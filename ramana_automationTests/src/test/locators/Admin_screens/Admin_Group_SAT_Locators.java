package Admin_screens;

public interface Admin_Group_SAT_Locators {

	public interface Admin_Group_SAT_Menu {
		static String MENU_GROUP_MANAGEMENT_XPATH = "//span[contains(.,'Group Class Management')]";
		static String MENU_SAT = "//span[contains(.,'SAT')]";
		static String MENU_MANAGE_CLASS_XPATH = "//span[contains(.,'Manage Class')]";
		static String MENU_BRANCH_MANAGEMENT_XPATH = "//span[contains(.,'Branch Management')]";
		static String MENU_PROCOTORING_XPATH="//span[contains(.,'Proctoring')]";
		static String MENU_SCORE_TRACKER_XPATH="//span[contains(.,'Score Tracker')]";
		static String MENU_ATTANDANCE_TRACKER_XPATH="(//span[contains(.,'Attendance Tracker')])[1]";
		static String MENU_STUDENT_ANALYTICS_XPATH="//span[contains(.,'Student Analytics')]";
		static String MENU_CUMULATIVE_ANALYTICS_XPATH="//span[contains(.,'Cumulative Analytics')]";
		static String MENU_CUMULATIVE_SCORE_CARD_XPATH="//span[contains(.,'Cumulative Score Card')]";
		static String MENU_LEARNING_PHASE_TRACKER_XPATH="//span[contains(.,'Learning Phase Tracker')]";
		
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
		static String TAB_MANAGE1_BATCH_XPATH = "//div[@id='heading4']//h4/a[contains(.,'Manage Batches')]";
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
		static String DRP_STUBATCH_XPATH = "//select[@id='batchIdProgress']";
		static String BTN_VIEW_PROGRESS_XPATH = "(//button[@title='View progress'])[1]";
		static String TAB_CHECK_PROGRESS_XPATH = "//a[@id='btnchkProgress']";
		static String TAB_VOCABULARY_PROGRESS_XPATH = "//a[@id='btnvocHistory']";
		static String TAB_QUIZE_HISTORY_XPATH = "//a[@id='btnquizHistory']";
		static String TAB_MATH_PRATICAL_HISTORY_XPATH = "//a[@id='btnpractHistory']";
		static String BTN_CLOSE_XPATH = "//button[@id='btnClose']";
		static String POPUP_TITLE_XPATH = "(//h4[@id='myModalLabel'])[2]";
	}
	
	public interface Student_Batch_Schedule_Locators{
		static String TAB_MANAGE2_BATCH_XPATH = "//div[@id='heading4']//h4/a[contains(.,'Manage Batches')]";
		static String TAB_SAT_BATCH_TEST_SCHEDULE_XPATH="//div[@id='heading8']//h4/a";
		static String DRP_SAT_BATCH_XPATH="(//form[@id='saveTestScheduleForm']//select)[1]";
		static String DRP_ACTIVITY_TYPE_XPATH="(//form[@id='saveTestScheduleForm']//select)[2]";
		static String ACTIVITY_DATE_XPATH="//input[@id='testDate']";
		static String DRP_TEXT_BOOK_XPATH="(//form[@id='saveTestScheduleForm']//select)[3]";
		static String DRP_TEST_XPATH="(//form[@id='saveTestScheduleForm']//select)[4]";
		static String BTN_TESTSCHEDULE_XPATH="//button[@id='submitBtn']";
		static String MSG_SUCCESS_XPATH="//div[@id='succDiv11']";
		static String BTN_REMOVE_XPATH="(//div[@class='table-responsive'])[1]//tr[1]//td[7]//a//span";
		static String MSG_FAIL_XPATH="//div[@id='errorDiv12']";
	}
	
