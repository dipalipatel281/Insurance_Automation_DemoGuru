package test_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import objects_page.Edit_Profile;

public class Edit_Profile_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/insurance/v1/header.php");
        driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[5]/a")).click();
        

        Edit_Profile profile = new Edit_Profile(driver);
		
        profile.clickProfileLink();

        profile.updateAddress("456 New Street");
        profile.updateCity("NewCity");
        profile.updateCounty("NewCounty");
        profile.updatePostcode("99999");
        profile.updatePhone("1234567890");

        profile.clickUpdate();

        System.out.println("Profile updated successfully.");

        driver.quit();
        
	}

}
