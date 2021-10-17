package Admin_Group_SAT_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Admin_screens.Admin_Group_SAT_Locators.Admin_Group_SAT_Menu;
import Admin_screens.Admin_Group_SAT_Locators.SAT_Student_Analytics_Locators;
import coaching_center_base.BaseClass;

public class ManageClass_SAT_Student_Analytics extends SAT_TemplatePage implements Admin_Group_SAT_Menu,SAT_Student_Analytics_Locators {
	@FindBy(how = How.XPATH, using = SELECT_BATCH_XPATH)
	private WebElement drp_select_batch;
	
	@FindBy(how = How.XPATH, using = SELECT_STUDENT_XPATH)
	private WebElement drp_select_student;
	
	@FindBy(how = How.XPATH, using = TAB_READINGTAB1_XPATH)
	private WebElement tab_rerading;
	
	@FindBy(how = How.XPATH, using = BTN_REGRADE_XPATH)
	private WebElement btn_regrad;
	
	@FindBy(how = How.XPATH, using = BTN_DOWLOAD_XPATH)
	private WebElement btn_download;
	
	@FindBy(how = How.XPATH, using = TAB_READINGTAB2_XPATH)
	private WebElement tab_reading2;

	@FindBy(how = How.XPATH, using = BTN_DELETE1_XPATH)
	private WebElement btn_delete1;

	@FindBy(how = How.XPATH, using = BTN_READDELETE_XPATH)
	private WebElement btn_delete;
	@FindBy(how = How.XPATH, using = BTN_REGRADE1_XPATH)
	private WebElement btn_regrade1;
	
	@FindBy(how = How.XPATH, using = BTN_DOWLOAD1_XPATH)
	private WebElement btn_download1;
	
	@FindBy(how = How.XPATH, using = TAB_WRITE_XPATH)
	private WebElement tab_write;

	@FindBy(how = How.XPATH, using = TAB_WRITING1_XPATH)
	private WebElement tab_write1;
	
	@FindBy(how = How.XPATH, using = TAB_MATHEMATICS_XPATH)
	private WebElement tab_mathematics;

	@FindBy(how = How.XPATH, using = TAB_MATHEMATICS1_XPATH)
	private WebElement tab_mathematics1;

	@FindBy(how = How.XPATH, using = BTN_DELETE2_XPATH)
	private WebElement btn_delete2;
	
	@FindBy(how = How.XPATH, using = BTN_REGRADE2_XPATH)
	private WebElement btn_regrade2;

	@FindBy(how = How.XPATH, using = BTN_DELETE3_XPATH)
	private WebElement btn_delete3;
	
	@FindBy(how = How.XPATH, using = BTN_REGRADE3_XPATH)
	private WebElement btn_regrade3;

	@FindBy(how = How.XPATH, using = BTN_DOWLOAD3_XPATH)
	private WebElement btn_download3;

	@FindBy(how = How.XPATH, using = BTN_DOWLOAD2_XPATH)
	private WebElement btn_download2;
	
	@FindBy(how = How.XPATH, using = TAB_MATHEMATICS2_XPATH)
	private WebElement tab_mathematics2;

	@FindBy(how = How.XPATH, using = MENU_STUDENT_ANALYTICS_XPATH)
	private WebElement menu_student_analytics;
	
	

	public WebElement getBtn_delete3() {
		return btn_delete3;
	}

	public WebElement getBtn_regrade3() {
		return btn_regrade3;
	}

	public WebElement getBtn_download3() {
		return btn_download3;
	}

	public WebElement getDrp_select_batch() {
		return drp_select_batch;
	}

	public WebElement getDrp_select_student() {
		return drp_select_student;
	}

	public WebElement getTab_rerading() {
		return tab_rerading;
	}

	public WebElement getBtn_regrad() {
		return btn_regrad;
	}

	public WebElement getBtn_download() {
		return btn_download;
	}

	public WebElement getTab_reading2() {
		return tab_reading2;
	}

	public WebElement getBtn_delete1() {
		return btn_delete1;
	}

	public WebElement getBtn_regrade1() {
		return btn_regrade1;
	}

	public WebElement getBtn_download1() {
		return btn_download1;
	}

	public WebElement getTab_write() {
		return tab_write;
	}

	public WebElement getTab_write1() {
		return tab_write1;
	}

	public WebElement getTab_mathematics() {
		return tab_mathematics;
	}

	public WebElement getTab_mathematics1() {
		return tab_mathematics1;
	}

	public WebElement getBtn_delete2() {
		return btn_delete2;
	}

	public WebElement getBtn_regrade2() {
		return btn_regrade2;
	}

	public WebElement getBtn_download2() {
		return btn_download2;
	}
	
	public WebElement getBtn_delete() {
		return btn_delete;
	}

	public WebElement getMenu_student_analytics() {
		return menu_student_analytics;
	}
	
	public WebElement getTab_mathematics2() {
		return tab_mathematics2;
	}

	public void navigateToStudentAnalytics() throws InterruptedException {
		getMenu_student_analytics().click();
		waitForPageLoad();
	}
	

	public ManageClass_SAT_Student_Analytics() {
		PageFactory.initElements(BaseClass.driver, this);
		// TODO Auto-generated constructor stub
	}

	public void verifyStudentAnalystics() throws Exception
	{
		Select batch=new Select(getDrp_select_batch());
		batch.selectByIndex(1);
		waitForMinTime();
		Select student = new Select(getDrp_select_student());
		student.selectByIndex(3);
		waitForMinTime();
		getTab_rerading().click();
		waitForMinTime();
		verifyElement(getBtn_delete(), "Delete Button");
		verifyElement(getBtn_regrad(), "Re-Grade Button");
		verifyElement(getBtn_download(), "Download Button");
		getTab_rerading().click();
		waitForMinTime();
		getTab_reading2().click();
		verifyElement(getBtn_delete1(), "Delete Button");
		verifyElement(getBtn_regrade1(), "Re-Grade Button");
		verifyElement(getBtn_download1(), "Download Button");
	}
	
	public void verifyWritingTab()throws Exception {
		getTab_write().click();
		waitForMinTime();
		getTab_write1().click();
		verifyElement(getBtn_delete1(), "Delete Button");
		verifyElement(getBtn_regrade1(), "Re-Grade Button");
		verifyElement(getBtn_download1(), "Download Button");
	}
	
	public void verifyMathematics() throws Exception {
		getTab_mathematics().click();
		waitForMinTime();
		getTab_mathematics1().click();
		verifyElement(getBtn_delete2(), "Delete Button");
		verifyElement(getBtn_regrade2(), "Re-Grade Button");
		verifyElement(getBtn_download2(), "Download Button");
		getTab_mathematics1().click();
		waitForMinTime();
		getTab_mathematics2().click();
		waitForMinTime();
		verifyElement(getBtn_delete3(), "Delete Button");
		verifyElement(getBtn_regrade3(), "Re-Grade Button");
		verifyElement(getBtn_download3(), "Download Button");	
		
	}
}
