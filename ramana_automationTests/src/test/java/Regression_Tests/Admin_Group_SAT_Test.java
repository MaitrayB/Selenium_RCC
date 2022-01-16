package Regression_Tests;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import Admin_Group_SAT_Pages.ManageClass_AttendanceTracker;
import Admin_Group_SAT_Pages.ManageClass_BatchDetailViewer;
import Admin_Group_SAT_Pages.ManageClass_BatchMapping;
import Admin_Group_SAT_Pages.ManageClass_Learning_Phase_Tracker;
import Admin_Group_SAT_Pages.ManageClass_ManageBatches;
import Admin_Group_SAT_Pages.ManageClass_MangeVideo;
import Admin_Group_SAT_Pages.ManageClass_Proctoring;
import Admin_Group_SAT_Pages.ManageClass_SAT_Batch_Test_Schedule;
import Admin_Group_SAT_Pages.ManageClass_SAT_BroadcastMessage;
import Admin_Group_SAT_Pages.ManageClass_SAT_CumulativeAnalytics;
import Admin_Group_SAT_Pages.ManageClass_SAT_Cumulative_Scrore_Card;
import Admin_Group_SAT_Pages.ManageClass_SAT_Scoretracker;
import Admin_Group_SAT_Pages.ManageClass_SAT_Student_Analytics;
import Admin_Group_SAT_Pages.ManageClass_SAT_Text_Book_form;
import Admin_Group_SAT_Pages.ManageClass_SAT_Text_Details;
import Admin_Group_SAT_Pages.ManageClass_Student_Progress_Tracker;
import coaching_center_base.FrameworkMethods;

public class Admin_Group_SAT_Test {

	@Test(priority = 1)
	public void verifyManageClass() throws Exception {
		ManageClass_ManageBatches manageClassPage = new ManageClass_ManageBatches();
		manageClassPage.verifyUserIsOnSATPage();
		FrameworkMethods.logger = FrameworkMethods.extent.createTest("Verify Create/de-activate batches");
		FrameworkMethods.logger.info("Navigating on ManageClass Page");
		manageClassPage.navigateToManageClass();
		FrameworkMethods.logger.info("Creating a new Batch");
		manageClassPage.CreateBatch();
		FrameworkMethods.logger.info("New Batch Created");
		FrameworkMethods.logger.info("Deactivating new batch");
		manageClassPage.DeactivateBatch();
		FrameworkMethods.logger.info("New batch deactivated");
		
	}

	@Test(priority = 2)
	public void verifyActiveInactiveStudetFunc() throws Exception {
		FrameworkMethods.logger = FrameworkMethods.extent.createTest("verifyActiveInactiveStudetFunc");
		ManageClass_BatchDetailViewer batchdetails = new ManageClass_BatchDetailViewer();
		batchdetails.verifyUserIsOnSATPage();
		FrameworkMethods.logger.info("Navigating on Batch detail Page");
		batchdetails.navigateToBatchDeatils();
		FrameworkMethods.logger.info("Inactive the Student");
		batchdetails.inactiveStudent();
		batchdetails.verifyUserIsOnSATPage();
		batchdetails.navigateToBatchDeatils();
		FrameworkMethods.logger.info("Active the student");
		batchdetails.activeStudent();
	
	}

	@Test(priority = 3)
	public void verifySudentVideoFunc() throws Exception {
		ManageClass_MangeVideo manageVideo = new ManageClass_MangeVideo();
		manageVideo.verifyUserIsOnSATPage();
		FrameworkMethods.logger.info("Navigating on User's SAT Page");
		manageVideo.navigateToManageClassVideo();
		FrameworkMethods.logger.info("Create Link");
		manageVideo.createLink();
		FrameworkMethods.logger.info("Deleting the added video");
		manageVideo.deleteAddedVideo();
		FrameworkMethods.logger = FrameworkMethods.extent.createTest("verifySudentVideoFunc");
		
		
	}

