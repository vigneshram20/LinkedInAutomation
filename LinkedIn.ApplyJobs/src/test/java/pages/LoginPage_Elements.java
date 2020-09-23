package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;
import utilities.WebM;

public class LoginPage_Elements extends CommonElements {

public LoginPage_Elements()
{
	PageFactory.initElements(Driver.getWebDriver(), this);
}
	
	@FindBy(id ="username")
	private WebElement input_UserName;
	
	@FindBy(id = "password")
	private WebElement input_Password;
	
	@FindBy(xpath="//button[text()='Sign in']")
	private WebElement button_SignIn; 

	
	public NewsFeedPage_Elements loginWithCredentials(String uName, String pass)
	{
		WebM.sendKeys(input_UserName, uName);
		WebM.sendKeys(input_Password, pass);
		WebM.click(button_SignIn);
		
		return new NewsFeedPage_Elements();
	}

}
