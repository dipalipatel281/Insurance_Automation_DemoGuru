package objects_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Sign_On {

	WebDriver driver;
	
	public Sign_On (WebDriver driver) {
		this.driver = driver;
	}
	
	 By usernamebox = By.name("userName");
     By passwordbox = By.name("password");
     By submitButton = By.name("submit");

    
    public void enterUsername(String username) {
        driver.findElement(usernamebox).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordbox).sendKeys(password);
    }

    public void clickSubmit() {
        driver.findElement(submitButton).click();
	
}
}