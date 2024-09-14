package Office_Work;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class b2b_2 {
	public static void main(String[] args) throws IOException, InterruptedException 
    {
        String path = "./excel/Office_Automation.xlsx";
        
     
        System.setProperty("webdriver.chrome.driver", "./Selenium/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
       
        FileInputStream fis = new FileInputStream(path);
        Workbook book = WorkbookFactory.create(fis);
        Sheet sheet = book.getSheet("Given"); 
      //  Sheet sheet1= book.createSheet("Prod_Results");
            Row r1 = sheet.getRow(1);            
            String origin = r1.getCell(1).toString();  
            String destination = r1.getCell(2).toString();
           String dept_date = r1.getCell(3).toString();

          
            driver.get("https://sandbox.era.raileurope.com/");
            Thread.sleep(7000);
        	//driver.findElement(By.xpath("//button[text()='Accept All Cookies']")).click();   //Accept All Cookies
        	driver.findElement(By.xpath("//button[.='Accept All Cookies']")).click();
        	WebElement username = driver.findElement(By.xpath("//input[@aria-label='Enter username (e.g. ID or email address)']"));           //ID
        	username.sendKeys("etroadec");
        	WebElement password = driver.findElement(By.xpath("//input[@aria-label='Enter password (8 or more characters)']"));               //pass
        	password.sendKeys("P@ssword01");
        	Thread.sleep(2000);
        	driver.findElement(By.xpath("//button[text()=' Sign in ']")).click();                                                            //signin button
        	Thread.sleep(7000);
        	//driver.findElement(By.xpath("//button[@aria-label='close dialog']")).click();
    
            WebElement search = driver.findElement(By.xpath("//input[@aria-label='From']"));
            search.click();
            search.sendKeys(origin);
            Thread.sleep(2000);
            //search.sendKeys(Keys.ARROW_DOWN);
            //Thread.sleep(2000);
  			search.sendKeys(Keys.ENTER);
  			
  			//from.sendKeys(Keys.TAB , Keys.TAB + "Lille", Keys.ENTER);
  			search.sendKeys(Keys.TAB , Keys.TAB + destination);                                                                                 //to
  			Thread.sleep(2000);
  			search.sendKeys(Keys.ENTER);
  			//WebElement to = driver.findElement(By.xpath("//label[text()=' To ']"));
  			//to.sendKeys("Lille");
  			//to.sendKeys(Keys.ENTER);
  			
  			
  			WebElement date_picker = driver.findElement(By.xpath("//input[@id='datetime-selector-date-departureDate']"));               //date
  			Thread.sleep(2000);
  			date_picker.click();
  			Thread.sleep(1000);
  			date_picker.click();
  			Thread.sleep(1000);
  			
  			date_picker.sendKeys(dept_date);
            Thread.sleep(2000);
  			//driver.findElement(By.xpath("//button[text()=' 11 ']")).click();                                                              //select date
  			//Thread.sleep(5000);
  			//WebElement time = driver.findElement(By.xpath("//input[@aria-label='Departure Time']"));
  			//time.findElement(By.xpath("//input[@value='8:00 am']")).click();                                                              //select time
  			//Thread.sleep(2000);
  			
  			
  			
  			
  			
  			
  			
  			
  			
  			
  			
  			
  			
  			
  			
//  			driver.findElement(By.xpath("//button[@data-select='pax-selector-adults-more']")).click();                                     //adult pax
//  			Thread.sleep(2000);
//  			driver.findElement(By.xpath("//button[text()=' Search ']")).click();                                                          //search button
//  			Thread.sleep(3000);
//  			
//             WebElement search1 = driver.findElement(By.xpath("//input[@id='search_finish_station']"));
//            search1.sendKeys(destination);
//            Thread.sleep(2000);
//            //search.sendKeys(Keys.ARROW_DOWN);
//            //Thread.sleep(2000);
//            search1.sendKeys(Keys.ENTER);
//            Thread.sleep(2000);
//           
//            driver.findElement(By.xpath("//div[.='Today']")).click();
//        	Thread.sleep(2000);
//        	driver.findElement(By.xpath("//div[@data-value='2024-06-22']")).click();
//        	Thread.sleep(2000);
//       
//        	driver.findElement(By.xpath("//div[@data-value='07:00']")).click();
//        	Thread.sleep(2000);
//        	
//        	driver.findElement(By.xpath("(//button[@type='submit'])[3]")).click();
//        	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        	
//        	
//        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	

             // Extract fare and price
             // List<WebElement> FareResults = driver.findElements(By.xpath(""));
             //int size= Results.size();
              
             // List<WebElement> priceElements = driver.findElements(By.xpath(""));
             // int size1= priceElements.size();
             //	 for (int j = 0; j < size1-1; j++) 
             //	{
             	//	WebElement links = FareResults.get(j); 
             	//	String FareName = links.getText();
             	//	WebElement link1 = priceElements.get(j);
             	//	String prices = link1.getText();
             		
             		// Write Fare name and price to Excel
                //     Row r2 = sheet1.createRow(j);
                //     Cell cell = r2.createCell(1); // assuming price will be written in the second column
                //     cell.setCellValue(FareName+" - " +prices);
                     
                                        
                     // Write changes to the Excel file
                 //    FileOutputStream fos = new FileOutputStream(path);
                 //    book.write(fos);
                     
 		      //  }
             	  // Close workbook and WebDriver
              //    book.close();
              //    driver.quit(); 
}
}