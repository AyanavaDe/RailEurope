package mouseHover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class action {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./Selenium/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=676742245123&hvpos=&hvnetw=g&hvrand=9313835449657818758&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9299044&hvtargid=kwd-10573980&hydadcr=14453_2367553");
	driver.manage().window().maximize();
	WebElement eng = driver.findElement(By.xpath("//div[.='EN']"));
	Actions act=new Actions(driver);
	act.moveToElement(eng).build().perform();
}
}
