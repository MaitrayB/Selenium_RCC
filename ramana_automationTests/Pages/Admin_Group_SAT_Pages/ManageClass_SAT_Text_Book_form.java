package Admin_Group_SAT_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Admin_screens.Admin_Group_SAT_Locators.Admin_Group_SAT_Menu;
import Admin_screens.Admin_Group_SAT_Locators.Student_Progess_Tracker_Locators;
import Admin_screens.Admin_Group_SAT_Locators.Tetxbox_Form_Locators;
import coaching_center_base.BaseClass;

public class ManageClass_SAT_Text_Book_form extends SAT_TemplatePage
		implements Admin_Group_SAT_Menu, Student_Progess_Tracker_Locators, Tetxbox_Form_Locators {
	@FindBy(how = How.XPATH, using = TAB_MANAGE1_BATCH_XPATH)
	private WebElement tab_manage_batch;

	@FindBy(how = How.XPATH, using = TAB_TEXTBOOK_XPATH)
	private WebElement tab_textbook_Form;

	@FindBy(how = How.XPATH, using = SUCCESS_MSG_XPATH)
	private WebElement success_message;

	@FindBy(how = How.XPATH, using = TXT_BOOK_TITLE_XPATH)
	private WebElement txt_book_title;
	@FindBy(how = How.XPATH, using = TXT_BOOK_ISBN_XPATH)
	private WebElement txt_isbn_book;
	@FindBy(how = How.XPATH, using = TXT_BOOK_EDITION_XPATH)
	private WebElement txt_book_edition_title;
	@FindBy(how = How.XPATH, using = TXT_BOOK_PUBLISHER_XPATH)
	private WebElement txt_book_publisher_title;
	@FindBy(how = How.XPATH, using = BTN_SAVE_XPATH)
	private WebElement btn_save;
	
	
	

	/**
	 * 
	 */
	public ManageClass_SAT_Text_Book_form() {
		PageFactory.initElements(BaseClass.driver, this);
		// TODO Auto-generated constructor stub
	}

	public WebElement getBtn_save() {
		return btn_save;
	}

	public WebElement getTab_manage_batch() {
		return tab_manage_batch;
	}

	public WebElement getTab_textbook_Form() {
		return tab_textbook_Form;
	}

	public WebElement getSuccess_message() {
		return success_message;
	}

	public WebElement getTxt_book_title() {
		return txt_book_title;
	}

	public WebElement getTxt_isbn_book() {
		return txt_isbn_book;
	}

	public WebElement getTxt_book_edition_title() {
		return txt_book_edition_title;
	}

	public WebElement getTxt_book_publisher_title() {
		return txt_book_publisher_title;
	}

	public void naviagteToSATFormtextbook() throws InterruptedException {
		waitForMinTime();
		getMenu_manage_class().click();
		waitForPageLoad();
		getTab_manage_batch().click();
		waitForMinTime();
		getTab_textbook_Form().click();
		waitForMinTime();
	}

	public void VerifyAddTextbookForm() throws Exception {
		getTxt_book_title().sendKeys("Automation Book");
		getTxt_isbn_book().sendKeys("ISBN");
		getTxt_book_publisher_title().sendKeys("Book Publisher");
		getTxt_book_edition_title().sendKeys("Edition Title");
		getBtn_save().click();
		waitForMinTime();
		verifyElement(getSuccess_message(),"Sucess Message");
	}

}
