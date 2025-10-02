package test_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import objects_page.Negative_Log_In;

public class Negative_Log_In_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/insurance/v1/index.php");
        driver.manage().window().maximize();
      
        Negative_Log_In noLogin = new Negative_Log_In (driver);
		
        
        noLogin.enterEmail("guru099@email.com");
        noLogin.enterPassword("098765");
        noLogin.clickLogin();
        
        if (driver.getCurrentUrl().contains("header.php")) {
            System.out.println("Login successful.");
        } else {
            System.out.println("Login failed.");
        }

       driver.quit();
		
	}

}
