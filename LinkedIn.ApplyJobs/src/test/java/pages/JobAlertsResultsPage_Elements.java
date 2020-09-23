package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JobAlertsResultsPage_Elements extends CommonElements {
	
	@FindBy(xpath="//a[contains(@class,'card-list__title')]")
	public static List<WebElement> a_ListOfJobs;
	
	@FindBy(xpath="//h2[contains(@class,'job-title')]")
	public static WebElement h2_RoleName;
	
	@FindBy(xpath="//a[@data-control-name='company_link'][contains(@class,'company-url')]")
	public static WebElement a_CompanyName;
	
	@FindBy(xpath="//*[contains(@class,'jobs-details')][@data-test-job-location]")
	public static List<WebElement> span_Location;
	
	@FindBy(id="job-details")
	public static WebElement div_JobDetails;
	
	@FindBy(xpath="//span[@data-test-save-button]")
	public static WebElement span_SaveOrUnsaveJob;
	
	@FindBy(xpath="//span[@data-test-save-button][text()='Save']")
	public static WebElement span_SaveJob;
	
	@FindBy(xpath="//span[@data-test-save-button][text()='Unsave']")
	public static WebElement span_UnsaveJob;
	
	@FindBy(xpath="//p[text()='You’ve saved this job in your Jobs Tracker.']")
	public static List<WebElement> p_JobSavedSuccessPopup;
	
	@FindBy(xpath="//button[contains(@class,'toast-item')]")
	public static WebElement button_closeToastMessage;
	
	@FindBy(xpath="//footer")
	public static WebElement span_About;
	
	public static String span_SaveOrUnsaveJob(String inputValue)
	{
		return "//span[@data-test-save-button][text()='"+inputValue+"']";
	}
}