	public interface Batch_Mapping_Locators{
		static String TAB_MANAGE3_BATCH_XPATH = "//div[@id='heading4']//h4/a[contains(.,'Manage Batches')]";
		static String TAB_BATCH_AND_STUDENT_MAPPING_XPATH = "//div[@id='heading2']//a";
		static String TAB_BATCH_AND_TEACHER_MAPPING_XPATH="//div[@id='heading3']//a";
		static String TAB_BATCH_AND_TEXTBOOK_MAPPING_XPATH="//div[@id='heading5']//a";
		//Batch and Student Mapping
		static String DRP_SELECT_STUDENT_XPATH="//select[@id='studentEnrollId']";
		static String DRP_SELECT_BATCH_XPATH="//select[@id='assignBatchId']";
		static String BTN_SAVE_XPATH="//button[@id='btnSaveAssign']";
		static String SUCCESS_MESSAGE_XPATH="//div[@id='successDiv']";
		
		//Batch and teacher Mapping
		static String DRP_TEACHER_SELECT_BATCH_XPATH="//select[@id='tBatchId']";
		static String DRP_TEACHER_XPATH="//select[@id='teacherIds']";
		static String BTN_SAVE_BATCH_TEACHER_XPATH="//button[@id='btnSaveBTAssign']";
		static String BT_SUCCESS_MESSAGE_XPATH="//div[@id='successDiv3']";
		
		//Batch and Textbook Mapping
		static String DRP_SELECT_TEXTBOOK_BATCH__XPATH="//select[@id='textbookBatchId']";
		static String DRP_TEXTBOOK_XPATH="//select[@id='teacherIds']";
		static String BTN_SAVE_BOOK_XPATH="//button[@id='btnSaveBatchTextbook']";
		static String TB_SUCCESS_MESSAGE_XPATH="//div[@id='successDiv5']";
		
	}
	
	public interface Tetxbox_Form_Locators{
		static String TAB_TEXTBOOK_XPATH="//div[@id='heading6']/h4/a";
		static String SUCCESS_MSG_XPATH="//div[@id='successDiv6']";
		static String TXT_BOOK_TITLE_XPATH="//input[@name='textBookTitle']";
		static String TXT_BOOK_EDITION_XPATH="//input[@name='textBookEdition']";
		static String TXT_BOOK_PUBLISHER_XPATH="//input[@name='textBookPublisher']";
		static String TXT_BOOK_ISBN_XPATH="//input[@name='textBookIsbn']";
		static String BTN_SAVE_XPATH="//button[@id='btnSaveSATTxtBook']"; 
	}
	
	public interface SAT_Test_Details_Locators{
		static String TAB_SAT_TEXT_DETAILS_XPATH="//div[@id='heading7']/h4/a";
		static String DRP_TEXT_BOOK_XPATH="//select[@id='satTextBookId']";
		static String TXT_TEXT_NUMBER_XPATH="//input[@id='testNumber']";
		static String TXT_SEC1_PAGE_NUMBER_XPATH="//input[@id='sec01PageNum']";
		static String TXT_SEC2_PAGE_XPATH="//input[@id='sec02PageNum']";
		static String TXT_SEC3_PAGE_XPATH="//input[@id='sec03PageNum']";
		static String TXT_SEC4_PAGE_XPATH="//input[@id='sec04PageNum']";
		static String TXT_ESSAY_PAGE_XPATH="//input[@id='essayPageNum']";
		static String BTN_SAVE_TEST_DETAIL_XPATH="//button[@id='btnSaveSATTestDetail']";
		static String SUCCESS_MSG_XPATH="//div[@id='successDiv7']";
	}
	
	public interface Broadcast_Message_Locators{
		static String DRP_SELECT_BATCH_XPATH="//select[@placeholder='Select Batch']";
		static String BROADCAST_MESSAGE_XPATH="//textarea[@id='broadcastMsg']";
		static String BTN_SENT_MSG_XPATH="//button[@type='submit'][1]";
		static String BTN_CLEAR_TEXT_XPATH="//button[contains(text(),'Clear')]";
		static String TAB_BROADCAST_MSG_XPATH="//div[@id='heading9']/h4/a";
		static String SUCCESS_MSG_XPTH="//div[contains(text(),' Email sent!')]";
	
	}
	
