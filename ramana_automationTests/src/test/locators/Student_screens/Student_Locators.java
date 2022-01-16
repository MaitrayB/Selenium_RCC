package Student_screens;

public interface Student_Locators {

	public interface Student_Menu {
		static String MENU_UPLOAD_PROFILE = "//a[@id='uploadProfilePhoto']";
		static String MENU_HOME_XPATH = "//a[@id='studentHome']";
		static String MENU_MATH_XPATH = "//span[contains(.,'Math Review')]";

	}

	public interface Upload_Profile_Photo_Menu {
		static String UPLOAD_PROFILE_FIELD_XPATH = "//input[@id='imageFile']";
		static String BTN_UPDATE_XPATH = "//button[@id='uploadImage']";
		static String MSG_PROFILE_APPROVED_XPATH = "//h4[text()='Profile Photo is Already Approved']";
		static String MSG_ADMIN_APPROVED_XPATH = "//h4[contains(.,'approved by Admin')]";
	}

	public interface HomePage_Locators {
		static String TAB_PROGRAMENAME_XPATH = "//div[@id='heading0']//a";
		static String LBL_PROGNAME_XPATH = "//th[text()='Program Name']";
		static String LBL_BATCHNAME_XPATH = "//a[contains(text(),'Weekend SAT')]";
		static String TITLE_STUDENT_TODO_LIST_XPATH = "(//u[contains(.,'TO DO List')])[1]";
		static String TITLE_PARENT_TODO_LIST_XPATH = "(//u[contains(.,'TO DO List')])[2]";
		static String RCCC_MSG_XPATH = "//li[contains(text(),'RCC Vocabulary list Practice on ')]	";
	}

	public interface MathPage_Locators {
		static String RDBTN_PREALGEBRA_XPATH = "(//input[@id='subProgramId'])[2]";
		static String RDBTN_ALGERA_XPATH = "(//input[@id='subProgramId'])[3]";
		static String RDBTN_GEOMETRY_XPATH = "(//input[@id='subProgramId'])[4]";
		static String RDBTN_ALGERA2_XPATH = "(//input[@id='subProgramId'])[5]";
		static String LBL_CHAPTERLIST_XPATH="//td//a";
		static String BTN_CLOSE_XPATH="(//button[@class='close'])[1]";
	}
}
