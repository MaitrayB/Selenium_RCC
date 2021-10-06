package Admin_BranchManagement_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Admin_screens.Locators.Menus;
import Admin_screens.Locators.NewRegistrationLocators;
import Admin_screens.Locators.ReferalManagementLocators;
import coaching_center_base.BaseClass;

public class referralManagementPage extends BaseClass implements ReferalManagementLocators, Menus {

	@FindBy(how = How.XPATH, using = MENU_REFERAL_MANAGEMENT_XPATH)
	private WebElement menu_referal_management;

	@FindBy(how = How.XPATH, using = TAB_REFERAL_ACTIVITY_XPATH)
	private WebElement tab_referal_activity;

	@FindBy(how = How.XPATH, using = TAB_REFERALL_REWARD_XPATH)
	private WebElement tab_reward_activity;

	@FindBy(how = How.XPATH, using = FIELD_REFERRER_NAME_XPATH)
	private WebElement referal_name;

	@FindBy(how = How.XPATH, using = FIELD_REFERRER_EMAIL_XPATH)
	private WebElement referal_email;

	@FindBy(how = How.XPATH, using = FIELD_CUSTOMER_NAME_XPATH)
	private WebElement customer_name;

	@FindBy(how = How.XPATH, using = FIELD_CUSTOMER_EMAIL_XPATH)
	private WebElement customer_email;

	@FindBy(how = How.XPATH, using = FIELD_APPROVE_DATE_XPATH)
	private WebElement approve_date;

	@FindBy(how = How.XPATH, using = FIELD_REWARD_DATE_XPATH)
	private WebElement reward_date;
	

	@FindBy(how = How.XPATH, using = FIELD_ACTION_STATUS_XPATH)
	private WebElement action_status;

	@FindBy(how = How.XPATH, using = FIELD_REFERRER_ACTIVITY_NAME_XPATH)
	private WebElement referrer_activity_name;

	@FindBy(how = How.XPATH, using = FIELD_REFERRER_ACTIVITY_EMAIL_XPATH)
	private WebElement referrer_activity_email;

	@FindBy(how = How.XPATH, using = FIELD_CUSTOMER_ACTIVITY_NAME_XPATH)
	private WebElement customer_activity_name;

	@FindBy(how = How.XPATH, using = FIELD_REFERRAL_DATE_XPATH)
	private WebElement referal_date;

	@FindBy(how = How.XPATH, using = FIELD_CUSTOMER_ACTIVITY_EMAIL_XPATH)
	private WebElement customer_activity_email;

	@FindBy(how = How.XPATH, using = FIELD_APPROVE_ACTIVITY_DATE_XPATH)
	private WebElement approval_activity_date;

	@FindBy(how = How.XPATH, using = FIELD_ACTION_ACTIVITY_STATUS_XPATH)
	private WebElement reward_action_activity;

	/**
	 * 
	 */
	public referralManagementPage() {
		PageFactory.initElements(BaseClass.driver, this);
		// TODO Auto-generated constructor stub
	}

	public WebElement getMenu_referal_management() {
		return menu_referal_management;
	}

	public WebElement getTab_referal_activity() {
		return tab_referal_activity;
	}

	public WebElement getReferal_name() {
		return referal_name;
	}

	public WebElement getReferal_email() {
		return referal_email;
	}

	public WebElement getCustomer_name() {
		return customer_name;
	}

	public WebElement getCustomer_email() {
		return customer_email;
	}

	public WebElement getApprove_date() {
		return approve_date;
	}

	
	public WebElement getReferal_date() {
		return referal_date;
	}

	public WebElement getReward_date() {
		return reward_date;
	}

	public WebElement getAction_status() {
		return action_status;
	}

	public WebElement getReferrer_activity_name() {
		return referrer_activity_name;
	}

	public WebElement getReferrer_activity_email() {
		return referrer_activity_email;
	}

	public WebElement getCustomer_activity_name() {
		return customer_activity_name;
	}

	public WebElement getCustomer_activity_email() {
		return customer_activity_email;
	}

	public WebElement getApproval_activity_date() {
		return approval_activity_date;
	}

	
	public WebElement getReward_action_activity() {
		return reward_action_activity;
	}

	public WebElement getTab_reward_activity() {
		return tab_reward_activity;
	}

	public void navigateToReferralManagementPage() throws InterruptedException {
		getMenu_referal_management().click();
		waitForPageLoad();
	}

	public void verifyReferralRewardManagement() throws Exception {
		verifyElement(getTab_referal_activity(), "Tab referral Activity");
		verifyElement(getReferal_name(), "Referrer Name");
		verifyElement(getReferal_email(), "Referrer Email ID");
		verifyElement(getCustomer_name(), "Customer Name");
		verifyElement(getCustomer_email(), "Customer Email");
		verifyElement(getApprove_date(), "Approval Date");
		verifyElement(getReward_date(), "Reward Date");
		verifyElement(getAction_status(), "Action status");
	}

	public void verifyReferralManagement()throws Exception {
		getTab_reward_activity().click();
		verifyElement(getTab_reward_activity(), "Tab reward Activity");
		verifyElement(getReferrer_activity_name(), "Referrer Name");
		verifyElement(getReferrer_activity_email(), "Referrer Email ID");
		verifyElement(getReferal_date(), "Referal Date");
		verifyElement(getCustomer_activity_name(), "Customer Name");
		verifyElement(getCustomer_activity_email(), "Customer Email");
		verifyElement(getApproval_activity_date(), "Approval Date");
		verifyElement(getReward_action_activity(), "Redemption Date");
		verifyElement(getReward_date(), "Action status");
	}
}
