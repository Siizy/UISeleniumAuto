package pageclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.ReportUtils;

public class CustomerRegistrationPage extends PageActions{

	public CustomerRegistrationPage(WebDriver driver) {		
		super(driver);		
	}
	
	By firstNameId = By.id("first_name");	
	By lastNameId = By.id("last_name");
	By customerRegistrationHeadingtagName = By.tagName("h3");
	
	public void enterFirstName(String firstName) {		
		type(firstNameId, firstName, "First Name");		
	}
		
	public void enterLastName(String lastName) {	
		type(lastNameId, lastName, "Last Name");
		
	}
	
	public String getCustomerRegisterHeading() {	
		String heading = getText(customerRegistrationHeadingtagName, "Heading");
		
		return heading;
	}

}
