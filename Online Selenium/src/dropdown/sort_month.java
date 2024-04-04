package dropdown;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class sort_month {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./Selenium/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	Thread.sleep(2000);
	WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	Select s=new Select(month);
	List<WebElement> option = s.getOptions();
	ArrayList<String> l = new ArrayList<String>();
	for ( WebElement opt : option)
	{
		String mon = opt.getText();
		l.add(mon);
		//System.out.println(mon);
	}
	
	
	Collections.sort(l,Collections.reverseOrder());
	for (String l1 : l)
	{
		System.out.println(l1);
	}
	
}
}
