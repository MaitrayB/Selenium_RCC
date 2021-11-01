package Admin_Group_SAT_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Admin_screens.Admin_Group_SAT_Locators.Admin_Group_SAT_Menu;
import Admin_screens.Admin_Group_SAT_Locators.SAT_Cumulative_Analystics;
import coaching_center_base.BaseClass;

public class ManageClass_SAT_CumulativeAnalytics extends SAT_TemplatePage implements SAT_Cumulative_Analystics,Admin_Group_SAT_Menu  {
	@FindBy(how = How.XPATH, using = DRP_SELECT_BATCH_XPATH)
	private WebElement select_batch;
	 
	@FindBy(how = How.XPATH, using = DRP_TEXTBOOK_XPATH)
	private WebElement select_textbook;
	 
	@FindBy(how = How.XPATH, using = DRP_TESTNUMBER_XPATH)
	private WebElement select_testnumber;
	
	@FindBy(how = How.XPATH, using = DRP_SECTION_XPATH)
	private WebElement select_section;
	
	@FindBy(how = How.XPATH, using = LBL_MULTIBATCH_XPATH)
	private WebElement lbl_multibatch;

	@FindBy(how = How.XPATH, using = CHBOX_MULTIBATCH_SELECTION_XPATH)
	private WebElement multibatch_selection;

	@FindBy(how = How.XPATH, using = MENU_CUMULATIVE_ANALYTICS_XPATH)
	private WebElement menu_cumulative_analytics;

	public ManageClass_SAT_CumulativeAnalytics() {
		PageFactory.initElements(BaseClass.driver, this);
		// TODO Auto-generated constructor stub
	}

	public WebElement getSelect_batch() {
		return select_batch;
	}

	public WebElement getSelect_textbook() {
		return select_textbook;
	}

	
	public WebElement getSelect_testnumber() {
		return select_testnumber;
	}

	public WebElement getSelect_section() {
		return select_section;
	}

	public WebElement getLbl_multibatch() {
		return lbl_multibatch;
	}

	public WebElement getMultibatch_selection() {
		return multibatch_selection;
	}
	
	public WebElement getMenu_cumulative_analytics() {
		return menu_cumulative_analytics;
	}

	public void navigateToCumulativeAnalyticsPage() {
		getMenu_cumulative_analytics().click();
	}
	
	public void verifyCumulativeAnalyticsPage() throws Exception {
		scrollUp();
		scrollUp();
		waitForMinTime();
		verifyElement(getLbl_multibatch(), "Enable Multi Batch Selection Label");
		verifyElement(getMenu_branch_manage_class(),"Select Batch Dropdown");
		verifyElement(getSelect_textbook(),"Select Textbook");
		verifyElement(getSelect_testnumber(),"Select TestNumber");
		verifyElement(getSelect_section(), "Select Section");
		refreshPage();
	}
}
