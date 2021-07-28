package Admin_pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Admin_screens.Locators.HomePageLocators;
import Admin_screens.Locators.Menus;
import coaching_center_base.BaseClass;


public class homePage extends BaseClass implements HomePageLocators,Menus {
	@FindBy(how = How.XPATH, using = HOME_WELCOME_XPATH)
	private WebElement welcome_label;
	
	
	public homePage() throws IOException {
		PageFactory.initElements(BaseClass.driver, this);
		// TODO Auto-generated constructor stub
	}

	public WebElement getWelcome_label() {
		return welcome_label;
	}

	public void verifyHomepage() throws Exception {
		verifyElement(getWelcome_label(), "Welcome message label");
	}

}