package Student_Home_Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import Student_screens.Student_Locators.MathPage_Locators;
import Student_screens.Student_Locators.Student_Menu;
import coaching_center_base.BaseClass;

public class Student_MathreviewPage extends BaseClass implements MathPage_Locators, Student_Menu {

	@FindBy(how = How.XPATH, using = MENU_MATH_XPATH)
	private WebElement menu_math;

	@FindBy(how = How.XPATH, using = RDBTN_PREALGEBRA_XPATH)
	private WebElement rdbtn_pre_algebra;

	@FindBy(how = How.XPATH, using = RDBTN_ALGERA_XPATH)
	private WebElement rdbtn_algebra;

	@FindBy(how = How.XPATH, using = RDBTN_GEOMETRY_XPATH)
	private WebElement rdbtn_geometry;

	@FindBy(how = How.XPATH, using = RDBTN_ALGERA2_XPATH)
	private WebElement rdbtn_algebra2;

	@FindBy(how = How.XPATH, using = LBL_CHAPTERLIST_XPATH)
	private WebElement chapterList;
	
	@FindBy(how = How.XPATH, using = BTN_CLOSE_XPATH)
	private WebElement btn_close;

	public WebElement getMenu_math() {
		return menu_math;
	}

	public WebElement getRdbtn_pre_algebra() {
		return rdbtn_pre_algebra;
	}

	public WebElement getRdbtn_algebra() {
		return rdbtn_algebra;
	}

	public WebElement getRdbtn_geometry() {
		return rdbtn_geometry;
	}

	public WebElement getRdbtn_algebra2() {
		return rdbtn_algebra2;
	}

	public WebElement getChapterList() {
		return chapterList;
	}

	public void navigateToMathReviewPage() throws InterruptedException {
		getMenu_math().click();
		waitForMinTime();
	}

	public void verifyPreAlgebra() throws InterruptedException {
		List<WebElement> chapters= driver.findElements(By.xpath("//td//a"));
		for(WebElement ele :chapters) {
			ele.click();
			waitForMinTime();
		}
	}
}
