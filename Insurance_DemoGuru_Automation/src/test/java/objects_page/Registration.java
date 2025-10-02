package objects_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Registration {

	WebDriver driver;
	
	By titleDropdown = By.name("title");
	By firstName = By.name("firstname");
	By lastName = By.name("lastname");
	By phone = By.name("phone");
	By yearDropdown = By.name("year");
	By monthDropdown = By.name("month");
	By dayDropdown = By.name("date");
	By licenseType = By.id("licencetype_t");
	By licensePeriod = By.name("licenceperiod");
	By occupationDropdown = By.name("occupation");
	By street = By.name("street");
	By city = By.name("city");
	By county = By.name("county");
	By postcode = By.name("post_code");
	By email = By.name("email");
	By password = By.name("password");
	By confirmPassword = By.name("c_password");
	By submitBtn = By.name("submit");
	
	public Registration (WebDriver driver) {
		this.driver = driver;
	}
	

	public void selectTitle(String title) {
		new Select(driver.findElement(titleDropdown)).selectByVisibleText(title);
	}

	public void enterFirstName(String fName) {
		driver.findElement(firstName).sendKeys(fName);
	}

	public void enterLastName(String lName) {
		driver.findElement(lastName).sendKeys(lName);
	}

	public void enterPhone(String phoneNo) {
		driver.findElement(phone).sendKeys(phoneNo);
	}

	public void selectDOB(String year, String month, String day) {
		new Select(driver.findElement(yearDropdown)).selectByVisibleText(year);
		new Select(driver.findElement(monthDropdown)).selectByVisibleText(month);
		new Select(driver.findElement(dayDropdown)).selectByVisibleText(day);
	}

	public void selectLicenseType() {
		driver.findElement(licenseType).click();
	}

	public void selectLicensePeriod(String years) {
		new Select(driver.findElement(licensePeriod)).selectByVisibleText(years);
	}

	public void selectOccupation(String occupation) {
		new Select(driver.findElement(occupationDropdown)).selectByVisibleText(occupation);
	}

	public void enterAddress(String str, String cty, String cty2, String zip) {
		driver.findElement(street).sendKeys(str);
		driver.findElement(city).sendKeys(cty);
		driver.findElement(county).sendKeys(cty2);
		driver.findElement(postcode).sendKeys(zip);
	}

	public void enterEmailAndPassword(String emailId, String pwd) {
		driver.findElement(email).sendKeys(emailId);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(confirmPassword).sendKeys(pwd);
	}

	public void clickSubmit() {
		driver.findElement(submitBtn).click();

	}
}