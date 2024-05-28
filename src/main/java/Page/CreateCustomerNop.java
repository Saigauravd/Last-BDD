package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCustomerNop {

	//////////////////////////////////Class is still abstract ////////////////////
	
	WebDriver driver ;
	
	public CreateCustomerNop(WebDriver driver)
	{
		this.driver  = driver;
		PageFactory.initElements(driver, this);
	
	}
	/*
	@FindBy(xpath = "//a[@href='#']//p[contains(text(),'Customers')]")
	 WebElement CustomersMain;
	
	@FindBy(xpath = "//a[@href='/Admin/Customer/List']")
	 WebElement CustomerSub;
	 
	@FindBy(xpath = "a[class='btn btn-primary']")
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
	@FindBy(xpath = "//a[@href='#']//p[contains(text(),'Customers')]")
	 WebElement CustomersMain;
	@FindBy(xpath = "//a[@href='#']//p[contains(text(),'Customers')]")
	 WebElement CustomersMain;
	@FindBy(xpath = "//a[@href='#']//p[contains(text(),'Customers')]")
	 WebElement CustomersMain;
	@FindBy(xpath = "//a[@href='#']//p[contains(text(),'Customers')]")
	 WebElement CustomersMain;
	@FindBy(xpath = "//a[@href='#']//p[contains(text(),'Customers')]")
	 WebElement CustomersMain;
	@FindBy(xpath = "//a[@href='#']//p[contains(text(),'Customers')]")
	 WebElement CustomersMain;
	@FindBy(xpath = "//a[@href='#']//p[contains(text(),'Customers')]")
	 WebElement CustomersMain;
	*/
}
