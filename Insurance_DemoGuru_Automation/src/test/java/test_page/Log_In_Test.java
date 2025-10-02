package test_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import objects_page.Log_In;

public class Log_In_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/insurance/v1/index.php");
        driver.manage().window().maximize();
      
        Log_In loginPage = new Log_In (driver);
		
        
        loginPage.enterEmail("guru099@email.com");
        loginPage.enterPassword("123456");
        loginPage.clickLogin();
        
        if (driver.getCurrentUrl().contains("header.php")) {
            System.out.println("Login successful.");
        } else {
            System.out.println("Login failed.");
        }

        driver.quit();
        
	}

}
