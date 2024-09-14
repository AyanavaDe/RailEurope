package Generic_office;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_class implements Base_Constant
{
public WebDriver driver;
@BeforeMethod
public void OpenApp()
   {
	System.setProperty(chrome_key, chrome_value);
	driver= new ChromeDriver();
	driver.get(url);
	driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
    
                                                                                          // Use JavascriptExecutor to set the zoom level to 75%
  //   JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
  //   jsExecutor.executeScript("document.body.style.zoom='75%'");
    
                                                                                          // Decrease the zoom size to 75%
  //  ((JavascriptExecutor) driver).executeScript("document.body.style.zoom='75%'");
    
   }
@AfterMethod
public void CloseApp()
   {
	driver.close();
   }
}
