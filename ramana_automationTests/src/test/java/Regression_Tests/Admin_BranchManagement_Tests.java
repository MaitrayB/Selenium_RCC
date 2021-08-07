package Regression_Tests;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

import org.testng.ITestResult;

import Admin_pages.searchStudentPage;
import Admin_pages.studentManagePage;
import Admin_pages.studentProspectsPage;
import Admin_pages.teacherStudentMappingPage;
import Admin_pages.homePage;
import Admin_pages.loginPage;
import Admin_pages.registrationPage;
import coaching_center_base.FrameworkMethods;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import coaching_center_base.BaseClass;

public class Admin_BranchManagement_Tests {

	@BeforeSuite
	public void set_up_application() throws IOException {
		BaseClass.SetUp();
	}

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

	
	  @Test(priority = 2) public void verify_Search_Student_functionality() throws
	  Exception {
	  
	  searchStudentPage branchPage = new searchStudentPage();
	  branchPage.navigateToSearchPage(); branchPage.searchStudentwithFirstName();
	  branchPage.ResetSearch(); branchPage.searchStudentwithLastName();
	  branchPage.verifyViewDetails(); FrameworkMethods.logger =
	  FrameworkMethods.extent.createTest("Verify_Search_Student_Functionality");
	  FrameworkMethods.logger.log(Status.PASS, MarkupHelper.
	  createLabel("Test Case Passed is - Branch_Management_Search_Student",
	  ExtentColor.GREEN));
	  
	  }
	  
	  @Test(priority = 3) public void New_Registraton_Page_Verification() throws
	  Exception {
	  
	  registrationPage register = new registrationPage();
	  register.navigateToRegistrationPage(); register.verifyNewRegistrationPage();
	  FrameworkMethods.logger =
	  FrameworkMethods.extent.createTest("Verify_New_Registrations_Page");
	  FrameworkMethods.logger.log(Status.PASS,
	  MarkupHelper.createLabel("Test Case Passed is - Registration Page",
	  ExtentColor.GREEN)); homePage homePage = new homePage();
	  homePage.getLogout(); }
	  
	  @Test(priority = 4) public void verify_student_management_functionality()
	  throws Exception { studentManagePage student = new studentManagePage();
	  student.navigatToStudentManagement(); student.verifyStudentLabel();
	  student.verifyStudentDetails(); FrameworkMethods.logger =
	  FrameworkMethods.extent.createTest("Verify_Student_Management_Page");
	  FrameworkMethods.logger.log(Status.PASS,
	  MarkupHelper.createLabel("Test Case Passed is - Student Management Page",
	  ExtentColor.GREEN)); }
	  
	  @Test(priority = 5) public void verify_student_prospect_page() throws
	  Exception { studentProspectsPage studentProspect = new
	  studentProspectsPage(); studentProspect.navigateToStudentProspectPage();
	  studentProspect.verifyStudentProspectPage();
	  studentProspect.verifyConversationFunctionality();
	  studentProspect.verifySecondTab(); }
	 

	@Test(priority = 6)
	public void verify_student_teacher_mapping_page() throws Exception {
		teacherStudentMappingPage techerstudentmapping = new teacherStudentMappingPage();
		techerstudentmapping.navigateToStudentTeacherMappingPage();
		techerstudentmapping.verifyStudentTeacherMappingPage();
		techerstudentmapping.verifyStudentTeacherMappingFunctionality();

	}

	@AfterTest
	public void writeToReport() {
		FrameworkMethods.extent.flush();
	}

	@AfterMethod
	public void getResult(ITestResult result) throws IOException {
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
	}

}
