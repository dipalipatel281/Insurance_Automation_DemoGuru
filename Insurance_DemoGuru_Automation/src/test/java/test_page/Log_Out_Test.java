package test_page;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import objects_page.Log_Out;

public class Log_Out_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demo.guru99.com/insurance/v1/header.php");

        Log_Out logout = new Log_Out(driver);
        
        logout.clickLogout();

        if (driver.getCurrentUrl().contains("index.php")) {
            System.out.println("Successfully logged out and returned to login page.");
        } else {
            System.out.println("Logout may have failed.");
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
        
        driver.quit();
    	
	}
}
