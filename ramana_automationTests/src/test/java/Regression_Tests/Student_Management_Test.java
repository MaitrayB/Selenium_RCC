package Regression_Tests;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import Admin_BranchManagement_pages.homePage;
import Admin_BranchManagement_pages.loginPage;
import coaching_center_base.BaseClass;
import coaching_center_base.FrameworkMethods;

public class Student_Management_Test {
	@Test(priority = 1)
	public void verify_Login_Funtionality() throws Exception {
		loginPage login = new loginPage();
		homePage home = new homePage();
		BaseClass.LaunchApplication();
		login.verifyLoginpage_Login();
		login.doLogin();
		home.verifyHomepage();
		FrameworkMethods.logger = FrameworkMethods.extent.createTest("verify_Login_Funtionality",
				"This test is to verify login page elements and then login to site as admin");
		FrameworkMethods.logger.log(Status.PASS,
				MarkupHelper.createLabel("Test Case Passed is - verify Login Funtionality", ExtentColor.GREEN));
	}


}
