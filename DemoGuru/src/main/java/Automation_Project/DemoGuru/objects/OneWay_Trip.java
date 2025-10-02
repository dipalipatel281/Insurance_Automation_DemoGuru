package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OneWay_Trip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/newtours/login.php");
		
		driver.findElement(By.name("userName")).sendKeys("John");
        driver.findElement(By.name("password")).sendKeys("24680");
        driver.findElement(By.name("submit")).click();
        
        driver.findElement(By.linkText("Flights")).click();
        
        WebElement oneWay = driver.findElement(By.xpath("//input[@value='oneway']"));
        oneWay.click();
        
        Select passengers = new Select(driver.findElement(By.name("passCount")));
        passengers.selectByVisibleText("1");
        
        
        Select departingFrom = new Select(driver.findElement(By.name("fromPort")));
        departingFrom.selectByVisibleText("New York");
        
        
        Select fromMonth = new Select(driver.findElement(By.name("fromMonth")));
        fromMonth.selectByVisibleText("January");
        Select fromDay = new Select(driver.findElement(By.name("fromDay")));
        fromDay.selectByVisibleText("1");
        
        
        Select arrivingIn = new Select(driver.findElement(By.name("toPort")));
        arrivingIn.selectByVisibleText("Paris");
        
        
        Select toMonth = new Select(driver.findElement(By.name("toMonth")));
        toMonth.selectByVisibleText("June");
        Select toDay = new Select(driver.findElement(By.name("toDay")));
        toDay.selectByVisibleText("1");
        
        
        WebElement Class = driver.findElement(By.xpath("//input[@value='Business']"));
        Class.click();
        
        
        Select airline = new Select(driver.findElement(By.name("airline")));
        airline.selectByVisibleText("Pangea Airlines");

 
        driver.findElement(By.name("findFlights")).click();
        
        
        if (driver.getPageSource().contains("After flight finder - No Seats Avaialble")) {
            System.out.println("One-way flight search executed successfully (no seats found).");
        } else {
            System.out.println("One-way flight search executed successfully (results available).");
        }

	}

}
