package Regression_Tests;

import org.testng.annotations.Test;

import Admin_MyTimeSheetPage.adminMytimesheetPage;

public class MyTimesheet_Test {

	@Test(priority = 1)
	public void verifyTimesheet() throws Exception {
		adminMytimesheetPage myTimesheet= new adminMytimesheetPage();
		myTimesheet.navigateToTimesheetPage();
		myTimesheet.verifyTimesheetPage();
		
	}
	
}
	
