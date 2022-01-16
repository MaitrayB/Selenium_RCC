package Admin_Group_SAT_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Admin_screens.Admin_Group_SAT_Locators.Admin_Group_SAT_Menu;
import Admin_screens.Admin_Group_SAT_Locators.Batch_Detail_Viewer_Locators;
import Admin_screens.Admin_Group_SAT_Locators.Create_Batch_Page_Locators;
import coaching_center_base.BaseClass;
import coaching_center_base.FrameworkMethods;

/**
 * @author Bhatt
 *
 */
public class ManageClass_BatchDetailViewer extends SAT_TemplatePage
		implements Admin_Group_SAT_Menu, Batch_Detail_Viewer_Locators {
	@FindBy(how = How.XPATH, using = TAB_MANAGE_BATCH_XPATH)
	private WebElement tab_manage_batch;

	@FindBy(how = How.XPATH, using = TAB_BATCH_DETAILS_VIEWER_XPATH)
	private WebElement tab_detail_viewer;

	@FindBy(how = How.XPATH, using = SELECT_SUBPROGRAME_XPATH)
	private WebElement select_subprograme;

	@FindBy(how = How.XPATH, using = EDIT_BUTTON_XPATH)
	private WebElement edit_button;

	@FindBy(how = How.XPATH, using = ACCESS_END_DATE_XPATH)
	private WebElement access_end_date;

	@FindBy(how = How.XPATH, using = SAVE_BUTTON_XPATH)
	private WebElement btn_save;

	@FindBy(how = How.XPATH, using = VIEW_BUTTON_XPATH)
	private WebElement view_button;

	@FindBy(how = How.XPATH, using = STUDENT_DETAIL_POPUP_XPATH)
	private WebElement student_detail_popup;

	@FindBy(how = How.XPATH, using = LOGIN_AS_STUDENT_XPATH)
	private WebElement btn_Loginas_student;

	@FindBy(how = How.XPATH, using = TAB_STUDENT_PROGRAME_XPATH)
	private WebElement tab_student;

	@FindBy(how = How.XPATH, using = DRP_SWITCH_ROLL_XPATH)
	private WebElement drp_switch_roll;

	@FindBy(how = How.XPATH, using = OPTION_PREVIOUS_ADMIN_XPATH)
	private WebElement option_previous_admin;

	@FindBy(how = How.XPATH, using = LINK_PROGRAME_XPATH)
	private WebElement link_programe;

	@FindBy(how = How.XPATH, using = MENU_BRANCH_MANAGEMENT_XPATH)
	private WebElement menu_branch_manage_class;

	@FindBy(how = How.XPATH, using = MENU_GROUP_MANAGEMENT_XPATH)
	private WebElement menu_gropu_management;

	@FindBy(how = How.XPATH, using = MENU_MANAGE_CLASS_XPATH)
	private WebElement menu_manage_class;

	@FindBy(how = How.XPATH, using = SEELCT_BATCH_XPATH)
	private WebElement drp_select_batch;

	@FindBy(how = How.XPATH, using = MENU_SAT)
	private WebElement menu_sat;

	@FindBy(how = How.XPATH, using = DISABLE_LINK_XPATH)
	private WebElement disable_link;

	public ManageClass_BatchDetailViewer() {
		PageFactory.initElements(BaseClass.driver, this);
		// TODO Auto-generated constructor stub
	}

	public WebElement getDisable_link() {
		return disable_link;
	}

	public WebElement getMenu_sat() {
		return menu_sat;
	}

	public WebElement getTab_manage_batch() {
		return tab_manage_batch;
	}

	public WebElement getTab_detail_viewer() {
		return tab_detail_viewer;
	}

	public WebElement getSelect_subprograme() {
		return select_subprograme;
	}

	public WebElement getEdit_button() {
		return edit_button;
	}

	public WebElement getAccess_end_date() {
		return access_end_date;
	}

	public WebElement getBtn_save() {
		return btn_save;
	}

	public WebElement getView_button() {
		return view_button;
	}

	public WebElement getStudent_detail_popup() {
		return student_detail_popup;
	}

	public WebElement getBtn_Loginas_student() {
		return btn_Loginas_student;
	}

	public WebElement getTab_student() {
		return tab_student;
	}

	public WebElement getDrp_switch_roll() {
		return drp_switch_roll;
	}

	public WebElement getOption_previous_admin() {
		return option_previous_admin;
	}

	public WebElement getLink_programe() {
		return link_programe;
	}

	public WebElement getMenu_branch_manage_class() {
		return menu_branch_manage_class;
	}

	public WebElement getDrp_select_batch() {
		return drp_select_batch;
	}

	public WebElement getMenu_gropu_management() {
		return menu_gropu_management;
	}

	public WebElement getMenu_manage_class() {
		return menu_manage_class;
	}

	public void navigateToBatchDeatils() throws InterruptedException {
		FrameworkMethods.logger.info("Clicked on ManageClass Page");
		getMenu_manage_class().click();
		waitForPageLoad();
		FrameworkMethods.logger.info("Clicked on Manage Tab Page");
		getTab_manage_batch().click();
		waitForMinTime();
		FrameworkMethods.logger.info("Clicked on detail Tab Page");
		getTab_detail_viewer().click();
		waitForMinTime();
	}

	public void inactiveStudent() throws Exception {
		FrameworkMethods.logger.info("Selecting the subprogram");
		Select studentName = new Select(getSelect_subprograme());
		studentName.selectByIndex(6);
		waitForMinTime();
		FrameworkMethods.logger.info("Selecting the batch");
		Select selectBatch = new Select(getDrp_select_batch());
		selectBatch.selectByIndex(1);
		waitForMinTime();
		getEdit_button().click();
		FrameworkMethods.logger.info("Selecting the access past date");
		getAccess_end_date().sendKeys(FrameworkMethods.getCustomProperty("past_date"));
		getBtn_save().click();
		FrameworkMethods.logger.info("Details saved");
		FrameworkMethods.logger.info("Clicking on view button");
		getView_button().click();
		waitForPageLoad();
		FrameworkMethods.logger.info("Verifying elements on students pop up");
		verifyElement(getStudent_detail_popup(), "Student Popup");
		getBtn_Loginas_student().click();
		waitForPageLoad();
		getTab_student().click();
		verifyElement(getDisable_link(), "Disable Link");
		getDrp_switch_roll().click();
		getOption_previous_admin().click();
	}

	public void activeStudent() throws Exception {
		waitForPageLoad();
		FrameworkMethods.logger.info("Selecting the student name ");
		Select studentName = new Select(getSelect_subprograme());
		studentName.selectByIndex(6);
		waitForMinTime();
		FrameworkMethods.logger.info("Selecting the batch");
		Select selectBatch = new Select(getDrp_select_batch());
		selectBatch.selectByIndex(1);
		waitForMinTime();
		getEdit_button().click();
		FrameworkMethods.logger.info("Selecting future date");
		getAccess_end_date().sendKeys(FrameworkMethods.getCustomProperty("future_date"));
		FrameworkMethods.logger.info("Clicking on future date");
		getBtn_save().click();
		getView_button().click();
		waitForPageLoad();
		FrameworkMethods.logger.info("Verifying stufent popup");
		verifyElement(getStudent_detail_popup(), "Student Popup");
		getBtn_Loginas_student().click();
		waitForPageLoad();
		FrameworkMethods.logger.info("Clicking on student tab");
		getTab_student().click();
		FrameworkMethods.logger.info("Verifying active link");
		verifyElement(getLink_programe(), "Active Link");
		getDrp_switch_roll().click();
		getOption_previous_admin().click();
	}

}
