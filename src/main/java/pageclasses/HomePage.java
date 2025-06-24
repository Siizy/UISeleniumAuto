package pageclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	By selectCombinationPliers = By.xpath("//img[@alt='Combination Pliers']");
	
	public void clickOnCombinationPliers() {
		driver.findElement(selectCombinationPliers).click();
	}

}
