package coaching_center_base;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class FrameworkMethods {
	private static Properties properties;
	private final String propertyFilePath = "resource//base.properties";
	public static BufferedReader customPropertyReader;
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest logger;

	
	public FrameworkMethods() {
		
		this.startReport();
		
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(propertyFilePath));
			properties = new Properties();
			try {
				properties.load(reader);
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
		}
	}

	public void startReport(){
		 
		 htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") +"/test-output/STMExtentReport.html");
		 
		 if (extent == null) {
		 extent = new ExtentReports();}
		 
		 extent.attachReporter(htmlReporter);
		 extent.setSystemInfo("Host Name", "RamanaCoachingCenter Automation");
		 extent.setSystemInfo("Environment", "Development Environment");
		
		 //logger = extent.createTest("Test");
		 
		 htmlReporter.config().setDocumentTitle("Automation Test Report");
		 htmlReporter.config().setReportName("RCC - Automation Tests");
		 htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
		 htmlReporter.config().setTheme(Theme.STANDARD);
		 htmlReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
		 }

	public long getImplicitlyWait() {
		String implicitlyWait = properties.getProperty("implicitlyWait");
		if (implicitlyWait != null)
			return Long.parseLong(implicitlyWait);
		else
			throw new RuntimeException("implicitlyWait not specified in the Configuration.properties file.");
	}


	public static String getCustomProperty(String propertyName) throws IOException {
		String customPropertyFilePath = properties.getProperty("customPropertyFile");
		try {
			customPropertyFilePath = "resource//" + customPropertyFilePath;
			customPropertyReader = new BufferedReader(new FileReader(customPropertyFilePath));
			properties.load(customPropertyReader);
			String propertyValue = properties.getProperty(propertyName);
			return propertyValue;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Configuration.properties not found at " + customPropertyFilePath);
		}
	}

	// Method to verify element on screen
	public static boolean verifyElement(WebElement webElement, String elementName) throws Exception {
		if (webElement.isDisplayed()) {
			Reporter.log("[Pass]" + elementName + " is Present on screen");
			return true;
		} else {
			Reporter.log("[fail]" + elementName + " is not Present on screen");
			return false;
			
		}
	}
	// Method to take screenshot

	public static void takeSnapShot(WebDriver webdriver, String fileWithPath) throws Exception {
		// Convert web driver object to TakeScreenshot
		TakesScreenshot scrShot = ((TakesScreenshot) webdriver);
		// Call getScreenshotAs method to create image file
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		// Move image file to new destination
		File DestFile = new File(fileWithPath);
		// Copy file at destination
		FileUtils.copyFile(SrcFile, DestFile);
	}
	
	
	public static void waitForPageLoad() throws InterruptedException {
		Thread.sleep(8000);
	}
}
