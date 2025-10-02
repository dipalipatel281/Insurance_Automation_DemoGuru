package test_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import objects_page.Retrieve_Quote;

public class Retrieve_Quote_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/insurance/v1/header.php");
 
        Retrieve_Quote retrievePage = new Retrieve_Quote(driver);
        
        retrievePage.goToRetrieveQuotation();

        String quotationId = "49806";
        retrievePage.enterQuotationId(quotationId);

        retrievePage.clickRetrieve();

        String details = retrievePage.getQuotationDetails();
        
        System.out.println("Retrieved Quotation Details: ");
        
        System.out.println(details);

        driver.quit();
		
	}

}
