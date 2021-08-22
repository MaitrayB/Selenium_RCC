package Regression_Tests;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import Admin_BranchManagement_pages.homePage;
import Admin_BranchManagement_pages.loginPage;
import Admin_Group_SAT_Pages.ManageClassPage;
import coaching_center_base.BaseClass;
import coaching_center_base.FrameworkMethods;

public class Admin_Group_SAT_Test {
	
	@Test(priority = 1)
	public void navigateToManageClass() throws Exception {
		ManageClassPage manageClassPage=new ManageClassPage();
		manageClassPage.navigateToManageClass();
	}
}
