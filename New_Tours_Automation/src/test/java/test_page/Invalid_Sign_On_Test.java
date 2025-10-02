package test_page;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import objects_page.Invalid_Sign_On;

public class Invalid_Sign_On_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/newtours/login.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));

		Invalid_Sign_On invalidsignOnPage = new Invalid_Sign_On(driver);

		invalidsignOnPage.enterUsername("Jone");
		invalidsignOnPage.enterPassword("0987654");
		invalidsignOnPage.clickSubmit();

		try {
			WebElement errormessage = driver
					.findElement(By.xpath("//span[contains(text(),'Enter your userName and password correct')]"));
			if (errormessage.isDisplayed()) {
				System.out.println("Login failed as expected. Error message shown.");
			}
		} catch (Exception e) {
			System.out.println("Login succeeded with invalid credentials!");
		}
		driver.quit();
	}
}
