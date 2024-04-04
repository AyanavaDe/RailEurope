package Emni;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./Selenium/chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	driver.get("https://www.flipkart.com/");
	//driver.manage().window().;
	//Thread.sleep(2000);
    String n = driver.getCurrentUrl();
    System.out.println(n);
    driver.findElement(By.xpath(n).
}
}
