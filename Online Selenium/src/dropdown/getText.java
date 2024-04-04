package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getText {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./Selenium/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	Select s=new Select(month);
	List<WebElement> option = s.getOptions();
	for (WebElement opt : option) {
		String op = opt.getText();
		System.out.println(op);
	}
}
}
