package Regression_Tests;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import Admin_Group_SAT_Pages.ManageClass_BatchDetailViewer;
import Admin_Group_SAT_Pages.ManageClass_BatchMapping;
import Admin_Group_SAT_Pages.ManageClass_ManageBatches;
import Admin_Group_SAT_Pages.ManageClass_MangeVideo;
import Admin_Group_SAT_Pages.ManageClass_SAT_Batch_Test_Schedule;
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


}
