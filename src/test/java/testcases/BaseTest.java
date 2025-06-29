package testcases;

import java.io.IOException;
import java.lang.reflect.Method;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.MediaEntityBuilder;

import org.testng.annotations.AfterSuite;


import utils.BaseUtils;
import utils.ReportUtils;

public class BaseTest {

// Design principle
	// 1. DRY
	// 2. SOLID Principle
	// S - Single Responsibility
	// O - Open close principle - open to extension and close to modify
	
	WebDriver driver ;
	
	@BeforeSuite
	protected void init() throws IOException {
		ReportUtils.initReport();
	}
	
	@BeforeMethod
	public void initBrowserDriver(Method method) throws IOException {

		ReportUtils.createTest(method.getName());	
		String browser = BaseUtils.getConfigValue("browser");
						
		switch (browser.toLowerCase()) { 
		case "chrome":
			driver = new ChromeDriver();			
			break;
			
		case "firefox":
			driver = new FirefoxDriver();
			
			break;
			
		case "edge":
			driver = new EdgeDriver();
			
			break;
			
		case "safari":
			driver = new SafariDriver();		
			break;
									
		default:
			System.out.println("Browser not supported");
			break;
		}
			
		ReportUtils.getLog().info(browser+ " was successfully launched !!");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Integer.valueOf(BaseUtils.getConfigValue("implicitwait"))));
		driver.manage().window().maximize();
		ReportUtils.getLog().info("Window is maximised");
		driver.navigate().to(BaseUtils.getConfigValue("url"));
		ReportUtils.getLog().info("Url launched : " + BaseUtils.getConfigValue("url"));
	}
	
	@AfterMethod
	public void endTest(ITestResult result) throws IOException {
		
		if (result.getStatus() == ITestResult.FAILURE) {
			ReportUtils.getLog().fail(result.getThrowable(),
					MediaEntityBuilder.createScreenCaptureFromPath(BaseUtils.getScreenShotPath(driver,
							result.getInstance().getClass().getSimpleName() + "." + result.getMethod().getMethodName()))
							.build());
		}
		
		driver.quit();
		ReportUtils.getLog().info("Browser closed");
	}
	
	@AfterSuite
	protected void tearDown() {
		ReportUtils.generateReport();		
	}
	

}
