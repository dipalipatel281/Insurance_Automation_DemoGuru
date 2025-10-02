package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Invalid_Register {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/newtours/register.php/");

		driver.manage().window().maximize();

		WebElement firstname = driver.findElement(By.name("firstName"));

		WebElement lastname = driver.findElement(By.name("lastName"));

		WebElement phone = driver.findElement(By.name("phone"));

		WebElement email = driver.findElement(By.id("userName"));

		WebElement username = driver.findElement(By.id("email"));

		WebElement password = driver.findElement(By.name("password"));

		WebElement confirmPassword = driver.findElement(By.name("confirmPassword"));

		WebElement submit = driver.findElement(By.name("submit"));

		firstname.sendKeys("Test");

		lastname.sendKeys("");

		phone.sendKeys("");

		email.sendKeys("guru99");

		username.sendKeys("Smith");

		password.sendKeys("");

		confirmPassword.sendKeys("");

		submit.click();

		try {
			WebElement confirmation = driver.findElement(By.xpath("//table//p[3]/font"));
			String confirmationText = confirmation.getText();
			if (confirmationText.contains("Dear")) {
				System.out.println("Registration went through with invalid data!");
			} else {
				System.out.println("Registration was blocked.");
			}
		} catch (Exception e) {
			System.out.println("No confirmation message displayed.");
		}

	}

}
