package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;
import utilities.WebM;

public class NewsFeedPage_Elements extends CommonElements {

	public NewsFeedPage_Elements()
	{
		PageFactory.initElements(Driver.getWebDriver(), this);
	}
	
	@FindBy(xpath = "//span[.='Jobs'][contains(@class,'primary')]/..")
	public static WebElement span_Jobs;
	
	
public JobsPage_Elements clickJobsTab()
{
	WebM.click(span_Jobs);
	return new JobsPage_Elements();
}

}
