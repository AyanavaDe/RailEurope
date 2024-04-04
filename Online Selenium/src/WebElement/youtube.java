package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class youtube {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./Selenium/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.youtube.com");
	Thread.sleep(2000);
	 WebElement d = driver.findElement(By.id("search"));
	 d.sendKey
} 
}
