package Admin_Send_SMS_Package;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Admin_screens.SendSMSPageLocators;
import coaching_center_base.BaseClass;
import coaching_center_base.FrameworkMethods;

public class SMSPage extends BaseClass implements SendSMSPageLocators {
	@FindBy(how = How.XPATH, using = MENU_SEND_SMS_XPATH)
	private WebElement menu_sendSMS;	
	
	@FindBy(how = How.XPATH, using = MENU_BRANCH_MANAGEMENT_XPATH)
	private WebElement menu_brach_management;	
	
	@FindBy(how = How.XPATH, using = FIRST_NAME_XPATH)
	private WebElement first_name;	
	
	@FindBy(how = How.XPATH, using = LAST_NAME_XPATH)
	private WebElement last_name;

	@FindBy(how = How.XPATH, using = BTN_SEARCH_XPATH)
	private WebElement btn_search;
	
	@FindBy(how = How.XPATH, using = FIELD_STUDENT_NAME_XPATH)
	private WebElement field_student_name;
	
	@FindBy(how = How.XPATH, using = FIELD_PHONE_NUMBER_XPATH)
	private WebElement field_phoneNUmber;
	
	@FindBy(how = How.XPATH, using = FIELD_SECONDARY_PARENT_XPATH)
	private WebElement field_secondary_parent;
	
	@FindBy(how = How.XPATH, using = FIELD_PHONE_NUMBER1_XPATH)
	private WebElement field_phone_number;
	
	@FindBy(how = How.XPATH, using = FIELD_PRIMARY_PARENT_NAME_XPATH)
	private WebElement field_primary_parent_name;
	
	
	public WebElement getMenu_brach_management() {
		return menu_brach_management;
	}

	public WebElement getField_primary_parent_name() {
		return field_primary_parent_name;
	}

	public WebElement getMenu_sendSMS() {
		return menu_sendSMS;
	}

	public WebElement getFirst_name() {
		return first_name;
	}

	public WebElement getLast_name() {
		return last_name;
	}

	public WebElement getBtn_search() {
		return btn_search;
	}

	public WebElement getField_student_name() {
		return field_student_name;
	}

	public WebElement getField_phoneNUmber() {
		return field_phoneNUmber;
	}

	public WebElement getField_secondary_parent() {
		return field_secondary_parent;
	}

	public WebElement getField_phone_number() {
		return field_phone_number;
	}
	
	
	public SMSPage() {
		PageFactory.initElements(BaseClass.driver, this);

		// TODO Auto-generated constructor stub
	}

	public void naviagteToSMSPage() throws InterruptedException {
		getMenu_brach_management().click();
		waitForMinTime();
		getMenu_sendSMS().click();
		waitForPageLoad();
	}
	
	public void verifySendSMSPage() throws Exception {
		verifyElement(getFirst_name(), "First Name Textbox");
		verifyElement(getLast_name(), "Last Name Textbox");	
		verifyElement(getBtn_search(), "Search Button");	
	}
	
	public void verifySendSMSFunctionality() throws Exception {
		FrameworkMethods.logger.info("Searhing the SMS by entgering first name");
		getFirst_name().sendKeys("Test");
		getBtn_search().click();
		waitForPageLoad();
		verifyElement(getField_student_name(), "Field Student Name");	
		verifyElement(getField_primary_parent_name(), "Field Primary Parent Name");	
		verifyElement(getField_phone_number(), "Field phone number");	
		verifyElement(getField_secondary_parent(), "Field Secondary Parent Name");	
		verifyElement(getField_phoneNUmber(), "Field Secondary Parent phone number");	
	}
}
