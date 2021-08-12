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
			static String MENU_STUDENT_PEROSPECT_XPATH="//span[contains(.,'Student Prospects')]";
			static String MENU_TEACHER_STUDENT_XPATH="//span[contains(.,'Teacher Student Mapping')]";
			static String MENU_ADD_REMOVEBRANCHES_XPATH="//span[contains(.,'Add/Remove Branches')]";
			static String MENU_ENQUIRY_XPATH="//span[contains(.,'Enquiries')]";
		}
		
		public interface SearchStudentPageLocator{
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
		
		public interface StudentProspectLocators{
			static String SAT_PROSPECTS_LOC="(//h4[@class='panel-title'])[1]";
			static String SAT_PROSPECT_ARROW_XPATH="(//h4[@class='panel-title']//span[contains(@class,'glyphicon')])[1]";
			static String DUKE_PROSPECT_XPATH="(//h4[@class='panel-title'])[2]";
			static String BTN_VIEWDETAILS_XPATH="(//button[@title='View Details'])[1]";
			static String BTN_CONVERSATION_XPATH="(//button[@title='Conversations'])[1]";
			static String TAB_PARENT_DETAILS_XPATH="//div[@id='headingOneM']";
			static String TAB_STUDENT_XPATH="//div[@id='headingFourM']";
			static String TAB_ENROLL_XPATH="//div[@id='headingThree']";
			static String TAB_UPDATE_BRANCH_XPATH="//div[@id='headingThree']";
			static String BTN_CLOSE_XPATH="//button[@id='btnCloseSearch']";
			static String TXT_MSG_XPATH="//textarea";
			static String BTN_SUBMIT_XPATH="//button[@id='btnConversation']";
			static String MESSAGE_XPATH="(//strong)[1]";
			static String BTN_CLOSE_POP_UP_XPATH="(//button[@class='close'])[1]";
		}
		
		public interface TeacherStudentMappingPageLocators{
			static String DRP_STUDENT_XPATH="//select[@id='StudentId']";
			static String DRP_STUDENT_ENROLLMENT_XPATH="//select[@id='StudentEnrollId']";
			static String DRP_SELECT_TEACHER_XPATH="//select[@id='teacherIds']";
			static String OPTION_TEACHER_XPATH="//select[@id='teacherIds']//option[2]";
			static String OPTION_STUDENT_ENROLLMENT_XPATH="//select[@id='StudentEnrollId']//option[2]";
			static String OPTION_SELECT_STUDENT_XPATH="//select[@id='StudentId']//option[2]";
			static String BTN_SEARCH_XPATH="//button[@id='btnSaveAssign']";
			static String BTN_RESET_XPATH="//button[@id='btnResetAssign']";
			static String SUCCESS_MSG_XPATH="//div[@id='success-alert_parent' and contains(.,'saved successfully')]";
		}
		
		public interface AddRemoveBranchesPageLocators{
			static String EAST_BRANCH_XPATH="//td[contains(.,'East')]";
			static String BTN_VIEW_DETAIL_XPATH="(//button[@title='View Details'])[3]";
			static String BTN_EDIT_DETAIL_XPATH="(//button[@title='Edit Details'])[3]";
			static String TITLE_EAST_BRANCH_XPATH="//b[contains(.,'East Branch')]";
			static String BRANCH_NAME_XPATH="//input[@id='branchName']";
			static String BTN_SAVE_BRNACH_DETAIL_XPATH="//button[contains(.,'Save')]";
			static String BTN_MSG_SAVE_XPATH="//button[contains(.,'Saved')]";
			static String BTN_CLOSE_XPATH="//button[text()='Close']";
			static String TAB_BRANCH_MANAGEMENT_XPATH="";
			static String BTN_CREATE_BRANCH_XPATH="//button[contains(.,'Create new branch')]";
			static String TAB_BRANCH_ZIP_XPATH="//a[contains(.,'ZIP Code')]";
			static String UPDATED_NAME_XPATH="(//tr[3]//td)[2]";
		}
		
		public interface EnquiriesPageLocators{
			static String FIRSTNAME_XPATH="//input[@id='parentFirstName']";
			static String LASTNAME_XPATH="//input[@name='enquiryForm.parentLastName']";
			static String MOBILE_NUMBER_XPATH="//input[@name='enquiryForm.parentPhoneNumber']";
			static String PARENT_EMAIL_XPATH="//input[@name='enquiryForm.parentEmailId']";
			static String STUDENT_FIRSTNAME_XPATH="//input[@name='enquiryForm.studentFirstName']";
			static String STUDENT_LASTNAME_XPATH="//input[@name='enquiryForm.studentLastName']";
			static String MESSAGE_XPATH="//textarea[@id='message']";
			static String INTRESTED_PROGRAM_XPATH="//select[@id='interested_Program']";
			static String BTN_RESET_XPATH="(//button[@id='btnReset'])[1]";
			static String BTN_ADDUPDATE_XPATH="(//button[@id='btnSubmit'])[1]";
			static String TAB_ADD_ENQUIRY_XPATH="//div[@id='headingThree']";
			static String TAB_SEARCH_ENQUIRY_XPATH="//div[@id='headingFour']";
			static String SEARCH_LAST_NAME_XPATH="(//input)[10]";
			static String BTN_SEARCH="//button[@id='btnSearchId']";
			
		}
		
}
