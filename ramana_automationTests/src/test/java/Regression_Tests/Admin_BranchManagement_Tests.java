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
		/*
		 * FrameworkMethods.logger.log(Status.PASS,
		 * MarkupHelper.createLabel("Test Case Passed is - verify Login Funtionality",
		 * ExtentColor.GREEN));
		 */
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
		/*
		 * FrameworkMethods.logger.log(Status.PASS, MarkupHelper.
		 * createLabel("Test Case Passed is - Branch_Management_Search_Student",
		 * ExtentColor.GREEN));
		 */

	}

	@Test(priority = 3)
	public void New_Registraton_Page_Verification() throws Exception {
		FrameworkMethods.logger = FrameworkMethods.extent.createTest("Verify_New_Registrations_Page");
		registrationPage register = new registrationPage();
		FrameworkMethods.logger.info("Navigating on Registration Page");
		register.navigateToRegistrationPage();
		FrameworkMethods.logger.info("Verifying new Registration Page");
		register.verifyNewRegistrationPage();
		/*
		 * FrameworkMethods.logger.log(Status.PASS,
		 * MarkupHelper.createLabel("Test Case Passed is - Registration Page",
		 * ExtentColor.GREEN));
		 */
		homePage homePage = new homePage();
		homePage.getLogout();
	}

	@Test(priority = 4)
	public void verify_student_management_functionality() throws Exception {
		FrameworkMethods.logger = FrameworkMethods.extent.createTest("Verify_Student_Management_Page");
		studentManagePage student = new studentManagePage();
		FrameworkMethods.logger.info("Navigating on student management page");
		student.navigatToStudentManagement();
		FrameworkMethods.logger.info("Verifying on student label");
		student.verifyStudentLabel();
		FrameworkMethods.logger.info("Verifying on student details");
		student.verifyStudentDetails();
		/*FrameworkMethods.logger.log(Status.PASS,
				MarkupHelper.createLabel("Test Case Passed is - Student Management Page", ExtentColor.GREEN));
	*/}

	@Test(priority = 5)
	public void verify_student_prospect_page() throws Exception {
		FrameworkMethods.logger = FrameworkMethods.extent.createTest("Verify_Student_Prospect_Page");
		studentProspectsPage studentProspect = new studentProspectsPage();
		FrameworkMethods.logger.info("Navigating on student prospect page");
		studentProspect.navigateToStudentProspectPage();		
		FrameworkMethods.logger.info("Verifying student prospect page");
		studentProspect.verifyStudentProspectPage();
		FrameworkMethods.logger.info("Verifying conversational functionality");
		studentProspect.verifyConversationFunctionality();
		FrameworkMethods.logger.info("Verifying second tab");
		studentProspect.verifySecondTab();
		/*
		 * FrameworkMethods.logger.log(Status.PASS,
		 * MarkupHelper.createLabel("Test Case Passed is - Student Prospect Page",
		 * ExtentColor.GREEN));
		 */
	}

	@Test(priority = 6)
	public void verify_student_teacher_mapping_page() throws Exception {
		FrameworkMethods.logger = FrameworkMethods.extent.createTest("Verify_Student_Teacher_Mapping");
		teacherStudentMappingPage techerstudentmapping = new teacherStudentMappingPage();
		FrameworkMethods.logger.info("Navigating on student techer mapping");
		techerstudentmapping.navigateToStudentTeacherMappingPage();
		FrameworkMethods.logger.info("Verifying on student techer mapping");
		techerstudentmapping.verifyStudentTeacherMappingPage();
		FrameworkMethods.logger.info("Verifying on student techer mapping functionality");
		techerstudentmapping.verifyStudentTeacherMappingFunctionality();
		/*
		 * FrameworkMethods.logger.log(Status.PASS, MarkupHelper.
		 * createLabel("Test Case Passed is - Student Teacher Mapping functionality",
		 * ExtentColor.GREEN));
		 */

	}

	@Test(priority = 7)
	public void verify_Add_remove_branches_page() throws Exception {
		addRemoveBranchesPage addRemoveBranches = new addRemoveBranchesPage();
		FrameworkMethods.logger.info("Navigating on add/remove branches");
		addRemoveBranches.navigateToAddRemoveBranches();
		FrameworkMethods.logger.info("Verifying Add removw branch page");
		addRemoveBranches.verifyAddRemovBrachePage();
		FrameworkMethods.logger.info("Verifying edit branch detail functionality");
		addRemoveBranches.editBranchDetail();
		FrameworkMethods.logger.info("Verifying reset branch detail page");
		addRemoveBranches.resetBranchDetails();
		FrameworkMethods.logger = FrameworkMethods.extent.createTest("Verify_Add_Remove_Branches_Page");
		/*
		 * FrameworkMethods.logger.log(Status.PASS,
		 * MarkupHelper.createLabel("Test Case Passed is - Add Remove Branches page",
		 * ExtentColor.GREEN));
		 */
	}

	@Test(priority = 8)
	public void verify_Add_update_enquiry_page() throws Exception {
		equiriesPage enquiry = new equiriesPage();
		FrameworkMethods.logger.info("Navigating on add equiry page");
		enquiry.navigateToAddEnquiryPage(); 
		FrameworkMethods.logger.info("Entering details for Enquiry");
		enquiry.addEnquiry();		
		FrameworkMethods.logger.info("Search Enquiry");
		enquiry.searchEnquiry();
		FrameworkMethods.logger = FrameworkMethods.extent.createTest("Verify_Enquiry_Page");
		/*
		 * FrameworkMethods.logger.log(Status.PASS,
		 * MarkupHelper.createLabel("Test Case Passed is - Enqiury Page",
		 * ExtentColor.GREEN));
		 */
	}

	@Test(priority = 9)
	public void verify_referral_activity_page() throws Exception {
		referralManagementPage referralPage=new referralManagementPage();
		FrameworkMethods.logger.info("Navigating on referral Management page");
		referralPage.navigateToReferralManagementPage();
		FrameworkMethods.logger.info("Verifying referral Management page");
		referralPage.verifyReferralRewardManagement();
		FrameworkMethods.logger.info("Navigating on referral Management page");
		referralPage.verifyReferralManagement();
		FrameworkMethods.logger = FrameworkMethods.extent.createTest("Verify_Referral_Activity_Page");
		/*
		 * FrameworkMethods.logger.log(Status.PASS, MarkupHelper.
		 * createLabel("Test Case Passed is - Verifiy Referral Activity page",
		 * ExtentColor.GREEN));
		 */
	}	
	
	@Test(priority = 10)
	public void verify_photo_approval_management_page() throws Exception {
		studentPhotoApprovalPage studentPhotoApproval=new studentPhotoApprovalPage();
		homePage homepage=new homePage();
		loginPage  loginpage= new loginPage();
		FrameworkMethods.logger.info("Logged out");
		homepage.doLogout();
		FrameworkMethods.logger.info("Login as a student");
		loginpage.IsUserOnLoginPage();
		FrameworkMethods.logger.info("Navigating on upload profile photo");
		studentPhotoApproval.navigateToUploadProfilePhoto();
		FrameworkMethods.logger.info("Send photo approval request");
		studentPhotoApproval.sendPhotoApprovalRequest();
		FrameworkMethods.logger.info("Logged out");
		homepage.doLogout();
		FrameworkMethods.logger.info("Login as an admin");
		loginpage.doLogin();
		FrameworkMethods.logger.info("Login as an admin");
		studentPhotoApproval.navigateToStudentPhotoRequestPage();
		FrameworkMethods.logger.info("Approving photo request");
		studentPhotoApproval.aprrovePhotoRequest();
		FrameworkMethods.logger.info("do logout");
		homepage.doLogout();
		FrameworkMethods.logger.info("Login as a student");
		loginpage.IsUserOnLoginPage();
		FrameworkMethods.logger.info("Verifying photo approval message");
		studentPhotoApproval.verifyPhotoAprrovalMessage();
		homepage.doLogout();
		loginpage.doLogin();
		FrameworkMethods.logger = FrameworkMethods.extent.createTest("verify_photo_approval_management_page");
		/*
		 * FrameworkMethods.logger.log(Status.PASS, MarkupHelper.
		 * createLabel("Test Case Passed is - verify_photo_approval_management_page",
		 * ExtentColor.GREEN));
		 */
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
