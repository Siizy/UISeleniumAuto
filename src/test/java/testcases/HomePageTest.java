package testcases;

import org.testng.annotations.Test;

import pageclasses.BasePage;

public class HomePageTest extends BaseTest {
	@Test
	public void sortedList() {
		BasePage bp = new BasePage(driver);
		bp.selectHammerCategory();
		bp.sortDropDown();
	}
}
