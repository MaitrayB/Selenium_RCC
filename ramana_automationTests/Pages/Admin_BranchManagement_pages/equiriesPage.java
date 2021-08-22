package Admin_BranchManagement_pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Admin_screens.Locators.EnquiriesPageLocators;
import Admin_screens.Locators.Menus;
import coaching_center_base.BaseClass;
import coaching_center_base.FrameworkMethods;

public class equiriesPage extends BaseClass implements Menus, EnquiriesPageLocators {

	public equiriesPage() {
		PageFactory.initElements(BaseClass.driver, this);
		// TODO Auto-generated constructor stub
	}

	@FindBy(how = How.XPATH, using = FIRSTNAME_XPATH)
	private WebElement parent_firstname;

	@FindBy(how = How.XPATH, using = LASTNAME_XPATH)
	private WebElement parent_lastname;

	@FindBy(how = How.XPATH, using = MOBILE_NUMBER_XPATH)
	private WebElement mobilenumber;

	@FindBy(how = How.XPATH, using = PARENT_EMAIL_XPATH)
	private WebElement parentEmail;

	@FindBy(how = How.XPATH, using = STUDENT_FIRSTNAME_XPATH)
	private WebElement studentfirstName;

	@FindBy(how = How.XPATH, using = STUDENT_LASTNAME_XPATH)
	private WebElement studentLastName;

	@FindBy(how = How.XPATH, using = INTRESTED_PROGRAM_XPATH)
	private WebElement interestedProgram;

	@FindBy(how = How.XPATH, using = MESSAGE_XPATH)
	private WebElement message;

	@FindBy(how = How.XPATH, using = BTN_RESET_XPATH)
	private WebElement btn_reset;

	@FindBy(how = How.XPATH, using = BTN_ADDUPDATE_XPATH)
	private WebElement btn_addupdates;

	@FindBy(how = How.XPATH, using = TAB_ADD_ENQUIRY_XPATH)
	private WebElement tab_add_enquiry;

	@FindBy(how = How.XPATH, using = TAB_SEARCH_ENQUIRY_XPATH)
	private WebElement tab_search_enquiry;

	@FindBy(how = How.XPATH, using = MENU_ENQUIRY_XPATH)
	private WebElement menu_enquiry;

	@FindBy(how = How.XPATH, using = SEARCH_LAST_NAME_XPATH)
	private WebElement serach_name;

	@FindBy(how = How.XPATH, using = BTN_SEARCH)
	private WebElement btn_search;
	
	@FindBy(how = How.XPATH, using = LAST_NAME_XPATH)
	private WebElement last_name;

	public WebElement getSerach_name() {
		return serach_name;
	}

	public WebElement getLast_name() {
		return last_name;
	}


	public WebElement getTab_search_enquiry() {
		return tab_search_enquiry;
	}

	public WebElement getBtn_search() {
		return btn_search;
	}

	public WebElement getParent_firstname() {
		return parent_firstname;
	}

	public WebElement getParent_lastname() {
		return parent_lastname;
	}

	public WebElement getMobilenumber() {
		return mobilenumber;
	}

	public WebElement getParentEmail() {
		return parentEmail;
	}

	public WebElement getStudentfirstName() {
		return studentfirstName;
	}

	public WebElement getStudentLastName() {
		return studentLastName;
	}

	public WebElement getInterestedProgram() {
		return interestedProgram;
	}

	public WebElement getMessage() {
		return message;
	}

	public WebElement getBtn_reset() {
		return btn_reset;
	}

	public WebElement getBtn_addupdates() {
		return btn_addupdates;
	}

	public WebElement getTab_add_enquiry() {
		return tab_add_enquiry;
	}

	public WebElement getMenu_enquiry() {
		return menu_enquiry;
	}
	

	public void navigateToAddEnquiryPage() throws InterruptedException {
		getMenu_enquiry().click();
		waitForPageLoad();
	}

	public void addEnquiry() throws IOException, InterruptedException {
		getParent_firstname().sendKeys(FrameworkMethods.getCustomProperty("parent_first_name"));
		getParent_lastname().sendKeys(FrameworkMethods.getCustomProperty("parent_last_name"));
		getMobilenumber().sendKeys(FrameworkMethods.getCustomProperty("parent_mobile_number"));
		getParentEmail().sendKeys(FrameworkMethods.getCustomProperty("parent_email"));
		getStudentfirstName().sendKeys(FrameworkMethods.getCustomProperty("student_first_name"));
		getStudentLastName().sendKeys(FrameworkMethods.getCustomProperty("student_last_name"));
		getMessage().sendKeys(FrameworkMethods.getCustomProperty("message"));
		Select studentName = new Select(getInterestedProgram());
		waitForMinTime();
		studentName.selectByIndex(1);
		getBtn_addupdates().click();
	}
	
	public void searchEnquiry() throws IOException, InterruptedException {
		waitForMinTime();
		getTab_add_enquiry().click();
		waitForMinTime();
		getTab_search_enquiry().click();
		getSerach_name().sendKeys(FrameworkMethods.getCustomProperty("parent_last_name"));
		waitForMinTime();
		getBtn_search().click();
		System.out.println(getLast_name().getText());
		getLast_name().getText().equals(FrameworkMethods.getCustomProperty("parent_last_name"));
	}
	
	 

}
