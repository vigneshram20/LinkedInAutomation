package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class JobAlertsPage_Elements extends CommonElements {

	public JobAlertsPage_Elements() {
		PageFactory.initElements(Driver.getWebDriver(), this);
	}
	@FindBy(xpath="//a[@data-control-name='job_alert_click']")
	private List<WebElement> a_ListOfAlertsLink;
	
	public List<WebElement> listOFAlertsHyperlink()
	{
		return a_ListOfAlertsLink;
	}
}
