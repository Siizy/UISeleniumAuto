package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageclasses.HomePage;
import utils.ReportUtils;

public class HomepageTest extends BaseTest {

	@Test
	public void clawhammerpricevalidationtest() {

		HomePage price = new HomePage(driver);
		price.clickingonpage2();
		Assert.assertEquals(price.clawHammervalidateprice(), "$20.14");
		ReportUtils.getLog().pass("Test case passed");

	}

}
