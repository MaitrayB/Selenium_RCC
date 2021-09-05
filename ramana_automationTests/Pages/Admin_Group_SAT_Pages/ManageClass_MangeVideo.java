package Admin_Group_SAT_Pages;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Admin_screens.Admin_Group_SAT_Locators.Admin_Group_SAT_Menu;
import Admin_screens.Admin_Group_SAT_Locators.Manage_Class_Video_Locators;
import coaching_center_base.BaseClass;
import coaching_center_base.FrameworkMethods;

public class ManageClass_MangeVideo extends SAT_TemplatePage implements Admin_Group_SAT_Menu, Manage_Class_Video_Locators {
	
	public ManageClass_MangeVideo() {
		PageFactory.initElements(BaseClass.driver, this);
		// TODO Auto-generated constructor stub
	}
	@FindBy(how = How.XPATH, using = TAB_MANAGE_VIDEO_REQUEST)
	private WebElement tab_manage_class_video;

	@FindBy(how = How.XPATH, using = DRP_WEEKEND_SAT_XPATH)
	private WebElement drp_select_weekend_sat;
	
	@FindBy(how = How.XPATH, using = DRP_BATCH_XPATH)
	private WebElement drp_select_batch;
	
	@FindBy(how = How.XPATH, using = DRP_DATE)
	private WebElement txt_date;
	
	@FindBy(how = How.XPATH, using = DRP_PHASE_XPATH)
	private WebElement drp_phase;
	
	@FindBy(how = How.XPATH, using = TXT_VIDEO_LINK_XPATH)
	private WebElement txt_video_link;
	
	@FindBy(how = How.XPATH, using = TXT_VIDEO_PASSWORD_XPATH)
	private WebElement txt_video_password;

	@FindBy(how = How.XPATH, using = BTN_ADD_VIDEO_XPATH)
	private WebElement btn_add_video;
	
	@FindBy(how = How.XPATH, using = BTN_DELETE_XPATH)
	private WebElement btn_delete;

	@FindBy(how = How.XPATH, using = MENU_BRANCH_MANAGEMENT_XPATH)
	private WebElement menu_branch_manage_class;
	
	@FindBy(how = How.XPATH, using = MENU_GROUP_MANAGEMENT_XPATH)
	private WebElement menu_gropu_management;

	@FindBy(how = How.XPATH, using = MENU_SAT)
	private WebElement menu_sat;
	
	@FindBy(how = How.XPATH, using = MENU_MANAGE_CLASS_XPATH)
	private WebElement menu_manage_class;
	
	
	public WebElement getMenu_branch_manage_class() {
		return menu_branch_manage_class;
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

	public WebElement getTab_manage_class_video() {
		return tab_manage_class_video;
	}

	public WebElement getDrp_select_weekend_sat() {
		return drp_select_weekend_sat;
	}

	public WebElement getDrp_select_batch() {
		return drp_select_batch;
	}

	public WebElement getTxt_date() {
		return txt_date;
	}

	public WebElement getDrp_phase() {
		return drp_phase;
	}

	public WebElement getTxt_video_link() {
		return txt_video_link;
	}

	public WebElement getTxt_video_password() {
		return txt_video_password;
	}

	public WebElement getBtn_add_video() {
		return btn_add_video;
	}
	
	public WebElement getBtn_delete() {
		return btn_delete;
	}

	public void navigateToManageClassVideo() throws InterruptedException {
		waitForMinTime();
		getMenu_manage_class().click();
		waitForPageLoad();
		getTab_manage_class_video().click();
	}
	
	public void createLink() throws Exception {
		String entredDate=null;
		String todayDate=null;
		Boolean verifiedDate=null;
		Select subPrograme = new Select(getDrp_select_weekend_sat());
		subPrograme.selectByIndex(6);
		waitForMinTime();
		Select selectBatch = new Select(getDrp_select_batch());
		selectBatch.selectByIndex(1);
		waitForMinTime();
		DateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy");
		waitForMaxTime();
		Date date = new Date();
		waitForMaxTime();
		todayDate = dateFormat.format(date);
	    waitForMaxTime();
		getTxt_date().sendKeys(todayDate);
		entredDate=getTxt_date().getText();
		verifiedDate= verifyTodayDate(entredDate);
	    while(verifiedDate==false)
	    {
	    	getTxt_date().clear();
			todayDate = dateFormat.format(date);
		    waitForMaxTime();
			getTxt_date().sendKeys(todayDate);
			entredDate=getTxt_date().getText();
			verifiedDate= verifyTodayDate(entredDate);
	    }
	
		waitForMinTime();
		Select phase=new Select(getDrp_phase());
		phase.selectByIndex(1);
		getTxt_video_link().sendKeys(FrameworkMethods.getCustomProperty("video_link"));
		verifyElement(getTxt_video_password(),"Video Password Field" );
		getTxt_video_password().sendKeys(FrameworkMethods.getCustomProperty("student_password"));
		getBtn_add_video().click();
		waitForPageLoad();
	}
	public void deleteAddedVideo() throws InterruptedException {
		getBtn_delete().click();
		waitForPageLoad();
	}
}
