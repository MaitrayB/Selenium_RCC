package Admin_Staff_Management_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Admin_screens.StaffManagentLocators.Menu_StaffManagement_Locators;
import Admin_screens.StaffManagentLocators.Teacher_availability_Locators;
import coaching_center_base.BaseClass;

public class Admin_Teacher_Attendance_Track extends BaseClass
		implements Menu_StaffManagement_Locators, Teacher_availability_Locators {

	@FindBy(how = How.XPATH, using = MENU_TEACHER_AVAILABILITY_XPATH)
	private WebElement menu_myavailability;

	@FindBy(how = How.XPATH, using = CHK_MONDAY_XPATH)
	private WebElement check_attendance;

	@FindBy(how = How.XPATH, using = BTN_SAVE_XPATH)
	private WebElement btn_save;

	@FindBy(how = How.XPATH, using = MSG_SUCCESS_XPATH)
	private WebElement msg_success;

	@FindBy(how = How.XPATH, using = MENU_BRANCH_MANAGEMENT_XPATH)
	private WebElement menu_branch_management;

	@FindBy(how = How.XPATH, using = MENU_STAFF_MANAGEMENT_XPATH)
	private WebElement menu_staff_management;

	@FindBy(how = How.XPATH, using =LBL_AVAILABLE_XPATH)
	private WebElement option_availble;

	@FindBy(how = How.XPATH, using =  LBL_NOT_AVAILABLE_XPATH)
	private WebElement option_not_availble;

	@FindBy(how = How.XPATH, using =  DRP_SELECT_TEACHER_XPATH)
	private WebElement drp_select_teacher;

	public Admin_Teacher_Attendance_Track() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	public WebElement getDrp_select_teacher() {
		return drp_select_teacher;
	}


	public WebElement getOption_availble() {
		return option_availble;
	}


	public WebElement getOption_not_availble() {
		return option_not_availble;
	}


	public WebElement getMenu_staff_management() {
		return menu_staff_management;
	}

	public WebElement getMenu_branch_management() {
		return menu_branch_management;
	}

	public WebElement getMenu_myavailability() {
		return menu_myavailability;
	}

	public WebElement getCheck_attendance() {
		return check_attendance;
	}

	public WebElement getBtn_save() {
		return btn_save;
	}

	public WebElement getMsg_success() {
		return msg_success;
	}

	public void navigateToMyAvailability() throws Exception {
		getMenu_myavailability().click();
		waitForPageLoad();
		
	}
	
	public void checkMyAttendance()  throws Exception{
		getCheck_attendance().click();
		scrollDown();
		waitForMinTime();
		getBtn_save().click();
		waitForMinTime();
		//verifyElement(getMsg_success(), "Msg Success");
	}

	public void navigateToTeacherAvailability() throws Exception {
		waitForMinTime();
		getMenu_branch_management().click();
		waitForMinTime();
		getMenu_staff_management().click();
		waitForMinTime();
		getMenu_myavailability().click();
		waitForMinTime();
	}
	
	public void selectTeacher() throws InterruptedException {
		Select selectTeacher= new Select(getDrp_select_teacher());
		selectTeacher.selectByIndex(1);
		waitForMinTime();
	}
	public void verifyOptionNotAvailable() throws Exception {
		verifyElement(getOption_not_availble(), "Option Not Available");
	}
	
	public void verifyOptionAvailable()throws Exception  {
		verifyElement(getOption_availble(), "Option Available");
	}
	
}
