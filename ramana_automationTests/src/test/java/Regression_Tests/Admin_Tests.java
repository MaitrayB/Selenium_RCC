package Regression_Tests;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.ITestResult;

import Admin_pages.branchManagementPage;
import Admin_pages.homePage;
import Admin_pages.loginPage;
import Admin_pages.registrationPage;
import coaching_center_base.FrameworkMethods;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import coaching_center_base.BaseClass;

public class Admin_Tests {

	@Test(priority = 1)
	public void verify_Login_Funtionality() throws Exception {
		try {
			loginPage login = new loginPage();
			homePage home = new homePage();
			login.verifyLoginpage_Login();
			home.verifyHomepage();
			FrameworkMethods.logger = FrameworkMethods.extent.createTest("verify_Login_Funtionality",
					"This test is to verify login page elements and then login to site as admin");
			FrameworkMethods.logger.log(Status.PASS,
					MarkupHelper.createLabel("Test Case Passed is - verify Login Funtionality", ExtentColor.GREEN));
		} catch (Exception e) {
		}
	}

	@Test(priority = 2)
	public void Branch_Management_Search_Student() throws Exception {
		try {
			branchManagementPage branchPage = new branchManagementPage();
			branchPage.searchStudentwithFirstName();
			branchPage.verifySearchResult();
			branchPage.searchStudentwithLastName();
			branchPage.verifySearchResult();
			FrameworkMethods.logger = FrameworkMethods.extent.createTest("Branch_Management_Search_Student");
			FrameworkMethods.logger.log(Status.PASS, MarkupHelper
					.createLabel("Test Case Passed is - Branch_Management_Search_Student", ExtentColor.GREEN));
		} catch (Exception e) {
		}
	}

	@Test(priority = 3)
	public void New_Registraton_Page_Verification() throws Exception {
		try {
		registrationPage register = new registrationPage();
		register.navigateToRegistrationPage();
		register.verifyNewRegistrationPage();
		FrameworkMethods.logger = FrameworkMethods.extent.createTest("Branch_Management_Search_Student");
		FrameworkMethods.logger.log(Status.PASS,
				MarkupHelper.createLabel("Test Case Passed is - Registration Page", ExtentColor.GREEN));}
		catch (Exception e) {
		}
	}

	
	@AfterTest public void writeToReport() { FrameworkMethods.extent.flush(); }
	 
	@AfterMethod
	public void getResult(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			FrameworkMethods.logger.log(Status.FAIL,
					MarkupHelper.createLabel(result.getName() + " FAILED ", ExtentColor.RED));
			FrameworkMethods.logger.fail(result.getThrowable());
		} else if (result.getStatus() == ITestResult.SUCCESS) {
			FrameworkMethods.logger.log(Status.PASS,
					MarkupHelper.createLabel(result.getName() + " PASSED ", ExtentColor.GREEN));
		} else {
			FrameworkMethods.logger.log(Status.SKIP,
					MarkupHelper.createLabel(result.getName() + " SKIPPED ", ExtentColor.ORANGE));
			FrameworkMethods.logger.skip(result.getThrowable());
		}
		BaseClass.Destroy();
	}

}
