package mock_practices;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Mock_2 {
	
 public static void main(String[] args) {
	
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	 
	  driver.get("https://demo.automationtesting.in/Slider.html");
	 
	 WebElement slider = driver.findElement(By.cssSelector("a.ui-slider-handle.ui-state-default.ui-corner-all"));
	 
	Actions ac = new Actions(driver);
	 ac.moveToElement(slider).clickAndHold().moveByOffset(300, 0).release().build().perform();
	 
	 
	 
	 
     }
   }
