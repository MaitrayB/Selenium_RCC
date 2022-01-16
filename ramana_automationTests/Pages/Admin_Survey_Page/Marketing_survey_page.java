package Admin_Survey_Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import Admin_screens.SurveyPageLocators;
import Admin_screens.SurveyPageLocators.MarketingSurveyPageLocators;
import coaching_center_base.BaseClass;
import coaching_center_base.FrameworkMethods;

/**
 * @author Bhatt
 *
 */
public class Marketing_survey_page extends BaseClass implements MarketingSurveyPageLocators {
	@FindBy(how = How.XPATH, using = MENU_SURVEY_XPATH)
	private WebElement menu_survey;
	
	@FindBy(how = How.XPATH, using = TITLE_SURVEY_STISTICS_XPATH)
	private WebElement title_survey_stistics;
	
	@FindBy(how = How.XPATH, using = TAB_SURVEY_DETAILS_XPATH)
	private WebElement tab_survey_details;
	
	@FindBy(how = How.XPATH, using = TAB_SURVEY_STISTICS_XPATH)
	private WebElement tab_survey_stistics;
	
	@FindBy(how = How.XPATH, using = FIELD_CHENNEL_NAME_XPATH)
	private WebElement field_chennel_name;
	
	@FindBy(how = How.XPATH, using = FIELD_OF_USERS_REGISTERED_XPATH)
	private WebElement field_of_users_registration;
	
	@FindBy(how = How.XPATH, using = SELECT_BRANCH_XPATH)
	private WebElement select_branch;
	
	@FindBy(how = How.XPATH, using = FIELD_REGISTRATION_DATE_XPATH)
	private WebElement registration_date;
	
	@FindBy(how = How.XPATH, using = FIELD_FIRSTNAME_XPATH)
	private WebElement first_name;
	
	@FindBy(how = How.XPATH, using = FIELD_LASTNAME_XPATH)
	private WebElement last_name;
	
	@FindBy(how = How.XPATH, using = MENU_BRANCH_MANAGEMENT_XPATH)
	private WebElement menu_branchManagement;
	
	@FindBy(how = How.XPATH, using = LABEL_TOTAL_RECORD_XPATH)
	private WebElement label_total_record;
	

	@FindBy(how = How.XPATH, using = LABEL_SURVEY_STATISTIC_TOTAL_RECORD_XPATH)
	private WebElement labelsurvey_statistic_total_record;

	public Marketing_survey_page() {
		PageFactory.initElements(BaseClass.driver, this);
		// TODO Auto-generated constructor stub
	}

	
	public WebElement getLabelsurvey_statistic_total_record() {
		return labelsurvey_statistic_total_record;
	}

  
	public WebElement getMenu_branchManagement() {
		return menu_branchManagement;
	}

	public WebElement getMenu_survey() {
		return menu_survey;
	}

	public WebElement getTitle_survey_stistics() {
		return title_survey_stistics;
	}

	public WebElement getTab_survey_details() {
		return tab_survey_details;
	}

	public WebElement getTab_survey_stistics() {
		return tab_survey_stistics;
	}

	public WebElement getField_chennel_name() {
		return field_chennel_name;
	}

	public WebElement getField_of_users_registration() {
		return field_of_users_registration;
	}

	public WebElement getSelect_branch() {
		return select_branch;
	}
	
	public WebElement getLabel_total_record() {
		return label_total_record;
	}

	public WebElement getRegistration_date() {
		return registration_date;
	}

	public WebElement getFirst_name() {
		return first_name;
	}

	public WebElement getLast_name() {
		return last_name;
	}
	

	public void navigateToSurveys() throws InterruptedException {
		waitForMaxTime();
		getMenu_branchManagement().click();
		waitForMinTime();
		getMenu_survey().click();
		waitForPageLoad();
	}
	
	public void verifyMarketingSurvey() throws Exception {
		verifyElement(getTab_survey_details(), "Tab Survey Details");
		verifyElement(getTitle_survey_stistics(), "Title survey statistic");
		verifyElement(getField_chennel_name(), "Field chennel name");
		verifyElement(getField_of_users_registration(), "User registration");
		String label= getLabelsurvey_statistic_total_record().getText();
		if(!label.contains("0")) {
			FrameworkMethods.logger.pass("Total is not 0");
		}		getTab_survey_details().click();
		waitForMinTime();
		verifyElement(getFirst_name(), "First Name Field");
		verifyElement(getLast_name(), "Last Name Field");
		verifyElement(getRegistration_date(), "Registration Date");
	}
	
	public void verifyCountShouldNotZero() {
		Select drpBranchName=new Select(getSelect_branch());
		FrameworkMethods.logger.info("Selected value: North Branch");
		drpBranchName.selectByIndex(1);
		String label= getLabel_total_record().getText();
		if(!label.contains("0")) {
			FrameworkMethods.logger.pass("Total is not 0");
		}
	}
}
