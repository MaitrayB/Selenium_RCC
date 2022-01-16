package Admin_screens;

public interface MyTimesheetLocators {
	static String MENU_MYTIIMESHEET_XPATH="//span[contains(.,'My Timesheet')]";
	static String TAB_TIMESHEET_STATUS_XPATH="//div[@id='headingOne']";
	static String TAB_RECORD_TIMESHEET_XPATH="//div[@id='headingtwo']";
	static String MENU_PAY_PERIOD_XPATH="//th[text()='Pay Period']";
	static String MENU_STATUS_XPATH="//th[text()='Status']";
	static String FIELD_REJECTED_REASON_XPATH="//th[text()='Rejected Reason']";
	static String LABEL_SUBMIT_HOURS_XPATH="//label[@for='sbmit0hrs']";
	static String LABEL_SELECT_PAY_PERIOD_XPATH="//label[@for='inputEmail3']";
	static String SELECT_DROPDOWN_XPATH="//select[@id='payPeriodId']";
	static String SELECT_TASK_XPATH="//select[@id='taskId']";
	static String SELECT_WEEKDAY_XPATH="//input[@id='recordDate']";
	static String TXT_FROMETIME_XPATH="//input[@id='stime']";
	static String TXT_TOTIME_XPATH="//input[@id='etime']";
	static String BTN_ADD_XPATH="//input[@id='totalHours']";
}

