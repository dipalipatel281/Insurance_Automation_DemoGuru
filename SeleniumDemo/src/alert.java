
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver ();
		
		driver.get("https://www.selenium.dev/selenium/web/alerts.html#");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		
		WebElement click =  driver.findElement(By.id("id=\"alert"));
		
		click.sendKeys();
		
		
	}

}
