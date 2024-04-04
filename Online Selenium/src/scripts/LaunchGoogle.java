package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchGoogle {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./Selenium/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.google.com");
	String s1=driver.getTitle();
	System.out.println(s1);
	String s2=driver.getCurrentUrl();
	System.out.println(s2);
	
	String s3=driver.getPageSource();
	System.out.println(s3);
}
}
