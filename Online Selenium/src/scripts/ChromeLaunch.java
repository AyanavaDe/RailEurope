package scripts;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeLaunch {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./Selenium/chromedriver.exe");
	 ChromeDriver driver= new ChromeDriver();
	 driver.close();
	
}
}
