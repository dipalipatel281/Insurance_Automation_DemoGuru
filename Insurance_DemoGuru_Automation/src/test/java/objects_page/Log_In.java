package objects_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Log_In {

	WebDriver driver;

	By emailField = By.name("email");
	By passwordField = By.name("password");
	By loginButton = By.name("submit");

	public Log_In(WebDriver driver) {
		this.driver = driver;
	}
	public void enterEmail(String email) {
		driver.findElement(emailField).sendKeys(email);
	}
	public void enterPassword(String password) {
		driver.findElement(passwordField).sendKeys(password);
	}
	public void clickLogin() {
        driver.findElement(loginButton).click();
    
	}
}