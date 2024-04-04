package scripts;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxLaunch {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver","./Selenium/geckodriver.exe");
	FirefoxDriver driver = new FirefoxDriver();
	
	driver.quit();
}
}
