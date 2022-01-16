package Regression_Tests;

import java.io.IOException;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import Admin_BranchManagement_pages.homePage;
import Admin_BranchManagement_pages.loginPage;
import Student_Home_Pages.Student_HomePage;
import coaching_center_base.BaseClass;
import coaching_center_base.FrameworkMethods;

public class Student_Tests extends BaseClass {
	@BeforeSuite
	public void set_up_application() throws IOException {
		BaseClass.SetUp();
	}	
	
	@Test(priority = 1)
	public void verify_Login_Funtionality() throws Exception {
		FrameworkMethods.logger = FrameworkMethods.extent.createTest("verify_Login_Funtionality",
				"This test is to verify login page elements and then login to site as a student");
		loginPage login = new loginPage();
		
		FrameworkMethods.logger.info("Launching an application");
		BaseClass.LaunchApplication();
		FrameworkMethods.logger.info("Verifying Login Page");
		login.verifyLoginpage_Login();
		login.IsUserOnLoginPage();
		homePage home = new homePage();
		home.verifyHomepage();
		FrameworkMethods.logger.info("Login success");
	}
	
	@Test(priority = 2)
	public void verifyHomePage() throws Exception {
		FrameworkMethods.logger = FrameworkMethods.extent.createTest("verify_Home_Page",
				"This testcase is to verify home page");
		Student_HomePage homepage=new Student_HomePage();
		homepage.navigateToHomePage();
		homepage.verifyHomePage();
		
	}
}
