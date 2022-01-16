package Regression_Tests;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import Admin_One_OnOne_ClassManagement_Page.ClassManagement_AttendanceTracker;
import coaching_center_base.FrameworkMethods;

public class OneOnOne_ClassManagement_Test {
	
	@Test(priority = 1)
	public void verifyManageClass() throws Exception {
		ClassManagement_AttendanceTracker attandanceTracker = new ClassManagement_AttendanceTracker();
		attandanceTracker.navigateToAttendanceTrackerPage();
		attandanceTracker.verifyAttendaceTrackerPage();
		attandanceTracker.verifyScheduleTest();
		attandanceTracker.saveAttendanceTest();
		attandanceTracker.verifyAttendancePrograme();
		FrameworkMethods.logger = FrameworkMethods.extent.createTest("Verify Create/de-activate batches");
		FrameworkMethods.logger.log(Status.PASS,
				MarkupHelper.createLabel("Test Case Passed is - Manage create/de-activate batch", ExtentColor.GREEN));
	}
	
	
	
	
}
	