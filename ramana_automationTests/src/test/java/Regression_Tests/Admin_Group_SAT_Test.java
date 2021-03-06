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
		FrameworkMethods.logger.log(Status.PASS,
				MarkupHelper.createLabel("Test Case Passed is - Manage create/de-activate batch", ExtentColor.GREEN));
	}

	@Test(priority = 2)
	public void verifyActiveInactiveStudetFunc() throws Exception {
		ManageClass_BatchDetailViewer batchdetails = new ManageClass_BatchDetailViewer();
		batchdetails.verifyUserIsOnSATPage();
		batchdetails.navigateToBatchDeatils();
		batchdetails.inactiveStudent();
		batchdetails.verifyUserIsOnSATPage();
		batchdetails.navigateToBatchDeatils();
		batchdetails.activeStudent();
		FrameworkMethods.logger = FrameworkMethods.extent.createTest("verifyActiveInactiveStudetFunc");
		FrameworkMethods.logger.log(Status.PASS,
				MarkupHelper.createLabel("Test Case Passed is - Batch Detail Viewer Page", ExtentColor.GREEN));
	}

	@Test(priority = 3)
	public void verifySudentVideoFunc() throws Exception {
		ManageClass_MangeVideo manageVideo = new ManageClass_MangeVideo();
		manageVideo.verifyUserIsOnSATPage();
		manageVideo.navigateToManageClassVideo();
		manageVideo.createLink();
		manageVideo.deleteAddedVideo();
		FrameworkMethods.logger = FrameworkMethods.extent.createTest("verifySudentVideoFunc");
		FrameworkMethods.logger.log(Status.PASS,
				MarkupHelper.createLabel("Test Case Passed is - Mange Class Video Page", ExtentColor.GREEN));
	}

	@Test(priority = 4)
	public void verifyStudentProgressTracker() throws Exception {
		ManageClass_Student_Progress_Tracker studentProgress = new ManageClass_Student_Progress_Tracker();
		studentProgress.verifyUserIsOnSATPage();
		studentProgress.navigateToStudentProgressPage();
		studentProgress.verifyStudentProgressTracker();
		FrameworkMethods.logger = FrameworkMethods.extent.createTest("verifyStudentProgressTracker");
		FrameworkMethods.logger.log(Status.PASS, MarkupHelper
				.createLabel("Test Case Passed is - Manage Student Progress Tracker Page", ExtentColor.GREEN));
	}

	@Test(priority = 5)
	public void verifyAdminGroupSATTest() throws Exception {
		ManageClass_SAT_Batch_Test_Schedule manageTest = new ManageClass_SAT_Batch_Test_Schedule();
		manageTest.verifyUserIsOnSATPage();
		manageTest.navigateToSatBatchTestSchedule();
		manageTest.scheduleTest();
		FrameworkMethods.logger = FrameworkMethods.extent.createTest("verifyAdminGroupSATTest");
		FrameworkMethods.logger.log(Status.PASS,
				MarkupHelper.createLabel("Test Case Passed is - SAT Batch Test Schedule ", ExtentColor.GREEN));

	}

	@Test(priority = 6)
	public void verifyBatchAndStudentMapping() throws Exception {
		ManageClass_BatchMapping batchMapping = new ManageClass_BatchMapping();
		batchMapping.verifyUserIsOnSATPage();
		batchMapping.navigateToBatchAndStudentMapping();
		batchMapping.verifyBatchAndStudentMapping();
		batchMapping.navigateToBatchAndTeacherMapping();
		batchMapping.verifyBatchAndTeacherMapping();
		batchMapping.navigateToBatchAndBookMapping();
		batchMapping.verifyBatchAndTextMapping();
		FrameworkMethods.logger = FrameworkMethods.extent.createTest("verifyBatchAndStudentMapping");
		FrameworkMethods.logger.log(Status.PASS,
				MarkupHelper.createLabel("Test Case Passed is - SAT Batch Test Schedule ", ExtentColor.GREEN));

	}

	@Test(priority = 7)
	public void verifyTextBookForm() throws Exception {
		ManageClass_SAT_Text_Book_form textbookForm = new ManageClass_SAT_Text_Book_form();
		textbookForm.verifyUserIsOnSATPage();
		textbookForm.naviagteToSATFormtextbook();
		textbookForm.VerifyAddTextbookForm();
		FrameworkMethods.logger = FrameworkMethods.extent.createTest("verifyTextBookForm");
		FrameworkMethods.logger.log(Status.PASS,
				MarkupHelper.createLabel("Test Case Passed is - verifyTextBookForm ", ExtentColor.GREEN));

	}

	@Test(priority = 8)
	public void verifySATTestDetails() throws Exception {
		ManageClass_SAT_Text_Details textDetail = new ManageClass_SAT_Text_Details();
		textDetail.verifyUserIsOnSATPage();
		textDetail.navigateToSATTestDetailTab();
		textDetail.verifySATTestDetails();
		FrameworkMethods.logger = FrameworkMethods.extent.createTest("verifySATTestDetails");
		FrameworkMethods.logger.log(Status.PASS,
				MarkupHelper.createLabel("Test Case Passed is - verifySATTestDetails ", ExtentColor.GREEN));
	}

	@Test(priority = 9)
	public void verifyBroadCastMessage() throws Exception {
		ManageClass_SAT_BroadcastMessage broadcastMessage = new ManageClass_SAT_BroadcastMessage();
		broadcastMessage.verifyUserIsOnSATPage();
		broadcastMessage.navigateToBroadcastMessagePage();
		broadcastMessage.verifyBroadcastMessage();
		FrameworkMethods.logger = FrameworkMethods.extent.createTest("verifyBroadCastMessage");
		FrameworkMethods.logger.log(Status.PASS,
				MarkupHelper.createLabel("Test Case Passed is - verifyBroadCastMessage ", ExtentColor.GREEN));
	}

	@Test(priority = 10)
	public void verifyProctoringFunctionality() throws Exception {
		ManageClass_Proctoring proctoting = new ManageClass_Proctoring();
		proctoting.verifyUserIsOnSATPage();
		proctoting.navigateToProcotoringPage();
		proctoting.verifyPracticeTest();
		proctoting.verifyProctorDetail();
		FrameworkMethods.logger = FrameworkMethods.extent.createTest("verifyProctoringFunctionality");
		FrameworkMethods.logger.log(Status.PASS,
				MarkupHelper.createLabel("Test Case Passed is - verifyProctoringFunctionality ", ExtentColor.GREEN));
	}

	@Test(priority = 11)

	public void verifyScoreTrackerFunctionality() throws Exception {
		ManageClass_AttendanceTracker attendanceTracker = new ManageClass_AttendanceTracker();
		attendanceTracker.verifyUserIsOnSATPage();
		attendanceTracker.navigateToStudentAttendancePage();
		attendanceTracker.verifyAttacndanceTracker();
		FrameworkMethods.logger = FrameworkMethods.extent.createTest("verifyScoreTrackerFunctionality");
		FrameworkMethods.logger.log(Status.PASS,
				MarkupHelper.createLabel("Test Case Passed is - verifyScoreTrackerFunctionality ", ExtentColor.GREEN));
	}

	@Test(priority = 12)
	public void StudentAnalyticsPage() throws Exception {
		ManageClass_SAT_Student_Analytics studentAnalytics = new ManageClass_SAT_Student_Analytics();
		studentAnalytics.verifyUserIsOnSATPage();
		studentAnalytics.navigateToStudentAnalytics();
		studentAnalytics.verifyStudentAnalystics();
		studentAnalytics.verifyWritingTab();
		studentAnalytics.verifyMathematics();
		FrameworkMethods.logger = FrameworkMethods.extent.createTest("StudentAnalyticsPage");
		FrameworkMethods.logger.log(Status.PASS,
				MarkupHelper.createLabel("Test Case Passed is - StudentAnalyticsPage ", ExtentColor.GREEN));
	}

	@Test(priority = 13)
	public void verifyCumulativeAnalytics() throws Exception {
		ManageClass_SAT_CumulativeAnalytics cumulativeAnalytics = new ManageClass_SAT_CumulativeAnalytics();
		cumulativeAnalytics.verifyUserIsOnSATPage();
		cumulativeAnalytics.navigateToCumulativeAnalyticsPage();
		cumulativeAnalytics.verifyCumulativeAnalyticsPage();
		FrameworkMethods.logger = FrameworkMethods.extent.createTest("verifyCumulativeAnalytics");
		FrameworkMethods.logger.log(Status.PASS,
				MarkupHelper.createLabel("Test Case Passed is - verifyCumulativeAnalytics ", ExtentColor.GREEN));
	}

	@Test(priority = 14)
	public void verifyCumulativeScore() throws Exception {
		ManageClass_SAT_Cumulative_Scrore_Card cumulativeScorecard = new ManageClass_SAT_Cumulative_Scrore_Card();
		cumulativeScorecard.verifyUserIsOnSATPage();
		cumulativeScorecard.naviagteToCumulativeScoreCard();
		cumulativeScorecard.verifyCumulativeScorePage();
		FrameworkMethods.logger = FrameworkMethods.extent.createTest("verifyCumulativeScore");
		FrameworkMethods.logger.log(Status.PASS,
				MarkupHelper.createLabel("Test Case Passed is - verifyCumulativeScore ", ExtentColor.GREEN));

	}

	@Test(priority = 15)
	public void verifyLearningPhaseTracker() throws Exception {
		ManageClass_Learning_Phase_Tracker learningPhaseTracker = new ManageClass_Learning_Phase_Tracker();
		learningPhaseTracker.verifyUserIsOnSATPage();
		learningPhaseTracker.navigateToLearningPhaseTracker();
		learningPhaseTracker.verifyLearningPhaseProgressTracker();
		FrameworkMethods.logger = FrameworkMethods.extent.createTest("verifyLearningPhaseTracker");
		FrameworkMethods.logger.log(Status.PASS,
				MarkupHelper.createLabel("Test Case Passed is - verifyLearningPhaseTracker ", ExtentColor.GREEN));

	}

}
