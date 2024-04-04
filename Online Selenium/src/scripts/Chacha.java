package scripts;

import org.openqa.selenium.chrome.ChromeDriver;

public class Chacha {
public static void main(String[] args) throws InterruptedException {
	String key="webdriver.chrome.driver";
	String value= "./Selenium/chromedriver.exe";
	System.setProperty(key, value);
	ChromeDriver driver = new ChromeDriver();
	Thread.sleep(10000);
	driver.quit();
}
}
