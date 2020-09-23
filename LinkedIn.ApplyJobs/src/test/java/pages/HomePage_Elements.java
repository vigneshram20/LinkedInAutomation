package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;
import utilities.WebM;

public class HomePage_Elements extends CommonElements{

	public HomePage_Elements()
	{
		PageFactory.initElements(Driver.getWebDriver(), this);
	}
	
	@FindBy(xpath = "//a[.='Sign in']")
	private WebElement a_SignIn;
	
	
public LoginPage_Elements clickSignInButton()
{
	WebM.click(a_SignIn);
	return new LoginPage_Elements();
}

}
