package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NopLogin {



	WebDriver driver;

	@FindBy (id = "Email")
	WebElement email;

	@FindBy(xpath = "//*[@class = 'password']")
	WebElement password;

	@FindBy(xpath ="//*[@class = 'button-1 login-button']")
	WebElement Login;

	@FindBy(linkText ="Logout")
	WebElement Logout;

	public NopLogin(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void Email(String emailadd)
	{
		email.clear();
		email.sendKeys(emailadd);
	}
	public void Password(String pass)
	{
		password.clear();
		password.sendKeys(pass);
	}


	public void LogintM()
	{	
		Login.click();
	}
	public void LogoutM()
	{	
		Logout.click();
	}
}
