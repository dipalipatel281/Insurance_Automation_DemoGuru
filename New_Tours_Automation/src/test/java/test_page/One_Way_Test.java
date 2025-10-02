package test_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;
import objects_page.One_Way;

public class One_Way_Test {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/reservation.php");
		driver.manage().window().maximize();
		
		One_Way flightfinder = new One_Way(driver);
		
		flightfinder.selectOneWay();
        flightfinder.selectPassengers("2");
        flightfinder.selectDepartingFrom("New York");
        flightfinder.selectFromDate("March", "15");
        flightfinder.selectArrivingIn("London");
        flightfinder.selectToDate("April", "10");
        
        try {
            Actions actions = new Actions(driver);
            actions.moveByOffset(10, 10).click().perform();
            System.out.println("Clicked on page to dismiss banner.");
        } catch (Exception e) {
            System.out.println("Unable to click anywhere: " + e.getMessage());
        }
        
        flightfinder.selectBusinessClass();
        flightfinder.selectAirline("Unified Airlines");
        flightfinder.clickContinue();
	
        try {
			WebElement submitinfo = driver.findElement(By.xpath("//span[contains(text(),'No Seats available')]"));
			if (submitinfo.isDisplayed()) {
				System.out.println("No Seats Available");
			}
		} catch (Exception e) {
			System.out.println("Login succeeded with invalid credentials!");
		}

		//driver.quit();

	}

}
