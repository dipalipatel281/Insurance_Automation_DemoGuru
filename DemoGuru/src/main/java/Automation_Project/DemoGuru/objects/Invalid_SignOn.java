package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Invalid_SignOn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/newtours/login.php");
		driver.manage().window().maximize();

		WebElement username = driver.findElement(By.name("userName"));
		WebElement password = driver.findElement(By.name("password"));

		username.sendKeys("John");
		password.sendKeys("135790865");

		driver.findElement(By.name("submit")).click();

		if (driver.getCurrentUrl().contains("login.php")) {
			System.out.println("Login failed as expected with invalid credentials.");
		} else {
			System.out.println("Login succeeded with invalid credentials!");
		}

	}

}
