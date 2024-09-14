package Generic_office;

import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class B2B_sandbox extends Base_class
{
	static String value="";
	static String value1="";
@Test(priority = 1)

public void test1() throws InterruptedException
    {
	value=Generic_DDT_fetch.Origin_Fetch("Sheet1", 2 , 5);
	value1=Generic_DDT_fetch.Destination_Fetch("Sheet1", 2 , 6);
//	Generic_DDT_fetch.Date_Fetch("Given", 2, 3);
	
	
	driver.findElement(By.xpath("//button[.='Accept All Cookies']")).click();                                                         //Accept All Cookies
	
	WebElement username = driver.findElement(By.xpath("//input[@aria-label='Enter username (e.g. ID or email address)']"));           //ID
	username.sendKeys("etroadec");
	WebElement password = driver.findElement(By.xpath("//input[@aria-label='Enter password (8 or more characters)']"));               //pass
	password.sendKeys("P@ssword01");
	driver.findElement(By.xpath("//button[text()=' Sign in ']")).click();                                                            //signin button
	Thread.sleep(3000);
	
	WebElement from = driver.findElement(By.xpath("//input[@aria-label='From']"));                                                   //from
	Thread.sleep(3000);
	from.sendKeys(value);
	Thread.sleep(2000);
    from.sendKeys(Keys.ENTER);
    Thread.sleep(3000);
	from.sendKeys(Keys.TAB , Keys.TAB + value1);                                                                                 //to
	Thread.sleep(3000);
    from.sendKeys(Keys.ENTER);
    Thread.sleep(2000);
 
	    driver.findElement(By.xpath("//button[@class='era-cta--withoutWidth era-dateSelector-toggleButton']")).click();               //click on date Textfield
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@data-select='era-calendarHeader-nextMonth']")).click();                             // click on Next month arrow
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()=' 11 ']")).click();                                                              //select date
		Thread.sleep(3000);
		
		WebElement time_dropdown = driver.findElement(By.xpath("//input[@data-select='datetime-selector-time-Departure']"));          //click on time_dropdown
	    Thread.sleep(2000);
	    time_dropdown.click();
	    Thread.sleep(2000);
	    
	    //Xpath for Time:-
	    
	    // 12:00 am --> (By.xpath("//section[@class='era-dropdown']/div[1]"))
	    // 2:00 am --> (By.xpath("//section[@class='era-dropdown']/div[2]"))
	    // 4:00 am --> (By.xpath("//section[@class='era-dropdown']/div[3]"))
	    // 6:00 am --> (By.xpath("//section[@class='era-dropdown']/div[4]"))
	    // 8:00 am--> (By.xpath("//section[@class='era-dropdown']/div[5]"))
	    // 10:00 am--> (By.xpath("//section[@class='era-dropdown']/div[6]"))
  	    // 12:00 pm--> (By.xpath("//section[@class='era-dropdown']/div[7]"))
	    // 2:00 pm--> (By.xpath("//section[@class='era-dropdown']/div[8]"))
	    // 4:00 pm--> (By.xpath("//section[@class='era-dropdown']/div[9]"))
	    // 6:00 pm--> (By.xpath("//section[@class='era-dropdown']/div[10]"))
	    // 8:00 pm--> (By.xpath("//section[@class='era-dropdown']/div[11]"))
	    // 10:00 pm--> (By.xpath("//section[@class='era-dropdown']/div[12]"))
	    
	    time_dropdown.findElement(By.xpath("//section[@class='era-dropdown']/div[6]")).click();                                      //select time
	    Thread.sleep(2000);
				  	
		
		driver.findElement(By.xpath("//button[@data-select='pax-selector-adults-more']")).click();                                     //select adult pax
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()=' Search ']")).click();        
		Thread.sleep(2000);
		
	    driver.findElement(By.xpath("(//span[@class='era-price-amount']/..)[1]")).click();                                      //choose fare 
	    Thread.sleep(2000);
	
//	WebElement Standard_fare = driver.findElement(By.xpath("(//div[.=' Standard ']/../../ul/li/era-point-to-point-result-item/article/era-result-header/div/era-proposition-button/button)[1]"));                  //fare change between [1] or [2]          
//	Standard_fare.click();
	
//  WebElement Comfort_fare = driver.findElement(By.xpath("(//div[.=' Comfort ']/../../ul/li/era-point-to-point-result-item/article/era-result-header/div/era-proposition-button/button)[3]"));                    //fare change between [3] or [4]          
//  Comfort_fare.click();
  
