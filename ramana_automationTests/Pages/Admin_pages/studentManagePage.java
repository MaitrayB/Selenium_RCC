package Admin_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import Admin_screens.Locators.Menus;
import Admin_screens.Locators.StudentManagementLocator;
import coaching_center_base.BaseClass;

public class studentManagePage extends BaseClass implements StudentManagementLocator, Menus {

	@FindBy(how = How.XPATH, using = LABEL_STUDENT_PAGE_TITLE_XPATH)
	private WebElement lbl_student_page_title ;
	
	@FindBy(how = How.XPATH, using = SEARCH_STUDENT_NAME_XPATH)
	private WebElement search_student_name;
	
	@FindBy(how = How.XPATH, using = SEARCH_RESULT_XPATH)
	private WebElement search_result;
	
	@FindBy(how = How.XPATH, using = BTN_DISCONTINUED_XPATH)
	private WebElement btn_discontinued_result;
	
	@FindBy(how = How.XPATH, using = BTN_VIEW_SCHEDULE_XPATH)
	private WebElement btn_viewschedule_result;

	@FindBy(how = How.XPATH, using = BTN_CONVERSATION_XPATH)
	private WebElement btn_conversation_result;
	
	@FindBy(how = How.XPATH, using = MENU_STUDENT_MANAGEMENT_XPATH)
	private WebElement btn_student_managemenent_result;
	
	@FindBy(how = How.XPATH, using = BTN_HOLDCLASS_XPATH)
	private WebElement btn_holdClass;

	public WebElement getBtn_holdClass() {
		return btn_holdClass;
	}

	public WebElement getLbl_student_page_title() {
		return lbl_student_page_title;
	}

	public WebElement getSearch_student_name() {
		return search_student_name;
	}

	public WebElement getSearch_result() {
		return search_result;
	}

	public WebElement getBtn_discontinued_result() {
		return btn_discontinued_result;
	}

	public WebElement getBtn_viewschedule_result() {
		return btn_viewschedule_result;
	}

	public WebElement getBtn_conversation_result() {
		return btn_conversation_result;
	}
	
	public WebElement getBtn_student_managemenent_result() {
		return btn_student_managemenent_result;
	}

	public void navigatToStudentManagement() throws InterruptedException {
		waitForPageLoad();
		getBtn_conversation_result().click();
	}
		
	public void verifyStudentLabel() throws Exception {
		getSearch_student_name().sendKeys("");
		verifyElement(getSearch_result(), "Search Result");
		getSearch_result().click();
		verifyElement(getBtn_discontinued_result(), "Button Disconnection");
		verifyElement(getBtn_conversation_result(), "Conversation Button");
		verifyElement(getBtn_holdClass(), "button Hold");
		verifyElement(getBtn_viewschedule_result(), "Button view schedule");

	}

}
