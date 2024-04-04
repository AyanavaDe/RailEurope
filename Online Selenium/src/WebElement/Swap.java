package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swap {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./Selenium/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/amrit/Desktop/Selenium.html");
	Thread.sleep(2000);
	WebElement ele = driver.findElement(By.id("a1"));
    ele.sendKeys(Keys.CONTROL+"ax");
	Thread.sleep(2000);
	
	WebElement ele1 = driver.findElement(By.id("a3"));
	ele1.sendKeys(Keys.CONTROL+"v");
	
	WebElement ele3 = driver.findElement(By.id("a2"));
	ele3.sendKeys(Keys.CONTROL+"a");
	Thread.sleep(2000);
	ele3.sendKeys(Keys.CONTROL+"x");
	ele.sendKeys(Keys.CONTROL+"v");
	
}
}
