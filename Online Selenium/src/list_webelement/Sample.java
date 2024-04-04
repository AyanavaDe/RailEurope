package list_webelement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./Selenium/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.amazon.in");
	driver.manage().window().maximize();
	List<WebElement> all_links = driver.findElements(By.tagName("a"));
	int count = all_links.size();

	System.out.println(count);
	for (WebElement a : all_links) {
		String s = a.getText();
		System.out.println(s);
	
	}
	}
}
