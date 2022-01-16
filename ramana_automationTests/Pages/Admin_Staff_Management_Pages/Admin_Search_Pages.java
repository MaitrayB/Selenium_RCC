package Admin_Staff_Management_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import Admin_screens.StaffManagentLocators.Menu_StaffManagement_Locators;
import Admin_screens.StaffManagentLocators.SearchStaff_Locators;
import coaching_center_base.BaseClass;
import coaching_center_base.FrameworkMethods;

public class Admin_Search_Pages extends BaseClass implements Menu_StaffManagement_Locators,SearchStaff_Locators {
	@FindBy(how = How.XPATH, using = MENU_SEARCH_XPATH)
	private WebElement menu_search;
	
	@FindBy(how = How.XPATH, using = MENU_STAFF_MANAGEMENT_XPATH)
	private WebElement menu_staff;

	@FindBy(how = How.XPATH, using = RDBTN_ACTIVE_XPATH)
	private WebElement rdbtn_active;
	
	@FindBy(how = How.XPATH, using = RDBTN_INACTIVE_XPATH)
	private WebElement rdbtn_inactive;

	@FindBy(how = How.XPATH, using = RDBTN_PENDING_XPATH)
	private WebElement rdbtn_approval;
	
	@FindBy(how = How.XPATH, using = SELECT_ROLE_XPATH)
	private WebElement select_role;
	
	@FindBy(how = How.XPATH, using = FIRSTNAME_XPATH)
	private WebElement txt_firstName;
	
	@FindBy(how = How.XPATH, using = LASTNAME_XPATH)
	private WebElement txt_lastName;
	
	@FindBy(how = How.XPATH, using = BTN_SEARCH_XPATH)
	private WebElement btn_search;
	
	@FindBy(how = How.XPATH, using = MENU_BRANCH_MANAGEMENT_XPATH)
	private WebElement menu_brachmanagement;
	
	@FindBy(how = How.XPATH, using = BTN_VIEW_XPATH)
	private WebElement btn_view;

	public WebElement getMenu_brachmanagement() {
		return menu_brachmanagement;
	}

	public WebElement getBtn_view() {
		return btn_view;
	}

	public WebElement getMenu_search() {
		return menu_search;
	}

	public WebElement getMenu_staff() {
		return menu_staff;
	}

	public WebElement getRdbtn_active() {
		return rdbtn_active;
	}

	public WebElement getRdbtn_inactive() {
		return rdbtn_inactive;
	}

	public WebElement getRdbtn_approval() {
		return rdbtn_approval;
	}

	public WebElement getSelect_role() {
		return select_role;
	}

	public WebElement getTxt_firstName() {
		return txt_firstName;
	}

	public WebElement getTxt_lastName() {
		return txt_lastName;
	}

	public WebElement getBtn_search() {
		return btn_search;
	}

	public Admin_Search_Pages() {
		PageFactory.initElements(BaseClass.driver, this);
	}

	public void navigateToSearchPage() throws InterruptedException {
		getMenu_brachmanagement().click();
		waitForMinTime();
		getMenu_staff().click();
		waitForMinTime();
		getMenu_search().click();
		waitForMinTime();
		
	}
	
	public void searchActiveStaff() throws Exception {
		getTxt_firstName().sendKeys("North");
		getTxt_lastName().sendKeys("staff");
		getBtn_search().click();
		waitForMinTime();
		verifyElement(getBtn_view(),"View Button");
		if(getBtn_view().isDisplayed()) {
			FrameworkMethods.logger.log(Status.PASS,
					MarkupHelper.createLabel("Search Result Displayed", ExtentColor.GREEN));
		}
	}
	
	public void searchInActiveStaff() throws Exception {
		getRdbtn_inactive().click();
		getTxt_firstName().clear();
		getTxt_firstName().sendKeys("Vijay");
		getTxt_lastName().clear();
		getTxt_lastName().sendKeys("staff");
		getBtn_search().click();
		waitForMinTime();
		verifyElement(getBtn_view(),"View Button");
		if(getBtn_view().isDisplayed()) {
			FrameworkMethods.logger.log(Status.PASS,
					MarkupHelper.createLabel("Search Result Displayed", ExtentColor.GREEN));
		}
	}
	
	public void searchInPendingApproval() throws Exception {
		getRdbtn_approval().click();
		getTxt_firstName().clear();
		getTxt_firstName().sendKeys("Sai");
		getTxt_lastName().clear();
		getTxt_lastName().sendKeys("Segu");
		getBtn_search().click();
		waitForMinTime();
		verifyElement(getBtn_view(),"View Button");
		if(getBtn_view().isDisplayed()) {
			FrameworkMethods.logger.log(Status.PASS,
					MarkupHelper.createLabel("Search Result Displayed", ExtentColor.GREEN));
		}
	}
	
}
