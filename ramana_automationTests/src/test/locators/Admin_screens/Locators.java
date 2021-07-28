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

		}
		public interface BranchmanagementLocators{
			static String FIRSTNAME_XPATH="//input[@name='searchForm.stuFirstName']";
			static String BTN_SEARCH_XPATH="//button[@id='btnSubmit']";
			static String LASTNAME_XPATH="//input[@name='stuLastName']";
			
		}
	
}
