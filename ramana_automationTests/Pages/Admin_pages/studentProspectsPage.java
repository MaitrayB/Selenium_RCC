package Admin_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import Admin_screens.Locators.Menus;
import Admin_screens.Locators.StudentProspectLocators;
import coaching_center_base.BaseClass;

public class studentProspectsPage extends BaseClass implements StudentProspectLocators,Menus{
	@FindBy(how = How.XPATH, using = MENU_STUDENT_PEROSPECT_XPATH)
	private WebElement menu_student_Prospect;
	
	@FindBy(how = How.XPATH, using = SAT_PROSPECTS_LOC)
	private WebElement sat_prospect;

	@FindBy(how = How.XPATH, using = DUKE_PROSPECT_XPATH)
	private WebElement duke_prospect;
	
	@FindBy(how = How.XPATH, using = BTN_VIEWDETAILS_XPATH)
	private WebElement btn_viewDetail;

	@FindBy(how = How.XPATH, using = BTN_CONVERSATION_XPATH)
	private WebElement btn_conversation;

	@FindBy(how = How.XPATH, using = TAB_PARENT_DETAILS_XPATH)
	private WebElement tab_parentDetails;
	
	@FindBy(how = How.XPATH, using = TAB_ENROLL_XPATH)
	private WebElement tab_studentEnrollDetails;
	
	@FindBy(how = How.XPATH, using = TAB_UPDATE_BRANCH_XPATH)
	private WebElement tab_updateBranch;
	
	@FindBy(how = How.XPATH, using = BTN_CLOSE_XPATH)
	private WebElement btn_close;
	

	@FindBy(how = How.XPATH, using = TAB_STUDENT_XPATH)
	private WebElement tab_student;
	
	
	public WebElement getTab_student() {
		return tab_student;
	}

	public WebElement getTab_parentDetails() {
		return tab_parentDetails;
	}

	public WebElement getTab_studentEnrollDetails() {
		return tab_studentEnrollDetails;
	}

	public WebElement getTab_updateBranch() {
		return tab_updateBranch;
	}

	public WebElement getBtn_close() {
		return btn_close;
	}

	public WebElement getMenu_student_Prospect() {
		return menu_student_Prospect;
	}

	public WebElement getSat_prospect() {
		return sat_prospect;
	}

	public WebElement getDuke_prospect() {
		return duke_prospect;
	}

	public WebElement getBtn_viewDetail() {
		return btn_viewDetail;
	}

	public WebElement getBtn_conversation() {
		return btn_conversation;
	}
	
	
	public void navigateToStudentProspectPage() throws InterruptedException {
		getMenu_student_Prospect().click();
		waitForPageLoad();
	}
	
	public void verifyProspectPage() throws Exception {
		verifyElement(getSat_prospect(), "Sat Prospect Details");
		verifyElement(getDuke_prospect(), "Duke Prospect Details");
		verifyElement(getBtn_viewDetail(), "Button View Detail");
		verifyElement(getBtn_conversation(), "View Conversation Detail");
		getBtn_viewDetail().click();
		verifyElement(getTab_student(),"Student Tab");
		verifyElement(getTab_parentDetails(), "Parent Details Tab");
		verifyElement(getTab_studentEnrollDetails(), "Parent Details Tab");
		verifyElement(getTab_updateBranch(), "Update Branch Details Tab");
		getBtn_close().click();
		
	}
}
