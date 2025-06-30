package pageclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CommonMenuPageLinks extends BasePage{
			
	public CommonMenuPageLinks(WebDriver driver) {
		super(driver);
	}
	
	
	private By SignIn_xpath=  By.xpath("//a[text()='Sign in']");
	
	public void clickSignIn() {				
		pageActions.click(SignIn_xpath, "Sign in button");
				
	}
	

}
