package Admin_Group_SAT_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Admin_screens.Admin_Group_SAT_Locators.Admin_Group_SAT_Menu;
import Admin_screens.Admin_Group_SAT_Locators.Student_Progess_Tracker_Locators;
import coaching_center_base.BaseClass;

public class ManageClass_Student_Progress_Tracker extends SAT_TemplatePage
		implements Admin_Group_SAT_Menu, Student_Progess_Tracker_Locators {

	public ManageClass_Student_Progress_Tracker() {
		PageFactory.initElements(BaseClass.driver, this);
	}

	@FindBy(how = How.XPATH, using = TAB_MANAGE1_BATCH_XPATH)
	private WebElement tab_manage_batch;

	@FindBy(how = How.XPATH, using = TAB_STUDENT_PROGRESS_XPATH)
	private WebElement tab_student_progress;

	@FindBy(how = How.XPATH, using = DRP_SUBPROGRAM_XPATH)
	private WebElement drp_subPrograme;

	@FindBy(how = How.XPATH, using = DRP_STUBATCH_XPATH)
	private WebElement drp_batch;

	@FindBy(how = How.XPATH, using = BTN_VIEW_PROGRESS_XPATH)
	private WebElement btn_view_progress;

	@FindBy(how = How.XPATH, using = TAB_CHECK_PROGRESS_XPATH)
	private WebElement tab_check_progress;

	@FindBy(how = How.XPATH, using = TAB_VOCABULARY_PROGRESS_XPATH)
	private WebElement tab_vocabulary_progress;

	@FindBy(how = How.XPATH, using = TAB_MATH_PRATICAL_HISTORY_XPATH)
	private WebElement tab_math_practice;

	@FindBy(how = How.XPATH, using = BTN_CLOSE_XPATH)
	private WebElement btn_close;

	@FindBy(how = How.XPATH, using = POPUP_TITLE_XPATH)
	private WebElement popup_title;

	@FindBy(how = How.XPATH, using = TAB_QUIZE_HISTORY_XPATH)
	private WebElement tab_quiz_history;

	public WebElement getTab_quiz_history() {
		return tab_quiz_history;
	}

	public WebElement getTab_student_progress() {
		return tab_student_progress;
	}

	public WebElement getDrp_subPrograme() {
		return drp_subPrograme;
	}

	public WebElement getTab_manage_batch() {
		return tab_manage_batch;
	}

	public WebElement getDrp_batch() {
		return drp_batch;
	}

	public WebElement getBtn_view_progress() {
		return btn_view_progress;
	}

	public WebElement getTab_check_progress() {
		return tab_check_progress;
	}

	public WebElement getTab_vocabulary_progress() {
		return tab_vocabulary_progress;
	}

	public WebElement getTab_math_practice() {
		return tab_math_practice;
	}

	public WebElement getBtn_close() {
		return btn_close;
	}

	public WebElement getPopup_title() {
		return popup_title;
	}

	public void navigateToStudentProgressPage() throws InterruptedException {
		waitForMinTime();
		getMenu_manage_class().click();
		waitForPageLoad();
		getTab_manage_batch().click();
		waitForMinTime();
		getTab_student_progress().click();
	}

	public void verifyStudentProgressTracker() throws Exception {
		waitForMinTime();
		Select selectSubPrograme = new Select(getDrp_subPrograme());
		selectSubPrograme.selectByIndex(6);
		waitForMinTime();
		Select selectBatch = new Select(getDrp_batch());
		selectBatch.selectByIndex(1);
		waitForMinTime();
		getBtn_view_progress().click();
		verifyElement(getPopup_title(), "Baby Progress Title");
		verifyElement(getTab_vocabulary_progress(), "Vocabulary Progress Tab");
		verifyElement(getTab_student_progress(), "Student Progress Tab");
		verifyElement(getTab_math_practice(), "Math Hostory Tab");
		verifyElement(getTab_quiz_history(), "Quize Hostory Tab");
		getTab_vocabulary_progress().click();
		getTab_quiz_history().click();
		getTab_math_practice().click();
		getBtn_close().click();

	}
}
