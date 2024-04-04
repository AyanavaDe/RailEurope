package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testyoutube {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "./Selenium/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.youtube.com");
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("input[id='search']")).sendKeys("besharam rang song");
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("button[id='search-icon-legacy']")).click();
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("div[class='text-wrapper style-scope ytd-video-renderer']")).click();
	
}
}
