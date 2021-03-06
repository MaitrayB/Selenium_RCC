package Regression_Tests;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

import org.testng.ITestResult;

import coaching_center_base.FrameworkMethods;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import Admin_BranchManagement_pages.addRemoveBranchesPage;
import Admin_BranchManagement_pages.equiriesPage;
import Admin_BranchManagement_pages.homePage;
import Admin_BranchManagement_pages.loginPage;
import Admin_BranchManagement_pages.referralManagementPage;
import Admin_BranchManagement_pages.registrationPage;
import Admin_BranchManagement_pages.searchStudentPage;
import Admin_BranchManagement_pages.studentManagePage;
import Admin_BranchManagement_pages.studentPhotoApprovalPage;
import Admin_BranchManagement_pages.studentProspectsPage;
import Admin_BranchManagement_pages.teacherStudentMappingPage;
import coaching_center_base.BaseClass;

public class Admin_BranchManagement_Tests {

	@BeforeSuite
	public void set_up_application() throws IOException {
		BaseClass.SetUp();
	}

	@Test(priority = 1)
	public void verify_Login_Funtionality() throws Exception {
		loginPage login = new loginPage();
		FrameworkMethods.logger = FrameworkMethods.extent.createTest("verify_Login_Funtionality",
				"This test is to verify login page elements and then login to site as admin");
		FrameworkMethods.logger.info("Launching an application");
		BaseClass.LaunchApplication();
		FrameworkMethods.logger.info("Verifying Login Page");
		login.verifyLoginpage_Login();
		login.doLogin();
		homePage home = new homePage();
		home.verifyHomepage();
		FrameworkMethods.logger.info("Login success");
		FrameworkMethods.logger.log(Status.PASS,
				MarkupHelper.createLabel("Test Case Passed is - verify Login Funtionality", ExtentColor.GREEN));
	}

	@Test(priority = 2)
	public void verify_Search_Student_functionality() throws Exception {
		FrameworkMethods.logger = FrameworkMethods.extent.createTest("Verify_Search_Student_Functionality");
		searchStudentPage branchPage = new searchStudentPage();
		FrameworkMethods.logger.info("Navigating on Search Page");
		branchPage.navigateToSearchPage();
		FrameworkMethods.logger.info("Searching Student with First Name ");
		branchPage.searchStudentwithFirstName();
		branchPage.ResetSearch();
		FrameworkMethods.logger.info("Searching Student with Last Name ");
		branchPage.searchStudentwithLastName();
		branchPage.verifyViewDetails();
		FrameworkMethods.logger.log(Status.PASS,
				MarkupHelper.createLabel("Test Case Passed is - Branch_Management_Search_Student", ExtentColor.GREEN));

	}

	@Test(priority = 3)
	public void New_Registraton_Page_Verification() throws Exception {
		FrameworkMethods.logger = FrameworkMethods.extent.createTest("Verify_New_Registrations_Page");
		registrationPage register = new registrationPage();
		FrameworkMethods.logger.info("Navigating on Registration Page");
		register.navigateToRegistrationPage();
		FrameworkMethods.logger.info("Verifying new Registration Page");
		register.verifyNewRegistrationPage();
		FrameworkMethods.logger.log(Status.PASS,
				MarkupHelper.createLabel("Test Case Passed is - Registration Page", ExtentColor.GREEN));
		homePage homePage = new homePage();
		homePage.getLogout();
	}

	@Test(priority = 4)
	public void verify_student_management_functionality() throws Exception {
		studentManagePage student = new studentManagePage();
		student.navigatToStudentManagement();
		student.verifyStudentLabel();
		student.verifyStudentDetails();
		FrameworkMethods.logger = FrameworkMethods.extent.createTest("Verify_Student_Management_Page");
		FrameworkMethods.logger.log(Status.PASS,
				MarkupHelper.createLabel("Test Case Passed is - Student Management Page", ExtentColor.GREEN));
	}

