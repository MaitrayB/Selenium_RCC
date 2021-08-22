package Admin_BranchManagement_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Admin_screens.Locators.SearchStudentPageLocator;
import Admin_screens.Locators.Menus;
import Admin_screens.Locators.StudentManagementLocator;
import coaching_center_base.BaseClass;

public class studentManagePage extends BaseClass implements StudentManagementLocator, Menus, SearchStudentPageLocator {

	@FindBy(how = How.XPATH, using = LABEL_STUDENT_PAGE_TITLE_XPATH)
	private WebElement lbl_student_page_title ;
	
	@FindBy(how = How.XPATH, using = SEARCH_STUDENT_NAME_XPATH)
	private WebElement search_student_name;
	
	@FindBy(how = How.XPATH, using = TAB_PARENT_DETAILS_XPATH)
	private WebElement tab_parent_details;
	
	@FindBy(how = How.XPATH, using = SEARCH_RESULT_XPATH)
	private WebElement search_result;
	
	@FindBy(how = How.XPATH, using = BTN_DISCONTINUED_XPATH)
	private WebElement btn_discontinued_result;
	
	@FindBy(how = How.XPATH, using = BTN_VIEW_SCHEDULE_XPATH)
	private WebElement btn_viewschedule_result;

	@FindBy(how = How.XPATH, using = BTN_CONVERSATION_XPATH)
	private WebElement btn_conversation_result;
		
	@FindBy(how = How.XPATH, using = BTN_HOLDCLASS_XPATH)
	private WebElement btn_holdClass;
	
	@FindBy(how = How.XPATH, using = MENU_STUDENT_MANAGEMENT_XPATH)
	private WebElement menu_student_management;

	@FindBy(how = How.XPATH, using = BTN_ARROW_COLLAPS_XPATH)
	private WebElement btn_Collaps_arrow;
	
	@FindBy(how = How.XPATH, using = TAB_STUDENT_DETAILS_XPATH)
	private WebElement tab_student_details;
	
	@FindBy(how = How.XPATH, using = TAB_STUDENT_ENROLL_XPATH)
	private WebElement tab_student_enroll_details;
	
	@FindBy(how = How.XPATH, using = TAB_UPDATE_BRANCH_XPATH)
	private WebElement tab_update_branch_details;
	
	@FindBy(how = How.XPATH, using = BTN_CLOSE_XPATH)
	private WebElement btn_close;
	
	public studentManagePage() {
		PageFactory.initElements(BaseClass.driver, this);
		// TODO Auto-generated constructor stub
	}

	
	public WebElement getBtn_Collaps_arrow() {
		return btn_Collaps_arrow;
	}


	public WebElement getTab_student_details() {
		return tab_student_details;
	}


	public WebElement getTab_student_enroll_details() {
		return tab_student_enroll_details;
	}


	public WebElement getTab_parent_details() {
		return tab_parent_details;
	}


	public WebElement getTab_update_branch_details() {
		return tab_update_branch_details;
	}


	public WebElement getBtn_close() {
		return btn_close;
	}


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
	
	public WebElement getMenu_student_management() {
		return menu_student_management;
	}
	
	public void navigatToStudentManagement() throws InterruptedException {
		waitForPageLoad();
		getMenu_student_management().click();
	}
		
	public void verifyStudentLabel() throws Exception {
		waitForPageLoad();
		getSearch_student_name().sendKeys("Devang");
		verifyElement(getSearch_result(), "Search Result");
		getSearch_result().click();
		verifyElement(getBtn_discontinued_result(), "Button Disconnection");
		verifyElement(getBtn_conversation_result(), "Conversation Button");
		verifyElement(getBtn_holdClass(), "button Hold");
		verifyElement(getBtn_viewschedule_result(), "Button view schedule");
	}
	
	public void verifyStudentDetails() throws Exception
	{
		getBtn_viewschedule_result().click();
		waitForPageLoad();
		verifyElement(getTab_parent_details(), "Parent Details Tab");
		getBtn_Collaps_arrow().click();
		verifyElement(getTab_student_details(), "student Details Tab");
		verifyElement(getTab_student_enroll_details(), "student Enrollment Detail Tab");
		verifyElement(getTab_update_branch_details(), "Update Branch Details Tab");
		waitForMinTime();
		getBtn_close().click(); 
	}
}
