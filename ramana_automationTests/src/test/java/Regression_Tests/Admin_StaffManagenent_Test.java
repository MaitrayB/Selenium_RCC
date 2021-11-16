package Regression_Tests;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import Admin_Staff_Management_Pages.Admin_Search_Pages;
import Admin_Staff_Management_Pages.Admin_StaffManagement_Pages;
import coaching_center_base.FrameworkMethods;

public class Admin_StaffManagenent_Test {
	
	@Test(priority = 1)
	public void verifyStaffApproval() throws Exception {
		FrameworkMethods.logger = FrameworkMethods.extent.createTest("Verify staff approval page");
		Admin_StaffManagement_Pages staffmanagement= new Admin_StaffManagement_Pages();
		//homePage homepage=new homePage();
		//homepage.doLogout();
		//staffmanagement.DoStaffRegistration();
		//staffmanagement.verifyElementsOnRegistration();
		//staffmanagement.StaffRegistration();
		staffmanagement.navigateToApprovalPage();
		staffmanagement.ActiveStaff();
		staffmanagement.InActiveStaff();
		FrameworkMethods.logger.log(Status.PASS,
				MarkupHelper.createLabel("Test Case Passed is - verifyStaffApproval", ExtentColor.GREEN));
	}
	
	@Test(priority = 2)
	public void verifySearchStaff() throws Exception {
		FrameworkMethods.logger = FrameworkMethods.extent.createTest("Verify search staff functionality");
		Admin_Search_Pages searchPage=new Admin_Search_Pages();
		searchPage.navigateToSearchPage();
		searchPage.searchActiveStaff();
		

	}

}
