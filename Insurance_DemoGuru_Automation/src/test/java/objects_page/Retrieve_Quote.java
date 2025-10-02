package objects_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Retrieve_Quote {

	WebDriver driver;

    By retrieveQuoteLink = By.linkText("Retrieve Quotation");
    By identificationNumberField = By.name("id");
    By retrieveBtn = By.id("getquote");
    By quotationDetailsBox = By.xpath("/html/body/table/tbody");

    public Retrieve_Quote(WebDriver driver) {
        this.driver = driver;
    }

    public void goToRetrieveQuotation() {
        driver.findElement(retrieveQuoteLink).click();
    }

    public void enterQuotationId(String quotationId) {
        driver.findElement(identificationNumberField).clear();
        driver.findElement(identificationNumberField).sendKeys(quotationId);
    }

    public void clickRetrieve() {
        driver.findElement(retrieveBtn).click();
    }
    
    public String getQuotationDetails() {
        return driver.findElement(quotationDetailsBox).getText();
    }
}