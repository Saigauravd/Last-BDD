package stepDefinations;

import java.io.File;
import java.io.IOException;
import java.sql.DriverManager;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;

import Page.sauseLogin;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.Proper;

public class suaseloginstep extends BaseClass{
	@Before
	public void initBrowser()
	{ read = new Proper();



	String browser = read.getBrowser();
	System.out.println(browser);
	switch(browser.toLowerCase()) 
	{
	case "chrome":

		if (driver==null) {
			driver = new ChromeDriver();}
		break;

	case "firefox":
		if (driver==null) {
			driver = new FirefoxDriver();}
		break;

	case "Edge":
		if (driver==null) {
			driver = new EdgeDriver();}
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
	@Given("User will open the browser and paste the URL {string}")
	public void user_will_open_the_browser_and_paste_the_url(String URL) {
		Saul = new sauseLogin(driver);
		driver.get(URL);
	}

	@When("User enter the Username {string} and Password {string}")
	public void user_enter_the_username_and_password(String Uname, String Pass) {
		Saul.UserN(Uname);
		Saul.PassW(Pass);
	}

	@When("Click on Login button")
	public void click_on_login_button() {
		Saul.login();

	}

	@Then("Page title should be {string}")
	public void page_title_should_be(String ExpectedTitle) {
		String actualTitle = driver.getTitle();

		Assert.assertEquals(actualTitle, ExpectedTitle,"Title Does'nt Match");

	}

	@When("user click on Elipses and click on  logout button")
	public void user_click_on_elipses_and_click_on_logout_button() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		Saul.logout();
	}

}
