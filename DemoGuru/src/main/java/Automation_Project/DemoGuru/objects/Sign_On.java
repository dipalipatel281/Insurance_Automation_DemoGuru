package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sign_On {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/newtours/login.php");
		driver.manage().window().maximize();

		WebElement username = driver.findElement(By.name("userName"));
		WebElement password = driver.findElement(By.name("password"));
		
		username.sendKeys("John");
		password.sendKeys("24680");

		driver.findElement(By.name("submit")).click();

		boolean flightsVisible = driver.findElement(By.linkText("Flights")).isDisplayed();
		if (flightsVisible) {
			System.out.println("Login successful!");
		} else {
			System.out.println("Login failed!");
		}
	}

}
