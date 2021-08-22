package Admin_screens;

public interface Admin_Group_SAT_Locators {
	
	public interface Admin_Group_SAT_Menu	{
		static String MENU_GROUP_MANAGEMENT_XPATH = "//span[contains(.,'Group Class Management')]";
		static String MENU_SAT="//span[contains(.,'SAT')]";
		static String MENU_MANAGE_CLASS_XPATH="//span[contains(.,'Manage Class')]";
		static String MENU_BRANCH_MANAGEMENT_XPATH="//span[contains(.,'Branch Management')]";
	}
	public interface Create_Batch_Page_Locators{
		static String BTN_CREATE_BATCH_XPATH="//button[@id='createBatch']";
		static String TXT_BATCH_NAME_XPATH="(//input[@id='batchName'])[2]";
		static String DRP_BRANCH_NAME_XPATH="//select[@id='branch.branchId']";
		static String DRP_SUB_PROGRAM_NAME_XPATH="(//select[@id='subProgramId'])[4]";
		static String BATCH_START_DATE_XPATH="//input[@id='targetSatTestDateForCreate']";
		static String BATCH_END_DATE_XPATH="//input[@id='batchStartDateForCreate']";
		static String CLASS_START_TIME_XPATH="(//input[@id='classStartTime'])[2]";	
		static String CLASS_END_TIME_XPATH="(//input[@id='classEndTime'])[2]";
	}
}