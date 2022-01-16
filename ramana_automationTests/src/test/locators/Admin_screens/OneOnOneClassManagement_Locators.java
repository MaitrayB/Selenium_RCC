package Admin_screens;

public interface OneOnOneClassManagement_Locators {

	public interface OneOnOneClassManagementMenu_Locators {
		static String MENU_ONEONONECLASS_XPATH = "//span[contains(.,'One-on-One')]";
		static String MENU_PROGRESS_TRACKER_XPATH = "//span[contains(.,'Progress Tracker')]";
		static String MENU_ATTENDANCE_TRACKER_XPATH = "(//span[contains(.,'Attendance Tracker')])[2]";
		static String MENU_RESCHEDULE_XPATH="//span[contains(.,'Reschedule requests')]";
		static String MENU_BRANCH_MANAGEMENT_XPATH = "//span[contains(.,'Branch Management')]";
	}
	
	public interface ProgressTracker_Locators{
		static String DRP_STUDENT_XPATH="//select[@id='studentDetailId']";
		static String DRP_SELECT_CLASS_XPATH="//select[@id='studentEnrollId']";
	}
	
	public interface AttendanceTracker_Locators{
		static String DRP_SELECT_DATE="//input[@id='classDateOneOnOne']";
		static String DRP_SELECT_PROGRAME="//select[@name='OneOnOneProgram']";
		static String DRP_STUDENT_XPATH="(//select[@id='StudentId'])[1]";	
		static String DRP_PROGRAME_XPATH="(//select[@id='StudentId'])[2]";
		static String BTN_VIEW_SCHEDULE_XPATH="(//button[@title='View schedule'])[1]";
		static String BTN_GETATTENDANCE_XPATH="(//button[@id='getattendBtn'])[1]";
		static String RDBTN_PRESENT_XPATH="(//input[@id='attendanceStatusOne0'])[1]";
		static String RDBTN_ABSENT_XPATH="(//input[@id='attendanceStatusOne0'])[2]";
		static String RDBTN_CREDIT_XPATH="(//input[@id='attendanceStatusOne0'])[3]";
		static String RDBTN_MAKE_UP_XPATH="(//input[@id='attendanceStatusOne0'])[4]";
		//Class Schedule 
		static String DRP_DAYS_XPATH="//select[@name='classDay']";
		static String DRP_SLOT_XPATH="(//select)[5]";
		static String BTN_UPDATE_SCHEDULE_XPATH="(//Button[@id='btnClose'])[2]";
		static String BTN_CLOSE_XPATH="(//Button[@id='btnClose'])[3]";
		static String TAB_STUDENT_ATTENDANCE_TRACKER_XPATH="//div[@id='heading3']";
		static String TAB_STUDENT_ATTEBDANCE_HISTORY_XPATH="//div[@id='heading2']";
		static String SELECT_DROPDOWN1_XPATH="(//select[@name='classDay'])[1]";
		static String SELECT_DROPDOWN2_XPATH="(//select[@name='classDay'])[2]";
		static String SELECT_SLOT1_XPATH="(//select)[5]";
		static String SELECT_SLOT2_XPATH="(//select)[7]";
		static String BTN_SELECT_SCHEDULE1_XPATH="(//button[@id='btnClose'])[1]";
		static String BTN_SELECT_SCHEDULE2_XPATH="(//button[@id='btnClose'])[2]";
		static String BTN_CLOSE_MODAL_XPATH="(//button[@id='btnClose'])[3]";
		static String BTN_SAVE_XPATH="//button[@id='getattendBtn']";
		static String DRP_STUDENTHISTORY_XPATH="(//select[@id='StudentId'])[1]";
		static String DRP_PROGRAMEHISTORY_XPATH="(//select[@id='StudentId'])[2]";

	}

}