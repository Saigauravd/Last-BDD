package Runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(
	//	features = {".//Features/loginNopcommerce.feature",".//Features/loginsause.feature"},
		features = ".//Features/",
		glue = "stepDefinations",
		monochrome = true,
		dryRun  = false,	
		plugin = {"pretty","html:target/cucmber-report/report_html.html"},
		tags ="@regression or @sanity"

		)






public class SteprunnerLogin extends AbstractTestNGCucumberTests{


}
