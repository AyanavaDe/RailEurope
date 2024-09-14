package Generic_office;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Class_B2B 
{
	@FindBy(xpath = "//button[.='Accept All Cookies']")
	private WebElement Accept_All_Cookies;
	@FindBy(xpath = "//input[@aria-label='Enter username (e.g. ID or email address)']")
	private WebElement username;
	@FindBy(xpath = "//input[@aria-label='Enter password (8 or more characters)']")
	private WebElement password;
	@FindBy(xpath="//button[text()=' Sign in ']")
	private WebElement Sign_in;
	//
	@FindBy(xpath="/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a")
	private WebElement pim;
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
	private WebElement add;
	@FindBy(xpath = "//input[@placeholder='First Name']")
	private WebElement firstName;
	@FindBy(xpath = "//input[@placeholder='Middle Name']")
	private WebElement middleName;
	@FindBy(xpath = "//input[@placeholder='Last Name']")
	private WebElement lastName;
	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")
	private WebElement save;
	@FindBy(xpath = "//a[text()='Employee List']")
	private WebElement employeeList;
	@FindBy(xpath = "//button[text()='4']")
	private WebElement pagination;
	@FindBy (xpath = "//div[text()='Supratim Bapan']//parent::div[@class='oxd-table-cell oxd-padding-cell']//preceding-sibling::div[@class='oxd-table-cell oxd-padding-cell']//preceding-sibling::div[@class='oxd-table-cell oxd-padding-cell']//div[@class='oxd-table-card-cell-checkbox']")
	private WebElement checkbox;
	@FindBy(xpath = "//div[text()='Supratim Bapan']//parent::div[@class='oxd-table-cell oxd-padding-cell']//following-sibling::div[@class='oxd-table-cell oxd-padding-cell']//following-sibling::div[@class='oxd-table-cell oxd-padding-cell']//following-sibling::div[@class='oxd-table-cell oxd-padding-cell']//following-sibling::div[@class='oxd-table-cell oxd-padding-cell']//following-sibling::div[@class='oxd-table-cell oxd-padding-cell']//following-sibling::div[@class='oxd-table-cell oxd-padding-cell']//div[@class='oxd-table-cell-actions']//button[@class='oxd-icon-button oxd-table-cell-action-space']//i[@class='oxd-icon bi-trash']")
	private WebElement Delete;
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']//i[@class='oxd-icon bi-trash oxd-button-icon']")
	private WebElement yesDelete;
	@FindBy(xpath = "//div[@class='oxd-toast-content oxd-toast-content--success']")
	private WebElement successMsg;
	@FindBy(xpath = "//p[@class='oxd-userdropdown-name']")
	private WebElement demo;
	@FindBy(xpath = "//a[text()='Logout']")
	private WebElement logout;
    
	public POM_Class_B2B(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public WebElement Accept_All_Cookies()
	{
		return Accept_All_Cookies;
	}
	public WebElement username()
	{
		return username;
	}
	public WebElement password()
	{
		return password;
	}
	public WebElement Sign_in()
	{
		return Sign_in;
	}
	
	//
	public WebElement pim()
	{
		return pim;
	}
	public WebElement add()
	{
		return add;
	}
	public WebElement firstName()
	{
		return firstName;
	}
	public WebElement middleName()
	{
		return middleName;
	}
	public WebElement lastName()
	{
		return lastName;
	}
	public WebElement save()
	{
		return save;
	}
	public WebElement employeeList()
	{
		return employeeList;
	}
	public WebElement pagination()
	{
		return pagination;
	}
	public WebElement checkbox()
	{
		return checkbox;
	}
	public WebElement Delete()
	{
		return Delete;
	}
	public WebElement yesDelete()
	{
		return yesDelete;
	}
	public WebElement successMsg()
	{
		return successMsg;
	}
	public WebElement demo()
	{
		return demo;
	}
	public WebElement logout()
	{
		return logout;
	}

}
