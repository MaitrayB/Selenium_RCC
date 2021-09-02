package Admin_screens;

public interface Admin_Group_SAT_Locators {

	public interface Admin_Group_SAT_Menu {
		static String MENU_GROUP_MANAGEMENT_XPATH = "//span[contains(.,'Group Class Management')]";
		static String MENU_SAT = "//span[contains(.,'SAT')]";
		static String MENU_MANAGE_CLASS_XPATH = "//span[contains(.,'Manage Class')]";
		static String MENU_BRANCH_MANAGEMENT_XPATH = "//span[contains(.,'Branch Management')]";
	}

	public interface Create_Batch_Page_Locators {
		static String BTN_CREATE_BATCH_XPATH = "//button[@id='createBatch']";
		static String TXT_BATCH_NAME_XPATH = "(//input[@id='batchName'])[2]";
		static String DRP_BRANCH_NAME_XPATH = "//select[@id='branch.branchId']";
		static String DRP_SUB_PROGRAM_NAME_XPATH = "(//select[@id='subProgramId'])[4]";
		static String BATCH_START_DATE_XPATH = "//input[@id='batchStartDateForCreate']";
		static String BATCH_END_DATE_XPATH = "//input[@id='batchEndDateForCreate']";
		static String CLASS_START_TIME_XPATH = "(//input[@id='classStartTime'])[2]";
		static String CLASS_END_TIME_XPATH = "(//input[@id='classEndTime'])[2]";
		static String BTN_SAVE_CHANGES_XPATH = "//button[@id='saveVocaScore']";
		static String TARGETED_DATE_XPATH = "//input[@id='targetSatTestDateForCreate']";
		static String BTN_CLOSE_XPATH = "(//button[@id='btnClose'])[1]";
		static String ADDED_BATCH_XPATH = "//tr//td[contains(.,'special Batch')]";
		static String BTN_DEACTIVE_XPATH = "//tr//td[contains(.,'special Batch')]//..//td//button[text()='Deactivate']";
		static String MSG_SUCCESS_XPATH = "//div[@id='successDiv4']";
	}

	public interface Batch_Detail_Viewer_Locators {
		static String TAB_MANAGE_BATCH_XPATH = "//div[@id='heading4']//h4/a[contains(.,'Manage Batches')]";
		static String TAB_BATCH_DETAILS_VIEWER_XPATH = "//div[@id='headingOne']//h4/a[contains(.,'Batch Details Viewer')]";
		static String SELECT_SUBPROGRAME_XPATH = "(//select[@id='subProgramId'])[1]";
		static String SEELCT_BATCH_XPATH = "//select[@id='batchId']";
		static String EDIT_BUTTON_XPATH = "//div[@id='collapseOne']//tr[3]//td[7]//button[2]";
		static String ACCESS_END_DATE_XPATH = "(//input[@id='classDate'])[3]";
		static String SAVE_BUTTON_XPATH = "//div[@id='collapseOne']//tr[3]//td[7]//button[1]";
		static String VIEW_BUTTON_XPATH = "//div[@id='collapseOne']//tr[3]//button[@title='View Details']";
		static String STUDENT_DETAIL_POPUP_XPATH = "//h4[text()='Student Details']";
		static String LOGIN_AS_STUDENT_XPATH = "//button[@name='login_as_student']";
		static String TAB_STUDENT_PROGRAME_XPATH = "//div[@id='heading0']//h4/a[contains(.,'Program')]";
		static String DRP_SWITCH_ROLL_XPATH = "//a[contains(.,'Student')]";
		static String OPTION_PREVIOUS_ADMIN_XPATH = "//a[contains(.,'Previous_administrator')]";
		static String LINK_PROGRAME_XPATH = "//a[contains(@class,'ng-binding ng-scope')]";
		static String DISABLE_LINK_XPATH = "//table[@id='myTable']//span";
	}

	public interface Manage_Class_Video_Locators {
		static String TAB_MANAGE_VIDEO_REQUEST = "//div[@id='headingOneTwo']//h4/a[contains(.,'Video')]";
		static String DRP_WEEKEND_SAT_XPATH = "(//select[@id='subProgramId'])[2]";
		static String DRP_BATCH_XPATH = "(//select[@id='batchId'])[2]";
		static String DRP_DATE = "//div[@id='collapseOne2']//input[@id='classDate']";
		static String DRP_PHASE_XPATH = "//select[@id='phase']";
		static String TXT_VIDEO_LINK_XPATH = "//input[@name='videoLink']";
		static String TXT_VIDEO_PASSWORD_XPATH = "//input[@name='videoPassword']";
		static String BTN_ADD_VIDEO_XPATH = "//button[contains(.,'Add Video')]";
		static String BTN_DELETE_XPATH = "(//button[@title='Delete Video'])[5]";
	}

	public interface Student_Progess_Tracker_Locators {
		static String TAB_STUDENT_PROGRESS_XPATH = "//div[@id='heading12']//h4/a";
		static String DRP_SUBPROGRAM_XPATH = "//select[@id='subProgramIdProgress']";
		static String DRP_BATCH_XPATH = "//select[@id='batchIdProgress']";
		static String BTN_VIEW_PROGRESS_XPATH = "(//button[@title='View progress'])[1]";
		static String TAB_CHECK_PROGRESS_XPATH = "//a[@id='btnchkProgress']";
		static String TAB_VOCABULARY_PROGRESS_XPATH = "//a[@id='btnvocHistory']";
		static String TAB_MATH_PRATICAL_HISTORY_XPATH = "//a[@id='btnquizHistory']";
		static String BTN_CLOSE_XPATH = "//button[@id='btnClose']";
		static String POPUP_TITLE_XPATH = "(//h4[@id='myModalLabel'])[2]";
	}
	
}