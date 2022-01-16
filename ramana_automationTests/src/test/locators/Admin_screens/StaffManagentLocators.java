package Admin_screens;

public interface StaffManagentLocators {

	public interface Menu_StaffManagement_Locators {
		String MENU_STAFF_MANAGEMENT_XPATH = "//span[contains(.,'Staff')]";
		String MENU_APROVALS_XPATH = "//span[contains(.,'Approvals')]";
		String MENU_TIMESHEET_XPATH = "//span[contains(.,'Timesheets')]";
		String MENU_SEARCH_XPATH="(//span[contains(.,'Search')])[2]";
		String MENU_TEACHER_AVAILABILITY_XPATH="(//span[contains(.,'Availability')])";
		String MENU_TEACHER_SKILLSETS_XPATH="(//span[contains(.,'Skill')])";
		String MENU_TEACHER_ATTENDANCE="(//span[contains(.,'Teacher Attendance')])";
		String MENU_BRANCH_MANAGEMENT_XPATH = "//span[contains(.,'Branch Management')]";
		String MENU_SKILLSET_XPATH="//span[contains(.,'SkillSet')]";

	}
	
	public interface StaffAccount_Locators{
		String TAB_REGISTRATION_XPATH="//button[text()='Register']";
		String LINK_REGISTRATION_XPATH="(//a[text()='click here'])[2]";
		String TXT_EMAIL_XPATH="//input[@id='inputUsername']";
		String TXT_PASSWORD_XPATH="//input[@id='password']";
		String TXT_CONFIRM_PASSWORD_XPATH="//input[@id='confirmPassword']";
		String TXT_FIRSTNAME_XPATH="//input[@id='inputFName']";
		String TXT_MIDDLENAME_XPATH="//input[@id='inputMName']";
		String TXT_LASTNAME_XPATH="//input[@id='inputLName']";
		String TXT_PHONE_NUMBER_XPATH="//input[@id='inputPhone']";
		String TXT_PERSONAL_EMAIL_XPATH="//input[@id='inputPersonalEmailId']";
		String TXT_STREET2_XPATH="//input[@id='street_adress2']";
		String TXT_STREET1_XPATH="//input[@id='street_adress1']";
		String TXT_CITY_XPATH="//input[@id='city']";
		String DRP_STATE_XPATH="//select[@id='stateCode']";
		String ZIP_CODE_XPATH="//input[@id='zip_code']";
		String BTN_RESET_XPATH="//button[@id='btnReset']";
		String AUTOFILL_ADDRESS_XPATH="//input[@id='autocomplete']";
		String BTN_SUBMIT_XPATH="//button[@id='btnSubmit']";
		String CHECKBOX_XPATH="//span[@role='checkbox']";
		String BTN_DELETE_XPATH="//button[@id='btnDeleteStaff']";
	}

	public interface Approval_Locators {
		String TAB_MANAGE_STAFF_XPATH="(//span[contains(.,'Teacher Attendance')])";
		String TAB_STAFF_AND_ROLE_XPATH="(//span[contains(.,'Manage Staff')])";
		String TAB_MANAGE_AND_STAFF_MAPPING_XPATH="(//a[contains(.,'Manager and Staff Mapping')])";
		String TAB_STAFF_AND_BRANCH_MAPPING_XPATH="(//a[contains(.,'Staff and Branch Mapping')])";	
		String RDBTN_PENDING_APPROVAL_XPATH="//input[@value='PENDING']";
		String RDBTN_ACTIVE_STAFF_XPATH="//input[@value='ACTIVE']";
		String RDBTN_INACTIVE_XPATH="//input[@value='INACTIVE']";
		String BTN_VIEW_DETAILS_XPATH="(//button[@id='btnStaffDetail'])[1]";
		String DRP_BRANCH_XPATH="//select[@id='branchId']";
		String DRP_MANAGER_XPATH="//select[@id='adminManager']";
		String DRP_ROLE_XPATH="//select[@id='role']";
		String DRP_EMPLOYMENT_XPATH="//select[@id='empType']";	
		String BTN_APPROVE_XPATH="//button[@id='btnApproveStaff']";
		String BTN_CANCEL_XPATH="//button[@id='btnClose']";
		String BTN_DEACTIVE_XPATH="(//button[@id='btnActDeactivate'])[1]";
	}
	
	public interface SearchStaff_Locators{
		String RDBTN_ACTIVE_XPATH="//input[@value='ACTIVE']";
		String RDBTN_INACTIVE_XPATH="//input[@value='INACTIVE']";
		String RDBTN_PENDING_XPATH="//input[@value='PENDING']";
		String FIRSTNAME_XPATH="//input[contains(@name,'staffFirstName')]";
		String LASTNAME_XPATH="//input[contains(@name,'staffLastName')]";
		String SELECT_ROLE_XPATH="//select[@id='role']";
		String BTN_SEARCH_XPATH="//button[@id='btnSubmit']";
		String BTN_VIEW_XPATH="//button[text()='View Detail']";
	}
	
	public interface Teacher_availability_Locators{
		String CHK_MONDAY_XPATH="(//td[2])[2]//label";
		String BTN_SAVE_XPATH="//button[text()='Save']";
		String MSG_SUCCESS_XPATH="//div[contains(text(),'Success!')]";
		String DRP_SELECT_TEACHER_XPATH="//select[@id='teacherDetailId']";
		String LBL_NOT_AVAILABLE_XPATH="(//td[2])[2]//span[@title='Not Available']";
		String LBL_AVAILABLE_XPATH="(//td[2])[2]//span[@title='Available']";
	}
	public interface MySkilSetLocators{
		String GRADE1_XPATH="(//span[text()='Grade 1'])[1]";
		String BTN_SAVE_XPATH="//button[text()='Save']";
		String DRP_SELECT_TEACHER_XPATH="//select[@id='teacherDetailId']";
		String OPTION_GRADE_1_XPATH="//label[text()=' Elementry School Level']//..//label[text()=' ELA']//..//span[text()='Grade 1']";
		//String GRADE_2_XPATH="//label[text()=' Elementry School Level']//..//label[text()=' ELA']//..//span[text()='Grade 2']";

	}
	
}
