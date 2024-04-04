package scripts;

import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./Selenium/chromedriver.exe");
	 ChromeDriver s1= new ChromeDriver();
	 s1.quit();
}
}
