package scripts;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Rahim {
public static void main(String[] args) throws InterruptedException {
	String key1="webdriver.gecko.driver";
	String value1="./Selenium/geckodriver.exe";
	System.setProperty(key1, value1);
	FirefoxDriver driver1 = new FirefoxDriver();
	
	String key="webdriver.chrome.driver";
	String value="./Selenium/chromedriver.exe";
	System.setProperty(key, value);
	ChromeDriver driver = new ChromeDriver();

	driver.close();
	
}
}
