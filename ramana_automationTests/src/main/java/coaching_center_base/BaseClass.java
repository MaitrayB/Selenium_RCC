package coaching_center_base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	WebDriver driver;
	
	@BeforeSuite
	public void SetUp()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	@BeforeTest
	public void OpenApplication()
	{
		driver.get("http://ec2-44-230-141-105.us-west-2.compute.amazonaws.com/myportal/");
	}
	
	@AfterSuite
	public void Destroy()
	{
		driver.quit();
	}
	
	
}
