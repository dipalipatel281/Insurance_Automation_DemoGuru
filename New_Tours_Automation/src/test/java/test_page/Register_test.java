package test_page;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import objects_page.Register;

public class Register_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		Register registerPage = new Register(driver);
		
		driver.get("https://demo.guru99.com/test/newtours/register.php/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
        
        registerPage.enterFirstName("Jane");
        registerPage.enterLastName("Smith");
        registerPage.enterPhone("1234567890");
        registerPage.enterEmail("guru099@email.com");
        registerPage.enterAddress("1234 Main Street");
        registerPage.enterCity("Anytown");
        registerPage.enterState("Anystate");
        registerPage.enterPostalCode("12345");
        registerPage.selectCountry("UNITED STATES");
        registerPage.enterUsername("Jane");
        registerPage.enterPassword("123456");
        registerPage.enterConfirmPassword("123456");
        registerPage.clickSubmit();
        
        System.out.println("Registration form submitted successfully.");

        driver.quit();
	}
}