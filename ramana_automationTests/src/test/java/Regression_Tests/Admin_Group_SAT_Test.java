package Regression_Tests;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import Admin_BranchManagement_pages.homePage;
import Admin_BranchManagement_pages.loginPage;
import Admin_Group_SAT_Pages.ManageClass_BatchDetailViewer;
import Admin_Group_SAT_Pages.ManageClass_ManageBatches;
import coaching_center_base.BaseClass;
import coaching_center_base.FrameworkMethods;

public class Admin_Group_SAT_Test {
	
	@Test(priority = 1)
	public void verifyManageClass() throws Exception {
		ManageClass_ManageBatches manageClassPage=new ManageClass_ManageBatches();
		manageClassPage.navigateToManageClass();
		manageClassPage.CreateBatch();
		manageClassPage.DeactivateBatch();
	}
	
	@Test(priority = 2)
	public void verifyActiveInactiveStudetFunc() throws Exception {
		ManageClass_BatchDetailViewer batchdetails=new ManageClass_BatchDetailViewer();
		batchdetails.navigateToBatchDeatils();
		batchdetails.inactiveStudent();
		batchdetails.navigateToBatchDeatils();
		batchdetails.activeStudent();
	}
	
	
}
