package Page;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateCustomerNop {
	
	WebDriver driver ;
	
	public CreateCustomerNop(WebDriver driver)
	{
		this.driver  = driver;
		PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(xpath = "//a[@href='#']//p[contains(text(),'Customers')]")
	 WebElement CustomersMain;
	
	@FindBy(xpath = "//a[@href='/Admin/Customer/List']")
	 WebElement CustomerSub;
	 
	@FindBy(linkText = "Add new")
	 WebElement addbtn;
	
	@FindBy(xpath = "//input[@id='Email']")
	 WebElement email;
	
	@FindBy(xpath = "//input[@id='Password']")
	 WebElement password;
	@FindBy(xpath = "//input[@id='FirstName']")
	 WebElement Firstname;
	@FindBy(xpath = "//input[@id='Gender_Male']")
	 WebElement GenderM;
	@FindBy(xpath = "//input[@id='Gender_Female']")
	 WebElement GenderF;
	@FindBy(xpath = "//input[@id='DateOfBirth']")
	 WebElement DOB;
	@FindBy(xpath = "//input[@id='Company']")
	 WebElement company;
	@FindBy(xpath = "(//input[@role='searchbox'])[1]")
	 WebElement News;
	@FindBy(xpath = "//select[@id='VendorId']")
	 WebElement SelectVendor;
	@FindBy(xpath = "//textarea[@id='AdminComment']")
	 WebElement Comment;
	@FindBy(xpath = "//input[@id='IsTaxExempt']")
	 WebElement Tax;
	@FindBy(xpath = "//button[@name='save']")
	 WebElement Save;
	
	public void customerM()
{
		CustomersMain.click();
		}
	
	public void subcustomer()
	{ driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		CustomerSub.click();
	
	}
	public void add()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		addbtn.click();
	}
	
	public void demographic( String Email, String Fname, String pass, String DoB, String Company, String Newsletter, String Vendor) {
		email.sendKeys(Email);
		password.sendKeys(pass);
		Firstname.sendKeys(Fname);
		GenderM.click();
		DOB.sendKeys(DoB);
		company.sendKeys(Company);
		News.sendKeys(Newsletter);
		Select SV = new Select(SelectVendor);
		SV.selectByVisibleText(Vendor);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Comment.sendKeys("Hello");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Tax.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Save.click();
	}
}
