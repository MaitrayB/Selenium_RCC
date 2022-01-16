package Admin_Staff_Management_Pages;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Admin_screens.StaffManagentLocators.Approval_Locators;
import Admin_screens.StaffManagentLocators.Menu_StaffManagement_Locators;
import Admin_screens.StaffManagentLocators.StaffAccount_Locators;
import coaching_center_base.BaseClass;
import coaching_center_base.FrameworkMethods;

public class Admin_StaffManagement_Pages extends BaseClass
		implements Menu_StaffManagement_Locators, StaffAccount_Locators, Approval_Locators {

	@FindBy(how = How.XPATH, using = TAB_REGISTRATION_XPATH)
	private WebElement tab_Registration;

	@FindBy(how = How.XPATH, using = LINK_REGISTRATION_XPATH)
	private WebElement link_regustration;

	@FindBy(how = How.XPATH, using = TXT_EMAIL_XPATH)
	private WebElement txt_email;

	@FindBy(how = How.XPATH, using = TXT_PASSWORD_XPATH)
	private WebElement txt_password;

	@FindBy(how = How.XPATH, using = TXT_CONFIRM_PASSWORD_XPATH)
	private WebElement txt_confirm_password;

	@FindBy(how = How.XPATH, using = TXT_FIRSTNAME_XPATH)
	private WebElement txt_firstname;

	@FindBy(how = How.XPATH, using = TXT_MIDDLENAME_XPATH)
	private WebElement txt_middleName;

	@FindBy(how = How.XPATH, using = TXT_LASTNAME_XPATH)
	private WebElement txt_lastName;

	@FindBy(how = How.XPATH, using = TXT_PHONE_NUMBER_XPATH)
	private WebElement txt_phoneNumber;

	@FindBy(how = How.XPATH, using = TXT_PERSONAL_EMAIL_XPATH)
	private WebElement txt_personal_email;

	@FindBy(how = How.XPATH, using = TXT_STREET2_XPATH)
	private WebElement txt_street2_email;

	@FindBy(how = How.XPATH, using = TXT_STREET1_XPATH)
	private WebElement txt_street1_email;

	@FindBy(how = How.XPATH, using = TXT_CITY_XPATH)
	private WebElement txt_city;

	@FindBy(how = How.XPATH, using = DRP_STATE_XPATH)
	private WebElement drp_state;

	@FindBy(how = How.XPATH, using = ZIP_CODE_XPATH)
	private WebElement zip_code;

	@FindBy(how = How.XPATH, using = BTN_RESET_XPATH)
	private WebElement btn_reset;

	@FindBy(how = How.XPATH, using = BTN_SUBMIT_XPATH)
	private WebElement btn_submit;

	@FindBy(how = How.XPATH, using = AUTOFILL_ADDRESS_XPATH)
	private WebElement autofill_address;

	@FindBy(how = How.XPATH, using = CHECKBOX_XPATH)
	private WebElement btn_checkbox;

	@FindBy(how = How.XPATH, using = BTN_DELETE_XPATH)
	private WebElement btn_delete;

	@FindBy(how = How.XPATH, using = BTN_VIEW_DETAILS_XPATH)
	private WebElement btn_view_detail;

	@FindBy(how = How.XPATH, using = MENU_STAFF_MANAGEMENT_XPATH)
	private WebElement menu_staffManagement;

	@FindBy(how = How.XPATH, using = MENU_APROVALS_XPATH)
	private WebElement menu_approvals;

	@FindBy(how = How.XPATH, using = MENU_BRANCH_MANAGEMENT_XPATH)
	private WebElement menu_branchmanagement;

	@FindBy(how = How.XPATH, using = BTN_VIEW_DETAILS_XPATH)
	private WebElement btn_view_details;

	@FindBy(how = How.XPATH, using = DRP_BRANCH_XPATH)
	private WebElement drp_branch;
	
	@FindBy(how = How.XPATH, using = DRP_MANAGER_XPATH)
	private WebElement drp_manager;
	
	@FindBy(how = How.XPATH, using = DRP_ROLE_XPATH)
	private WebElement drp_role;
	
	@FindBy(how = How.XPATH, using = DRP_EMPLOYMENT_XPATH)
	private WebElement drp_employement;
	
	@FindBy(how = How.XPATH, using = BTN_APPROVE_XPATH)
	private WebElement btn_approve;
	
	@FindBy(how = How.XPATH, using = BTN_CANCEL_XPATH)
	private WebElement btn_cancel;
	
	@FindBy(how = How.XPATH, using = BTN_DEACTIVE_XPATH)
	private WebElement btn_deactive;
	
	@FindBy(how = How.XPATH, using = RDBTN_ACTIVE_STAFF_XPATH)
	private WebElement rdbtn_activeStaff;
	
	public WebElement getRdbtn_activeStaff() {
		return rdbtn_activeStaff;
	}

	public WebElement getBtn_cancel() {
		return btn_cancel;
	}

	public WebElement getBtn_approve() {
		return btn_approve;
	}

	public WebElement getDrp_branch() {
		return drp_branch;
	}

	public WebElement getDrp_manager() {
		return drp_manager;
	}

	public WebElement getDrp_role() {
		return drp_role;
	}

	public WebElement getDrp_employement() {
		return drp_employement;
	}

	public WebElement getBtn_view_details() {
		return btn_view_details;
	}

	public WebElement getMenu_branchmanagement() {
		return menu_branchmanagement;
	}

	public WebElement getMenu_approvals() {
		return menu_approvals;
	}

	public WebElement getMenu_staffManagement() {
		return menu_staffManagement;
	}

	public WebElement getBtn_view_detail() {
		return btn_view_detail;
	}

	public WebElement getBtn_checkbox() {
		return btn_checkbox;
	}

	public WebElement getAutofill_address() {
		return autofill_address;
	}

	public WebElement getTab_Registration() {
		return tab_Registration;
	}

	public WebElement getLink_regustration() {
		return link_regustration;
	}

	public WebElement getTxt_email() {
		return txt_email;
	}

	public WebElement getTxt_password() {
		return txt_password;
	}

	public WebElement getTxt_confirm_password() {
		return txt_confirm_password;
	}

	public WebElement getTxt_firstname() {
		return txt_firstname;
	}

	public WebElement getTxt_middleName() {
		return txt_middleName;
	}

	public WebElement getBtn_delete() {
		return btn_delete;
	}

	public WebElement getTxt_lastName() {
		return txt_lastName;
	}

	public WebElement getTxt_phoneNumber() {
		return txt_phoneNumber;
	}

	public WebElement getTxt_personal_email() {
		return txt_personal_email;
	}

	public WebElement getTxt_street2_email() {
		return txt_street2_email;
	}

	public WebElement getTxt_street1_email() {
		return txt_street1_email;
	}

	public WebElement getTxt_city() {
		return txt_city;
	}

	public WebElement getDrp_state() {
		return drp_state;
	}

	public WebElement getZip_code() {
		return zip_code;
	}

	public WebElement getBtn_reset() {
		return btn_reset;
	}

	public WebElement getBtn_submit() {
		return btn_submit;
	}

	
	public WebElement getBtn_deactive() {
		return btn_deactive;
	}

	public Admin_StaffManagement_Pages() {
		PageFactory.initElements(BaseClass.driver, this);
	}

	public void navigateToApprovalPage() throws InterruptedException {
		FrameworkMethods.logger.info("Navigating on approval page");
		getMenu_branchmanagement().click();
		waitForMinTime();
		getMenu_staffManagement().click();
		waitForMinTime();
		getMenu_approvals().click();
		waitForPageLoad();
	}

	public void DoStaffRegistration() throws InterruptedException {
		waitForPageLoad();
		getTab_Registration().click();
		waitForPageLoad();
		getLink_regustration().click();
		waitForPageLoad();

	}

	public void verifyElementsOnRegistration() throws Exception {
		verifyElement(getTxt_email(), "Email Textbox");
		verifyElement(getTxt_password(), "Password Textbox");
		verifyElement(getTxt_confirm_password(), "Confirm Password Textbox");
		verifyElement(getTxt_firstname(), "First Name");
		verifyElement(getTxt_middleName(), "Middle Name");
		scrollDown();
		verifyElement(getTxt_lastName(), "Last Name");
		verifyElement(getTxt_phoneNumber(), "Phone Number");
		verifyElement(getTxt_personal_email(), "Personal Email");
		verifyElement(getTxt_street1_email(), "Street Address 1");
		verifyElement(getTxt_street2_email(), "Street Address 2");
		verifyElement(getTxt_city(), "City Textbox");
		verifyElement(getDrp_state(), "Dropdown State");
		verifyElement(getZip_code(), "Zipcode");
		verifyElement(getBtn_reset(), "Reset Button");
		verifyElement(getBtn_submit(), "Submit Button");
	}

	public void StaffRegistration() throws IOException {
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String email = RandomStringUtils.random(8, alphabet);
		getTxt_email().sendKeys(email + "@ramanacoachingcenter.com");
		getTxt_password().sendKeys(FrameworkMethods.getCustomProperty("password"));
		getTxt_confirm_password().sendKeys(FrameworkMethods.getCustomProperty("password"));
		getTxt_firstname().sendKeys("Fname");
		getTxt_lastName().sendKeys("Lname");
		getTxt_middleName().sendKeys("MiddleName");
		getTxt_phoneNumber().sendKeys("9869741236");
		getTxt_personal_email().sendKeys(email + "@gmail.com");
		getAutofill_address().sendKeys("12300 Bermuda Road, Henderson, NV, USA");
		getTxt_street1_email().sendKeys("12300 Bermuda Road");
		getTxt_street1_email().sendKeys("Street2");
		getTxt_city().sendKeys("Henderson");
		Select selectState = new Select(getDrp_state());
		selectState.selectByIndex(3);
		getZip_code().sendKeys("89044");
		scrollDown();
		getBtn_checkbox().click();
		getBtn_submit().click();
	}

	public void ActiveStaff() throws InterruptedException {
		FrameworkMethods.logger.info("Clicking on view details");
		getBtn_view_detail().click();
		waitForMinTime();
		scrollDown();
		waitForMinTime();
		Select drpBranch= new Select(getDrp_branch());
		drpBranch.selectByIndex(2);
		waitForMinTime();
		FrameworkMethods.logger.info("Branch selected");
		Select drpManager= new Select(getDrp_manager());
		drpManager.selectByIndex(2);
		waitForMinTime();
		FrameworkMethods.logger.info("Manager Selected");
		Select drpRole= new Select(getDrp_role());
		drpRole.selectByIndex(2);
		waitForMinTime();
		Select drpEmployement= new Select(getDrp_employement());
		drpEmployement.selectByIndex(2);
		getBtn_approve().click();
		FrameworkMethods.logger.info("Approved");
		getBtn_cancel().click();
		FrameworkMethods.logger.info("Pop up closed");
	}
	
	public void InActiveStaff()throws InterruptedException {
		FrameworkMethods.logger.info("Navigating on active staff detail page");
		getRdbtn_activeStaff().click();
		waitForMinTime();
		getBtn_view_detail().click();
		waitForMinTime();
		getBtn_deactive().click();
		FrameworkMethods.logger.info("Staff deactivated");
		getBtn_cancel().click();
		FrameworkMethods.logger.info("Pop up closed");
	}
	
	
}