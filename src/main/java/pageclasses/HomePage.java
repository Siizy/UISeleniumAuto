package pageclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.ReportUtils;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public String getCordlessDrill12VHeading() {

		String heading = driver.findElement(By.xpath("//h5[text()=' Cordless Drill 12V ']")).getText();
		ReportUtils.getLog().info("Cordless Drill Heading is " + heading);
		return heading;

	}

}
