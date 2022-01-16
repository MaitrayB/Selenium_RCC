package Admin_Staff_Management_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Admin_screens.StaffManagentLocators.Menu_StaffManagement_Locators;
import Admin_screens.StaffManagentLocators.MySkilSetLocators;
import coaching_center_base.BaseClass;

public class TeacherskillsetPage extends BaseClass implements Menu_StaffManagement_Locators, MySkilSetLocators {
	@FindBy(how = How.XPATH, using = MENU_TEACHER_SKILLSETS_XPATH)
	private WebElement menu_myskill;
	
	@FindBy(how = How.XPATH, using = MENU_BRANCH_MANAGEMENT_XPATH)
	private WebElement menu_branch_management;

	@FindBy(how = How.XPATH, using = MENU_STAFF_MANAGEMENT_XPATH)
	private WebElement menu_staff_management;

	@FindBy(how = How.XPATH, using = GRADE1_XPATH)
	private WebElement grade1;	

	@FindBy(how = How.XPATH, using = OPTION_GRADE_1_XPATH)
	private WebElement verifyGrade1;
	
	@FindBy(how = How.XPATH, using = DRP_SELECT_TEACHER_XPATH)
	private WebElement drp_select_teacher;
	
	@FindBy(how = How.XPATH, using = BTN_SAVE_XPATH)
	private WebElement btn_save;

	public TeacherskillsetPage() {
		PageFactory.initElements(BaseClass.driver, this);
	}

	public WebElement getMenu_myskill() {
		return menu_myskill;
	}

	public WebElement getMenu_branch_management() {
		return menu_branch_management;
	}

	public WebElement getMenu_staff_management() {
		return menu_staff_management;
	}

	public WebElement getGrade1() {
		return grade1;
	}

	public WebElement getVerifyGrade1() {
		return verifyGrade1;
	}

	public WebElement getDrp_select_teacher() {
		return drp_select_teacher;
	}

	public WebElement getBtn_save() {
		return btn_save;
	}
	
	public void navigateToTeacherSkillset() throws InterruptedException {
		getMenu_branch_management().click();
		waitForMinTime();
		getMenu_staff_management().click();
		waitForMinTime();
		getMenu_myskill().click();
		waitForPageLoad();
	}
	public void navigateToMySkillset() throws InterruptedException {
		getMenu_myskill().click();
		waitForPageLoad();
	}
	
	public void selectGrade() throws InterruptedException {
		getGrade1().click();
		scrollDown();
		getBtn_save().click();
		waitForMinTime();
		scrollUp();
	}
	
	public void selectTeacher() {
		Select selectTeacher=new Select(getDrp_select_teacher());
		selectTeacher.selectByIndex(1);
	}
	public void verifyGread1() throws Exception {
		waitForMinTime();
		verifyElement(getVerifyGrade1(),"Option Grade 1");
	}
	
	public void verifyGread() {
		try {
		if(getVerifyGrade1().isDisplayed()==false) {
			logger.pass(getVerifyGrade1() + " is not Present on screen");
		}
		else
		{
			logger.fail(getVerifyGrade1() + " is Present on screen");
		}
		}catch(Exception e) {
			logger.info(e.getMessage());
			logger.fail(getVerifyGrade1() + " is Present on screen");
		}
	}
}
