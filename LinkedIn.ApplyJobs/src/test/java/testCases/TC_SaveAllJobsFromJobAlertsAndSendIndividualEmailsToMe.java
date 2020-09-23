package testCases;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.HomePage_Elements;
import pages.JobAlertsPage_Elements;
import pages.JobAlertsResultsPage_Elements;
import pages.JobsPage_Elements;
import pages.LoginPage_Elements;
import pages.NewsFeedPage_Elements;
import utilities.Driver;
import utilities.DriverEngine;
import utilities.TestEngineConfigurator;
import utilities.TestSuperClass;
import utilities.WebM;

public class TC_SaveAllJobsFromJobAlertsAndSendIndividualEmailsToMe extends TestSuperClass {
	

	@Test//(dataProvider="data")
	public void test_SaveAllJobsFromJobAlertsAndSendIndividualEmailsToMe() {
		System.out.println("test_SaveAllJobsFromJobAlertsAndSendIndividualEmailsToMe");
		
		WebM.get(TestEngineConfigurator.get("URL"));
		List<WebElement> elements = new HomePage_Elements()
				.clickSignInButton().loginWithCredentials("7200322380", "James00!")
		.clickJobsTab().clickJobAlertsLink().listOFAlertsHyperlink();
		
		System.out.println(elements.size());
		for(WebElement ele : elements)
		{
			WebM.WaitForElementClickable(ele);
			System.out.println("Alerts Link");
			System.out.println(ele.getAttribute("href"));
			((JavascriptExecutor)WebM.driver).executeScript("window.open('"+ele.getAttribute("href")+"');");
			ArrayList<String> tabs = new ArrayList<String> (Driver.driver.getWindowHandles());
			WebM.switchToWindowByName(tabs.get(1));
			WebM.WaitForElementPresence(JobAlertsResultsPage_Elements.span_About);
			WebM.moveToElement(JobAlertsResultsPage_Elements.span_About);
			List<WebElement> alljobs = JobAlertsResultsPage_Elements.a_ListOfJobs;
			System.out.println(alljobs.size());
			for(WebElement innerele : alljobs)
			{
				System.out.println("Job Link");
				System.out.println(innerele.getAttribute("href"));
				WebM.click(innerele);
				System.out.println("Role Name : "+JobAlertsResultsPage_Elements.h2_RoleName.getText());
				if(JobAlertsResultsPage_Elements.span_Location.size()>1)
				{
					System.out.println("Location : "+JobAlertsResultsPage_Elements.span_Location.get(1).getText());
				}
				else
				{
					System.out.println("Location : "+JobAlertsResultsPage_Elements.span_Location.get(0).getText());
				}
				
				String SavedOrNotSaved = JobAlertsResultsPage_Elements.span_SaveOrUnsaveJob.getText();
				if (SavedOrNotSaved.equalsIgnoreCase("Unsave"))
				{
					System.out.println("Job Already Saved");
				}
				else
				{
					WebM.click(JobAlertsResultsPage_Elements.span_SaveJob);
					if(JobAlertsResultsPage_Elements.p_JobSavedSuccessPopup.size()>0)
					{
						WebM.WaitForElementClickable(JobAlertsResultsPage_Elements.p_JobSavedSuccessPopup.get(0));
						WebM.click(JobAlertsResultsPage_Elements.button_closeToastMessage);
					}
					
				}
				
				System.out.println("Location : "+JobAlertsResultsPage_Elements.div_JobDetails.getText());
				
			}
			Driver.driver.close();
			Driver.driver.switchTo().window(tabs.get(0));
		}
		
		
		
	}

}
