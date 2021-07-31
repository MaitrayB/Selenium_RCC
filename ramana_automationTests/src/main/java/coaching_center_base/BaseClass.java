package coaching_center_base;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass extends FrameworkMethods{
	static FrameworkMethods configFileReader = null;
	public static WebDriver driver;
	private static WebDriverWait wait;
	final String propertyFilePath = "resource//base.properties";
	
	
	public static void SetUp() throws IOException
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	public static void LaunchApplication() throws IOException
	{
		driver.get(FrameworkMethods.getCustomProperty("dev_url"));
	}
	
	public static void Destroy()
	{
		driver.quit();
	}
	
	protected void waitForElementToAppear(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	protected void waitForElementToDisappear(WebElement element) {
		wait.until(ExpectedConditions.invisibilityOf(element));
	}

	protected void waitForTextToDisappear(By locator, String text) {
		wait.until(ExpectedConditions.not(ExpectedConditions.textToBe(locator, text)));
	}
	
}
