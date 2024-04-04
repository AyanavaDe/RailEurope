package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class deselect {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./Selenium/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	Thread.sleep(2000);
	WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	Select s=new Select(month);
	s.deselectAll();
}
}