//  WebElement Premier_fare = driver.findElement(By.xpath("(//div[.=' Premier ']/../../ul/li/era-point-to-point-result-item/article/era-result-header/div/era-proposition-button/button)[5]"));                    //fare change between [5] or [6]          
//  Premier_fare.click();
	
    driver.findElement(By.xpath("//button[.=' Add to cart ']")).click();                                 //add to cart
	Thread.sleep(2000); 
	
//	driver.findElement(By.xpath("(//button[@data-select='continue-offer-button'])[1]")).click();                                 //add to cart
//	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@data-select='go-to-cart']")).click();                                                //go to cart
	Thread.sleep(2000);
	driver.findElement(By.xpath(" //button[@data-select='cart-checkout']")).click();                                             // Checkout
	Thread.sleep(2000);
	
    WebElement title = driver.findElement(By.xpath("//button[@data-select='travelers-details-form-traveler-0-title-select']"));      //Title dropdown
	Thread.sleep(3000);
    title.click();
	Thread.sleep(2000);
    title.findElement(By.xpath("//button[@value='MR']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@aria-label='First Name']")).sendKeys("Ayanava" , Keys.TAB + "De");                   //Customer details
	Thread.sleep(2000);
	WebElement date = driver.findElement(By.xpath("//input[@aria-label='Date of birth (YYYY-MM-DD)']"));                   //Customer details
	date.sendKeys("1991");                                                                                                   //Customer details
	Thread.sleep(2000);
	date.sendKeys("02");                                                                                                       //Customer details
	Thread.sleep(2000);
	date.sendKeys("04");                                                                                                      //Customer details
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@aria-label='Email']")).sendKeys("ayanavade0@gmail.com");                            //Customer details
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@aria-label='Phone number']")).sendKeys("+918768910552");                          //Customer details
    Thread.sleep(2000);
    
    WebElement targetElement4 = driver.findElement(By.xpath("//button[text()=' Confirm ']"));
    Thread.sleep(5000);
                                                                                                     // Create an instance of Actions class
     Actions actions = new Actions(driver);
     Thread.sleep(3000);
                                                                                                 // Use the Actions class to move to the element
     actions.moveToElement(targetElement4);
     Thread.sleep(5000);
     targetElement4.click();                                                                           //confirm button
     Thread.sleep(2000);                                      
     actions.perform();                                                                             // Perform the action
     Thread.sleep(2000);
    
//    driver.findElement(By.xpath("//button[text()=' Confirm ']")).click();                                                 //confirm button
//    Thread.sleep(2000);
    
//     driver.findElement(By.xpath("(//era-icon[@class='era-icon'])[6]")).click();          //travel agent contact dropdown
//     Thread.sleep(2000);
     
//     driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_DOWN);
//     Thread.sleep(2000);
                                                                                                    // Find an element on the page where you want to scroll to
//     WebElement targetElement = driver.findElement(By.xpath("//button[@data-select='travelers-details-contact-form-save-button']"));
//     Thread.sleep(5000);
//                                                                                               // Use the Actions class to move to the element
//     actions.moveToElement(targetElement);
//     Thread.sleep(5000);
//     targetElement.click();                                                                           //click on save on "Travel agent contact"
//     Thread.sleep(5000);
//     actions.perform();                                                                              // Perform the action
//     Thread.sleep(3000);
     
    driver.findElement(By.xpath("//button[@data-select='travelers-details-contact-form-save-button']")).click();            //save button 
    Thread.sleep(2000);
    
     WebElement targetElement1 = driver.findElement(By.xpath("//button[text()=' continue to hold & payment ']"));
     Thread.sleep(3000);
                                                                                                    // Use the Actions class to move to the element
      actions.moveToElement(targetElement1);
      Thread.sleep(3000);
      targetElement1.click();                                                                           //pay now
      Thread.sleep(3000);                                      
      actions.perform();                                                                             // Perform the action
      Thread.sleep(3000);
     
     
//    driver.findElement(By.xpath("//button[text()=' continue to hold & payment ']")).click();          //continue to hold & payment button
//    Thread.sleep(2000);
    
