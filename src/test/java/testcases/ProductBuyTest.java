package testcases;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import pageclasses.CombinationPlierPage;
import pageclasses.HomePage;

public class ProductBuyTest{
	
		public static void main (String [] args) {
			
		WebDriver driver = new ChromeDriver ();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://practicesoftwaretesting.com/");
		
		HomePage Pg = new HomePage(driver);
		Pg.clickOnCombinationPliers();
		
		CombinationPlierPage Cp = new CombinationPlierPage(driver);
		Cp.clickAddToCart();
		
		Assert.assertEquals(Cp.getProductAddedHeading(),"Product added to shopping cart.");
		
		driver.quit();
	}

}
