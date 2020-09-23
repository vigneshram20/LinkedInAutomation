package utilities;

import java.util.Set;

import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Optional;

public class WebM extends Driver {

	public static void get(String URL) {
		driver.get(URL);
	}
	
	public static void moveToElement(WebElement element) {
		Actions actions= new Actions(driver);
		actions.moveToElement(element).build().perform();
	}
	
	public static WebElement WaitForElementClickable(WebElement element) {
		return new WebDriverWait(driver, Integer.parseInt(TestEngineConfigurator.property.getProperty("WaitTime")))
				.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public static WebElement WaitForElementPresence(WebElement element) {
		return new WebDriverWait(driver, Integer.parseInt(TestEngineConfigurator.property.getProperty("WaitTime")))
				.until(ExpectedConditions.visibilityOf(element));
	}


	// Explicit Wait to Click on WebElement.
	public static void click(WebElement element) {
		new WebDriverWait(driver, Integer.parseInt(TestEngineConfigurator.property.getProperty("WaitTime")))
				.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}

	public static void click(WebElement element, int timeout) {
		new WebDriverWait(driver, timeout).until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}
	
	public static void switchToWindowByName(String handleName)
	{
		driver.switchTo().window(handleName);
	}
	
	public static Set<String> getWindowHandles()
	{
		return driver.getWindowHandles();
	}
	
	public static void sendKeys(WebElement element, String keysToSend)
	{
		new WebDriverWait(driver, Integer.parseInt(TestEngineConfigurator.property.getProperty("WaitTime"))).until(ExpectedConditions.elementToBeClickable(element));
		element.sendKeys(keysToSend);
	}

	// To Switch into a Frame using Name.
	public void switchToFrame(String frameName) {
		try {
			driver.switchTo().frame(frameName);
			System.out.println("Navigated to Frame with Name ::: " + frameName);
		} catch (NoSuchFrameException e) {
			System.out.println("Unable to Locate Frame with Name ::: " + frameName + e.getStackTrace());
		} catch (Exception e) {
			System.out.println("Unable to Navigate to Frame with Name ::: " + frameName + e.getStackTrace());
		}
	}

	// To Switch into a Frame using Index.
	public void switchToFrame(int frame) {
		try {
			driver.switchTo().frame(frame);
			System.out.println("Navigated to Frame with Index ::: " + frame);
		} catch (NoSuchFrameException e) {
			System.out.println("Unable to Locate Frame with Index ::: " + frame + e.getStackTrace());
		} catch (Exception e) {
			System.out.println("Unable to Navigate to Frame with Index ::: " + frame + e.getStackTrace());
		}
	}

}
