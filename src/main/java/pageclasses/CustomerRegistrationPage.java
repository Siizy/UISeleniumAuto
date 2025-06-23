package pageclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.ReportUtils;

public class CustomerRegistrationPage {

	WebDriver driver;

	public CustomerRegistrationPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By firstNameId = By.id("first_name");	
	By lastNameId = By.id("last_name");
	By customerRegistrationHeadingtagName = By.tagName("h3");
	
	public void enterFirstName(String firstName) {
		driver.findElement(firstNameId).sendKeys(firstName);
		ReportUtils.getLog().info("First Name set as " + firstName);
	}
		
	public void enterLastName(String lastName) {
		driver.findElement(lastNameId).sendKeys(lastName);
		ReportUtils.getLog().info("Last Name set as **********");
	}
	
	public String getCustomerRegisterHeading() {
		String heading = driver.findElement(customerRegistrationHeadingtagName).getText();
		ReportUtils.getLog().info("Registration Heading is " + heading);
		return heading;
	}

}
