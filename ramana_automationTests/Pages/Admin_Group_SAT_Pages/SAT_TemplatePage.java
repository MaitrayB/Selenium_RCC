package Admin_Group_SAT_Pages;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import Admin_screens.Admin_Group_SAT_Locators.Admin_Group_SAT_Menu;
import Admin_screens.Admin_Group_SAT_Locators.Manage_Class_Video_Locators;
import coaching_center_base.BaseClass;

public class SAT_TemplatePage extends BaseClass implements Admin_Group_SAT_Menu, Manage_Class_Video_Locators  {
	
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

	public void navigateToManageClassSAT() throws InterruptedException {
		waitForMinTime();
		getMenu_branch_manage_class().click();
		waitForMinTime();
		getMenu_gropu_management().click();
		waitForMinTime();
		getMenu_sat().click();
		waitForMinTime();
	}	
	public void verifyUserIsOnSATPage() throws InterruptedException {
		String  uri="satbatchmngmnt";
		if(!driver.getCurrentUrl().contains(uri)) {
			navigateToManageClassSAT();
		}
	}
	
	public Boolean verifyTodayDate(String enteredDate) {
		DateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy");
		Date date = new Date();
		String TodayDate = dateFormat.format(date);
		if(enteredDate.contains(TodayDate)) {
			return true;
		}
		else {
			return false;
		}	
	}
	
	public void refreshPage() {
		driver.navigate().refresh();
	}
	
}