	public interface Proctoring_Locators{
		static String TAB_UPCOMMINGTEST_XPATH="//div[@id='heading1']/h4/a";
		static String TAB_PRACTICE_TEST_XPATH="//div[@id='headingOne']/h4/a";
		static String TAB_PROCTOR_TEST_DETAIL_XPATH="//div[@id='headingThree']/h4/a";
		static String RDBTN_MATH_TEST_XPATH="//input[@value='MATH']";
		static String RDBTN_READING_TEST_XPATH="//input[@value='READING']";
		static String RDBTN_WRITING_TEST_XPATH="//input[@value='WRITING']";
		static String RDBTN_FULL_LENGTH_XPATH="//input[@name='testType']";
		static String ESSAY_CHECKBOX_XPATH="//input[@id='isEssay']";
		static String DRP_BATCHID_XPATH="//select[@id='batchId']";
		static String DRP_TEST_NUMBER_XPATH="//select[@id='testDetailId']";
		static String DRP_TXTBOOK_XPATH="//select[@name='textBookId']";
		static String BTN_TEST_PRACTICE_XPATH="//button[@id='submitBtn']";
		static String TXT_START_TIME_XPATH="//input[@id='startTime']";
		static String LBL_TEST_DATE_XPATH="//label[contains(.,'Test Date')]";
		static String LBL_TEXT_BOOK_XPATH="(//label[contains(.,'Text Book')])[2]";
		static String LBL_TEST_XPATH="(//label[contains(.,'Test')])[8]";
		static String LBL_ESSAY_XPATH="(//label[contains(.,'Essay')])[3]";
		static String LBL_ESSAY_PAGE_XPATH="(//label[contains(.,'Essay')])[4]";
	}
	
	public interface SAT_Student_Progress_Check_Locators{
		static String TAB_SAT_STUDENT_PROGRESS_CHECK_XPATH="//div[@id='headingOne']/h4/a";
		static String TAB_SAT_SCRORE_MANAGEMENT_XPATH="//div[@id='headingTwo']/h4/a";
		static String DRP_SELECT_BATCHFORPROGRESS_XPATH="//select[@id='batchIdForProgress']";
		static String LINK_VIEW_DETAILS_XPATH="(//a[text()='View Scores'])[1]";
		static String TAB_VOCABULARY_TEST_XPATH="//a[@id='btnvocHistory']";
		static String TAB_QUIZ_HISTORY_XPATH="//a[@id='btnquizHistory']";
		static String TAB_MATH_PRACTICE_HISTORY_XPATH="//a[@id='btnpractHistory']";
		static String TITLE_XPATH="(//h4[@id='myModalLabel'])[3]";
		static String DRP_BATCH_ID_XPATH="//select[@id='batchId']";
		static String BTN_CLOSE_XPATH="//button[@id='btnClose']";
		static String RDBTN_WRITETEST_XPATH="//input[@value='WRITING']";
		static String RDBTN_READINGTEST_XPATH="//input[@value='READING']";
		static String RDBTN_FULLLENGTH_XPATH="(//input[@name='testType'])[8]";	
		static String LINK_VIEW_SCORE_XPATH="(//tr[1]//td//a)[1]";
	}
	
	public interface SAT_Attandance_Tracker_Locators{
		static String TAB_BATCH_ATTENDANCE_TRACKER_XPATH="//div[@id='headingOne']/h4/a";
		static String TAB_STUDENT_ATTENDANCE_TRACKER_XPATH="//div[@id='heading2']/h4/a";
		static String DRP_SELECTBATCH_XPATH="(//select[@id='batchId'])[1]";
		static String TXT_DATE_XPATH="//input[@id='classDate']";
		static String BTN_GET_ATTENDANCE_XPATH="(//button[contains(text(),'Get')])[1]";
		static String DRP_STUDENT_NAME_XPATH="(//select)[3]";
		static String BTN_GETATTENDANCE_XPATH="//div[@id='collapse2']//button";
		static String BTN_SAVE_ATTENDANCE_XPATH="(//button)[2]";
		static String MSG_SUCESS_XPATH="//strong[text()='Success! ']";
	}
	
