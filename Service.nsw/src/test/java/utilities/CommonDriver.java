package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class CommonDriver {

	/**
	 * This method will return value for the key passed.
	 * 
	 * @param key
	 * @return ConfigurationValue
	 */
	
	public static String getProperties(String key)
	{
		Properties Config = null;
		File file = new File(System.getProperty("user.dir")+"//src//"+"//test//"+"//java//"+"//Configuration//"+"//Config.properties");
		
	try {
		FileInputStream fis = new FileInputStream(file);
		Config = new Properties();
		Config.load(fis);
		} 
	catch (IOException e) 
		{

		System.out.println("Unable to read the file properly.");
		}
	return Config.getProperty(key);
	}
	
	}
