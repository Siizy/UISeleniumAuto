package pageclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.BaseUtils;
import utils.ReportUtils;

public class CommonMenuPageLinks extends BasePage{
	
	WebDriver driver;
	
	public CommonMenuPageLinks(WebDriver driver) {
		this.driver = driver;
	}
	
	
	By SignIn_xpath=  By.xpath("//a[text()='Sign in']");
	
	public void clickSignIn() {
		
		driver.findElement(SignIn_xpath).click();
		ReportUtils.getLog().info("Sign in button was clicked successfully");				
	}
	

}
