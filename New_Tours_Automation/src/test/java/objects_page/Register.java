package objects_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Register {

	WebDriver driver;
	public Register(WebDriver driver) {
		this.driver = driver;
	}

	By firstNameField = By.name("firstName");
	By lastNameField = By.name("lastName");
	By phoneField = By.name("phone");
	By emailField = By.id("userName");
	By addressField = By.name("address1");
	By cityField = By.name("city");
	By stateField = By.name("state");
	By postalCodeField = By.name("postalCode");
	By countryDropdown = By.name("country");
	By usernameField = By.id("email");
	By passwordField = By.name("password");
	By confirmPasswordField = By.name("confirmPassword");
	By submitButton = By.name("submit");

	public void enterFirstName(String firstName) {
		driver.findElement(firstNameField).sendKeys(firstName);
	}

	public void enterLastName(String lastName) {
		driver.findElement(lastNameField).sendKeys(lastName);
	}

	public void enterPhone(String phone) {
		driver.findElement(phoneField).sendKeys(phone);
	}

	public void enterEmail(String email) {
		driver.findElement(emailField).sendKeys(email);
	}

	public void enterAddress(String address) {
		driver.findElement(addressField).sendKeys(address);
	}

	public void enterCity(String city) {
		driver.findElement(cityField).sendKeys(city);
	}

	public void enterState(String state) {
		driver.findElement(stateField).sendKeys(state);
	}

	public void enterPostalCode(String postalCode) {
		driver.findElement(postalCodeField).sendKeys(postalCode);
	}

	public void selectCountry(String country) {
		driver.findElement(countryDropdown).sendKeys(country);
	}

	public void enterUsername(String username) {
		driver.findElement(usernameField).sendKeys(username);
	}

	public void enterPassword(String password) {
		driver.findElement(passwordField).sendKeys(password);
	}

	public void enterConfirmPassword(String confirmPassword) {
		driver.findElement(confirmPasswordField).sendKeys(confirmPassword);
	}

	public void clickSubmit() {
		driver.findElement(submitButton).click();
	}

}
