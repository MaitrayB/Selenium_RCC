package Regression_Tests;

import org.testng.annotations.Test;

import Admin_Send_SMS_Package.SMSPage;
import Admin_screens.SendSMSPageLocators;
import coaching_center_base.BaseClass;
import coaching_center_base.FrameworkMethods;

public class Send_SMS_Test extends BaseClass implements SendSMSPageLocators  {
	
	@Test(priority = 1)
	public void verifySendSMSFunctionality() throws Exception {
		FrameworkMethods.logger = FrameworkMethods.extent.createTest("Verify Send SMS");
		SMSPage smsPage=new SMSPage();
		smsPage.naviagteToSMSPage();
		smsPage.verifySendSMSPage();
		smsPage.verifySendSMSFunctionality();
	}
	
}
