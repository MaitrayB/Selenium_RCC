package Admin_One_OnOne_ClassManagement_Page;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Admin_screens.OneOnOneClassManagement_Locators.AttendanceTracker_Locators;
import Admin_screens.OneOnOneClassManagement_Locators.OneOnOneClassManagementMenu_Locators;
import coaching_center_base.BaseClass;

public class ClassManagement_AttendanceTracker extends BaseClass implements AttendanceTracker_Locators,OneOnOneClassManagementMenu_Locators{
	
	@FindBy(how = How.XPATH, using = DRP_STUDENT_XPATH)
	private WebElement drp_student;
	
	@FindBy(how = How.XPATH, using = DRP_PROGRAME_XPATH)
	private WebElement drp_programe;
	
	@FindBy(how = How.XPATH, using = BTN_VIEW_SCHEDULE_XPATH)
	private WebElement btn_view_schedule;
	
	@FindBy(how = How.XPATH, using = BTN_GETATTENDANCE_XPATH)
	private WebElement btn_getattendance;
	
	@FindBy(how = How.XPATH, using = RDBTN_PRESENT_XPATH)
	private WebElement rdbtn_present;
	
	@FindBy(how = How.XPATH, using = RDBTN_ABSENT_XPATH)
	private WebElement rdbtn_absent;
	
	@FindBy(how = How.XPATH, using = RDBTN_CREDIT_XPATH)
	private WebElement rdbtn_credit;
	
	@FindBy(how = How.XPATH, using = RDBTN_MAKE_UP_XPATH)
	private WebElement rdbtn_makeUp;
	
	@FindBy(how = How.XPATH, using = DRP_SLOT_XPATH)
	private WebElement drp_slot;
	
	@FindBy(how = How.XPATH, using = BTN_UPDATE_SCHEDULE_XPATH)
	private WebElement btn_update_schedule;
	
	@FindBy(how = How.XPATH, using = BTN_CLOSE_XPATH)
	private WebElement btn_close;
	
	@FindBy(how = How.XPATH, using = TAB_STUDENT_ATTENDANCE_TRACKER_XPATH)
	private WebElement tab_student_attendance;
	
	@FindBy(how = How.XPATH, using = TAB_STUDENT_ATTEBDANCE_HISTORY_XPATH)
	private WebElement tab_student_attendance_history;

	@FindBy(how = How.XPATH, using = MENU_ONEONONECLASS_XPATH)
	private WebElement menu_oneOnOne;
	
	@FindBy(how = How.XPATH, using = MENU_ATTENDANCE_TRACKER_XPATH)
	private WebElement menu_attendancTracker;
	
	@FindBy(how = How.XPATH, using = MENU_BRANCH_MANAGEMENT_XPATH)
	private WebElement menu_branch_class;

	@FindBy(how = How.XPATH, using = DRP_SELECT_DATE)
	private WebElement drp_Select_date;
	
	@FindBy(how = How.XPATH, using = DRP_SELECT_PROGRAME)
	private WebElement drp_Selct_programe;
	
	@FindBy(how = How.XPATH, using = SELECT_DROPDOWN1_XPATH)
	private WebElement select_day1;
	
	@FindBy(how = How.XPATH, using = SELECT_DROPDOWN2_XPATH)
	private WebElement select_day2;
	
	@FindBy(how = How.XPATH, using = SELECT_SLOT1_XPATH)
	private WebElement select_slot1;
	
	@FindBy(how = How.XPATH, using = SELECT_SLOT2_XPATH)
	private WebElement select_slot2;
	
	@FindBy(how = How.XPATH, using = BTN_SELECT_SCHEDULE2_XPATH)
	private WebElement btn_schedule2;
	
	@FindBy(how = How.XPATH, using = BTN_SELECT_SCHEDULE1_XPATH)
	private WebElement btn_schedule1;
	
	@FindBy(how = How.XPATH, using = BTN_SAVE_XPATH)
	private WebElement btn_save;
	
	@FindBy(how = How.XPATH, using = DRP_STUDENTHISTORY_XPATH)
	private WebElement drp_studenthistory;
	
