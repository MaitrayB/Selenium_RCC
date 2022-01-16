package Admin_screens;

public interface SurveyPageLocators {
	public interface MarketingSurveyPageLocators{
		static String MENU_SURVEY_XPATH="//ul[@id='menu-group-1']//li[11]";
		static String MENU__XPATH="//ul[@id='menu-group-1']//li[11]";
		static String TITLE_SURVEY_STISTICS_XPATH="//b[text()='Marketing Surveys']";
		static String TAB_SURVEY_DETAILS_XPATH="//span[text()='Survey Details']";
		static String TAB_SURVEY_STISTICS_XPATH="//span[text()='Survey Statistics']";
		static String FIELD_CHENNEL_NAME_XPATH="//a[contains(.,'Channel Name')]";
		static String FIELD_OF_USERS_REGISTERED_XPATH="//a[contains(.,'Users Registered')]";
		static String SELECT_BRANCH_XPATH="//select";
		static String FIELD_REGISTRATION_DATE_XPATH="//th/a[contains(.,'Registration')]";
		static String FIELD_FIRSTNAME_XPATH="//th/a[contains(.,'First Name')]";
		static String FIELD_LASTNAME_XPATH="//th/a[contains(.,'Last Name')]";
		static String MENU_BRANCH_MANAGEMENT_XPATH = "//a[@id='branchManagementId']";
		static String LABEL_TOTAL_RECORD_XPATH="(//label[@class='ng-binding'])[2]";
		static String LABEL_SURVEY_STATISTIC_TOTAL_RECORD_XPATH="(//label[@class='ng-binding'])[1]";
	}

	
	
}
