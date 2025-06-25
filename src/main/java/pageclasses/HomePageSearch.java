package pageclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageSearch {

	WebDriver driver;

	public HomePageSearch(WebDriver driver) {
		this.driver = driver;

	}

	By searchText = By.id("search-query");
	By clickButton = By.xpath("//*[@id='filters']/form[2]/div/button[2]");
	By productResult = By.xpath("//h3/span[text()='Combination Pliers']");

	public void enterProductName() {
		driver.findElement(searchText).sendKeys("Combination Pliers");
		driver.findElement(clickButton).click();
	}

	public String productNameResult() {
		return driver.findElement(productResult).getText();

	}
}
