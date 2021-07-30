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
		
		}
		
		public interface Menus{
			static String MENU_SEARCH_STUDENT_XPATH="//span[@id='searchStudent']";
			static String MENU_REGISTRATION_XPATH="//span[contains(.,'New Registrations')]";
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
	
		}
		
		
		public interface NewRegistrationLocators{
			static String BTN_SEARCH_XPATH="//button[@id='btnSubmit']";	
			static String ACCORDIAN_STUDENT_REGISTRATION_XPATH="(//div[@id='headingThree'])[1]";
			static String ACCORDIAN_STUDENT_XPATH="//div[@id='headingYet']";
			static String ACCORDIAN_NEW_PARENT_XPATH="//div[@id='headingFour']";	
			static String ACCORDIAN_NEW_STUDENT_XPATH="(//div[@id='headingThree'])[2]";
		}
}
