package testcases;

import org.testng.annotations.Test;

import pageclasses.BoltCutterPage;


public class AddToFavourites extends BaseTest{
@Test
	public void selectItem() {
		BoltCutterPage bcp = new BoltCutterPage(driver);
		bcp.ClickOnItem();
		bcp.AddToFavourites();
		
	}
	
}
