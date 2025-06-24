package pageclasses;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.ReportUtils;

public class AppPagination {
	
	WebDriver driver;
	
	public AppPagination(WebDriver driver) {
		this.driver = driver;
	}
	
	By appPaginationListLink = By.xpath("//app-pagination//ul//a");
	
	public void clickLastPage() {
		
		List<WebElement> pages = driver.findElements(appPaginationListLink);
		int lastPageIndex = pages.size() - 1;
		
		driver.findElement(By.xpath("//app-pagination//li[" + lastPageIndex + "]")).click();
		ReportUtils.getLog().info("Last Page successfully clicked");	
		
	}
	
	

}
