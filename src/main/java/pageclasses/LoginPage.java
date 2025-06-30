package pageclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.PageActions;
import utils.ReportUtils;

public class LoginPage extends PageActions{

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	By registerYourAccountxpath = By.xpath("//a[text()='Register your account']");
	
	public void clickOnRegisterYourAccountLink() {		
		click(registerYourAccountxpath, "Register Your Account link");
	}

}
