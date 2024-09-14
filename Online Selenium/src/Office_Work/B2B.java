package Office_Work;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class B2B {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./Selenium/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://sandbox.era.raileurope.com/sign-in");                                                                      //URL
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
	WebElement from = driver.findElement(By.xpath("//input[@aria-label='From']"));                                                   //from
	Thread.sleep(2000);
	from.sendKeys("London");
	Thread.sleep(2000);
    from.sendKeys(Keys.ENTER);
	//from.sendKeys(Keys.TAB , Keys.TAB + "Lille", Keys.ENTER);
	from.sendKeys(Keys.TAB , Keys.TAB + "Lille");                                                                                 //to
	Thread.sleep(2000);
	from.sendKeys(Keys.ENTER);
	//WebElement to = driver.findElement(By.xpath("//label[text()=' To ']"));
	//to.sendKeys("Lille");
	//to.sendKeys(Keys.ENTER);
	driver.findElement(By.xpath("//button[@class='era-cta--withoutWidth era-dateSelector-toggleButton']")).click();               //date
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[text()=' 11 ']")).click();                                                              //select date
	Thread.sleep(5000);
	WebElement time = driver.findElement(By.xpath("//input[@aria-label='Departure Time']"));
	time.findElement(By.xpath("//input[@value='8:00 am']")).click();                                                              //select time
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@data-select='pax-selector-adults-more']")).click();                                     //adult pax
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[text()=' Search ']")).click();                                                          //search button
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[text()='Semi Flex']")).click();                                                           //semi-flex fare
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[text()=' Add to cart ']")).click();                                                     //add to cart
	Thread.sleep(2000);
	driver.findElement(By.xpath(" //button[@data-select='go-to-cart']")).click();                                                //go to cart
	Thread.sleep(2000);
	driver.findElement(By.xpath(" //button[@data-select='cart-checkout']")).click();                                             // Checkout
	Thread.sleep(10000);
	//WebElement d = driver.findElement(By.xpath("//button[@data-select='era-travelersDetails-toggleButton']"));
	//Thread.sleep(2000);
	//d.click();
	//Thread.sleep(1000);
	//d.click();
	//Thread.sleep(3000);
	
	
	//WebElement title = driver.findElement(By.xpath("//button[@aria-label='Title']"));
	//Thread.sleep(2000);
	//title.findElement(By.xpath("//button[@name='MR-options']")).click();
	//Thread.sleep(2000);
	
	
	//WebElement ti = driver.findElement(By.xpath("//button[@id='8cd48ab08e8340-8cd48ab08e75f0-8cd48ab08e3b60-8cd48ab08e4490']"));
//	Thread.sleep(3000);
	//ti.click();
	//Thread.sleep(2000);
	
	//Select s=new Select(ti);
	//s.selectByVisibleText(" Ms ");
//	ti.findElement(By.xpath("//button[@value='MR']")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@aria-label='First Name']")).sendKeys("Ayanava" , Keys.TAB+"De");                   //Customer details
	Thread.sleep(2000);
	WebElement date = driver.findElement(By.xpath("//input[@aria-label='Date of birth (YYYY-MM-DD)']"));                   //Customer details
	date.sendKeys("1995");                                                                                                   //Customer details
	Thread.sleep(1000);
	date.sendKeys("02");                                                                                                       //Customer details
	Thread.sleep(1000);
	date.sendKeys("04");                                                                                                      //Customer details
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@aria-label='Email']")).sendKeys("ayanavade0@gmail.com");                            //Customer details
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@aria-label='Phone number']")).sendKeys("+918768910552");                          //Customer details
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[text()=' Confirm ']")).click();                                                 //confirm button
	Thread.sleep(10000);
	//driver.findElement(By.xpath("//button[@type='submit']")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("//button[text()=' continue to hold & payment ']")).click();                             //continue to hold & payment button
	Thread.sleep(5000);
	WebElement radio = driver.findElement(By.xpath("//span[text()=' Pay now ']"));                                   //pay now radio button
	Thread.sleep(5000);
	radio.click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[@type='submit']")).click();                                              // payment submit button
	Thread.sleep(2000);
	
	
}
}
