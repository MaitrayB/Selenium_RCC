package Admin_Group_SAT_Pages;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Admin_screens.Admin_Group_SAT_Locators.Admin_Group_SAT_Menu;
import Admin_screens.Admin_Group_SAT_Locators.SAT_Attandance_Tracker_Locators;
import coaching_center_base.BaseClass;

public class ManageClass_AttendanceTracker extends SAT_TemplatePage implements Admin_Group_SAT_Menu,SAT_Attandance_Tracker_Locators {

	@FindBy(how = How.XPATH, using = TAB_BATCH_ATTENDANCE_TRACKER_XPATH)
	private WebElement tab_batch_attendance;
	
	@FindBy(how = How.XPATH, using = TAB_STUDENT_ATTENDANCE_TRACKER_XPATH)
	private WebElement tab_student_attendance;
	
	@FindBy(how = How.XPATH, using = DRP_SELECTBATCH_XPATH)
	private WebElement drp_selectbatch;

	@FindBy(how = How.XPATH, using = TXT_DATE_XPATH)
	private WebElement txt_date;
	
	@FindBy(how = How.XPATH, using = BTN_GET_ATTENDANCE_XPATH)
	private WebElement btn_getAttendance;

	@FindBy(how = How.XPATH, using = DRP_STUDENT_NAME_XPATH)
	private WebElement drp_StudentName;
	
	@FindBy(how = How.XPATH, using = BTN_GET_ATTENDANCE_XPATH)
	private WebElement btn_getStudentAttendance;

	@FindBy(how = How.XPATH, using = MENU_ATTANDANCE_TRACKER_XPATH)
	private WebElement menu_attandanceTracker;

	@FindBy(how = How.XPATH, using = BTN_SAVE_ATTENDANCE_XPATH)
	private WebElement btn_saveAttendance;
	
	@FindBy(how = How.XPATH, using = MSG_SUCESS_XPATH)
	private WebElement msg_sucess;
	
	
	public WebElement getMsg_sucess() {
		return msg_sucess;
	}

	public WebElement getBtn_saveAttendance() {
		return btn_saveAttendance;
	}

	public ManageClass_AttendanceTracker() {
		PageFactory.initElements(BaseClass.driver, this);
	}

	public WebElement getMenu_attandanceTracker() {
		return menu_attandanceTracker;
	}

	public WebElement getTab_batch_attendance() {
		return tab_batch_attendance;
	}

	public WebElement getTab_student_attendance() {
		return tab_student_attendance;
	}

	public WebElement getDrp_selectbatch() {
		return drp_selectbatch;
	}

	public WebElement getTxt_date() {
		return txt_date;
	}

	public WebElement getBtn_getAttendance() {
		return btn_getAttendance;
	}

	public WebElement getDrp_StudentName() {
		return drp_StudentName;
	}

	public WebElement getBtn_getStudentAttendance() {
		return btn_getStudentAttendance;
	}
	
	public void navigateToStudentAttendancePage() throws InterruptedException {
		getMenu_attandanceTracker().click();
		waitForPageLoad();
	}
	
	public void verifyAttacndanceTracker() throws Exception{
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		waitForMinTime();	
		Date date = new Date();
		waitForMinTime();	
		String TodayDate = dateFormat.format(date);
		Select selectBatch=new Select(getDrp_selectbatch());
		selectBatch.selectByIndex(1);
		getTxt_date().sendKeys(TodayDate);
		getBtn_getAttendance().click();
		scrollDown();
		scrollDown();
		waitForMinTime();
		getBtn_saveAttendance().click();
		waitForMinTime();
		verifyElement(getMsg_sucess(),"Sucess Message");
	}
	
	

	
}
