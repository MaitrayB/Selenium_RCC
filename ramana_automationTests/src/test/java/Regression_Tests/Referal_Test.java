package Regression_Tests;

import org.testng.annotations.Test;

import Admin_Referral_Page.Referral_Programe_Page;
import coaching_center_base.FrameworkMethods;

public class Referal_Test {
	@Test(priority = 1)
	public void verifyReferalDetail() throws Exception 
	{
		FrameworkMethods.logger = FrameworkMethods.extent.createTest("Verify survey detail");
		Referral_Programe_Page referral_page= new Referral_Programe_Page();
		referral_page.navigateToReferralProgramePage();
		referral_page.verifyReferNowTab();
		referral_page.verifyInviteRefer();
		referral_page.verifyMyReferralTab();
	}

	

}
