package utilities;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestContext;

import pages.HomePage_Elements;

public class TestEngineConfigurator {
	public static Properties property;
	private TestEngineConfigurator()
	{
		try 
		{
			property = new Properties();
			FileInputStream inputStream = new FileInputStream("./config.properties");
			property.load(inputStream);
			System.out.println("Properties file read");
			System.out.println(property.getProperty("URL"));

		} 
		catch (Exception e)
		{
			e.printStackTrace();
		} 
	}
	
	public static String get(String key)
	{
		return property.getProperty(key);	
	}
	
	public static void initialize()
	{
		if(property==null)
		{
			new TestEngineConfigurator();
		}
	}
	
}
