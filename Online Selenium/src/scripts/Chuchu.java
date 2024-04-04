package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Chuchu {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","./Selenium/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("file:///C:/Users/amrit/Desktop/text.html");
	WebElement ele = driver.findElement(By.id("a1"));
	Thread.sleep(2000);
	ele.clear();
	WebElement pwd = driver.findElement(By.id("a2"));
	Thread.sleep(3000);
	pwd.sendKeys("Selenium");
	
}
}
