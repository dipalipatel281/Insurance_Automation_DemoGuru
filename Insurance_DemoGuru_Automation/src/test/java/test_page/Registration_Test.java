package test_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import objects_page.Registration;

public class Registration_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/insurance/v1/register.php");
		driver.manage().window().maximize();

		Registration register = new Registration(driver);

		register.selectTitle("Mrs");
		register.enterFirstName("Jane");
		register.enterLastName("Smith");
		register.enterPhone("9876543210");
		register.selectDOB("1990", "January", "21");
		register.selectLicenseType();
		register.selectLicensePeriod("5");
		register.selectOccupation("Student");
		register.enterAddress("123 Main St", "New York", "NY", "10001");
		register.enterEmailAndPassword("guru099@email.com", "123456");
		register.clickSubmit();

		System.out.println("Registration test completed successfully.");

		driver.quit();
	}

}
