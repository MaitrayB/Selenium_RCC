package Admin_Referral_Page;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import Admin_screens.ReferralPageLocators;
import coaching_center_base.BaseClass;
import coaching_center_base.FrameworkMethods;

public class Referral_Programe_Page extends BaseClass implements ReferralPageLocators {
	@FindBy(how = How.XPATH, using = MENU_REFERRAL_PROGRAMME_XPATH)
	private WebElement menu_referal;

	@FindBy(how = How.XPATH, using = TAB_REFER_NOW_XPATH)
	private WebElement tab_refer_now;

	@FindBy(how = How.XPATH, using = TAB_MY_REFERAL_XPATH)
	private WebElement tab_my_referal;

	@FindBy(how = How.XPATH, using = TXT_NAME_XPATH)
	private WebElement txt_name;

	@FindBy(how = How.XPATH, using = TXT_EMAIL_XPATH)
	private WebElement txt_email;

	@FindBy(how = How.XPATH, using = TXT_PHONE_XPATH)
	private WebElement txt_phone;

	@FindBy(how = How.XPATH, using = TXT_MESSAGE_XATH)
	private WebElement txt_message;

	@FindBy(how = How.XPATH, using = BTN_INVITE_XPATH)
	private WebElement btn_invite;

	@FindBy(how = How.XPATH, using = MSG_SUCCESS_XPATH)
	private WebElement msg_success;
	
	@FindBy(how = How.XPATH, using = BTN_RESEND_XPATH)
	private WebElement btn_resend;

	public WebElement getBtn_resend() {
		return btn_resend;
	}
	
	public Referral_Programe_Page() {
		PageFactory.initElements(BaseClass.driver, this);
	}

	public WebElement getTxt_message() {
		return txt_message;
	}

	public WebElement getMenu_referal() {
		return menu_referal;
	}

	public WebElement getTab_refer_now() {
		return tab_refer_now;
	}

	public WebElement getTab_my_referal() {
		return tab_my_referal;
	}

	public WebElement getTxt_name() {
		return txt_name;
	}

	public WebElement getTxt_email() {
		return txt_email;
	}

	public WebElement getTxt_phone() {
		return txt_phone;
	}

	public WebElement getBtn_invite() {
		return btn_invite;
	}

	public WebElement getMsg_success() {
		return msg_success;
	}

	public void navigateToReferralProgramePage() throws InterruptedException {
		getMenu_referal().click();
		waitForPageLoad();
		waitForMinTime();
	}

	public void verifyReferNowTab() throws Exception {
		verifyElement(getTxt_name(), "Friend Name Textbox");
		verifyElement(getTxt_email(), "Friend Email Textbox");
		verifyElement(getTxt_phone(), "Friend Phone Textbox");
		verifyElement(getTxt_message(),"Message Textarea");
		verifyElement(getTxt_phone(), "Friend Phone Textbox");
	}
	
	public void verifyInviteRefer() throws Exception {
		FrameworkMethods.logger.info("Entering Friends Name:"+ FrameworkMethods.getCustomProperty("student_first_name"));
		getTxt_name().sendKeys(FrameworkMethods.getCustomProperty("student_first_name"));
		FrameworkMethods.logger.info("Entering Friends Email:"+ FrameworkMethods.getCustomProperty("student_email"));
		getTxt_email().sendKeys(FrameworkMethods.getCustomProperty("student_email"));
		FrameworkMethods.logger.info("Entering Friends Phone:"+ FrameworkMethods.getCustomProperty("parent_mobile_number"));
		getTxt_phone().sendKeys(FrameworkMethods.getCustomProperty("parent_mobile_number"));
		getBtn_invite().click();
		waitForMinTime();
		scrollUp();
		verifyElement(getMsg_success(), "Success Message");
	}
	
	public void verifyMyReferralTab() throws Exception {
		getTab_my_referal().click();
		waitForMinTime();
		getBtn_resend().click();
		verifyElement(getMsg_success(), "Success Message");
	}
}
