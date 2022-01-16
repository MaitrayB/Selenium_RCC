package Regression_Tests;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import Admin_BranchManagement_pages.homePage;
import Admin_BranchManagement_pages.loginPage;
import Admin_Staff_Management_Pages.Admin_Search_Pages;
import Admin_Staff_Management_Pages.Admin_StaffManagement_Pages;
import Admin_Staff_Management_Pages.Admin_Teacher_Attendance_Track;
import Admin_Staff_Management_Pages.TeacherskillsetPage;
import Admin_screens.Locators.HomePageLocators;
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
		searchPage.searchInActiveStaff();;
		searchPage.searchInPendingApproval();
		FrameworkMethods.logger.log(Status.PASS,
				MarkupHelper.createLabel("Test Case Passed is - verifyStaffApproval", ExtentColor.GREEN));
	}
	
	@Test(priority = 3)
	public void verifyTeacherAvailability() throws Exception {
		FrameworkMethods.logger = FrameworkMethods.extent.createTest("Verify teacher's availability");
		homePage homepage=new homePage();
		loginPage loginpage=new loginPage();
		homepage.doLogout();
		loginpage.LoginAsTeacher();
		Admin_Teacher_Attendance_Track attendanceTrack= new Admin_Teacher_Attendance_Track();
		attendanceTrack.navigateToMyAvailability();
		attendanceTrack.checkMyAttendance();
		homepage.doLogout();
		loginpage.doLogin();
		attendanceTrack.navigateToTeacherAvailability();
		attendanceTrack.selectTeacher();
		attendanceTrack.verifyOptionAvailable();
		homepage.doLogout();
		loginpage.LoginAsTeacher();
		attendanceTrack.navigateToMyAvailability();
		attendanceTrack.checkMyAttendance();
		homepage.doLogout();
		loginpage.doLogin();
		attendanceTrack.navigateToTeacherAvailability();
		attendanceTrack.selectTeacher();
		attendanceTrack.verifyOptionNotAvailable();
		homepage.doLogout();
		loginpage.doLogin();
		FrameworkMethods.logger.log(Status.PASS,
				MarkupHelper.createLabel("Test Case Passed is - verifyTeacherAvailability", ExtentColor.GREEN));
	}
	
	@Test(priority = 4)
	public void verifySkillSet() throws Exception {
		FrameworkMethods.logger = FrameworkMethods.extent.createTest("Verify teacher's attandance");
		TeacherskillsetPage skillsetPage=new TeacherskillsetPage();
		homePage homepage=new homePage();
		loginPage loginpage=new loginPage();
		homepage.doLogout();
		loginpage.LoginAsTeacher();
		skillsetPage.navigateToMySkillset();
		skillsetPage.selectGrade();
		homepage.doLogout();
		loginpage.doLogin();
		skillsetPage.navigateToTeacherSkillset();
		skillsetPage.selectTeacher();
		skillsetPage.verifyGread1();
		homepage.doLogout();
		loginpage.LoginAsTeacher();
		skillsetPage.navigateToMySkillset();
		skillsetPage.selectGrade();
		homepage.doLogout();
		loginpage.doLogin();
		skillsetPage.navigateToTeacherSkillset();
		skillsetPage.selectTeacher();
		skillsetPage.verifyGread();
		FrameworkMethods.logger.log(Status.PASS,
				MarkupHelper.createLabel("Test Case Passed is - verifySkillSet", ExtentColor.GREEN));
	}
	
}
