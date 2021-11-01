package Admin_Group_SAT_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Admin_screens.Admin_Group_SAT_Locators.Admin_Group_SAT_Menu;
import Admin_screens.Admin_Group_SAT_Locators.Proctoring_Locators;
import coaching_center_base.BaseClass;

public class ManageClass_Proctoring extends SAT_TemplatePage implements Admin_Group_SAT_Menu, Proctoring_Locators{

	@FindBy(how = How.XPATH, using = MENU_PROCOTORING_XPATH)
	private WebElement menu_Proctoring;

	@FindBy(how = How.XPATH, using = TAB_UPCOMMINGTEST_XPATH)
	private WebElement tab_upcomingtest;
	
	@FindBy(how = How.XPATH, using = TAB_PRACTICE_TEST_XPATH)
	private WebElement tab_practiceTest;
	
	@FindBy(how = How.XPATH, using = TAB_PROCTOR_TEST_DETAIL_XPATH)
	private WebElement tab_proctorTest;
	
	@FindBy(how = How.XPATH, using = RDBTN_MATH_TEST_XPATH)
	private WebElement rdbtn_math_test;
	
	@FindBy(how = How.XPATH, using = RDBTN_READING_TEST_XPATH)
	private WebElement rdbtn_reading_test;
	
	@FindBy(how = How.XPATH, using = RDBTN_WRITING_TEST_XPATH)
	private WebElement rdbtn_writing_test;
	
	@FindBy(how = How.XPATH, using = RDBTN_FULL_LENGTH_XPATH)
	private WebElement rdbtn_full_length_test;
	
	@FindBy(how = How.XPATH, using = ESSAY_CHECKBOX_XPATH)
	private WebElement chkbox_eassy;
	
	@FindBy(how = How.XPATH, using = DRP_BATCHID_XPATH)
	private WebElement drp_batchid;
	
	@FindBy(how = How.XPATH, using = DRP_TXTBOOK_XPATH)
	private WebElement drp_txtbook;
	
	@FindBy(how = How.XPATH, using = DRP_TEST_NUMBER_XPATH)
	private WebElement drp_testnumber;

	@FindBy(how = How.XPATH, using = BTN_TEST_PRACTICE_XPATH)
	private WebElement btn_testpractice;

	@FindBy(how = How.XPATH, using = TXT_START_TIME_XPATH)
	private WebElement txt_startTime;

	@FindBy(how = How.XPATH, using = LBL_TEST_DATE_XPATH)
	private WebElement lbl_test_date;
	
	@FindBy(how = How.XPATH, using = LBL_TEXT_BOOK_XPATH)
	private WebElement lbl_book_date;
	
	@FindBy(how = How.XPATH, using = LBL_TEST_XPATH)
	private WebElement lbl_test;

	@FindBy(how = How.XPATH, using = LBL_ESSAY_XPATH)
	private WebElement lbl_essay;
	
	@FindBy(how = How.XPATH, using = LBL_ESSAY_PAGE_XPATH)
	private WebElement lbl_essay_page;


	
	public ManageClass_Proctoring() {
		PageFactory.initElements(BaseClass.driver, this);
		// TODO Auto-generated constructor stub
	}	
	
	public WebElement getLbl_test_date() {
		return lbl_test_date;
	}

	public WebElement getLbl_book_date() {
		return lbl_book_date;
	}

	public WebElement getLbl_test() {
		return lbl_test;
	}

	public WebElement getLbl_essay() {
		return lbl_essay;
	}

	public WebElement getLbl_essay_page() {
		return lbl_essay_page;
	}

	public WebElement getMenu_Proctoring() {
		return menu_Proctoring;
	}

	public WebElement getTab_upcomingtest() {
		return tab_upcomingtest;
	}

	public WebElement getTab_practiceTest() {
		return tab_practiceTest;
	}

	public WebElement getTab_proctorTest() {
		return tab_proctorTest;
	}

	public WebElement getRdbtn_math_test() {
		return rdbtn_math_test;
	}

	public WebElement getRdbtn_reading_test() {
		return rdbtn_reading_test;
	}

	public WebElement getRdbtn_writing_test() {
		return rdbtn_writing_test;
	}

	public WebElement getRdbtn_full_length_test() {
		return rdbtn_full_length_test;
	}

	public WebElement getChkbox_eassy() {
		return chkbox_eassy;
	}

	public WebElement getDrp_batchid() {
		return drp_batchid;
	}

	public WebElement getDrp_txtbook() {
		return drp_txtbook;
	}

	public WebElement getDrp_testnumber() {
		return drp_testnumber;
	}

	public WebElement getBtn_testpractice() {
		return btn_testpractice;
	}
	
	public void navigateToProcotoringPage() throws InterruptedException {
		getMenu_Proctoring().click();
		waitForMaxTime();
	}
	
	public WebElement getTxt_startTime() {
		return txt_startTime;
	}

	public void verifyPracticeTest() throws Exception {
		//verifyElement(getTab_upcomingtest(), "Upcoming Test Tab");
		getTab_practiceTest().click();
		waitForMinTime();
		getRdbtn_writing_test().click();
		getChkbox_eassy().click();
		waitForMinTime();
		Select selectBatch= new Select(getDrp_batchid());
		selectBatch.selectByIndex(1);
		waitForMinTime();
		Select selectTextBook= new Select(getDrp_txtbook());
		selectTextBook.selectByIndex(3);
		waitForMinTime();
		Select selectTestNumber= new Select(getDrp_testnumber());	
		selectTestNumber.selectByIndex(1);
		waitForMinTime();
		getTxt_startTime().sendKeys("9:00 PM");
		getBtn_testpractice().click();	
		waitForMaxTime();
	}
		
	public void verifyProctorDetail() throws Exception {
		verifyElement(getLbl_test_date(),"Label Test Date");
		verifyElement(getLbl_book_date(),"Label Book Date");
		verifyElement(getLbl_test(),"Label Test");
		verifyElement(getLbl_essay_page(),"Label Test Eassay");    
		refreshPage();
	}	

}