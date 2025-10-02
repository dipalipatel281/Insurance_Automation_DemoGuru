package test_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import objects_page.Invalid_Register;

public class Invalid_Register_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		Invalid_Register registerPage = new Invalid_Register(driver);

		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();

		registerPage.enterFirstName("Test");
		registerPage.enterLastName(""); // Missing last name
		registerPage.enterPhone(""); // Missing phone
		registerPage.enterEmail("guru99"); // Invalid email format
		registerPage.enterUsername(""); // Missing user name
		registerPage.enterPassword(""); // Missing password
		registerPage.enterConfirmPassword(""); // Missing confirm password
		registerPage.clickSubmit();
		
		try {
		    WebElement submitinfo = driver.findElement(By.xpath("//p[2]/font[contains(text(),'Thank you for registering')]"));
		    if (submitinfo.isDisplayed()) {
		        System.out.println("Register went through with incomplete details");
		    }
		} catch (Exception e) {
		    System.out.println("Register unsuccessful as expected with incomplete details");
		}
		driver.quit();
	}
}
