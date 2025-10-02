package objects_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Book_Flight {

	WebDriver driver;

	public Book_Flight(WebDriver driver) {
        this.driver = driver;
	}   
        By oneWayRadio = By.xpath("//input[@value='oneway']");
        By passengersDropdown = By.name("passCount");
        By departingFromDropdown = By.name("fromPort");
        By fromMonthDropdown = By.name("fromMonth");
        By fromDayDropdown = By.name("fromDay");
        By arrivingInDropdown = By.name("toPort");
        By toMonthDropdown = By.name("toMonth");
        By toDayDropdown = By.name("toDay");
        By businessClassRadio = By.xpath("//input[@value='Business']");
        By airlineDropdown = By.name("airline");
        By continueButton = By.name("findFlights");
        
	
        public void selectOneWay() {
			driver.findElement(oneWayRadio).click();
		}

		public void selectPassengers(String count) {
			new Select(driver.findElement(passengersDropdown)).selectByVisibleText(count);
		}

		public void selectDepartingFrom(String city) {
			new Select(driver.findElement(departingFromDropdown)).selectByVisibleText(city);
		}

		public void selectFromDate(String month, String day) {
			new Select(driver.findElement(fromMonthDropdown)).selectByVisibleText(month);
			new Select(driver.findElement(fromDayDropdown)).selectByVisibleText(day);
		}

		public void selectArrivingIn(String city) {
			new Select(driver.findElement(arrivingInDropdown)).selectByVisibleText(city);
		}

		public void selectToDate(String month, String day) {
			new Select(driver.findElement(toMonthDropdown)).selectByVisibleText(month);
			new Select(driver.findElement(toDayDropdown)).selectByVisibleText(day);
		}

		public void selectBusinessClass() {
			driver.findElement(businessClassRadio).click();
		}
		
		public void selectAirline(String airline) {
			new Select(driver.findElement(airlineDropdown)).selectByVisibleText(airline);
		}

		public void clickContinue() {
			driver.findElement(continueButton).click();
}
}