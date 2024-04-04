package Emnii;
import org.apache.poi.ss.usermodel.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SearchOnAmazon 
{

    public static void main(String[] args) throws IOException 
    {
        // Path to your Excel file
        String path = "./excel/Book1.xlsx";
        
        // Initialize WebDriver
        System.setProperty("webdriver.chrome.driver", "./Selenium/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        // Load Excel file
        FileInputStream fis = new FileInputStream(path);
        Workbook book = WorkbookFactory.create(fis);
        Sheet sheet = book.getSheet("Sheet1"); // assuming the mobile names are in the first sheet
        Sheet sheet1= book.createSheet("ResultssSa");
            Row r1 = sheet.getRow(1);
            
            String mobileName = r1.getCell(1).toString(); // assuming mobile names are in the first column

            // Search mobile on Amazon
            driver.get("https://www.amazon.in/");
            WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
            search.sendKeys(mobileName , Keys.ENTER);
            
            // Wait for search results to load
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            // Extract mobile name and price
             List<WebElement> Results = driver.findElements(By.xpath("//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal']"));
            //int size= Results.size();
             
             List<WebElement> priceElements = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
             int size1= priceElements.size();
            	 for (int j = 0; j < size1-1; j++) 
            	{
            		WebElement links = Results.get(j); 
            		String mobileNameOnAmazon = links.getText();
            		WebElement link1 = priceElements.get(j);
            		String prices = link1.getText();
            		
            		// Write mobile name and price to Excel
                    Row r2 = sheet1.createRow(j);
                    Cell cell = r2.createCell(1); // assuming price will be written in the second column
                    cell.setCellValue(mobileNameOnAmazon+" - " +prices);
                    
                                       
                    // Write changes to the Excel file
                    FileOutputStream fos = new FileOutputStream(path);
                    book.write(fos);
                    
		        }
            	  // Close workbook and WebDriver
                // book.close();
                // driver.quit(); 
      }

          
}

        