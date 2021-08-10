package Admin_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Admin_screens.Locators.AddRemoveBranchesPageLocators;
import Admin_screens.Locators.Menus;
import coaching_center_base.BaseClass;
import coaching_center_base.FrameworkMethods;

public class addRemoveBranchesPage extends BaseClass implements Menus, AddRemoveBranchesPageLocators {

	@FindBy(how = How.XPATH, using = EAST_BRANCH_XPATH)
	private WebElement east_branch;

	@FindBy(how = How.XPATH, using = BTN_VIEW_DETAIL_XPATH)
	private WebElement btn_view_detail;

	@FindBy(how = How.XPATH, using = BTN_EDIT_DETAIL_XPATH)
	private WebElement btn_edit_detail;

	@FindBy(how = How.XPATH, using = TITLE_EAST_BRANCH_XPATH)
	private WebElement title_east_branch;

	@FindBy(how = How.XPATH, using = BRANCH_NAME_XPATH)
	private WebElement branch_name;

	@FindBy(how = How.XPATH, using = BTN_SAVE_BRNACH_DETAIL_XPATH)
	private WebElement btn_save_branch_detail;

	@FindBy(how = How.XPATH, using = BTN_MSG_SAVE_XPATH)
	private WebElement btn_msg_save;

	@FindBy(how = How.XPATH, using = BTN_CLOSE_XPATH)
	private WebElement btn_close_save;

	@FindBy(how = How.XPATH, using = TAB_BRANCH_ZIP_XPATH)
	private WebElement tab_zip_code_coverage;

	@FindBy(how = How.XPATH, using = TAB_BRANCH_MANAGEMENT_XPATH)
	private WebElement tab_branch_management;

	@FindBy(how = How.XPATH, using = BTN_CREATE_BRANCH_XPATH)
	private WebElement btn_create_branch;

	@FindBy(how = How.XPATH, using = MENU_ADD_REMOVEBRANCHES_XPATH)
	private WebElement menu_add_remove_branches;
	
	@FindBy(how = How.XPATH, using = UPDATED_NAME_XPATH)
	private WebElement updated_name;

	public WebElement getEast_branch() {
		return east_branch;
	}

	public WebElement getBtn_view_detail() {
		return btn_view_detail;
	}
	
	public WebElement getUpdated_name() {
		return updated_name;
	}

	public WebElement getBtn_edit_detail() {
		return btn_edit_detail;
	}

	public WebElement getTitle_east_branch() {
		return title_east_branch;
	}

	public WebElement getBranch_name() {
		return branch_name;
	}

	public WebElement getBtn_save_branch_detail() {
		return btn_save_branch_detail;
	}

	public WebElement getBtn_msg_save() {
		return btn_msg_save;
	}

	public WebElement getBtn_close_save() {
		return btn_close_save;
	}

	public WebElement getTab_branch_management() {
		return tab_branch_management;
	}

	public WebElement getBtn_create_branch() {
		return btn_create_branch;
	}

	public WebElement getTab_zip_code_coverage() {
		return tab_zip_code_coverage;
	}

	
	public WebElement getMenu_add_remove_branches() {
		return menu_add_remove_branches;
	}

	public addRemoveBranchesPage() {
		PageFactory.initElements(BaseClass.driver, this);
		// TODO Auto-generated constructor stub
	}

	public void navigateToAddRemoveBranches() throws InterruptedException {
		waitForMinTime();
		getMenu_add_remove_branches().click();
		waitForPageLoad();
	}
	
	//methods
	public void verifyAddRemovBrachePage() throws Exception {
		verifyElement(getBtn_create_branch(), "Create Branch Button");
		verifyElement(getTab_branch_management(), "Bracnh Management Page");
		verifyElement(getBtn_edit_detail(),"Edit Detail Button");
		verifyElement(getBtn_view_detail(),"View detail button");
	}
	
	public void editBranchDetail() throws Exception {
		getBtn_edit_detail().click();
		waitForMaxTime();
		verifyElement(getTitle_east_branch(),"East Branch Title");
		getBranch_name().clear();
		getBranch_name().sendKeys(FrameworkMethods.getCustomProperty("updated_branch_name"));
		getBtn_save_branch_detail().click();
		waitForMinTime();
		verifyElement(getBtn_msg_save(), "Success Message");
		getBtn_close_save().click();
		waitForMaxTime();
		getUpdated_name().getText().equals(FrameworkMethods.getCustomProperty("updated_branch_name"));
	}
	
	
	public void resetBranchDetails()throws Exception  {
		waitForMaxTime();
		getBtn_edit_detail().click();
		waitForMaxTime();
		getBranch_name().clear();
		getBranch_name().sendKeys(FrameworkMethods.getCustomProperty("branch_name"));
		getBtn_save_branch_detail().click();
		waitForMinTime();
		verifyElement(getBtn_msg_save(), "Success Message");
		waitForMaxTime();
		getBtn_close_save().click();
		waitForMaxTime();
		getUpdated_name().getText().equals(FrameworkMethods.getCustomProperty("branch_name"));
	}

}
