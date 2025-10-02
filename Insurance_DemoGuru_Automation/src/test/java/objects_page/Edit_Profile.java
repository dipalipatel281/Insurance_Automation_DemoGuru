package objects_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Edit_Profile {

	WebDriver driver;

	By profileLink = By.name("user[title]");
	By phoneField = By.name("user[phone]");
	By addressField = By.name("user[address_attributes][street]");
	By cityField = By.name("user[address_attributes][city]");
	By countyField = By.name("user[address_attributes][county]");
	By postcodeField = By.name("user[address_attributes][postcode]");
	By updateBtn = By.name("commit");

	public Edit_Profile(WebDriver driver) {
	        this.driver = driver;
	}       

	public void clickProfileLink() {
		driver.findElement(profileLink).click();
	}
	
	public void updatePhone(String phone) {
		driver.findElement(phoneField).clear();
		driver.findElement(phoneField).sendKeys(phone);
	}

	public void updateAddress(String address) {
		driver.findElement(addressField).clear();
		driver.findElement(addressField).sendKeys(address);
	}

	public void updateCity(String city) {
		driver.findElement(cityField).clear();
		driver.findElement(cityField).sendKeys(city);
	}

	public void updateCounty(String county) {
		driver.findElement(countyField).clear();
		driver.findElement(countyField).sendKeys(county);
	}

	public void updatePostcode(String postcode) {
		driver.findElement(postcodeField).clear();
		driver.findElement(postcodeField).sendKeys(postcode);
	}

	public void clickUpdate() {
		driver.findElement(updateBtn).click();
	}
}