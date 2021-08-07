package Admin_pages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Admin_screens.Locators.Menus;
import Admin_screens.Locators.TeacherStudentMappingPageLocators;
import coaching_center_base.BaseClass;

public class teacherStudentMappingPage extends BaseClass implements Menus, TeacherStudentMappingPageLocators {

	public teacherStudentMappingPage() {
		PageFactory.initElements(BaseClass.driver, this);
		// TODO Auto-generated constructor stub
	}

	@FindBy(how = How.XPATH, using = DRP_STUDENT_XPATH)
	private WebElement drp_student_name;

	@FindBy(how = How.XPATH, using = DRP_STUDENT_ENROLLMENT_XPATH)
	private WebElement drp_studentenrollment_detail;

	@FindBy(how = How.XPATH, using = DRP_SELECT_TEACHER_XPATH)
	private WebElement drp_selectTeacher_detail;

	@FindBy(how = How.XPATH, using = OPTION_TEACHER_XPATH)
	private WebElement selectTeacher_detail;

	@FindBy(how = How.XPATH, using = OPTION_STUDENT_ENROLLMENT_XPATH)
	private WebElement selectStudentEnrollment_detail;

	@FindBy(how = How.XPATH, using = OPTION_SELECT_STUDENT_XPATH)
	private WebElement selectStudentDetail_detail;

	@FindBy(how = How.XPATH, using = BTN_SEARCH_XPATH)
	private WebElement btn_search;

	@FindBy(how = How.XPATH, using = BTN_RESET_XPATH)
	private WebElement btn_reset;

	@FindBy(how = How.XPATH, using = SUCCESS_MSG_XPATH)
	private WebElement success_msg;

	@FindBy(how = How.XPATH, using = MENU_TEACHER_STUDENT_XPATH)
	private WebElement menu_parent_teacher_mapping;

	public WebElement getMenu_parent_teacher_mapping() {
		return menu_parent_teacher_mapping;
	}

	public WebElement getDrp_student_name() {
		return drp_student_name;
	}

	public WebElement getDrp_studentenrollment_detail() {
		return drp_studentenrollment_detail;
	}

	public WebElement getDrp_selectTeacher_detail() {
		return drp_selectTeacher_detail;
	}

	public WebElement getSelectTeacher_detail() {
		return selectTeacher_detail;
	}

	public WebElement getSelectStudentEnrollment_detail() {
		return selectStudentEnrollment_detail;
	}

	public WebElement getSelectStudentDetail_detail() {
		return selectStudentDetail_detail;
	}

	public WebElement getBtn_search() {
		return btn_search;
	}

	public WebElement getBtn_reset() {
		return btn_reset;
	}

	public WebElement getSuccess_msg() {
		return success_msg;
	}

	// Method to Navigate on Student Teacher Mapping Page
	public void navigateToStudentTeacherMappingPage() throws InterruptedException {
		waitForPageLoad();
		getMenu_parent_teacher_mapping().click();
		waitForPageLoad();

	}

	// Method to verify student teacher mapping page
	public void verifyStudentTeacherMappingPage() throws Exception {
		verifyElement(getDrp_selectTeacher_detail(), "Select Teacher Dropdown");
		verifyElement(getDrp_student_name(), "Student Name Dropdown");
		verifyElement(getDrp_studentenrollment_detail(), "Student Detail Dropdown");
		verifyElement(getBtn_search(), "Search Butoon");
		verifyElement(getBtn_reset(), "Reset Butoon");

	}

	// Method to verify student teacher mapping functionality
	public void verifyStudentTeacherMappingFunctionality() throws Exception {
		Select studentName=new Select(getDrp_student_name());
		studentName.selectByIndex(1);
		waitForMinTime();
		Select enrollmentDetail= new Select(getDrp_studentenrollment_detail());
		enrollmentDetail.selectByIndex(1);
		Select teacherDetail= new Select(getDrp_selectTeacher_detail());
		teacherDetail.selectByIndex(1);	
		waitForMinTime();
		getBtn_search().click();
		waitForMinTime();
		assertTrue(getSuccess_msg().isDisplayed());
		
	}

}
