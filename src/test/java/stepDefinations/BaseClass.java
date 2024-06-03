package stepDefinations;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import Page.CreateCustomerNop;
import Page.NopLogin;
import Page.Searchinnop;

import Page.sauseLogin;
import utility.Proper;

public class BaseClass {




	public static   WebDriver driver ; 
	public CreateCustomerNop CustomerNop;
	public NopLogin nopl;
	public sauseLogin Saul; 
	public static  Logger log;
	public Proper  read;
	public Searchinnop search;
	
	public String generateEmailId()
	{
		return(RandomStringUtils.randomAlphabetic(5));
	}
}
