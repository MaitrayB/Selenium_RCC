package Admin_Group_SAT_Pages;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Admin_screens.Admin_Group_SAT_Locators;
import Admin_screens.Admin_Group_SAT_Locators.Admin_Group_SAT_Menu;
import Admin_screens.Admin_Group_SAT_Locators.Create_Batch_Page_Locators;
import coaching_center_base.BaseClass;

public class ManageClassPage extends BaseClass implements Admin_Group_SAT_Menu, Create_Batch_Page_Locators {

	public ManageClassPage() {
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

	public void getTodaysDate() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		System.out.println(dtf.format(now));
	}

	public void navigateToManageClass() throws InterruptedException {
		getMenu_branch_manage_class().click();
		waitForMinTime();
		getMenu_gropu_management().click();
		waitForMinTime();
		getMenu_sat().click();
		waitForMinTime();
		getMenu_manage_class().click();
	}

	public void CreateBatch() throws InterruptedException {
		getBtn_create_batch().click();
		waitForMinTime();
		getBatch_start_date().sendKeys();
	}

}
