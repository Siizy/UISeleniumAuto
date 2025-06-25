package TestContactForm;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.github.javafaker.Faker;

public class TestAuto {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://practicesoftwaretesting.com/");

        WebElement contactLink = driver.findElement(By.linkText("Contact"));
        contactLink.click();

        driver.findElement(By.id("first_name")).sendKeys(new Faker().name().firstName());
        driver.findElement(By.id("last_name")).sendKeys(new Faker().name().lastName());

        Faker faker = new Faker();
        driver.findElement(By.id("email")).sendKeys(faker.internet().emailAddress());

        WebElement dropdown = driver.findElement(By.id("subject"));
        Select select = new Select(dropdown);
        select.selectByVisibleText("Customer service");

        // Submit without a message
        driver.findElement(By.xpath("//input[@type='submit']")).click();

        WebElement errorMsg = driver.findElement(By.xpath("//*[@id='message_alert']/div"));
        String errorText = errorMsg.getText();

        if (errorText.equals("Message is required")) {
            System.out.println("Empty message validation passed");
        } else {
            System.out.println("Validation failed. Got: " + errorText);
        }

        // Enter a short message
        driver.findElement(By.id("message")).sendKeys("Too short message");

        driver.findElement(By.xpath("//input[@type='submit']")).click();

        WebElement errorMsg2 = driver.findElement(By.xpath("//*[@id='message_alert']/div"));
        String errorText2 = errorMsg2.getText();

        if (errorText2.equals("Message must be minimal 50 characters")) {
            System.out.println("Short message validation passed");
        } else {
            System.out.println("Short message validation failed. Got: " + errorText2);
        }

        driver.quit();
    }
}
