package Admin_pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Admin_screens.Locators.BranchmanagementLocators;
import Admin_screens.Locators.Menus;
import coaching_center_base.BaseClass;
import coaching_center_base.FrameworkMethods;

public class searchStudentPage extends BaseClass implements BranchmanagementLocators, Menus {
	public searchStudentPage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(BaseClass.driver, this);
	}

	@FindBy(how = How.XPATH, using = MENU_SEARCH_STUDENT_XPATH)
	private WebElement menu_search_student;
	
	@FindBy(how = How.XPATH, using = FIRSTNAME_XPATH)
	private WebElement student_first_name;
	
	@FindBy(how = How.XPATH, using = LASTNAME_XPATH)
	private WebElement student_last_name;

	@FindBy(how = How.XPATH, using = BTN_SEARCH_XPATH)
	private WebElement btn_search_student;

	@FindBy(how = How.XPATH, using = TXT_STUDENT_NAME_XPATH)
	private WebElement student_name;
	
	@FindBy(how = How.XPATH, using = TXT_GRADE_XPATH)
	private WebElement grade;
	
	@FindBy(how = How.XPATH, using = TXT_ZIPCODE_XPATH)
	private WebElement zidecode;
	
	@FindBy(how = How.XPATH, using = TXT_PARENT_NAME_XPATH)
	private WebElement parentName;
	
	@FindBy(how = How.XPATH, using = TXT_SCHOOL_XPATH)
	private WebElement school_name;
	
	@FindBy(how = How.XPATH, using = BTN_VIEW_DETAIL_XPATH)
	private WebElement view_details_button;
	
	@FindBy(how = How.XPATH, using = TAB_PARENT_DETAILS_XPATH)
	private WebElement tab_parent_details;
	
	@FindBy(how = How.XPATH, using = TAB_STUDENT_ENROLL_XPATH)
	private WebElement tab_student_enroll_details;
	
	@FindBy(how = How.XPATH, using = TAB_STUDENT_DETAILS_XPATH)
	private WebElement tab_student_details;
	
	@FindBy(how = How.XPATH, using = BTN_ARROW_COLLAPS_XPATH)
	private WebElement btn_Collaps_arrow;
	
	@FindBy(how = How.XPATH, using = TAB_UPDATE_BRANCH_XPATH)
	private WebElement tab_update_branch_details;
	
	@FindBy(how = How.XPATH, using = BTN_CLOSE_XPATH)
	private WebElement btn_close;

	@FindBy(how = How.XPATH, using = BTN_RESET_XPATH)
	private WebElement btn_reset;

	public WebElement getTab_student_details() {
		return tab_student_details;
	}

	public WebElement getBtn_Collaps_arrow() {
		return btn_Collaps_arrow;
	}

	public WebElement getView_details_button() {
		return view_details_button;
	}

	public WebElement getTab_parent_details() {
		return tab_parent_details;
	}

	public WebElement getTab_student_enroll_details() {
		return tab_student_enroll_details;
	}

	public WebElement getTab_update_branch_details() {
		return tab_update_branch_details;
	}

	public WebElement getBtn_close() {
		return btn_close;
	}

	public WebElement getStudent_name() {
		return student_name;
	}

	public WebElement getGrade() {
		return grade;
	}

	public WebElement getZidecode() {
		return zidecode;
	}

	public WebElement getParentName() {
		return parentName;
	}

	public WebElement getSchool_name() {
		return school_name;
	}

	public WebElement getMenu_search_student() {
		return menu_search_student;
	}

	public WebElement getStudent_first_name() {
		return student_first_name;
	}

	public WebElement getBtn_search_student() {
		return btn_search_student;
	}
	

	public WebElement getStudent_last_name() {
		return student_last_name;
	}
	

	public WebElement getBtn_reset() {
		return btn_reset;
	}
	public void navigateToSearchPage() throws InterruptedException {
		getMenu_search_student().click();
		waitForPageLoad();
	}
	
	public void searchStudentwithFirstName() throws Exception {
	
		
		verifyElement(getMenu_search_student(), "Username Textbox");
		getStudent_first_name().sendKeys(FrameworkMethods.getCustomProperty("student_name"));
		getBtn_search_student().click();
	}
	
	
	public void ResetSearch() {
		getBtn_reset().click();

	}
			
	public void searchStudentwithLastName() throws Exception {
		getStudent_last_name().sendKeys(FrameworkMethods.getCustomProperty("student_Last__name"));
		getBtn_search_student().click();
		waitForPageLoad();
	}
	
	public void verifySearchResult() throws Exception {
		waitForElementToAppear(getStudent_name());
		verifyElement(getStudent_name(), "Username Textbox");
		Assert.assertEquals(getStudent_name().getText(),FrameworkMethods.getCustomProperty("student"));
		waitForElementToAppear(getGrade());
		verifyElement(getGrade(), "Grade");
		Assert.assertEquals(getGrade().getText(), FrameworkMethods.getCustomProperty("grade"));
		Assert.assertEquals(getParentName().getText(),FrameworkMethods.getCustomProperty("parent_name"));
		Assert.assertEquals(getZidecode(),FrameworkMethods.getCustomProperty("zip_code"));
		Assert.assertEquals(getSchool_name(),FrameworkMethods.getCustomProperty("school_name"));	
	}
	
	public void verifyViewDetails() throws Exception {
		getView_details_button().click();
		waitForPageLoad();
		verifyElement(getTab_parent_details(), "Parent Details Tab");
		getBtn_Collaps_arrow().click();
		verifyElement(getTab_student_details(), "student Details Tab");
		verifyElement(getTab_student_enroll_details(), "student Enrollment Detail Tab");
		verifyElement(getTab_update_branch_details(), "Update Branch Details Tab");
		getBtn_close().click();
	}
}
