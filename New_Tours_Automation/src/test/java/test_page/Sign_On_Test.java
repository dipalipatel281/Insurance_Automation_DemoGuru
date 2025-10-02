package test_page;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import objects_page.Sign_On;

public class Sign_On_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		Sign_On signOnPage = new Sign_On(driver);

		driver.get("https://demo.guru99.com/test/newtours/login.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));

		signOnPage.enterUsername("Jane");
		signOnPage.enterPassword("123456");
		signOnPage.clickSubmit();

		System.out.println("Sign_On form submitted successfully");

		driver.quit();
	
	}
}