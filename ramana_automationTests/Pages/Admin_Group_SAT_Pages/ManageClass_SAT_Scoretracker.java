package Admin_Group_SAT_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Admin_screens.Admin_Group_SAT_Locators.Admin_Group_SAT_Menu;
import Admin_screens.Admin_Group_SAT_Locators.SAT_Student_Progress_Check_Locators;
import coaching_center_base.BaseClass;

/**
 * @author Bhatt
 *
 */
public class ManageClass_SAT_Scoretracker extends SAT_TemplatePage
		implements Admin_Group_SAT_Menu, SAT_Student_Progress_Check_Locators {
	@FindBy(how = How.XPATH, using = TAB_SAT_STUDENT_PROGRESS_CHECK_XPATH)
	private WebElement tab_sat_student_progress_check;

	@FindBy(how = How.XPATH, using = TAB_SAT_SCRORE_MANAGEMENT_XPATH)
	private WebElement tab_sat_score_management;

	@FindBy(how = How.XPATH, using = DRP_SELECT_BATCHFORPROGRESS_XPATH)
	private WebElement drp_select_batch;

	@FindBy(how = How.XPATH, using = LINK_VIEW_DETAILS_XPATH)
	private WebElement link_view;

	@FindBy(how = How.XPATH, using = TAB_VOCABULARY_TEST_XPATH)
	private WebElement tab_vocabulary_test;

	@FindBy(how = How.XPATH, using = TAB_QUIZ_HISTORY_XPATH)
	private WebElement tab_quiz_history;

	@FindBy(how = How.XPATH, using = TAB_MATH_PRACTICE_HISTORY_XPATH)
	private WebElement tab_math_practice_history;

	@FindBy(how = How.XPATH, using = TITLE_XPATH)
	private WebElement title_xpath;

	@FindBy(how = How.XPATH, using = DRP_BATCH_ID_XPATH)
	private WebElement batch_id;

	@FindBy(how = How.XPATH, using = MENU_SCORE_TRACKER_XPATH)
	private WebElement menu_score_tracker;

	@FindBy(how = How.XPATH, using = RDBTN_WRITETEST_XPATH)
	private WebElement rdbtn_writetest;

	@FindBy(how = How.XPATH, using = RDBTN_READINGTEST_XPATH)
	private WebElement rdbtn_reading;

	@FindBy(how = How.XPATH, using = RDBTN_FULLLENGTH_XPATH)
	private WebElement rdbtn_fullLength;

	@FindBy(how = How.XPATH, using = BTN_CLOSE_XPATH)
	private WebElement btn_close;
	
	@FindBy(how = How.XPATH, using = LINK_VIEW_SCORE_XPATH)
	private WebElement link_view_score;
	
	
	
	public WebElement getLink_view_score() {
		return link_view_score;
	}

	public WebElement getRdbtn_writetest() {
		return rdbtn_writetest;
	}

	public WebElement getRdbtn_reading() {
		return rdbtn_reading;
	}

	public WebElement getRdbtn_fullLength() {
		return rdbtn_fullLength;
	}

	public WebElement getTab_sat_student_progress_check() {
		return tab_sat_student_progress_check;
	}

	public WebElement getTab_sat_score_management() {
		return tab_sat_score_management;
	}

	public WebElement getDrp_select_batch() {
		return drp_select_batch;
	}

	public WebElement getLink_view() {
		return link_view;
	}

	public WebElement getTab_vocabulary_test() {
		return tab_vocabulary_test;
	}

	public WebElement getTab_quiz_history() {
		return tab_quiz_history;
	}

	public WebElement getTab_math_practice_history() {
		return tab_math_practice_history;
	}

	public WebElement getTitle_xpath() {
		return title_xpath;
	}

	public WebElement getBatch_id() {
		return batch_id;
	}

	public WebElement getMenu_score_tracker() {
		return menu_score_tracker;
	}

	public WebElement getBtn_close() {
		return btn_close;
	}

	public ManageClass_SAT_Scoretracker() {
		PageFactory.initElements(BaseClass.driver, this);
	}

	public void navigateToScoreTracker() throws InterruptedException {
		getMenu_score_tracker().click();
		waitForPageLoad();
	}

	public void verifySATStudentProgressCheck() throws InterruptedException {
		getDrp_select_batch().click();
		getMenu_score_tracker().click();
		waitForMinTime();
		Select selectBatchid = new Select(getDrp_select_batch());
		selectBatchid.selectByIndex(2);
		waitForMinTime();
		getLink_view().click();
		waitForMinTime();
		getTab_vocabulary_test().click();
		getTab_quiz_history().click();
		getTab_math_practice_history().click();
		getBtn_close().click();
		waitForPageLoad();
	}

	public void verifyScoreManagement() throws InterruptedException {
		getTab_sat_student_progress_check().click();
		getTab_sat_score_management().click();
		Select selectBatchid = new Select(getBatch_id());
		selectBatchid.selectByIndex(2);
		waitForMinTime();
		getLink_view_score().click();
		waitForMinTime();
		getRdbtn_reading().click();
		getRdbtn_writetest().click();
		getRdbtn_fullLength().click();
	}

}
