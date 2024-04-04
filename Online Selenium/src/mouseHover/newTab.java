package mouseHover;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class newTab {
public static void main(String[] args) throws AWTException {
	System.setProperty("webdriver.chrome.driver", "./Selenium/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.selenium.dev/");
	driver.manage().window().maximize();
	WebElement download = driver.findElement(By.xpath("//span[.='Downloads']"));
	WebElement docu = driver.findElement(By.xpath("//span[.='Documentation']"));
	WebElement prj = driver.findElement(By.xpath("//span[.='Projects']"));
	ArrayList<WebElement> l=new ArrayList<WebElement>();
	l.add(prj);
	l.add(docu);
	l.add(download);
	Robot r= new Robot();
	Actions act=new Actions(driver);
	for (WebElement l1 : l) {
		act.contextClick(l1).perform();
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