	@Test(priority = 4)
	public void verifyStudentProgressTracker() throws Exception {
		ManageClass_Student_Progress_Tracker studentProgress = new ManageClass_Student_Progress_Tracker();
		studentProgress.verifyUserIsOnSATPage();
		FrameworkMethods.logger.info("Navigating on student progress page");
		studentProgress.navigateToStudentProgressPage();
		FrameworkMethods.logger.info("Verifying student progress tracker");
		studentProgress.verifyStudentProgressTracker();
		FrameworkMethods.logger = FrameworkMethods.extent.createTest("verifyStudentProgressTracker");
		FrameworkMethods.logger.log(Status.PASS, MarkupHelper
				.createLabel("Test Case Passed is - Manage Student Progress Tracker Page", ExtentColor.GREEN));
	}

	@Test(priority = 5)
	public void verifyAdminGroupSATTest() throws Exception {
		ManageClass_SAT_Batch_Test_Schedule manageTest = new ManageClass_SAT_Batch_Test_Schedule();
		manageTest.verifyUserIsOnSATPage();
		FrameworkMethods.logger.info("Navigating on batch schedule page");
		manageTest.navigateToSatBatchTestSchedule();
		FrameworkMethods.logger.info("Scheduling the test");
		manageTest.scheduleTest();
		FrameworkMethods.logger = FrameworkMethods.extent.createTest("verifyAdminGroupSATTest");
		
	}

	@Test(priority = 6)
	public void verifyBatchAndStudentMapping() throws Exception {
		ManageClass_BatchMapping batchMapping = new ManageClass_BatchMapping();
		batchMapping.verifyUserIsOnSATPage();
		FrameworkMethods.logger.info("Navigating on batch and student mapping");
		batchMapping.navigateToBatchAndStudentMapping();
		FrameworkMethods.logger.info("Verifying on batch and student mapping");
		batchMapping.verifyBatchAndStudentMapping();
		FrameworkMethods.logger.info("Naviagtg to batch and teacher mapping");
		batchMapping.navigateToBatchAndTeacherMapping();
		FrameworkMethods.logger.info("Verifying batch and teacher mapping");
		batchMapping.verifyBatchAndTeacherMapping();
		FrameworkMethods.logger.info("Navigate to batch and mapping");
		batchMapping.navigateToBatchAndBookMapping();
		FrameworkMethods.logger.info("Verifying batch and text mapping");
		batchMapping.verifyBatchAndTextMapping();
		FrameworkMethods.logger = FrameworkMethods.extent.createTest("verifyBatchAndStudentMapping");
		
	}

	@Test(priority = 7)
	public void verifyTextBookForm() throws Exception {
		ManageClass_SAT_Text_Book_form textbookForm = new ManageClass_SAT_Text_Book_form();
		textbookForm.verifyUserIsOnSATPage();
		FrameworkMethods.logger.info("Navigating on SAT form textform");
		textbookForm.naviagteToSATFormtextbook();
		FrameworkMethods.logger.info("Verifying add textbook form");
		textbookForm.VerifyAddTextbookForm();
		FrameworkMethods.logger = FrameworkMethods.extent.createTest("verifyTextBookForm");
		
	}

	@Test(priority = 8)
	public void verifySATTestDetails() throws Exception {
		ManageClass_SAT_Text_Details textDetail = new ManageClass_SAT_Text_Details();
		textDetail.verifyUserIsOnSATPage();
		FrameworkMethods.logger.info("Navigating on SAT Test detail tab");
		textDetail.navigateToSATTestDetailTab();
		FrameworkMethods.logger.info("Verifying SAT Test details details");
		textDetail.verifySATTestDetails();
		FrameworkMethods.logger = FrameworkMethods.extent.createTest("verifySATTestDetails");
		
	}

	@Test(priority = 9)
	public void verifyBroadCastMessage() throws Exception {
		ManageClass_SAT_BroadcastMessage broadcastMessage = new ManageClass_SAT_BroadcastMessage();
		broadcastMessage.verifyUserIsOnSATPage();
		FrameworkMethods.logger.info("Navigating on broadcast message page");
		broadcastMessage.navigateToBroadcastMessagePage();
		FrameworkMethods.logger.info("Verifying broadcast message page");
		broadcastMessage.verifyBroadcastMessage();
		FrameworkMethods.logger = FrameworkMethods.extent.createTest("verifyBroadCastMessage");
	
	}

