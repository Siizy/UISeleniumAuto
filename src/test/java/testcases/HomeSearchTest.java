package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageclasses.HomePageSearch;

public class HomeSearchTest extends BaseTest {
	
	@Test
	public void searchProduct() {
		
		
		HomePageSearch search = new HomePageSearch(driver);
		search.enterProductName();
		
		Assert.assertEquals(search.productNameResult(), "Combination Pliers");
		
	}

}
