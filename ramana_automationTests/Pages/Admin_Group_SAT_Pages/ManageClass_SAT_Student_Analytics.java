package Admin_Group_SAT_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import Admin_screens.Admin_Group_SAT_Locators.Admin_Group_SAT_Menu;
import Admin_screens.Admin_Group_SAT_Locators.SAT_Student_Analytics_Locators;

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

	
	@FindBy(how = How.XPATH, using = BTN_REGRADE1_XPATH)
	private WebElement btn_regrade1;
	
	@FindBy(how = How.XPATH, using = BTN_DOWLOAD1_XPATH)
	private WebElement btn_download1;
	
}
