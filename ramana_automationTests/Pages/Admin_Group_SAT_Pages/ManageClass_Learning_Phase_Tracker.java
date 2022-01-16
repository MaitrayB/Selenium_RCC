package Admin_Group_SAT_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Admin_screens.Admin_Group_SAT_Locators.Admin_Group_SAT_Menu;
import Admin_screens.Admin_Group_SAT_Locators.SAT_Learningphase_Locators;
import coaching_center_base.BaseClass;

public class ManageClass_Learning_Phase_Tracker extends SAT_TemplatePage
		implements Admin_Group_SAT_Menu, SAT_Learningphase_Locators {

	public ManageClass_Learning_Phase_Tracker() {
		PageFactory.initElements(BaseClass.driver, this);
	}

	@FindBy(how = How.XPATH, using = MENU_LEARNING_PHASE_TRACKER_XPATH)
	private WebElement menu_learnigng_phase;
	
	@FindBy(how = How.XPATH, using = DRP_BATCH1_XPATH)
	private WebElement drp_batch;
	
	@FindBy(how = How.XPATH, using = DRP_SUBJECT_XPATH)
	private WebElement drp_subject;
	
	@FindBy(how = How.XPATH, using = DRP_TEXTBOOK_XPATH)
	private WebElement drp_textbook;

	public WebElement getMenu_learnigng_phase() {
		return menu_learnigng_phase;
	}

	public WebElement getDrp_batch() {
		return drp_batch;
	}

	public WebElement getDrp_subject() {
		return drp_subject;
	}

	public WebElement getDrp_textbook() {
		return drp_textbook;
	}
	
	public void navigateToLearningPhaseTracker() throws InterruptedException {
		scrollDown();
		getMenu_learnigng_phase().click();
		waitForPageLoad();
	}

	public void verifyLearningPhaseProgressTracker() throws Exception
	{
		verifyElement(getDrp_batch(),"Select Batch");
		verifyElement(getDrp_subject(),"Select Subject");
		verifyElement(getDrp_textbook(),"Select Textbook");


	}
}