//                                                                                                     // Find an element on the page where you want to scroll to
//     WebElement targetElement2 = driver.findElement(By.xpath("//span[text()=' Pay now ']"));
//     Thread.sleep(3000);
//                                                                                                    // Use the Actions class to move to the element
//      actions.moveToElement(targetElement2);
//      Thread.sleep(3000);
//      targetElement2.click();                                                                           //pay now
//      Thread.sleep(3000);
//      actions.perform();                                                                             // Perform the action
//      Thread.sleep(3000);
    
      
	  WebElement radio = driver.findElement(By.xpath("//span[text()=' Pay now ']"));                 //pay now radio button
	  Thread.sleep(2000);
      radio.click();
      Thread.sleep(2000);
    
	driver.findElement(By.xpath("//button[@data-select='billing-information-pay-button']")).click();             // continue to pay button
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("(//button[.='X'])[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//button[.='X'])[1]")).click();
	Thread.sleep(2000);
	
	WebElement mail = driver.findElement(By.xpath("//input[@id='email-multiple-To']")); 
	mail.click();
	Thread.sleep(2000);
	mail.sendKeys("ayanavade0@gmail.com");
	Thread.sleep(3000);
	
	 WebElement targetElement3 = driver.findElement(By.xpath("//button[@data-select='email-setup-send-button']"));
     Thread.sleep(5000);
                                                                                                    // Use the Actions class to move to the element
      actions.moveToElement(targetElement3);
      Thread.sleep(5000);
      targetElement3.click();                                                                           //pay now
      Thread.sleep(5000);                                      
      actions.perform();                                                                             // Perform the action
      Thread.sleep(3000);
	
//	driver.findElement(By.xpath("//button[@data-select='email-setup-send-button']")).click();         
//	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//span[@data-select='header-item-reference']")).click(); 
	Thread.sleep(2000);
	
	WebElement Booking_ref = driver.findElement(By.xpath("//span[@data-select='header-item-reference']"));
	String ref = Booking_ref.getText();
	Thread.sleep(2000);
	Generic_DDT_write.write( 2, 16, ref);                                                                       //write the data (passing parameters)
	Thread.sleep(2000);
	
	WebElement write_PNR = driver.findElement(By.xpath("(//span[@class='reference-value'])[1]"));                    //fetch PNR & write
	String PNR = write_PNR.getText();
	Thread.sleep(2000);
	Generic_DDT_write.write( 2, 15, PNR); 
	Thread.sleep(2000);
	
	WebElement write_booking_fee = driver.findElement(By.xpath("(//span[@data-select='price'])[2]"));                    //fetch booking_fee & write
	String fee = write_booking_fee.getText();
	Thread.sleep(2000);
	Generic_DDT_write.write( 2, 11, fee); 
	Thread.sleep(2000);
	
	WebElement write_fare_amount = driver.findElement(By.xpath("(//span[@data-select='price'])[1]"));                    //fetch fetch_fare_amount & write
	String amount = write_fare_amount.getText();
	Thread.sleep(2000);
	Generic_DDT_write.write( 2, 10, amount); 
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("(//era-icon[@class=\"era-icon\"])[3]")).click();                               //Trip summary dropdown under OVERVIEW
	Thread.sleep(2000);
	
	WebElement write_pax = driver.findElement(By.xpath("//span[@class='era-legSummaryTravelers-paxType']"));                    //fetch pax & write
	String pax = write_pax.getText();
	Thread.sleep(2000);
	Generic_DDT_write.write( 2, 7, pax); 
	Thread.sleep(2000);
	
	WebElement write_date = driver.findElement(By.xpath("(//time[@data-select='travel-date-one-way'])[1]"));          //fetch the date & write
	String date1 = write_date.getText();
	Thread.sleep(2000);
	Generic_DDT_write.write( 2, 3, date1); 
	Thread.sleep(2000);
	
	WebElement write_time = driver.findElement(By.xpath("(//time[@data-select='station-time'])[1]"));                    //fetch the time & write
	String time = write_time.getText();
	Thread.sleep(2000);
	Generic_DDT_write.write( 2, 4, time); 
	Thread.sleep(2000);
	
	WebElement write_fare = driver.findElement(By.xpath("//span[@data-select='ptp-trip-summary-product-fare-cabin-details']"));                    //fetch the fare & write
	String fare = write_fare.getText();
	Thread.sleep(2000);
	Generic_DDT_write.write( 2, 9, fare); 
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//button[@data-select='era-ptp-itemSummary-toggleDetailsButton']")).click();                               //Trip summary dropdown under Trip summary
	Thread.sleep(2000);
	
	WebElement write_train = driver.findElement(By.xpath("//p[@data-select='segmentDetails-vehicle']"));                    //fetch the train details & write
	String train = write_train.getText();
	Thread.sleep(2000);
	Generic_DDT_write.write( 2, 8, train); 
	Thread.sleep(2000);
	
	WebElement write_seat = driver.findElement(By.xpath("//div[@data-select='travelers-details-summary-traveler-card-accommodation']"));                    //fetch the seat details & write
	String seat = write_seat.getText();
	Thread.sleep(2000);
	Generic_DDT_write.write( 2, 12, seat); 
	Thread.sleep(2000);
	
	}

}
