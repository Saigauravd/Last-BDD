package utility;

import java.io.FileInputStream;

import java.util.Properties;

public class Proper {
	
	Properties readconfig ;
	public Proper()
	{
		
		
		String path = System.getProperty("user.dir")+"//src//test//resources//Config.properties";

		readconfig = new Properties();
		try {
			FileInputStream fis = new FileInputStream(path);
			readconfig.load(fis);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
		public String getBrowser()
		{
			String value = readconfig.getProperty("Browser");

			if(value!=null)
				return value;
			else
				throw new RuntimeException("url not specified in config file.");

		}
		public String Email()
		{
			String value = readconfig.getProperty("Email");
			return value;
		}
		public String Passwordl()
		{
			String value = readconfig.getProperty("Password");
			return value;
		}
		public String Firstname()
		{
			String value = readconfig.getProperty("Firstname");
			return value;
		}
		public String Lastname()
		{
			String value = readconfig.getProperty("Lastname");
			return value;
		}
		public String Companyname ()
		{
			String value = readconfig.getProperty("Companyname");
			return value;
		}
		public String Newsletter()
		{
			String value = readconfig.getProperty("Newsletter");
			return value;
		}
		public String Managerofvendor()
		{
			String value = readconfig.getProperty("Managerofvendor");
			return value;
		}
	}


