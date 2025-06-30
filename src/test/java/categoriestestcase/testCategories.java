package categoriestestcase;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class testCategories extends BaseTest{
	
  

	
	@Test
	public void BaseCategories() throws InterruptedException{
		 
		
		 WebElement categories = driver.findElement(By.xpath("//*[@id='navbarSupportedContent']/ul/li[2]/a"));
		 Actions actions = new Actions(driver);
		 actions.moveToElement(categories).click().perform();
	     
	     
	    

}
	
}
