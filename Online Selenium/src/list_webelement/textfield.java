package list_webelement;

import java.sql.Driver;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class textfield {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./Selenium/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/amrit/Desktop/textfields.html");
	driver.manage().window().maximize();
	List<WebElement> textfield = driver.findElements(By.xpath("//input[@type='text']"));
	int count = textfield.size();
	System.out.println(count);		
    
	for (WebElement field : textfield) {
		field.sendKeys("selenium");
		
	}
	for (WebElement field1 : textfield) {
		field1.clear();
	}
	
		
	
	//WebElement textfield1 = driver.findElement(By.xpath("//input[@type='text']"));
   // textfield1.sendKeys(Keys.CONTROL+"a", Keys.DELETE);
 //for (int i = 0; i < count-1; i++) {
//	WebElement text1= textfield.get(i);
	// Object text = text1.sendKeys("selenium");
	// text1.clear();
 }
}


