package objects_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Request_Quote {

	WebDriver driver;

	By breakdownCoverDropdown = By.id("quotation_breakdowncover");
	By windscreenrepairDropdown = By.name("windscreenrepair");
	By incidentField = By.name("incidents");
	By registrationField = By.name("registration");
	By mileageField = By.name("mileage");
	By estimatedValueField = By.name("value");
	By parkingLocationDropdown = By.name("parkinglocation");
	By yearDropdown = By.name("year");
	By monthDropdown = By.name("month");
	By dateDropdown = By.name("date");
	By calculatePremiumBtn = By.xpath("/html/body/div[3]/div/div[2]/form/div[8]/input[1]");

	public Request_Quote(WebDriver driver) {
		this.driver = driver;
	}

	public void selectBreakdownCover(String option) {
		new Select(driver.findElement(breakdownCoverDropdown)).selectByVisibleText(option);
	}

	public void selectscreen() {
		driver.findElement(windscreenrepairDropdown).click();;
	}

	public void enterIncident(String incident) {
		driver.findElement(incidentField).sendKeys(incident);
	}

	public void enterVehicleRegistration(String registration) {
		driver.findElement(registrationField).sendKeys(registration);
	}

	public void enterMileage(String mileage) {
		driver.findElement(mileageField).sendKeys(mileage);
	}

	public void enterEstimatedValue(String value) {
		driver.findElement(estimatedValueField).sendKeys(value);
	}

	public void selectParkingLocation(String location) {
		new Select(driver.findElement(parkingLocationDropdown)).selectByVisibleText(location);
	
	}
	
	public void selectSOP(String year, String month, String date) {
		new Select(driver.findElement(yearDropdown)).selectByVisibleText(year);
		new Select(driver.findElement(monthDropdown)).selectByVisibleText(month);
		new Select(driver.findElement(dateDropdown)).selectByVisibleText(date);
		
	}

	public void clickCalculatePremium() {
        driver.findElement(calculatePremiumBtn).click();   
	}
}