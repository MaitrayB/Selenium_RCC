package Admin_Group_SAT_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import Admin_screens.Admin_Group_SAT_Locators.Admin_Group_SAT_Menu;
import Admin_screens.Admin_Group_SAT_Locators.SAT_Cumulative_ScoreCard_Locators;
import Admin_screens.Admin_Group_SAT_Locators.SAT_Learningphase_Locators;

public class ManageClass_SAT_Cumulative_Scrore_Card implements SAT_Cumulative_ScoreCard_Locators,Admin_Group_SAT_Menu   {
	@FindBy(how = How.XPATH, using = DRP_SELECT_BATCH_XPATH)
	private WebElement select_batch;
	 
	@FindBy(how = How.XPATH, using = DRP_BOOK_XPATH)
	private WebElement select_book;
	
	@FindBy(how = How.XPATH, using = DRP_TEST_NUMBER_XPATH)
	private WebElement select_test_number;
	
	@FindBy(how = How.XPATH, using = DRP_SECTION_XPATH)
	private WebElement select_section;
	
	@FindBy(how = How.XPATH, using = LBL_AUTO_REFERESH_XPATH)
	private WebElement lbl_auto_refresh;

	public WebElement getSelect_batch() {
		return select_batch;
	}

	public WebElement getSelect_book() {
		return select_book;
	}

	public WebElement getSelect_test_number() {
		return select_test_number;
	}

	public WebElement getSelect_section() {
		return select_section;
	}

	public WebElement getLbl_auto_refresh() {
		return lbl_auto_refresh;
	}
	
	public void naviagteToCumulativeScoreCard() {
		
	}
	
	public void verifyCumulativeScorePage() {
		
	}
		
}
