package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/newtours/register.php/");
		
		driver.manage().window().maximize();

		
		WebElement firstname = driver.findElement(By.name("firstName"));

		WebElement lastname = driver.findElement(By.name("lastName"));

		WebElement phone = driver.findElement(By.name("phone"));

		WebElement email = driver.findElement(By.id("userName"));

		WebElement address = driver.findElement(By.name("address1"));

		WebElement city = driver.findElement(By.name("city"));

		WebElement state = driver.findElement(By.name("state"));

		WebElement postal = driver.findElement(By.name("postalCode"));

		WebElement country = driver.findElement(By.name("country"));

		country.sendKeys("UNITED STATES");

		WebElement username = driver.findElement(By.id("email"));

		WebElement password = driver.findElement(By.name("password"));

		WebElement confirmPassword = driver.findElement(By.name("confirmPassword"));

		WebElement submit = driver.findElement(By.name("submit"));


		firstname.sendKeys("John");

		lastname.sendKeys("Smith");

		phone.sendKeys("1234567890");

		email.sendKeys("guru99@email.com");

		address.sendKeys("123 Main Street");

		city.sendKeys("Anytown");

		state.sendKeys("Antstate");

		postal.sendKeys("12345");

		username.sendKeys("John");

		password.sendKeys("24680");

		confirmPassword.sendKeys("24680");
		
		submit.click();
		
		 System.out.println("Confirmation");

	}

}