	public interface SAT_Student_Analytics_Locators{
		static String SELECT_BATCH_XPATH="//select[@id='batchIdProgress']";
		static String SELECT_STUDENT_XPATH="//select[@id='enrollId']";
		//Reading Tab
		static String TAB_READING_XPATH="//a[@id='readingTab']";
		static String TAB_READINGTAB1_XPATH="//div[@id='heading10']";
		static String BTN_READDELETE_XPATH="(//button[contains(.,'Delete Answers')])[1]";
		static String BTN_REGRADE_XPATH="(//button[contains(.,'Re-Grade')])[1]";
		static String BTN_DOWLOAD_XPATH="(//button[contains(.,'Download')])[1]";
		static String TAB_READINGTAB2_XPATH="//div[@id='heading11']";
		static String BTN_DELETE1_XPATH="(//button[contains(.,'Delete Answers')])[2]";
		static String BTN_REGRADE1_XPATH="(//button[contains(.,'Re-Grade')])[2]";
		static String BTN_DOWLOAD1_XPATH="(//button[contains(.,'Download')])[2]";
		
		//Writing Tab
		static String TAB_WRITE_XPATH="//a[@id='writingTab']";
		static String TAB_WRITING1_XPATH="//div[@id='heading20']";
		static String TAB_MATHEMATICS_XPATH="(//a[@id='writingTab'])[2]";
		static String TAB_MATHEMATICS1_XPATH="//div[@id='heading30']";
		static String TAB_MATHEMATICS2_XPATH="//div[@id='heading31']";
		static String BTN_DELETE2_XPATH="(//button[contains(.,'Delete Answers')])[5]";
		static String BTN_REGRADE2_XPATH="(//button[contains(.,'Re-Grade')])[5]";
		static String BTN_DOWLOAD2_XPATH="(//button[contains(.,'Download')])[5]";
		static String BTN_DELETE3_XPATH="(//button[contains(.,'Delete Answers')])[6]";
		static String BTN_REGRADE3_XPATH="(//button[contains(.,'Re-Grade')])[6]";
		static String BTN_DOWLOAD3_XPATH="(//button[contains(.,'Download')])[6]";
	}
	public interface SAT_Cumulative_Analystics{
		static String DRP_SELECT_BATCH_XPATH="//select[@id='batchIdProgress']";
		static String DRP_TEXTBOOK_XPATH="//select[@id='textBookId']";
		static String DRP_TESTNUMBER_XPATH="//select[@id='testDetailId']";
		static String DRP_SECTION_XPATH="//select[@id='testSection']";
		static String LBL_MULTIBATCH_XPATH="//label[@for='isMultiBatchSelected']";
		static String CHBOX_MULTIBATCH_SELECTION_XPATH="//input[@id='isMultiBatchSelected']"; 
	}
	
	public interface SAT_Cumulative_ScoreCard_Locators{
		static String DRP_SELECT_BATCH_XPATH="//select[@id='batchIdProgress']";
		static String DRP_BOOK_XPATH="//select[@id='textBookId']";
		static String DRP_TEST_NUMBER_XPATH="//select[@id='testDetailId']";
		static String DRP_SECTION_XPATH="//select[@id='testSection']";
		static String LBL_AUTO_REFERESH_XPATH="//label[@for='autoRefreshFlag']";
	}
	
	public interface SAT_Learningphase_Locators{
		static String DRP_BATCH1_XPATH="//select[@id='batchId']";
		static String DRP_SUBJECT_XPATH="//select[@id='subject']";
		static String DRP_TEXTBOOK_XPATH="//select[@id='textBookId']";
	}
}