	@Test(priority = 10)
	public void verifyProctoringFunctionality() throws Exception {
		ManageClass_Proctoring proctoting = new ManageClass_Proctoring();
		proctoting.verifyUserIsOnSATPage();
		FrameworkMethods.logger.info("Navigating on Procotoring message page");
		proctoting.navigateToProcotoringPage();
		FrameworkMethods.logger.info("Verifying practice test");
		proctoting.verifyPracticeTest();
		FrameworkMethods.logger.info("Verifying protor detail");
		proctoting.verifyProctorDetail();
		FrameworkMethods.logger = FrameworkMethods.extent.createTest("verifyProctoringFunctionality");

	}

	@Test(priority = 11)

	public void verifyScoreTrackerFunctionality() throws Exception {
		ManageClass_AttendanceTracker attendanceTracker = new ManageClass_AttendanceTracker();
		attendanceTracker.verifyUserIsOnSATPage();
		FrameworkMethods.logger.info("Navigating on Student Attendance page");
		attendanceTracker.navigateToStudentAttendancePage();
		FrameworkMethods.logger.info("Verifying attandance tracker");
		attendanceTracker.verifyAttacndanceTracker();
		FrameworkMethods.logger = FrameworkMethods.extent.createTest("verifyScoreTrackerFunctionality");
	
	}

	@Test(priority = 12)
	public void StudentAnalyticsPage() throws Exception {
		ManageClass_SAT_Student_Analytics studentAnalytics = new ManageClass_SAT_Student_Analytics();
		studentAnalytics.verifyUserIsOnSATPage();
		FrameworkMethods.logger.info("Navigating on Student Analysis page");
		studentAnalytics.navigateToStudentAnalytics();
		FrameworkMethods.logger.info("Verfying Student Analysis page");
		studentAnalytics.verifyStudentAnalystics();
		FrameworkMethods.logger.info("Verfying writing tab");
		studentAnalytics.verifyWritingTab();
		FrameworkMethods.logger.info("Verfying mathematics tab");
		studentAnalytics.verifyMathematics();
		FrameworkMethods.logger = FrameworkMethods.extent.createTest("StudentAnalyticsPage");
	
	}

	@Test(priority = 13)
	public void verifyCumulativeAnalytics() throws Exception {
		ManageClass_SAT_CumulativeAnalytics cumulativeAnalytics = new ManageClass_SAT_CumulativeAnalytics();
		cumulativeAnalytics.verifyUserIsOnSATPage();
		FrameworkMethods.logger.info("Navigating on cumulative Analysis page");
		cumulativeAnalytics.navigateToCumulativeAnalyticsPage();
		FrameworkMethods.logger.info("Verifying cumulative Analysis page");
		cumulativeAnalytics.verifyCumulativeAnalyticsPage();
		FrameworkMethods.logger = FrameworkMethods.extent.createTest("verifyCumulativeAnalytics");
		
	}

	@Test(priority = 14)
	public void verifyCumulativeScore() throws Exception {
		ManageClass_SAT_Cumulative_Scrore_Card cumulativeScorecard = new ManageClass_SAT_Cumulative_Scrore_Card();
		cumulativeScorecard.verifyUserIsOnSATPage();
		FrameworkMethods.logger.info("Navigating to cumulative scrore card page");
		cumulativeScorecard.naviagteToCumulativeScoreCard();
		FrameworkMethods.logger.info("Verifying cumulative score page");
		cumulativeScorecard.verifyCumulativeScorePage();
		FrameworkMethods.logger = FrameworkMethods.extent.createTest("verifyCumulativeScore");
	
	}

	@Test(priority = 15)
	public void verifyLearningPhaseTracker() throws Exception {
		ManageClass_Learning_Phase_Tracker learningPhaseTracker = new ManageClass_Learning_Phase_Tracker();
		learningPhaseTracker.verifyUserIsOnSATPage();
		FrameworkMethods.logger.info("Navigating to learning phase tracker");
		learningPhaseTracker.navigateToLearningPhaseTracker();
		FrameworkMethods.logger.info("Verifying learning phase progress tracker functionality");
		learningPhaseTracker.verifyLearningPhaseProgressTracker();
		FrameworkMethods.logger = FrameworkMethods.extent.createTest("verifyLearningPhaseTracker");

	}

}
