package objects_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Save_Quotation {

	WebDriver driver;

    By requestQuotationLink = By.linkText("Request Quotation");
    By breakdownCoverDropdown = By.id("quotation_breakdowncover");
    By windscreenrepairDropdown = By.name("windscreenrepair");
    By incidentField = By.name("incidents");
    By vehicleRegistration = By.name("registration");
    By annualMileage = By.name("mileage");
    By estimatedValue = By.name("value");
    By parkingLocationDropdown = By.name("parkinglocation");
    By SOPYear = By.name("year");
    By SOPMonth = By.name("month");
    By SOPDay = By.name("date");
    By calculatePremiumBtn = By.xpath("/html/body/div[3]/div/div[2]/form/div[8]/input[1]");
    By saveQuotationBtn = By.name("submit");
    By quotationIdMessage = By.xpath("//b[contains(text(),'Your identification number is :')]");

    public Save_Quotation(WebDriver driver) {
		this.driver = driver;
    }
    
    public void navigateToRequestQuotation() {
        driver.findElement(requestQuotationLink).click();
    }

    public void selectBreakdownCover(String option) {
        new Select(driver.findElement(breakdownCoverDropdown)).selectByVisibleText(option);
    }

    public void selectscreen() {
		driver.findElement(windscreenrepairDropdown).click();;
    }

    public void enterIncident(String text) {
        driver.findElement(incidentField).sendKeys(text);
    }

    public void enterVehicleRegistration(String reg) {
        driver.findElement(vehicleRegistration).sendKeys(reg);
    }

    public void enterAnnualMileage(String mileage) {
        driver.findElement(annualMileage).sendKeys(mileage);
    }

    public void enterEstimatedValue(String value) {
        driver.findElement(estimatedValue).sendKeys(value);
    }

    public void selectParkingLocation(String option) {
        new Select(driver.findElement(parkingLocationDropdown)).selectByVisibleText(option);
    }

    public void selectStartOfPolicy(String year, String month, String day) {
        new Select(driver.findElement(SOPYear)).selectByVisibleText(year);
        new Select(driver.findElement(SOPMonth)).selectByVisibleText(month);
        new Select(driver.findElement(SOPDay)).selectByVisibleText(day);
    }

    public void clickCalculatePremium() {
        driver.findElement(calculatePremiumBtn).click();
    }

    public void clickSaveQuotation() {
        driver.findElement(saveQuotationBtn).click();
    }

    public String getQuotationId() {
        return driver.findElement(quotationIdMessage).getText();
}
    }
