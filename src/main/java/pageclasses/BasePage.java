package pageclasses;

import org.openqa.selenium.WebDriver;

import utils.PageActions;
import utils.ReportUtils;

public class BasePage {
	
	protected PageActions pageActions;
	protected WebDriver driver;
	
	public BasePage(WebDriver driver) {
		this.driver = driver;
		pageActions = new PageActions(driver);
	}
	
	public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    public String getTitle() {
        return driver.getTitle();
    }

    public void refreshPage() {
        driver.navigate().refresh();       
        ReportUtils.getLog().info("Page refreshed");
    }

    public void navigateBack() {
        driver.navigate().back();
        ReportUtils.getLog().info("Navigated back");       
    }

    public void navigateForward() {
        driver.navigate().forward();
        ReportUtils.getLog().info("Navigated forward");        
    }
	
	

}
