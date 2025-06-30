package pageclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.ReportUtils;

public class BoltCutterPage {
	WebDriver driver;

	public BoltCutterPage(WebDriver driver) {
		this.driver = driver;

	}

	By BoltCutters_xpath = By.xpath("/html/body/app-root/div/app-overview/div[3]/div[2]/div[1]/a[3]/div[2]/h5");
	By AddToFav_xpath = By.xpath("//button[@data-test ='add-to-favorites']");
	By ErrMessage = By.id("toast-container");

	public void clickOnBoltCutters() {
		driver.findElement(BoltCutters_xpath).click();
		ReportUtils.getLog().info("Item Selected sucessfully");
	}

	public void clickAddToFavourites() {
		driver.findElement(AddToFav_xpath).click();
		ReportUtils.getLog().info("Clicked on Favorites");
	}

	public String getErrMessage() {
		String error = driver.findElement(ErrMessage).getText();
		ReportUtils.getLog().info("Error message is " + error);
		return error;
	}
}
