package scripts;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class facebook {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","./Selenium/geckodriver.exe");
	 FirefoxDriver driver = new FirefoxDriver();
	/*driver.get("https://www.facebook.com");
	driver.findElementByCssSelector("input[id='email']").sendKeys("Qspider");
	Thread.sleep(3000);
	
	driver.findElementByCssSelector("input[id='pass']").sendKeys("SKR");
	Thread.sleep(3000);
	
	driver.findElementByCssSelector("button[name='login']").click();*/
	 driver.navigate().to("https://www.facebook.com");
	 Point d= new Point(200, 100);
	 driver.manage().window().setPosition(d);
	 
}
}
