package testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageclasses.ContactPage;
import utils.ReportUtils;


public class ContactPageTest extends BaseTest {
	
	@Test   
	public void contactFormSubmissionTest() {
		driver.findElement(By.linkText("Contact")).click();

		ContactPage contactPage = new ContactPage(driver);

		contactPage.fillContactForm();
		contactPage.submitForm();

		String actualMsg = contactPage.getSuccessMessage();
		String expectedmsg = "Thanks for your message! We will contact you shortly.";

		Assert.assertEquals(actualMsg, expectedmsg, "Success message validation failed.");

		ReportUtils.getLog().pass("Contact form success message validated.");

	}

}
