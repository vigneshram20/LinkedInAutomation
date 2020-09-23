package utilities;

import org.testng.ITestContext;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import pages.CommonElements;

public class TestSuperClass {
	
	public static String sheetName;

	public TestSuperClass(String sheetName) {
		
		TestSuperClass.sheetName=sheetName;
	}
	
	public TestSuperClass()
	{
		sheetName="";
	}

	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Before Suite from super class");
		TestEngineConfigurator.initialize();
		//DriverEngine.initialize("localhost:58282");
		DriverEngine.initialize();
		new CommonElements();
		new WebM();
	}
	
	@DataProvider
	public static String[][]getTestData()
	{
			String abc[][]= new String[1][1];
			abc[0][0] = "abc";
		return abc;
		}
	}

