package Regression_Tests;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import Admin_Group_SAT_Pages.ManageClass_AttendanceTracker;
import Admin_Group_SAT_Pages.ManageClass_BatchDetailViewer;
import Admin_Group_SAT_Pages.ManageClass_BatchMapping;
import Admin_Group_SAT_Pages.ManageClass_ManageBatches;
import Admin_Group_SAT_Pages.ManageClass_MangeVideo;
import Admin_Group_SAT_Pages.ManageClass_Proctoring;
import Admin_Group_SAT_Pages.ManageClass_SAT_Batch_Test_Schedule;
import Admin_Group_SAT_Pages.ManageClass_SAT_BroadcastMessage;
import Admin_Group_SAT_Pages.ManageClass_SAT_Scoretracker;
import Admin_Group_SAT_Pages.ManageClass_SAT_Text_Book_form;
import Admin_Group_SAT_Pages.ManageClass_SAT_Text_Details;
import Admin_Group_SAT_Pages.ManageClass_Student_Progress_Tracker;
import coaching_center_base.FrameworkMethods;

public class Admin_Group_SAT_Test {

	@Test(priority = 1)
	public void verifyManageClass() throws Exception {
		ManageClass_ManageBatches manageClassPage = new ManageClass_ManageBatches();
		manageClassPage.verifyUserIsOnSATPage();
		manageClassPage.navigateToManageClass();
		manageClassPage.CreateBatch();
		manageClassPage.DeactivateBatch();
		FrameworkMethods.logger = FrameworkMethods.extent.createTest("Verify Create/de-activate batches");
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
		FrameworkMethods.logger = FrameworkMethods.extent.createTest("verifyAdminGroupSATTest");
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
		ManageClass_SAT_Text_Details textDetail= new ManageClass_SAT_Text_Details();
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
		ManageClass_Proctoring  proctoting = new ManageClass_Proctoring();
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
		ManageClass_AttendanceTracker attendanceTracker= new ManageClass_AttendanceTracker();
		attendanceTracker.verifyUserIsOnSATPage();
		attendanceTracker.navigateToStudentAttendancePage();
		attendanceTracker.verifyAttacndanceTracker();
		FrameworkMethods.logger = FrameworkMethods.extent.createTest("verifyScoreTrackerFunctionality");
		FrameworkMethods.logger.log(Status.PASS,
				MarkupHelper.createLabel("Test Case Passed is - verifyScoreTrackerFunctionality ", ExtentColor.GREEN));
	}
	
}
