package test_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import objects_page.Book_Flight;

public class Book_Flight_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		Book_Flight flight = new Book_Flight(driver);
	
		driver.get("https://demo.guru99.com/test/newtours/reservation.php");
		driver.manage().window().maximize();

		flight.selectOneWay();
		flight.selectPassengers("2");
		flight.selectDepartingFrom("Paris");
		flight.selectFromDate("March", "15");
		flight.selectArrivingIn("London");
		flight.selectToDate("June", "10");
		
		 try {
	            Actions actions = new Actions(driver);
	            actions.moveByOffset(10, 10).click().perform();
	            System.out.println("Clicked on page to dismiss banner.");
	        } catch (Exception e) {
	            System.out.println("Unable to click anywhere: " + e.getMessage());
	        }
	    
		flight.selectBusinessClass();
		flight.selectAirline("Unified Airlines");
		flight.clickContinue();
		
		try {
		    WebElement submitInfo = driver.findElement(
		        By.xpath("//p/font/b/font[contains(text(),'No Seats Avaialble')]")
		    );
		    
		    if (submitInfo.isDisplayed()) {
		        System.out.println("No Seats Available");
		    }
		} catch (Exception e) {
		    System.out.println("Seats are available");
		}
		
		//driver.quit();
	}
	}