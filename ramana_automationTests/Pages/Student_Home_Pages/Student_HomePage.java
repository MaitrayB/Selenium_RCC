package Student_Home_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Student_screens.Student_Locators;
import Student_screens.Student_Locators.HomePage_Locators;
import Student_screens.Student_Locators.Student_Menu;
import coaching_center_base.BaseClass;
import coaching_center_base.FrameworkMethods;

public class Student_HomePage extends BaseClass implements HomePage_Locators, Student_Menu {

	@FindBy(how = How.XPATH, using = MENU_HOME_XPATH)
	private WebElement menu_home;

	@FindBy(how = How.XPATH, using = TAB_PROGRAMENAME_XPATH)
	private WebElement tab_programeName;

	@FindBy(how = How.XPATH, using = LBL_PROGNAME_XPATH)
	private WebElement programeName;

	@FindBy(how = How.XPATH, using = LBL_BATCHNAME_XPATH)
	private WebElement batchName;

	@FindBy(how = How.XPATH, using = TITLE_STUDENT_TODO_LIST_XPATH)
	private WebElement student_todo_list;

	@FindBy(how = How.XPATH, using = TITLE_PARENT_TODO_LIST_XPATH)
	private WebElement parent_todo_list;

	@FindBy(how = How.XPATH, using = RCCC_MSG_XPATH)
	private WebElement rcc_msg;



	public Student_HomePage() {
		PageFactory.initElements(BaseClass.driver, this);
	}

	public WebElement getMenu_home() {
		return menu_home;
	}

	public WebElement getTab_programeName() {
		return tab_programeName;
	}

	public WebElement getProgrameName() {
		return programeName;
	}

	public WebElement getBatchName() {
		return batchName;
	}

	public WebElement getStudent_todo_list() {
		return student_todo_list;
	}

	public WebElement getParent_todo_list() {
		return parent_todo_list;
	}
	
	public WebElement getRcc_msg() {
		return rcc_msg;
	}

	public void navigateToHomePage() throws InterruptedException {
		FrameworkMethods.logger.info("Navigating on home pagw");
		waitForMinTime();
		getMenu_home().click();
		waitForMaxTime();
	}
	
	
	public void verifyHomePage() throws Exception {
		verifyElement(getTab_programeName(), "Programe Tab");
		waitForMinTime();
		getTab_programeName().click();
		getProgrameName().click();
		waitForMinTime();
		verifyElement(getProgrameName(), "Programe Name Label");
		getBatchName().click();
		waitForMinTime();
		verifyElement(getStudent_todo_list(), "Student Todo List");
		verifyElement(getParent_todo_list(), "Parent Todo List");
		//verifyElement(getParent_todo_list(), "Parent Todo List");
		FrameworkMethods.logger.info(getRcc_msg().getText());

	}
}
