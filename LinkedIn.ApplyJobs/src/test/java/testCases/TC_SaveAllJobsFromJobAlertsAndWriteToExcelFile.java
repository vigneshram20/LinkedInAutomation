package testCases;

import org.testng.annotations.Test;

import pages.CommonElements;
import pages.HomePage_Elements;
import utilities.DriverEngine;
import utilities.TestEngineConfigurator;
import utilities.TestSuperClass;
import utilities.WebM;

import org.testng.annotations.Test;

public class TC_SaveAllJobsFromJobAlertsAndWriteToExcelFile extends TestSuperClass{
	
	
	public TC_SaveAllJobsFromJobAlertsAndWriteToExcelFile(String sheetName) {
		super(sheetName);
		// TODO Auto-generated constructor stub
	}

	@Test()
	public void test_SaveAllJobsFromJobAlertsAndWriteToExcelFile()
	{
		System.out.println("test_SaveAllJobsFromJobAlertsAndWriteToExcelFile");
		new HomePage_Elements();
		WebM.get(TestEngineConfigurator.get("URL"));
		//WebM.click(HomePage_Elements.a_SignIn);
	}

}
