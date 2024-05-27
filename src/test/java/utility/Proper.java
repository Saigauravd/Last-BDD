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
		
		
		
	}