	@Test(priority = 5)
	public void verify_student_prospect_page() throws Exception {
		studentProspectsPage studentProspect = new studentProspectsPage();
		studentProspect.navigateToStudentProspectPage();
		studentProspect.verifyStudentProspectPage();
		studentProspect.verifyConversationFunctionality();
		studentProspect.verifySecondTab();
		FrameworkMethods.logger = FrameworkMethods.extent.createTest("Verify_Student_Prospect_Page");
		FrameworkMethods.logger.log(Status.PASS,
				MarkupHelper.createLabel("Test Case Passed is - Student Prospect Page", ExtentColor.GREEN));
	}

	@Test(priority = 6)
	public void verify_student_teacher_mapping_page() throws Exception {
		teacherStudentMappingPage techerstudentmapping = new teacherStudentMappingPage();
		techerstudentmapping.navigateToStudentTeacherMappingPage();
		techerstudentmapping.verifyStudentTeacherMappingPage();
		techerstudentmapping.verifyStudentTeacherMappingFunctionality();
		FrameworkMethods.logger = FrameworkMethods.extent.createTest("Verify_Student_Teacher_Mapping");
		FrameworkMethods.logger.log(Status.PASS,
				MarkupHelper.createLabel("Test Case Passed is - Student Teacher Mapping functionality", ExtentColor.GREEN));

	}

	@Test(priority = 7)
	public void verify_Add_remove_branches_page() throws Exception {
		addRemoveBranchesPage addRemoveBranches = new addRemoveBranchesPage();
		addRemoveBranches.navigateToAddRemoveBranches();
		addRemoveBranches.verifyAddRemovBrachePage();
		addRemoveBranches.editBranchDetail();
		addRemoveBranches.resetBranchDetails();
		FrameworkMethods.logger = FrameworkMethods.extent.createTest("Verify_Add_Remove_Branches_Page");
		FrameworkMethods.logger.log(Status.PASS,
				MarkupHelper.createLabel("Test Case Passed is - Add Remove Branches page", ExtentColor.GREEN));
	}

	@Test(priority = 8)
	public void verify_Add_update_enquiry_page() throws Exception {
		equiriesPage enquiry = new equiriesPage();
		enquiry.navigateToAddEnquiryPage(); 
		enquiry.addEnquiry();
		enquiry.searchEnquiry();
		FrameworkMethods.logger = FrameworkMethods.extent.createTest("Verify_Enquiry_Page");
		FrameworkMethods.logger.log(Status.PASS,
				MarkupHelper.createLabel("Test Case Passed is - Enqiury Page", ExtentColor.GREEN));
	}

	@Test(priority = 9)
	public void verify_referral_activity_page() throws Exception {
		referralManagementPage referralPage=new referralManagementPage();
		referralPage.navigateToReferralManagementPage();
		referralPage.verifyReferralRewardManagement();
		referralPage.verifyReferralManagement();
		FrameworkMethods.logger = FrameworkMethods.extent.createTest("Verify_Referral_Activity_Page");
		FrameworkMethods.logger.log(Status.PASS,
				MarkupHelper.createLabel("Test Case Passed is - Verifiy Referral Activity page", ExtentColor.GREEN));
	}	
	
	@Test(priority = 10)
	public void verify_photo_approval_management_page() throws Exception {
		studentPhotoApprovalPage studentPhotoApproval=new studentPhotoApprovalPage();
		homePage homepage=new homePage();
		loginPage  loginpage= new loginPage();
		homepage.doLogout();
		loginpage.IsUserOnLoginPage();
		studentPhotoApproval.navigateToUploadProfilePhoto();
		studentPhotoApproval.sendPhotoApprovalRequest();
		homepage.doLogout();
		loginpage.doLogin();
		studentPhotoApproval.navigateToStudentPhotoRequestPage();
		studentPhotoApproval.aprrovePhotoRequest();
		homepage.doLogout();
		loginpage.IsUserOnLoginPage();
		studentPhotoApproval.verifyPhotoAprrovalMessage();
		homepage.doLogout();
		loginpage.doLogin();
		FrameworkMethods.logger = FrameworkMethods.extent.createTest("Verify_Enquiry_Page");
		FrameworkMethods.logger.log(Status.PASS,
				MarkupHelper.createLabel("Test Case Passed is - Enqiury Page", ExtentColor.GREEN));
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
