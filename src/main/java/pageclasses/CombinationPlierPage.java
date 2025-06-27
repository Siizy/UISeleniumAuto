package pageclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.ReportUtils;

public class CombinationPlierPage {
	
	WebDriver driver;
	
	public CombinationPlierPage(WebDriver driver) {
	this.driver=driver;
	
	}
	By SelectProduct = By.xpath("//button[@data-test='add-to-cart']");
	By ProductAddCartHeadingName = By.id("toast-container");
			
	public void clickAddToCart() {
		driver.findElement(SelectProduct).click();
		ReportUtils.getLog().info("Product added to cart successfully");
	}
	public String getProductAddedHeading() {
		String heading = driver.findElement(ProductAddCartHeadingName).getText();
		ReportUtils.getLog().info("Heading is" + heading);
		return heading;
		}
	
	}

