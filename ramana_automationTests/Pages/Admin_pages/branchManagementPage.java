package Admin_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Admin_screens.Locators.BranchmanagementLocators;
import Admin_screens.Locators.Menus;
import coaching_center_base.BaseClass;
import coaching_center_base.FrameworkMethods;

public class branchManagementPage extends BaseClass implements BranchmanagementLocators, Menus {
	public branchManagementPage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(BaseClass.driver, this);
	}


	@FindBy(how = How.XPATH, using = MENU_SEARCH_STUDENT_XPATH)
	private WebElement menu_search_student;
	
	@FindBy(how = How.XPATH, using = FIRSTNAME_XPATH)
	private WebElement student_first_name;
	
	@FindBy(how = How.XPATH, using = LASTNAME_XPATH)
	private WebElement student_last_name;
	
	
	@FindBy(how = How.XPATH, using = BTN_SEARCH_XPATH)
	private WebElement btn_search_student;
	
	public WebElement getMenu_search_student() {
		return menu_search_student;
	}

	public WebElement getStudent_first_name() {
		return student_first_name;
	}

	public WebElement getBtn_search_student() {
		return btn_search_student;
	}
	

	public WebElement getStudent_last_name() {
		return student_last_name;
	}

	public void searchStudentwithFirstName() throws Exception {
		getMenu_search_student().click();
		Thread.sleep(3000);
		verifyElement(getMenu_search_student(), "Username Textbox");
		getStudent_first_name().sendKeys(FrameworkMethods.getCustomProperty("student_name"));
		getBtn_search_student().click();
	}
	
	public void searchStudentwithLastName() throws Exception {
		getMenu_search_student().click();
		Thread.sleep(3000);
		verifyElement(getMenu_search_student(), "Username Textbox");
		getStudent_last_name().sendKeys(FrameworkMethods.getCustomProperty("student_Last__name"));
		getBtn_search_student().click();
	
	}
}
