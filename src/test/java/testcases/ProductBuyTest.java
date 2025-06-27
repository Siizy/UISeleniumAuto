package testcases;


import org.testng.Assert;
import org.testng.annotations.Test;

import pageclasses.CombinationPlierPage;
import pageclasses.HomePage;
import utils.ReportUtils;


public class ProductBuyTest extends BaseTest {
@Test
	public void productBuyTest01() {

		HomePage Pg = new HomePage(driver);
		Pg.clickOnCombinationPliers();

		CombinationPlierPage Cp = new CombinationPlierPage(driver);
		Cp.clickAddToCart();

		Assert.assertEquals(Cp.getProductAddedHeading(), "Product added to shopping cart.");
		ReportUtils.getLog().pass("Test Passed");
	}


}
