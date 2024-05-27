package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class sauseLogin  {

	WebDriver driver;
	
	@FindBy (xpath = "//input[@id='user-name']")
	WebElement username;
	
	@FindBy (xpath = "//input[@id='password']")
	WebElement password;
	
	@FindBy (xpath = "//input[@id='login-button']")
	WebElement loginbtn;
	
	@FindBy (xpath = "//div[@class='header_label']")
	WebElement ellipse;
	
	@FindBy (xpath = "//a[@id='logout_sidebar_link']")
	WebElement Logout;
	
	
	public sauseLogin(WebDriver driver)
	{
		this.driver = driver;
		 PageFactory.initElements(driver, this);
		 
	}
	
	public void  UserN (String Uname)
	{
		username.sendKeys(Uname);
	}
	public void  PassW (String pass)
	{
		password.sendKeys(pass);
	}
	
	public void login()
	{
		loginbtn.click();
	}
	
	public void logout()
	{
		ellipse.click();
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Logout.click();
		}
	}
	
}