	@FindBy(how = How.XPATH, using = DRP_PROGRAMEHISTORY_XPATH)
	private WebElement drp_programehistory;
	
	public WebElement getBtn_save() {
		return btn_save;
	}

	public WebElement getBtn_schedule2() {
		return btn_schedule2;
	}

	public WebElement getBtn_schedule1() {
		return btn_schedule1;
	}

	public WebElement getSelect_day1() {
		return select_day1;
	}

	public WebElement getSelect_day2() {
		return select_day2;
	}

	public WebElement getSelect_slot1() {
		return select_slot1;
	}

	public WebElement getSelect_slot2() {
		return select_slot2;
	}

	public WebElement getDrp_Select_date() {
		return drp_Select_date;
	}

	public WebElement getDrp_Selct_programe() {
		return drp_Selct_programe;
	}

	public WebElement getMenu_branch_class() {
		return menu_branch_class;
	}

	public WebElement getMenu_attendancTracker() {
		return menu_attendancTracker;
	}

	public WebElement getDrp_student() {
		return drp_student;
	}

	public WebElement getDrp_programe() {
		return drp_programe;
	}

	public WebElement getBtn_view_schedule() {
		return btn_view_schedule;
	}

	public WebElement getBtn_getattendance() {
		return btn_getattendance;
	}

	public WebElement getRdbtn_present() {
		return rdbtn_present;
	}

	public WebElement getRdbtn_absent() {
		return rdbtn_absent;
	}

	public WebElement getRdbtn_credit() {
		return rdbtn_credit;
	}

	public WebElement getRdbtn_makeUp() {
		return rdbtn_makeUp;
	}

	public WebElement getDrp_slot() {
		return drp_slot;
	}

	public WebElement getBtn_update_schedule() {
		return btn_update_schedule;
	}

	public WebElement getBtn_close() {
		return btn_close;
	}

	public WebElement getTab_student_attendance() {
		return tab_student_attendance;
	}

	public WebElement getTab_student_attendance_history() {
		return tab_student_attendance_history;
	}

	public WebElement getMenu_oneOnOne() {
		return menu_oneOnOne;
	}
	
	public WebElement getDrp_studenthistory() {
		return drp_studenthistory;
	}

	public WebElement getDrp_programehistory() {
		return drp_programehistory;
	}

	public ClassManagement_AttendanceTracker() {
		PageFactory.initElements(BaseClass.driver, this);
		
	}
	
	public void navigateToAttendanceTrackerPage() throws InterruptedException {
		getMenu_branch_class().click();
		waitForMinTime();
		getMenu_oneOnOne().click();
		waitForMinTime();
		getMenu_attendancTracker().click();
		waitForPageLoad();
	}
	
	public void verifyAttendaceTrackerPage() throws Exception {
		verifyElement(getTab_student_attendance(),"Tab Student Attendance");
		verifyElement(getTab_student_attendance(),"Tab Student Attendance");
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		Date date = new Date();
		waitForMinTime();
		String TodayDate = dateFormat.format(date);
		getDrp_Select_date().sendKeys(TodayDate);
		waitForPageLoad();
	    Alert simpleAlert = driver.switchTo().alert();
	    simpleAlert.accept();
	    Select selectPrograme= new Select(getDrp_Selct_programe()); 
	    selectPrograme.selectByIndex(1);
	}

	public void verifyScheduleTest()throws Exception {
		getBtn_view_schedule().click();
		waitForMinTime();
		verifyElement(getSelect_day1(),"Select Day");
		verifyElement(getSelect_day2(),"Select Day");
		verifyElement(getSelect_slot1(),"Select Slot");
		verifyElement(getSelect_slot2(),"Select Slot");
		verifyElement(getBtn_schedule1(),"Button Schedule1");
		verifyElement(getBtn_schedule2(),"Button Schedule2");
		getBtn_close().click();
	}
	
	public void saveAttendanceTest() throws InterruptedException {
		waitForMinTime();
		getRdbtn_present().click();
		getBtn_save().click();
	}
	
	public void verifyAttendancePrograme() throws Exception {
		verifyElement(getDrp_studenthistory(),"Student History");
		verifyElement(getDrp_programehistory(),"Programe History");

	}
	
}
