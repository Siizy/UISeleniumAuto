package pageclasses;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.github.javafaker.Faker;

import utils.ReportUtils;

public class ContactPage {

	WebDriver driver;
	WebDriverWait wait;
	Faker faker;

	By firstName = By.id("first_name");
	By lastName = By.id("last_name");
	By email = By.id("email");
	By subject = By.id("subject");
	By messageField = By.id("message");
	By submitButton = By.xpath("/html/body/app-root/div/app-contact/div/div/div/form/div/div[2]/div[4]/input");
	By successMessage = By.xpath("/html/body/app-root/div/app-contact/div/div/div/div");

	public ContactPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		this.faker = new Faker();
	}

	public void fillContactForm() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(firstName));
		driver.findElement(firstName).sendKeys(faker.name().fullName());
		driver.findElement(lastName).sendKeys(faker.name().lastName());
		driver.findElement(email).sendKeys(faker.internet().emailAddress());

		Select subjectSelect = new Select(driver.findElement(subject));
		subjectSelect.selectByVisibleText("Payments");

		driver.findElement(messageField).sendKeys(faker.lorem().paragraph());
		ReportUtils.getLog().info("Contact form filled with fake data.");
	}

	public void submitForm() {
		wait.until(ExpectedConditions.elementToBeClickable(submitButton));
		driver.findElement(submitButton).click();
		ReportUtils.getLog().info("Contact form submitted.");
	}

	public String getSuccessMessage() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(successMessage));
		String validateMsg = driver.findElement(successMessage).getText();
		ReportUtils.getLog().info("Success message displayed: " + validateMsg);
		return validateMsg;
	}

}
