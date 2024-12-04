package stepDefinations;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utility.Proper;

public class AppHook extends BaseClass{
	

	 
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
		
	}
}
