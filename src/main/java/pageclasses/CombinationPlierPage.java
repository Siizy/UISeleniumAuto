package pageclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CombinationPlierPage {
	
	WebDriver driver;
	
	public CombinationPlierPage(WebDriver driver) {
	this.driver=driver;
	
	}
	By SelectProduct = By.xpath("//button[@data-test='add-to-cart']");
	By ProductAddCartHeadingName = By.id("toast-container");
			
	public void clickAddToCart() {
		driver.findElement(SelectProduct).click();
	}
	public String getProductAddedHeading() {
		String heading = driver.findElement(ProductAddCartHeadingName).getText();
		return heading;
		}
	
	
	}

