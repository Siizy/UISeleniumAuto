package pageclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.ReportUtils;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By registerYourAccountxpath = By.xpath("//a[text()='Register your account']");
	
	public void clickOnRegisterYourAccountLink() {
		driver.findElement(registerYourAccountxpath).click();
		ReportUtils.getLog().info("Register Your Account link was successfully clicked");	
	}

}
