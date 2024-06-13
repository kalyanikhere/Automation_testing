package mock_practices;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Mock_1 {

	public static void main(String[] args) {
		
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	 
	driver.get("https://meet.google.com");
//	driver.findElement(By.cssSelector("a[id=\"navbarDropdown\"]")).click();
	
		
	}

}
