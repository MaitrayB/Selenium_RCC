package Admin_MyTimeSheetPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Admin_screens.MyTimesheetLocators;
import coaching_center_base.BaseClass;
import coaching_center_base.FrameworkMethods;

public class adminMytimesheetPage extends BaseClass implements MyTimesheetLocators {
	@FindBy(how = How.XPATH, using = MENU_MYTIIMESHEET_XPATH)
	private WebElement menu_mytimesheet;	
	
	@FindBy(how = How.XPATH, using = TAB_TIMESHEET_STATUS_XPATH)
	private WebElement tab_timesheet_status;
	
	@FindBy(how = How.XPATH, using = TAB_RECORD_TIMESHEET_XPATH)
	private WebElement tab_record_timesheet;
	
	@FindBy(how = How.XPATH, using = MENU_PAY_PERIOD_XPATH)
	private WebElement menu_pay_period;
	
	@FindBy(how = How.XPATH, using = MENU_STATUS_XPATH)
	private WebElement menu_status;
	
	@FindBy(how = How.XPATH, using = FIELD_REJECTED_REASON_XPATH)
	private WebElement field_rejected_reason;
	
	@FindBy(how = How.XPATH, using = LABEL_SUBMIT_HOURS_XPATH)
	private WebElement label_submit_hours;	

	@FindBy(how = How.XPATH, using = LABEL_SELECT_PAY_PERIOD_XPATH)
	private WebElement label_select_pay_period;

	@FindBy(how = How.XPATH, using = SELECT_DROPDOWN_XPATH)
	private WebElement select_dropdown;
	
	@FindBy(how = How.XPATH, using = SELECT_TASK_XPATH)
	private WebElement select_task;
	
	@FindBy(how = How.XPATH, using = SELECT_WEEKDAY_XPATH)
	private WebElement select_weekday;
	
	@FindBy(how = How.XPATH, using = TXT_FROMETIME_XPATH)
	private WebElement txt_fromtime;
	
	@FindBy(how = How.XPATH, using = TXT_TOTIME_XPATH)
	private WebElement txt_tomtime;
	
	@FindBy(how = How.XPATH, using = BTN_ADD_XPATH)
	private WebElement btn_Add;
	
	
	public adminMytimesheetPage() {
		PageFactory.initElements(BaseClass.driver, this);
		// TODO Auto-generated constructor stub
	}

	public WebElement getMenu_mytimesheet() {
		return menu_mytimesheet;
	}

	public WebElement getTab_timesheet_status() {
		return tab_timesheet_status;
	}

	public WebElement getTab_record_timesheet() {
		return tab_record_timesheet;
	}

	public WebElement getMenu_pay_period() {
		return menu_pay_period;
	}

	public WebElement getMenu_status() {
		return menu_status;
	}

	public WebElement getField_rejected_reason() {
		return field_rejected_reason;
	}

	public WebElement getLabel_submit_hours() {
		return label_submit_hours;
	}

	public WebElement getLabel_select_pay_period() {
		return label_select_pay_period;
	}

	public WebElement getSelect_dropdown() {
		return select_dropdown;
	}

	public WebElement getSelect_task() {
		return select_task;
	}

	public WebElement getSelect_weekday() {
		return select_weekday;
	}

	public WebElement getTxt_fromtime() {
		return txt_fromtime;
	}

	public WebElement getTxt_tomtime() {
		return txt_tomtime;
	}

	public WebElement getBtn_Add() {
		return btn_Add;
	}
	
	public void navigateToTimesheetPage() throws InterruptedException {
		FrameworkMethods.logger.info("Clicking on my timesheet");
		getMenu_mytimesheet().click();
		waitForPageLoad();
	}
	
	public void verifyTimesheetPage() throws Exception {
		FrameworkMethods.logger.info("Verifying elements on my timesheet");
		verifyElement(getTab_timesheet_status(), "Timesheet Status");
		verifyElement(getTab_record_timesheet(), "Record Timesheet");
		verifyElement(getMenu_pay_period(), "Field Pay Period");
		verifyElement(getField_rejected_reason(), "Field Reject Reason");
		verifyElement(getMenu_status(), "Field Status");
		verifyElement(getSelect_task(), "Select Task");
		verifyElement(getLabel_select_pay_period(), "Select pay period");	
		verifyElement(getLabel_submit_hours(), "Submit hours");
		verifyElement(getTxt_fromtime(), "From Time");
		verifyElement(getTxt_tomtime(), "To Time");
		verifyElement(getBtn_Add(), "Add Button");
	}
}
