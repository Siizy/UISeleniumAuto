package pageclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.BaseUtils;
import utils.ReportUtils;

public class CommonMenuPageLinks extends PageActions{
			
	public CommonMenuPageLinks(WebDriver driver) {
		super(driver);
	}
	
	
	By SignIn_xpath=  By.xpath("//a[text()='Sign in']");
	
	public void clickSignIn() {				
		click(SignIn_xpath, "Sign in button");
				
	}
	

}
