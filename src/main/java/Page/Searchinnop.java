package Page;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Searchinnop {
	
	
	WebDriver driver;
	
	public Searchinnop(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href='#']//p[contains(text(),'Customers')]")
	 WebElement CustomersMain;
	
	@FindBy(xpath = "//a[@href='/Admin/Customer/List']")
	 WebElement CustomerSub;
	
	@FindBy (xpath = "//input[@id='SearchEmail']")
	WebElement email;
	
	@FindBy (xpath = "//tbody/tr")
List<WebElement> rows;
	
	@FindBy(xpath = "//button[@id='search-customers']")
	 WebElement Search;
	
	

	public void customerM()
{
		CustomersMain.click();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		CustomerSub.click();
	
	}
	
	public void Emaail()
	{
		email.sendKeys("brenda_lindgren@nopCommerce.com");
	}
	public void serachbtn()
	{
		Search.click();
	}
	public boolean search(String value)
	{
		
		boolean  found = true;
		int rsize = rows.size();
		
		for (int i = 1;i <=rsize;i++ )
		{
			String actual = driver.findElement(By.xpath("//tbody/tr["+i+"]/td[2]")).getText();
			 if (actual.equals(value)) {
				 found = true;
				 break;
			 }
		}
	
		return found;
	}
	
	
}
