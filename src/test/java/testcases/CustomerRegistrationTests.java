package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import pageclasses.CommonMenuPageLinks;
import pageclasses.CustomerRegistrationPage;
import pageclasses.LoginPage;

public class CustomerRegistrationTests extends BaseTest{
		
	
	@Test 
	public void newCustomerRegTest() {
				
		CommonMenuPageLinks comlinks = new CommonMenuPageLinks(driver);
		comlinks.clickSignIn();
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.clickOnRegisterYourAccountLink();
		
		CustomerRegistrationPage crpage = new CustomerRegistrationPage(driver);
		crpage.enterFirstName(new Faker().name().firstName());
		crpage.enterLastName(new Faker().name().lastName());
		
		Assert.assertEquals(crpage.getCustomerRegisterHeading(), "Customer registration");		
		
	}
	
	
	@Test 
	public void newCustomerRegTest2() {
				
		CommonMenuPageLinks comlinks = new CommonMenuPageLinks(driver);
		comlinks.clickSignIn();
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.clickOnRegisterYourAccountLink();
		
		CustomerRegistrationPage crpage = new CustomerRegistrationPage(driver);
		crpage.enterFirstName(new Faker().name().firstName());
		crpage.enterLastName(new Faker().name().lastName());
		
		Assert.assertEquals(crpage.getCustomerRegisterHeading(), "Customer registration");		
	}
	
	
	
}
