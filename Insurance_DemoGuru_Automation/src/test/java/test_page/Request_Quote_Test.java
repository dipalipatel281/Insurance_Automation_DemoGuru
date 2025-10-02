package test_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import objects_page.Request_Quote;

public class Request_Quote_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demo.guru99.com/insurance/v1/header.php");
        driver.findElement(By.linkText("Request Quotation")).click();

        Request_Quote quotation = new Request_Quote(driver);
        
        quotation.selectBreakdownCover("Roadside");
        quotation.selectscreen();
        quotation.enterIncident("Car theft");
        quotation.enterVehicleRegistration("ABC1234");
        quotation.enterMileage("1000");
        quotation.enterEstimatedValue("20000");
        quotation.selectParkingLocation("Street/Road");
        quotation.selectSOP("2025", "January", "1");
      
        try {
            Actions actions = new Actions(driver);
            actions.moveByOffset(10, 10).click().perform();
            System.out.println("Clicked on page to dismiss banner.");
        } catch (Exception e) {
            System.out.println("Unable to click anywhere: " + e.getMessage());
        }
        
        quotation.clickCalculatePremium();

        System.out.println("Request Quotation completed successfully.");

        driver.quit();
	}

}
