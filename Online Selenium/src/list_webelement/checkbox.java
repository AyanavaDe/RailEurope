package list_webelement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import scripts.Chrome;

public class checkbox {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./Selenium/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("file:///C:/Users/amrit/Desktop/checkboxes.html");
	List<WebElement> checkbox = driver.findElements(By.xpath("//input"));
	int count = checkbox.size();
	System.out.println(count);
	
	for (WebElement box : checkbox) {
		box.click();
	}
	 // List<WebElement> checkbox1 = driver.findElements(By.xpath("//input"));
	for (int i = count-1; i >=0; i--) {
		WebElement an = checkbox.get(i);
		an.click();
	}
}
}
