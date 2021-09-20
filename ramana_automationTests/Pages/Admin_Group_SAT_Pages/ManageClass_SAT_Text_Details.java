package Admin_Group_SAT_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Admin_screens.Admin_Group_SAT_Locators.Admin_Group_SAT_Menu;
import Admin_screens.Admin_Group_SAT_Locators.SAT_Test_Details_Locators;
import coaching_center_base.BaseClass;

public class ManageClass_SAT_Text_Details extends SAT_TemplatePage
implements SAT_Test_Details_Locators,Admin_Group_SAT_Menu {
	
	@FindBy(how = How.XPATH, using = TAB_SAT_TEXT_DETAILS_XPATH)
	private WebElement tab_SAT_Test_Details;
	
	@FindBy(how = How.XPATH, using = DRP_TEXT_BOOK_XPATH)
	private WebElement drp_text_book;
	
	@FindBy(how = How.XPATH, using = TXT_TEXT_NUMBER_XPATH)
	private WebElement txt_test_number;

	@FindBy(how = How.XPATH, using = TXT_SEC1_PAGE_NUMBER_XPATH)
	private WebElement txt_sec_page_number;

	@FindBy(how = How.XPATH, using = TXT_SEC2_PAGE_XPATH)
	private WebElement txt_sec2_page_number;

	@FindBy(how = How.XPATH, using = TXT_SEC3_PAGE_XPATH)
	private WebElement txt_sec3_page_number;

	@FindBy(how = How.XPATH, using = TXT_SEC4_PAGE_XPATH)
	private WebElement txt_sec4_page_number;

	@FindBy(how = How.XPATH, using = TXT_ESSAY_PAGE_XPATH)
	private WebElement txt_essay_page_number;

	@FindBy(how = How.XPATH, using = BTN_SAVE_TEST_DETAIL_XPATH)
	private WebElement btn_save_test;
	

	@FindBy(how = How.XPATH, using = SUCCESS_MSG_XPATH)
	private WebElement msg_success;
	
	@FindBy(how = How.XPATH, using = TAB_MANAGE1_BATCH_XPATH)
	private WebElement tab_manage_batch;
	

	
	/**
	 * 
	 */
	public ManageClass_SAT_Text_Details() {
		PageFactory.initElements(BaseClass.driver, this);
	}

	public WebElement getTab_manage_batch() {
		return tab_manage_batch;
	}

	public WebElement getMsg_success() {
		return msg_success;
	}

	public WebElement getTab_SAT_Test_Details() {
		return tab_SAT_Test_Details;
	}

	public WebElement getDrp_text_book() {
		return drp_text_book;
	}

	public WebElement getTxt_test_number() {
		return txt_test_number;
	}

	public WebElement getTxt_sec_page_number() {
		return txt_sec_page_number;
	}

	public WebElement getTxt_sec2_page_number() {
		return txt_sec2_page_number;
	}

	public WebElement getTxt_sec3_page_number() {
		return txt_sec3_page_number;
	}

	public WebElement getTxt_sec4_page_number() {
		return txt_sec4_page_number;
	}

	public WebElement getTxt_essay_page_number() {
		return txt_essay_page_number;
	}

	public WebElement getBtn_save_test() {
		return btn_save_test;
	}
	
	public void navigateToSATTestDetailTab() throws InterruptedException {
		waitForMinTime();
		getMenu_manage_class().click();
		waitForPageLoad();
		scrollDown();
		getTab_SAT_Test_Details().click();
		waitForMinTime();
	}
	
	public void verifySATTestDetails() throws Exception {
		Select selectTextBook= new Select(getDrp_text_book());
		selectTextBook.selectByIndex(1);
		getTxt_test_number().sendKeys("1");
		getTxt_sec_page_number().sendKeys("1");
		getTxt_sec2_page_number().sendKeys("2");
		getTxt_sec3_page_number().sendKeys("3");
		getTxt_sec4_page_number().sendKeys("4");
		getTxt_essay_page_number().sendKeys("1");
		getBtn_save_test().click();
		waitForMinTime();
		verifyElement(getMsg_success(), "Success Message");
	}

	
}
