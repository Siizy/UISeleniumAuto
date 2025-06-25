package pageclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.ReportUtils;

public class BoltCutterPage {
WebDriver driver;
	
	public BoltCutterPage(WebDriver driver) {
	this.driver =driver;
	
}
	By Item_xpath = By.xpath("/html/body/app-root/div/app-overview/div[3]/div[2]/div[1]/a[3]/div[2]/h5");
	By ClickAddToFav_xpath = By.xpath("//button[@data-test ='add-to-favorites']");
	By ErrMessage = By.id("toast-container");
	
	public void ClickOnItem() {
		driver.findElement(Item_xpath).click();
		ReportUtils.getLog().info("Item Selected sucessfully");
	}
	
	
	public void AddToFavourites() {
		driver.findElement(ClickAddToFav_xpath).click();
		ReportUtils.getLog().info("Clicked on Favorites");
	}
	public String ValidateErrMessage() {
		String error = driver.findElement(ErrMessage).getText();
		ReportUtils.getLog().info("Error message is " +error);
		return error;
	}
}


