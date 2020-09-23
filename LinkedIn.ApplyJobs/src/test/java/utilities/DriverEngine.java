package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

import pages.CommonElements;

public class DriverEngine {

	static WebDriver driver;
	static ChromeOptions co;

	private DriverEngine() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		final ChromeOptions co = new ChromeOptions();
		co.addArguments("--start-maximized");
		driver = new ChromeDriver(co);
		ChromeDriver cDriver = (ChromeDriver) driver;
		Capabilities cap = cDriver.getCapabilities();
		System.out.println("Debugger Address - " + cap.getCapability("goog:chromeOptions"));
		driver.manage().timeouts().implicitlyWait(
				Integer.parseInt(TestEngineConfigurator.property.getProperty("WaitTime")), TimeUnit.SECONDS);
		Driver.setWebDriver(driver);
	}

	private DriverEngine(String debuggerAddress) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		final ChromeOptions co = new ChromeOptions();
		co.addArguments("--start-maximized");
		co.setExperimentalOption("debuggerAddress", debuggerAddress);
		driver = new ChromeDriver(co);
		ChromeDriver cDriver = (ChromeDriver) driver;
		Capabilities cap = cDriver.getCapabilities();
		System.out.println("Debugger Address - " + cap.getCapability("goog:chromeOptions"));
		driver.manage().timeouts().implicitlyWait(
				Integer.parseInt(TestEngineConfigurator.property.getProperty("WaitTime")), TimeUnit.SECONDS);
		Driver.setWebDriver(driver);
	}

	public static void initialize() {
		if (Driver.getWebDriver() == null)
			try {
				new DriverEngine();
			} catch (Exception e) {

			}
	}

	public static void initialize(String debuggerAddress) {
		if (Driver.getWebDriver() == null)
			try {
				new DriverEngine(debuggerAddress);
			} catch (Exception e) {

			}
	}

}
