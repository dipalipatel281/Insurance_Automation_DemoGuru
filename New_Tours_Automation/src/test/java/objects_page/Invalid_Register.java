package objects_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Invalid_Register {

	WebDriver driver;

	public Invalid_Register(WebDriver driver) {
		this.driver = driver;
	}

	By firstName = By.name("firstName");
	By lastName = By.name("lastName");
	By phonenumber = By.name("phone");
	By emailid = By.id("userName");
	By username = By.id("email");
	By passwordfield = By.name("password");
	By confirmPasswordfield = By.name("confirmPassword");
	By submitButton = By.name("submit");

	public void enterFirstName(String fName) {
		driver.findElement(firstName).sendKeys(fName);
	}

	public void enterLastName(String lName) {
		driver.findElement(lastName).sendKeys(lName);
	}

	public void enterPhone(String phone) {
		driver.findElement(phonenumber).sendKeys(phone);
	}

	public void enterEmail(String email) {
		driver.findElement(emailid).sendKeys(email);
	}

	public void enterUsername(String uname) {
		driver.findElement(username).sendKeys(uname);
	}

	public void enterPassword(String password) {
		driver.findElement(passwordfield).sendKeys(password);
	}

	public void enterConfirmPassword(String confirmPassword) {
		driver.findElement(confirmPasswordfield).sendKeys(confirmPassword);
	}

	public void clickSubmit() {
		driver.findElement(submitButton).click();

	}
}
