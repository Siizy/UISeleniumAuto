package pageclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.ReportUtils;

public class HomePageSearch {

	WebDriver driver;

	public HomePageSearch(WebDriver driver) {
		this.driver = driver;

	}

	By searchText = By.id("search-query");
	By clickButton = By.xpath("//*[@id='filters']/form[2]/div/button[2]");
	By productResult = By.xpath("//h3/span[text()='Combination Pliers']");

	public void enterProductName(String productName) {
		driver.findElement(searchText).sendKeys(productName);
		driver.findElement(clickButton).click();
		ReportUtils.getLog().info("Produt Name is:" + productName);
	}

	public String productNameResult() {
		return driver.findElement(productResult).getText();

	}
}
