package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageclasses.BoltCutterPage;

public class AddToFavouritesTest extends BaseTest {
	@Test
	public void selectItem() {
		BoltCutterPage bcp = new BoltCutterPage(driver);
		bcp.clickOnBoltCutters();
		bcp.clickAddToFavourites();
		Assert.assertEquals(bcp.getErrMessage(), "Unauthorized, can not add product to your favorite list.");

	}

}