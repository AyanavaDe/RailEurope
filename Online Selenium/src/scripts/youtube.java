package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class youtube {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./Selenium/chromedriver.exe");
	 WebDriver driver = new  ChromeDriver();
	driver.get("https://www.youtube.com");
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("input[id='search']")).sendKeys("Jawan");
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("button[id='search-icon-legacy']")).click();
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("div[id='thumbnail-container']")).click();
}
}
