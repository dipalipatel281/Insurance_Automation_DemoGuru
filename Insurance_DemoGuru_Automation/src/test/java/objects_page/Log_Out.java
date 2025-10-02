package objects_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Log_Out {

	WebDriver driver;

    By logoutLink = By.xpath("/html/body/div[3]/form/input");

    public Log_Out(WebDriver driver) {
        this.driver = driver;
    }

    public void clickLogout() {
        driver.findElement(logoutLink).click();
	
}
}