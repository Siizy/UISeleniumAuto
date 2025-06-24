package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageclasses.AppPagination;
import pageclasses.HomePage;
import utils.ReportUtils;

public class CordlessDrillTest extends BaseTest {

	@Test
	public void cordlessDrillTests() {

		AppPagination pagination = new AppPagination(driver);
		pagination.clickLastPage();

		HomePage hp = new HomePage(driver);

		Assert.assertEquals(hp.getCordlessDrill12VHeading(), "Cordless Drill 12V");
		ReportUtils.getLog().pass("Test Passed");

	}
}
