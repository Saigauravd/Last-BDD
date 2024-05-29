package stepDefinations;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Page.CreateCustomerNop;
import Page.NopLogin;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.Proper;

public class nopLoginstep extends BaseClass {

	@Before
	public void initBrowser()
	{ read = new Proper();



	String browser = read.getBrowser();
	System.out.println(browser);
	switch(browser.toLowerCase()) 
	{
	case "chrome":

	
			driver = new ChromeDriver();
		break;

	case "firefox":
		
			driver = new FirefoxDriver();
		break;

	case "Edge":
			driver = new EdgeDriver();
		break;

	}


	}

	@After
	public void teardown(Scenario sc )
	{
		if (sc.isFailed()== true)
		{
			String path = System.getProperty("user.dir")+"\\Screeenshot.png";
			TakesScreenshot SS = (TakesScreenshot)driver;
			File src = SS.getScreenshotAs(OutputType.FILE);
			File des = new File(path);
			try {
				FileHandler.copy(src, des);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		driver.quit();
	}
	@Given("User is able open the browser")
	public void user_is_able_open_the_browser() {
		nopl = new NopLogin(driver);

	}

	@When("thw user enter the url {string}")
	public void thw_user_enter_the_url(String URL) {
		driver.get(URL);
	
	}

	@When("Enter the Username {string} and Password {string}")
	public void enter_the_username_and_password(String email, String pass) {

		nopl.Email(email);
		nopl.Password(pass);

	}

	@When("click on login button")
	public void click_on_login_button() {
		nopl.LogintM();

	}

	@Then("The page title should be {string}")
	public void the_page_title_should_be(String ExpectedTitle) {
		String actualTitle = driver.getTitle();

		Assert.assertEquals(actualTitle, ExpectedTitle,"Title Does'nt Match");

	}

	@When("User click on Log out button")
	public void user_click_on_log_out_button() {
		nopl.LogoutM();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	



	@When("The user click on Customer menu and click on customer click on Customer tab")
	public void the_user_click_on_customer_menu_and_click_on_customer_click_on_customer_tab() {
		CustomerNop = new CreateCustomerNop(driver);
		CustomerNop.customerM();
		CustomerNop.subcustomer();

	}
	@When("Click on Add new button")
	public void click_on_add_new_button() {
		CustomerNop.add();
	}
	@When("Fill all the demografic data")
	public void fill_all_the_demografic_data() {
		CustomerNop.demographic(generateEmailId()+"@gmail.com", read.Passwordl(), read.Firstname(),
	read.Lastname(), read.Newsletter(), read.Newsletter(), read.Managerofvendor());

	}


	@Then("New Customer will be Saved {string}")
	public void new_customer_will_be_saved(String Expected) {
    
		
		String actual = driver.findElement(By.tagName("body")).getText();
		if (actual.contains(Expected))
		{
			Assert.assertTrue(true);
			
		}else {
			Assert.assertTrue(false);
					}
	}

}
