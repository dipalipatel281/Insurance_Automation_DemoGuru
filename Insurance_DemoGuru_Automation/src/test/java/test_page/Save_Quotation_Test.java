package test_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import objects_page.Save_Quotation;

public class Save_Quotation_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/insurance/v1/header.php");
       
        Save_Quotation quotationPage = new Save_Quotation(driver);

        quotationPage.navigateToRequestQuotation();
        quotationPage.selectBreakdownCover("Roadside");
        quotationPage.selectscreen();
        quotationPage.enterIncident("Minor accident");
        quotationPage.enterVehicleRegistration("XYZ1234");
        quotationPage.enterAnnualMileage("12000");
        quotationPage.enterEstimatedValue("15000");
        quotationPage.selectParkingLocation("Street/Road");
        quotationPage.selectStartOfPolicy("2025", "January", "1");
        
        try {
            Actions actions = new Actions(driver);
            actions.moveByOffset(10, 10).click().perform();
            System.out.println("Clicked on page to dismiss banner.");
        } catch (Exception e) {
            System.out.println("Unable to click anywhere: " + e.getMessage());
        }

        quotationPage.clickSaveQuotation();
        
        String quotationId = quotationPage.getQuotationId();
        if (quotationId != null) {
            System.out.println("Quotation saved with ID: " + quotationId);
        } else {
            System.out.println("Failed to capture Quotation ID.");
        }
    
        driver.quit();
		
	}
}