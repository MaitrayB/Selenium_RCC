package Regression_Tests;

import org.testng.annotations.Test;
import Admin_Group_SAT_Pages.ManageClass_BatchDetailViewer;
import Admin_Group_SAT_Pages.ManageClass_ManageBatches;
import Admin_Group_SAT_Pages.ManageClass_MangeVideo;

public class Admin_Group_SAT_Test {
	
	@Test(priority = 1)
	public void verifyManageClass() throws Exception {
		ManageClass_ManageBatches manageClassPage=new ManageClass_ManageBatches();
		manageClassPage.verifyUserIsOnSATPage();
		manageClassPage.navigateToManageClass();
		manageClassPage.CreateBatch();
		manageClassPage.DeactivateBatch();
	}
	
	@Test(priority = 2)
	public void verifyActiveInactiveStudetFunc() throws Exception {
		ManageClass_BatchDetailViewer batchdetails=new ManageClass_BatchDetailViewer();
		batchdetails.verifyUserIsOnSATPage();
		batchdetails.navigateToBatchDeatils();
		batchdetails.inactiveStudent();
		batchdetails.verifyUserIsOnSATPage();
		batchdetails.navigateToBatchDeatils();
		batchdetails.activeStudent();
	}
	
	@Test(priority = 3)
	public void verifySudentVideoFunc() throws Exception {
		ManageClass_MangeVideo manageVideo=new ManageClass_MangeVideo();
		manageVideo.verifyUserIsOnSATPage();
		manageVideo.navigateToManageClassVideo();
		manageVideo.createLink();
		manageVideo.deleteAddedVideo();
	}
}
