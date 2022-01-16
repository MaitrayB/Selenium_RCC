package Admin_BranchManagement_pages;

import coaching_center_base.BaseClass;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import Admin_screens.Locators.LoginPageLocators;
import coaching_center_base.FrameworkMethods;

public class loginPage extends BaseClass implements LoginPageLocators {
	@FindBy(how = How.XPATH, using = LOGIN_EMAIL_XPATH)
	private WebElement email_textbox;

	@FindBy(how = How.XPATH, using = LOGIN_PASSWORD_XPATH)
	private WebElement password_textbox;

	@FindBy(how = How.XPATH, using = LOGIN_BUTTON_XPATH)
	private WebElement login_button;

	@FindBy(how = How.XPATH, using = LOGIN_FORGOT_PASSWORD_XPATH)
	private WebElement forgot_password_links;

	@FindBy(how = How.XPATH, using = LOGIN_FORGOTID_XPATH)
	private WebElement forgot_ID_links;

	@FindBy(how = How.XPATH, using = LOGIN_CAPTCHA_XPATH)
	private WebElement captcha;

	public loginPage() throws IOException {
		PageFactory.initElements(BaseClass.driver, this);
		// TODO Auto-generated constructor stub
	}

	public void doLogin() throws IOException, InterruptedException {
		Reporter.log("Entering User Name:" + FrameworkMethods.getCustomProperty("admin_username"));
		getEmail_textbox().sendKeys(FrameworkMethods.getCustomProperty("admin_username"));
		Reporter.log("Entering Password:" + FrameworkMethods.getCustomProperty("admin_password"));
		getPassword_textbox().sendKeys(FrameworkMethods.getCustomProperty("admin_password"));
		getLogin_button().click();
	}

	
	public WebElement getCaptcha() {
		return captcha;
	}

	public WebElement getLogin_button() {
		return login_button;
	}

	public WebElement getForgot_password_links() {
		return forgot_password_links;
	}

	public WebElement getForgot_ID_links() {
		return forgot_ID_links;
	}

	public WebElement getEmail_textbox() {
		return email_textbox;
	}

	public WebElement getPassword_textbox() {
		return password_textbox;
	}

	// Verifying Login Page elements
	public void verifyLoginpage_Login() throws Exception {
		waitForPageLoad();
		verifyElement(getEmail_textbox(), "Username Textbox");
		verifyElement(getPassword_textbox(), "Password Textbox");
		verifyElement(getLogin_button(), "Login Button");
		verifyElement(getForgot_ID_links(), "Forgot ID Link");
		verifyElement(getForgot_password_links(), "Forgot Password Link");
	}

	public void IsUserOnLoginPage() throws IOException {
		String currentURL = driver.getCurrentUrl();
		if (currentURL.contentEquals("http://ec2-44-230-141-105.us-west-2.compute.amazonaws.com/myportal/")) {
			Reporter.log("Enterig UserName:" + FrameworkMethods.getCustomProperty("student_email"));
			getEmail_textbox().sendKeys(FrameworkMethods.getCustomProperty("student_email"));
			Reporter.log("Enterig UserName:" + FrameworkMethods.getCustomProperty("student_password"));
			getPassword_textbox().sendKeys(FrameworkMethods.getCustomProperty("student_password"));
			getLogin_button().click();

		}
	}

	public void LoginAsTeacher() throws IOException {
		Reporter.log("Enterig UserName:" + FrameworkMethods.getCustomProperty("teacher_email"));
		getEmail_textbox().sendKeys(FrameworkMethods.getCustomProperty("teacher_email"));
		Reporter.log("Enterig UserName:" + FrameworkMethods.getCustomProperty("teacher_password"));
		getPassword_textbox().sendKeys(FrameworkMethods.getCustomProperty("teacher_password"));
		getLogin_button().click();
	}

}
