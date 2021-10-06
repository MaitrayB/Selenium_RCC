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
import Admin_screens.Admin_Group_SAT_Locators.Student_Batch_Schedule_Locators;
import coaching_center_base.BaseClass;

public class ManageClass_SAT_Batch_Test_Schedule extends SAT_TemplatePage implements Admin_Group_SAT_Menu, Student_Batch_Schedule_Locators {

	
	public ManageClass_SAT_Batch_Test_Schedule() {
		PageFactory.initElements(BaseClass.driver, this);
		// TODO Auto-generated constructor stub
	}

	@FindBy(how = How.XPATH, using = TAB_SAT_BATCH_TEST_SCHEDULE_XPATH)
	private WebElement tab_sat_batch_Test_Schdule;

	@FindBy(how = How.XPATH, using = DRP_SAT_BATCH_XPATH)
	private WebElement drp_sat_batch;
	
	@FindBy(how = How.XPATH, using = DRP_ACTIVITY_TYPE_XPATH)
	private WebElement drp_activity_type;
	
	@FindBy(how = How.XPATH, using = ACTIVITY_DATE_XPATH)
	private WebElement activity_date;
	
	@FindBy(how = How.XPATH, using = DRP_TEXT_BOOK_XPATH)
	private WebElement drp_text_book;
	
	@FindBy(how = How.XPATH, using = DRP_TEST_XPATH)
	private WebElement drp_test;
	
	@FindBy(how = How.XPATH, using = TAB_MANAGE2_BATCH_XPATH)
	private WebElement tab_manage_batch;

	@FindBy(how = How.XPATH, using = BTN_TESTSCHEDULE_XPATH)
	private WebElement btn_save;
	
	@FindBy(how = How.XPATH, using = MSG_SUCCESS_XPATH)
	private WebElement msg_success;

	@FindBy(how = How.XPATH, using = BTN_REMOVE_XPATH)
	private WebElement btn_remove;

	
	public WebElement getBtn_remove() {
		return btn_remove;
	}

	public WebElement getMsg_success() {
		return msg_success;
	}

	public WebElement getTab_manage_batch() {
		return tab_manage_batch;
	}

	public WebElement getTab_sat_batch_Test_Schdule() {
		return tab_sat_batch_Test_Schdule;
	}

	public WebElement getDrp_sat_batch() {
		return drp_sat_batch;
	}

	public WebElement getDrp_activity_type() {
		return drp_activity_type;
	}

	public WebElement getActivity_date() {
		return activity_date;
	}

	public WebElement getDrp_text_book() {
		return drp_text_book;
	}
	
	public WebElement getDrp_test() {
		return drp_test;
	}
	
	public WebElement getBtn_save() {
		return btn_save;
	}

	public void navigateToSatBatchTestSchedule() throws InterruptedException {
		waitForMinTime();
		getMenu_manage_class().click();
		waitForPageLoad();
		getTab_manage_batch().click();
		waitForMinTime();
		getTab_sat_batch_Test_Schdule().click();
	}
	
	public void scheduleTest() throws Exception {
		scrollDown();
		Select selectBatch= new Select(getDrp_sat_batch());
		selectBatch.selectByIndex(1);
		waitForMinTime();	
		Select selectActivity= new Select(getDrp_activity_type());
		selectActivity.selectByIndex(3);
		waitForMinTime();	
		Select selectTextBook= new Select(getDrp_text_book());
		selectTextBook.selectByIndex(2);
		waitForMinTime();	
		Select selectTestNumber= new Select(getDrp_test());
		selectTestNumber.selectByIndex(1);
		waitForMinTime();	
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		waitForMinTime();	
		Date date = new Date();
		waitForMinTime();	
		String TodayDate = dateFormat.format(date);
		getActivity_date().sendKeys(TodayDate);
		getBtn_save().click();
		waitForMinTime();
		verifyElement(getMsg_success(), "Success Message");
		getBtn_remove().click();
		waitForMinTime();
	}
}
 