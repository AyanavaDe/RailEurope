package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demoshop {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","./Selenium/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.xpath("//a[@href='/register']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@id='gender-male']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Ayanava");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("De");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("ayanava2006@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Ayanava@1998");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("Ayanava@1998");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='register-button']")).click();
	driver.quit();
	
}
}

