package pageclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.PageActions;
import utils.ReportUtils;

public class CustomerRegistrationPage {

	WebDriver driver;
	PageActions elementActions;

	public CustomerRegistrationPage(WebDriver driver) {
		this.driver = driver;
		elementActions = new PageActions(driver);
	}

	By firstNameId = By.id("first_name");
	By lastNameId = By.id("last_name");
	By customerRegistrationHeadingtagName = By.tagName("h3");

	public void enterFirstName(String firstName) {
		// driver.findElement(firstNameId).sendKeys(firstName);
		// ReportUtils.getLog().info("First Name set as " + firstName);
		elementActions.type(firstNameId, firstName, "First name");
	}

	public void enterLastName(String lastName) {
		// driver.findElement(lastNameId).sendKeys(lastName);
		// ReportUtils.getLog().info("Last Name set as **********");
		elementActions.type(lastNameId, lastName, "First name");
	}

	public String getCustomerRegisterHeading() {
		// String heading =
		// driver.findElement(customerRegistrationHeadingtagName).getText();
		// ReportUtils.getLog().info("Registration Heading is " + heading);
		String heading = elementActions.getText(customerRegistrationHeadingtagName, "Heading");
		return heading;
	}

}
