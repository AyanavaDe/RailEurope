package popup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_download {
	public static void main(String[] args) throws InterruptedException, AWTException {
	System.setProperty("webdriver.chrome.driver", "./Selenium/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.selenium.dev/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//span[.='Downloads']")).click();
	Thread.sleep(7000);
	driver.findElement(By.xpath("//a[.='4.16.1 (December 6, 2023)']")).click();
	Robot r= new Robot();
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_J);
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_J);
	}
}
