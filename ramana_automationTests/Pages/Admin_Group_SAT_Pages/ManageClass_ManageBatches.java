package Admin_Group_SAT_Pages;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Admin_screens.Admin_Group_SAT_Locators;
import Admin_screens.Admin_Group_SAT_Locators.Admin_Group_SAT_Menu;
import Admin_screens.Admin_Group_SAT_Locators.Create_Batch_Page_Locators;
import coaching_center_base.BaseClass;
import coaching_center_base.FrameworkMethods;

public class ManageClass_ManageBatches extends SAT_TemplatePage implements Admin_Group_SAT_Menu, Create_Batch_Page_Locators {

	public ManageClass_ManageBatches() {
		PageFactory.initElements(BaseClass.driver, this);
		// TODO Auto-generated constructor stub
	}

	@FindBy(how = How.XPATH, using = MENU_GROUP_MANAGEMENT_XPATH)
	private WebElement menu_gropu_management;

	@FindBy(how = How.XPATH, using = MENU_SAT)
	private WebElement menu_sat;

	@FindBy(how = How.XPATH, using = MENU_MANAGE_CLASS_XPATH)
	private WebElement menu_manage_class;

	@FindBy(how = How.XPATH, using = BTN_CREATE_BATCH_XPATH)
	private WebElement btn_create_batch;

	@FindBy(how = How.XPATH, using = MENU_BRANCH_MANAGEMENT_XPATH)
	private WebElement menu_branch_manage_class;

	@FindBy(how = How.XPATH, using = BTN_CREATE_BATCH_XPATH)
	private WebElement btn_batch_name;

	@FindBy(how = How.XPATH, using = TXT_BATCH_NAME_XPATH)
	private WebElement txt_batch_name;

	@FindBy(how = How.XPATH, using = DRP_BRANCH_NAME_XPATH)
	private WebElement drp_branch_name;

	@FindBy(how = How.XPATH, using = DRP_SUB_PROGRAM_NAME_XPATH)
	private WebElement drp_subprogram_name;

	@FindBy(how = How.XPATH, using = BATCH_START_DATE_XPATH)
	private WebElement batch_start_date;

	@FindBy(how = How.XPATH, using = BATCH_END_DATE_XPATH)
	private WebElement batch_end_date;

	@FindBy(how = How.XPATH, using = CLASS_START_TIME_XPATH)
	private WebElement class_start_time;

	@FindBy(how = How.XPATH, using = CLASS_END_TIME_XPATH)
	private WebElement class_end_time;

	@FindBy(how = How.XPATH, using = BTN_SAVE_CHANGES_XPATH)
	private WebElement btn_save_changes;

	@FindBy(how = How.XPATH, using = BTN_CLOSE_XPATH)
	private WebElement btn_close;

	@FindBy(how = How.XPATH, using = BTN_DEACTIVE_XPATH)
	private WebElement btn_deactive;
	
	@FindBy(how = How.XPATH, using = TARGETED_DATE_XPATH)
	private WebElement targeted_Date;

	
	public WebElement getBtn_deactive() {
		return btn_deactive;
	}

	public WebElement getBtn_close() {
		return btn_close;
	}

	public WebElement getTargeted_Date() {
		return targeted_Date;
	}

	public WebElement getMenu_gropu_management() {
		return menu_gropu_management;
	}

	public WebElement getMenu_sat() {
		return menu_sat;
	}

	public WebElement getMenu_manage_class() {
		return menu_manage_class;
	}

	public WebElement getMenu_branch_manage_class() {
		return menu_branch_manage_class;
	}

	public WebElement getBtn_create_batch() {
		return btn_create_batch;
	}

	public WebElement getBtn_batch_name() {
		return btn_batch_name;
	}

	public WebElement getTxt_batch_name() {
		return txt_batch_name;
	}

	public WebElement getDrp_branch_name() {
		return drp_branch_name;
	}

	public WebElement getDrp_subprogram_name() {
		return drp_subprogram_name;
	}

	public WebElement getBatch_start_date() {
		return batch_start_date;
	}

	public WebElement getBatch_end_date() {
		return batch_end_date;
	}

	public WebElement getClass_start_time() {
		return class_start_time;
	}

	public WebElement getClass_end_time() {
		return class_end_time;
	}

	public WebElement getBtn_save_changes() {
		return btn_save_changes;
	}

	public void navigateToManageClass() throws InterruptedException {
		getMenu_manage_class().click();
		waitForPageLoad();
	}

	public void CreateBatch() throws InterruptedException, IOException {
		getBtn_create_batch().click();
		waitForPageLoad();
		DateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date date1 = new Date();
		String TodayDatetime = dateFormat1.format(date1);
		getTxt_batch_name().sendKeys(FrameworkMethods.getCustomProperty("batch_name")+TodayDatetime);
		Select brachName = new Select(getDrp_branch_name());
		brachName.selectByIndex(1);
		waitForMinTime();
		Select subbrachName = new Select(getDrp_subprogram_name());
		subbrachName.selectByIndex(1);
		waitForMinTime();
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		String TodayDate = dateFormat.format(date);
		getTargeted_Date().sendKeys(TodayDate);
		getBatch_start_date().sendKeys(TodayDate);
		getBatch_end_date().sendKeys(TodayDate);
		getClass_start_time().sendKeys(FrameworkMethods.getCustomProperty("start_time"));
		getClass_end_time().sendKeys(FrameworkMethods.getCustomProperty("end_time"));
		getBtn_save_changes().click();
		waitForMinTime();
		getBtn_close().click();
		waitForPageLoad();
	}
	
	public void DeactivateBatch() throws InterruptedException
	{
		getMenu_manage_class().click();
		waitForPageLoad();
		getBtn_deactive().click();
	}
}
