package pages;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeSuite;

import utilities.Driver;
import utilities.TestNGListener;

public class CommonElements{
	public CommonElements()
	{
		PageFactory.initElements(Driver.getWebDriver(), this);
	}
	
}
