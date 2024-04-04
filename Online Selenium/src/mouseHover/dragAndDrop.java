package mouseHover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDrop {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./Selenium/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://demoapps.qspiders.com/dragDrop/dragToCorrect?sublist=1");
	driver.manage().window().maximize();
	WebElement mobile = driver.findElement(By.xpath("//div[.='Mobile Charger']"));
	WebElement target = driver.findElement(By.xpath("//div[@class='drop-column  min-h-[200px] bg-slate-100']"));
	Actions act = new Actions(driver);
	act.dragAndDrop(mobile, target);
}
}
