package demo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./Selenium/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	WebElement wer = driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']"));
	wer.sendKeys("Mobile",Keys.ENTER);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[.='APPLE iPhone 14 (Midnight, 128 GB)']")).click();
	Thread.sleep(1000);
	Set<String> ele = driver.getWindowHandles();
	Thread.sleep(2000);
	//for (String st : ele) {
	//driver.switchTo().window(st);
	//Thread.sleep(7000);
		
	//}
	WebElement ee = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']"));
	
	ee.click();
	Thread.sleep(2000);
}
}
