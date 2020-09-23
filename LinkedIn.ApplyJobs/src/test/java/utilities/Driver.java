package utilities;

import org.openqa.selenium.WebDriver;

public class Driver {
	
	static ThreadLocal<WebDriver> threadLocaldriver = new ThreadLocal<WebDriver>();
	public static WebDriver driver;
	public Driver () {
		driver =threadLocaldriver.get();
	}
	
	public static WebDriver getWebDriver()
	{
		return driver;
	}

	public static void setWebDriver(WebDriver driver) {

		threadLocaldriver.set(driver);
	}
}
