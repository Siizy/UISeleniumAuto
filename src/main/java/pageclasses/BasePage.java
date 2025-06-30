package pageclasses;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.ReportUtils;

public class BasePage {
	WebDriver driver;

	public BasePage(WebDriver driver) {
		this.driver = driver;
	}

	By HammerCategory_xpath = By.xpath("//label[contains(text(), 'Hammer')]/input");
	By SortDropdown_xpath = By.xpath("//select[@data-test ='sort']");

	public void selectHammerCategory() {
		driver.findElement(HammerCategory_xpath).click();
		ReportUtils.getLog().info("Category Hammer Selected");
	}

	public void sortDropDown() {
		WebElement dropdownEle = driver.findElement(SortDropdown_xpath);
		Select dropdown = new Select(dropdownEle);
		dropdown.selectByVisibleText("Name (A - Z)");

		// validateSorted()
		List<WebElement> options = dropdown.getOptions();
		List<String> originalList = new ArrayList<>();
		for (WebElement o : options) {
			originalList.add(o.getText().trim());
		}

		// 4. Copy & sort for comparison
		List<String> sortedList = new ArrayList<>(originalList);
		Collections.sort(sortedList, String.CASE_INSENSITIVE_ORDER);

		// 5. Validate
		if (originalList.equals(sortedList)) {
			System.out.println("Dropdown is sorted A→Z.");
		} else {
			System.out.println("Dropdown is NOT sorted A→Z.");
			System.out.println("Original: " + originalList);
			System.out.println("Expected: " + sortedList);
		}
		ReportUtils.getLog().info("Sorted list validated");
	}

}

//
//
