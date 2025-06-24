package pageclasses;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.ReportUtils;

public class HomePage {
	WebDriver driver;
	WebDriverWait wait;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		this.wait= new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	By page2 = By.xpath("(//a[@class='page-link'])[3]");

	By priceOfClawHammer = By.xpath("//span[text()='$20.14']");

	public void clickingonpage2() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 800)");
		wait.until(ExpectedConditions.elementToBeClickable(page2));
		driver.findElement(page2).click();
	}

	public String clawHammervalidateprice() {
		String finalprice = driver.findElement(priceOfClawHammer).getText();
		ReportUtils.getLog().info("Claw Hammer price is: " + finalprice);
		return finalprice;
	}

}
