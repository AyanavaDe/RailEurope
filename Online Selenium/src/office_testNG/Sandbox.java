package office_testNG;



import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.Test;
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


public class Sandbox 
{
@Test(priority = 1) 
public void test()throws IOException, InterruptedException 
    {
	//Reporter.log("Ram", true);
	 String path = "./excel/Office_Automation1.xlsx";
     
     
     
     System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
     WebDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     
    
     FileInputStream fis = new FileInputStream(path);
     Workbook book = WorkbookFactory.create(fis);
     Sheet sheet = book.getSheet("Given"); 
     Sheet sheet1= book.createSheet("Sandbox_Results");
         Row r1 = sheet.getRow(1);            
         String origin = r1.getCell(1).toString();  
         String destination = r1.getCell(2).toString();
        // String dept_date = r1.getCell(3).toString();

       
         driver.get("https://sandbox.era.raileurope.com/");
         Thread.sleep(7000);
     	driver.findElement(By.xpath("//button[.='Accept All Cookies']")).click();
     	
     	WebElement username = driver.findElement(By.xpath("//input[@aria-label='Enter username (e.g. ID or email address)']"));           //ID
     	username.sendKeys("etroadec");
     	WebElement password = driver.findElement(By.xpath("//input[@aria-label='Enter password (8 or more characters)']"));               //pass
     	password.sendKeys("P@ssword01");
     	Thread.sleep(2000);
     	driver.findElement(By.xpath("//button[text()=' Sign in ']")).click();                                                            //signin button
     	Thread.sleep(20000); 
     	
 
         WebElement search = driver.findElement(By.xpath("//input[@aria-label='From']"));                                                 //from
         search.sendKeys(origin);
         Thread.sleep(2000);
			search.sendKeys(Keys.ENTER);
			
		    search.sendKeys(Keys.TAB , Keys.TAB + destination);                                                                                 //to
			Thread.sleep(2000);
			search.sendKeys(Keys.ENTER);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
			
//			WebElement date = driver.findElement(By.xpath("//input[@data-select='datetime-selector-date-departureDate']"));              
//			Thread.sleep(2000);
//			date.click();
//			Thread.sleep(1000);
//			date.click();
//			Thread.sleep(2000);
//			date.sendKeys(dept_date);
			
			
	        //date Hard_Coded
			//int a=22;
 	//	for(int i=a;i<=30;i++)
 		{
 			//String date;
 		//	date="2024-06-"+i;
 			//System.out.println(date);
 			driver.findElement(By.xpath("//button[@class='era-cta--withoutWidth era-dateSelector-toggleButton']")).click();               //date Hard Coded
   			Thread.sleep(2000);
   			driver.findElement(By.xpath("//button[@data-select='era-calendarHeader-nextMonth']")).click();                             // Next month arrow
   			Thread.sleep(2000);
   			driver.findElement(By.xpath("//button[text()=' 11 ']")).click();                                                              //select date
   			Thread.sleep(5000);
   			WebElement time_dropdown = driver.findElement(By.xpath("//input[@data-select='datetime-selector-time-Departure']"));
 			Thread.sleep(2000);
 			time_dropdown.click();
 			Thread.sleep(3000);
 			time_dropdown.findElement(By.xpath("//section[@class='era-dropdown']/div[6]")).click();
 			Thread.sleep(2000);
   					  	
   			
   			driver.findElement(By.xpath("//button[@data-select='pax-selector-adults-more']")).click();                                     //adult pax
   			Thread.sleep(2000);
   			driver.findElement(By.xpath("//button[text()=' Search ']")).click();                                                          //search button
   			
   			
   			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   			
   			
   			driver.findElement(By.xpath("(//era-result-header[@data-select='point-to-point-result-header'])[1]")).click();
 	  			
 			  List<WebElement> TrainResults = driver.findElements(By.xpath("//div[@class='vehicle']"));
           //int size= FareResults.size();
 			
 			
          // Extract fare and price
           List<WebElement> FareResults = driver.findElements(By.xpath("//span[@data-select='trainDetailsOffer-radioLabel']"));
          //int size= FareResults.size();
           
           List<WebElement> priceElements = driver.findElements(By.xpath("//span[@class='era-price']/.."));
           int size1= priceElements.size();
          	 for (int j = 0; j < size1-1; j++) 
          	{
          		WebElement train = TrainResults.get(j);
         	    String Train_Name = train.getText();
          		WebElement links = FareResults.get(j); 
          		String FareName = links.getText();
          		WebElement link1 = priceElements.get(j);
          	    String prices = link1.getText();
          	    
          	
          		// Write Fare name and price to Excel
                 Row r2 = sheet1.createRow(j);
                 Cell cell = r2.createCell(1); // assuming price will be written in the second column
                 //Cell cell1 = r2.createCell(0);
                 //cell1.setCellValue(Train_Name);
                 cell.setCellValue(Train_Name+" - "+FareName+" - " +prices);
                  
                                     
                  //Write changes to the Excel file
                 FileOutputStream fos = new FileOutputStream(path);
                 book.write(fos);
                  
          	}  	
 		}
 	}
 		
@Test(priority = 2)
public void test1()throws IOException, InterruptedException 
    {
	//Reporter.log("Ram", true);
	 String path = "./excel/Office_Automation1.xlsx";
     
     
     
     System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
     WebDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     
    
     FileInputStream fis = new FileInputStream(path);
     Workbook book = WorkbookFactory.create(fis);
     Sheet sheet = book.getSheet("Given"); 
     Sheet sheet1= book.createSheet("Sandbox_Results");
         Row r1 = sheet.getRow(1);            
         String origin = r1.getCell(1).toString();  
         String destination = r1.getCell(2).toString();
        // String dept_date = r1.getCell(3).toString();

       
         driver.get("https://sandbox.era.raileurope.com/");
         Thread.sleep(7000);
     	driver.findElement(By.xpath("//button[.='Accept All Cookies']")).click();
     	
     	WebElement username = driver.findElement(By.xpath("//input[@aria-label='Enter username (e.g. ID or email address)']"));           //ID
     	username.sendKeys("etroadec");
     	WebElement password = driver.findElement(By.xpath("//input[@aria-label='Enter password (8 or more characters)']"));               //pass
     	password.sendKeys("P@ssword01");
     	Thread.sleep(2000);
     	driver.findElement(By.xpath("//button[text()=' Sign in ']")).click();                                                            //signin button
     	Thread.sleep(20000); 
     	
 
         WebElement search = driver.findElement(By.xpath("//input[@aria-label='From']"));                                                 //from
         search.sendKeys(origin);
         Thread.sleep(2000);
			search.sendKeys(Keys.ENTER);
			
		    search.sendKeys(Keys.TAB , Keys.TAB + destination);                                                                                 //to
			Thread.sleep(2000);
			search.sendKeys(Keys.ENTER);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
			
//			WebElement date = driver.findElement(By.xpath("//input[@data-select='datetime-selector-date-departureDate']"));              
//			Thread.sleep(2000);
//			date.click();
//			Thread.sleep(1000);
//			date.click();
//			Thread.sleep(2000);
//			date.sendKeys(dept_date);
			
			
	        //date Hard_Coded
			//int a=22;
 	//	for(int i=a;i<=30;i++)
 		{
 			//String date;
 		//	date="2024-06-"+i;
 			//System.out.println(date);
 			driver.findElement(By.xpath("//button[@class='era-cta--withoutWidth era-dateSelector-toggleButton']")).click();               //date Hard Coded
   			Thread.sleep(2000);
   			driver.findElement(By.xpath("//button[@data-select='era-calendarHeader-nextMonth']")).click();                             // Next month arrow
   			Thread.sleep(2000);
   			driver.findElement(By.xpath("//button[text()=' 12 ']")).click();                                                              //select date
   			Thread.sleep(5000);
   			WebElement time_dropdown = driver.findElement(By.xpath("//input[@data-select='datetime-selector-time-Departure']"));
 			Thread.sleep(2000);
 			time_dropdown.click();
 			Thread.sleep(3000);
 			time_dropdown.findElement(By.xpath("//section[@class='era-dropdown']/div[6]")).click();
 			Thread.sleep(2000);
   					  	
   			
   			driver.findElement(By.xpath("//button[@data-select='pax-selector-adults-more']")).click();                                     //adult pax
   			Thread.sleep(2000);
   			driver.findElement(By.xpath("//button[text()=' Search ']")).click();                                                          //search button
   			
   			
   			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   			
   			
   			driver.findElement(By.xpath("(//era-result-header[@data-select='point-to-point-result-header'])[1]")).click();
 	  			
 			  List<WebElement> TrainResults = driver.findElements(By.xpath("//div[@class='vehicle']"));
           //int size= FareResults.size();
 			
 			
          // Extract fare and price
           List<WebElement> FareResults = driver.findElements(By.xpath("//span[@data-select='trainDetailsOffer-radioLabel']"));
          //int size= FareResults.size();
           
           List<WebElement> priceElements = driver.findElements(By.xpath("//span[@class='era-price']/.."));
           int size1= priceElements.size();
          	 for (int j = 0; j < size1-1; j++) 
          	{
          		WebElement train = TrainResults.get(j);
         	    String Train_Name = train.getText();
          		WebElement links = FareResults.get(j); 
          		String FareName = links.getText();
          		WebElement link1 = priceElements.get(j);
          	    String prices = link1.getText();
          	    
          	
          		// Write Fare name and price to Excel
                 Row r2 = sheet1.createRow(j);
                 Cell cell = r2.createCell(1); // assuming price will be written in the second column
                 //Cell cell1 = r2.createCell(0);
                 //cell1.setCellValue(Train_Name);
                 cell.setCellValue(Train_Name+" - "+FareName+" - " +prices);
                  
                                     
                  //Write changes to the Excel file
                 FileOutputStream fos = new FileOutputStream(path);
                 book.write(fos);
                  
          	}  	
 		}
    }
}		

