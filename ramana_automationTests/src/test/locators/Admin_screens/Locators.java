package Admin_screens;

public interface Locators {
		public interface LoginPageLocators{
			static String LOGIN_EMAIL_XPATH = "//input[@id='j_username']";
			static String LOGIN_PASSWORD_XPATH="//input[@id='j_password']";
			static String LOGIN_FORGOT_PASSWORD_XPATH="//a[text()='Forgot Password ?']";
			static String LOGIN_FORGOTID_XPATH="//a[text()='Forgot Login Id ?']";
			static String LOGIN_BUTTON_XPATH="//button[@id='loginbtn']";
		}
		public interface HomePageLocators{
			static String HOME_WELCOME_XPATH = "//li[contains(.,'Welcome')]";
			static String HOME_PENDING_APPROVAL_NOTIFICATION_XPATH="//div[@id='headingHome']//h4";
			static String LOGOUT_XPATH="//b[text()='Logout']";
		}
		
		public interface Menus{
			static String MENU_SEARCH_STUDENT_XPATH="//span[@id='searchStudent']";
			static String MENU_REGISTRATION_XPATH="//span[contains(.,'New Registrations')]";
			static String MENU_STUDENT_MANAGEMENT_XPATH="//li[@id='branch_student_mgnt_id']";

		}
		
		public interface BranchmanagementLocators{
			static String FIRSTNAME_XPATH="//input[@name='searchForm.stuFirstName']";
			static String BTN_SEARCH_XPATH="//button[@id='btnSubmit']";
			static String LASTNAME_XPATH="//input[@name='stuLastName']";
			static String BTN_VIEW_DETAILS_XPATH="//button[text()='View Details']";
			static String TXT_STUDENT_NAME_XPATH="(//table[@id='resultTable']//td[1])[1]]";
			static String TXT_GRADE_XPATH="(//table[@id='resultTable']//td[2])[1]";
			static String TXT_PARENT_NAME_XPATH="(//table[@id='resultTable']//td[3])[1]";
			static String TXT_ZIPCODE_XPATH="(//table[@id='resultTable']//td[4])[1]";
			static String TXT_SCHOOL_XPATH="(//table[@id='resultTable']//td[5])[1]";
			static String BTN_VIEW_DETAIL_XPATH="//button[text()='View Details']";
			static String POPUP_STUDENT_DETAILS_XPATH="//h4[text()='Student Details']";
			static String TAB_PARENT_DETAILS_XPATH="//div[@id='headingOneM']";
			static String BTN_ARROW_COLLAPS_XPATH="(//a[@class='collapsed'])[1]";
			static String TAB_STUDENT_DETAILS_XPATH="(//a[@class='collapsed'])[2]";
			static String TAB_STUDENT_ENROLL_XPATH="(//a[@class='collapsed'])[3]";
			static String TAB_UPDATE_BRANCH_XPATH="(//a[@class='collapsed'])[4]";
			static String BTN_CLOSE_XPATH="//button[@id='btnCloseSearch']";
			static String BTN_RESET_XPATH="//button[@id='btnReset']";
	
		}
		
		public interface NewRegistrationLocators{
			static String BTN_SEARCH_XPATH="//button[@id='btnSubmit']";	
			static String ACCORDIAN_STUDENT_REGISTRATION_XPATH="(//div[@id='headingThree'])[1]";
			static String ACCORDIAN_STUDENT_XPATH="//div[@id='headingYet']";
			static String ACCORDIAN_NEW_PARENT_XPATH="//div[@id='headingFour']";	
			static String ACCORDIAN_NEW_STUDENT_XPATH="(//div[@id='headingThree'])[2]";
			static String ARROW_XPATH="(//div[@id='headingThree'])[1]//span[contains(@class,'head-arrow')]";
		}
		
		public interface StudentManagementLocator{
			static String LABEL_STUDENT_PAGE_TITLE_XPATH="//div[@id='studentBranchmngmntDiv']//span[contains(text(),'Student')]";
			static String SEARCH_STUDENT_NAME_XPATH="//input[@id='nameSearch']";
			static String SEARCH_RESULT_XPATH="//div[@id='heading10']//a";
			static String BTN_DISCONTINUED_XPATH="(//button[contains(text(),'Discontinue')])[1]";
			static String BTN_HOLDCLASS_XPATH="(//button[contains(text(),'Hold Class')])[1]";
			static String BTN_VIEW_SCHEDULE_XPATH="//button[@title='View Details']";
			static String BTN_CONVERSATION_XPATH="//button[@title='Conversations']";
		}
}
