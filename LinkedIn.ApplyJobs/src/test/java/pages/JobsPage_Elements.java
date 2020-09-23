package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;
import utilities.WebM;

public class JobsPage_Elements extends CommonElements {
	
	public JobsPage_Elements() {
		PageFactory.initElements(Driver.getWebDriver(), this);
	}
	
	@FindBy(xpath="//span[text()='Job Alerts']")
	public static WebElement span_JobAlerts;
	
	public JobAlertsPage_Elements clickJobAlertsLink()
	{
		WebM.click(span_JobAlerts);
		return new JobAlertsPage_Elements();
	}

}
