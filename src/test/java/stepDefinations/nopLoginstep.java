package stepDefinations;

import java.io.File;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;

import Page.NopLogin;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;

public class nopLoginstep extends BaseClass {

	@Before
	public void initBrowser()
	{
           log = LogManager.getLogger("nopLoginstep");
		driver = new ChromeDriver();
     log.info(" Browser is opening");
	}
	@After
	public void teardown(Scenario sc )
	{
		if (sc.isFailed()== true)
		{ log.warn(" Test case is failed");
			String path = System.getProperty("user.dir")+"\\Screeenshot.png";
			TakesScreenshot SS = (TakesScreenshot)driver;
			File src = SS.getScreenshotAs(OutputType.FILE);
			File des = new File(path);
			try {
				FileHandler.copy(src, des);
			} catch (IOException e) {

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
		log.info(" User is on URL");
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
	}

}
