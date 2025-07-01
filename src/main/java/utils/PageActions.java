package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class PageActions {

	private WaitUtils waitUtils;


	public PageActions(WebDriver driver) {           
        waitUtils = new WaitUtils(driver);
        
    }
	 
	public void click(By locator, String elementName) {
		try {
			WebElement element = waitUtils.waitForElementClickable(locator);
			element.click();			
			ReportUtils.getLog().info(elementName+ " was successfully clicked");
		} catch (Exception e) {			
			ReportUtils.getLog().fail("Failed to click on " + elementName + " due to: " + e.getMessage());
			throw e;
		}
	}

	public void type(By locator, String text, String elementName) {
		try {
			WebElement element = waitUtils.waitForElementVisible(locator);
			element.clear();
			element.sendKeys(text);			
			ReportUtils.getLog().info("Entered '" + text + "' in " + elementName);
		} catch (Exception e) {
			ReportUtils.getLog().fail("Failed to type in " + elementName + " due to: " + e.getMessage());
			throw e;
		}
	}

	public String getText(By locator, String elementName) {
		try {
			WebElement element = waitUtils.waitForElementVisible(locator);
			String text = element.getText();
			ReportUtils.getLog().info("Fetched text '" + text + "' from " + elementName);
			return text;
		} catch (Exception e) {
			ReportUtils.getLog().fail("Failed to get text from " + elementName + " due to: " + e.getMessage());
			throw e;
		}
	}

	public boolean isDisplayed(By locator, String elementName) {
		try {
			boolean visible = waitUtils.waitForElementVisible(locator).isDisplayed();
			ReportUtils.getLog().info(elementName + " is displayed: " + visible);
			return visible;
		} catch (Exception e) {
			ReportUtils.getLog().fail(elementName + " not displayed due to: " + e.getMessage());
			return false;
		}
	}

}
