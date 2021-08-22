package Admin_BranchManagement_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import Admin_screens.Locators.Menus;
import Admin_screens.Locators.NewRegistrationLocators;
import coaching_center_base.BaseClass;

public class registrationPage extends BaseClass implements NewRegistrationLocators,Menus {
	@FindBy(how = How.XPATH, using =MENU_REGISTRATION_XPATH )
	private WebElement new_registrationmenu;
	
	@FindBy(how = How.XPATH, using =ACCORDIAN_STUDENT_REGISTRATION_XPATH )
	private WebElement student_registration_tab;
	
	@FindBy(how = How.XPATH, using =ARROW_XPATH )
	private WebElement arrow;
	
	@FindBy(how = How.XPATH, using =ACCORDIAN_STUDENT_XPATH )
	private WebElement student_tab;
	
	@FindBy(how = How.XPATH, using =ACCORDIAN_NEW_PARENT_XPATH )
	private WebElement parent_tab;
	
	@FindBy(how = How.XPATH, using =ACCORDIAN_NEW_STUDENT_XPATH )
	private WebElement new_student_tab;
	
	public registrationPage() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	public WebElement getArrow() {
		return arrow;
	}

	public WebElement getNew_registrationmenu() {
		return new_registrationmenu;
	}

	public WebElement getStudent_registration_tab() {
		return student_registration_tab;
	}

	public WebElement getStudent_tab() {
		return student_tab;
	}

	public WebElement getParent_tab() {
		return parent_tab;
	}

	public WebElement getNew_student_tab() {
		return new_student_tab;
	}
	
	public void navigateToRegistrationPage() throws Exception {
		verifyElement(getNew_registrationmenu(), "Student registartion menu");
		getNew_registrationmenu().click();
	}
	
	public void verifyNewRegistrationPage() throws Exception {
		waitForPageLoad();
		verifyElement(getStudent_registration_tab(), "Student registartion tab");
		getArrow().click();
		verifyElement(getStudent_tab(), "Student registration tab");
		verifyElement(getParent_tab(), "New Parent tab");
		verifyElement(getNew_student_tab(), "New Student tab");
	}
}
