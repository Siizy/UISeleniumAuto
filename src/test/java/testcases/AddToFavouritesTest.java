package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageclasses.BoltCutterPage;
import utils.ReportUtils;

public class AddToFavouritesTest extends BaseTest {
	@Test
	public void selectItem() {
		BoltCutterPage bcp = new BoltCutterPage(driver);
		bcp.ClickOnBoltCutters();
		bcp.ClickAddToFavourites();
		Assert.assertEquals(bcp.GetErrMessage(), "Unauthorized, can not add product to your favorite list.");
		ReportUtils.getLog().pass("Test Passed");

	}

}
