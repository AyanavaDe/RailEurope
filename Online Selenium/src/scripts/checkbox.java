package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./Selenium/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://loco2:sidings@staging.raileurope.com/en");
//	driver.findElement(By.xpath("//input[@id='a1']"));
//	Thread.sleep(2000);
//	boolean l = ele.isSelected();
//	if (l) {
//		System.out.println("Element is Selected");
//	}
//	else {
//		System.out.println("Element is not Selected");
//	}
  	Thread.sleep(2000);
  	driver.findElement(By.xpath("//button[text()='Accept All Cookies']")).click();
  	Thread.sleep(2000);
  	WebElement ele = driver.findElement(By.xpath("//input[@placeholder='From']"));
  			ele.sendKeys("London");
  			Thread.sleep(2000);
  			ele.sendKeys(Keys.ARROW_DOWN);
  			Thread.sleep(2000);
  			ele.sendKeys(Keys.ENTER);
  	WebElement ele1 = driver.findElement(By.xpath("//input[@placeholder='To']"));
  	ele1.sendKeys("Paris");
  	Thread.sleep(2000);
  	ele1.sendKeys(Keys.ENTER);
  	
  	driver.findElement(By.xpath("//button[@class='submit-search button-primary']")).click();
  	Thread.sleep(7000);
  		
  	driver.findElement(By.xpath("//button[@class='submit-search button-primary']")).click();
  	
  	
}
}
