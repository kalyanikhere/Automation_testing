package dynamic_code;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_class {

	public static WebDriver driver;
	public static String projectpath = System.getProperty("user.dir");	
	public static Actions ac;

	public static void launch_browser(String browser) {
		
		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();

		} else if (browser.equalsIgnoreCase("firefox")) {
			
		    driver = new FirefoxDriver();
	    }
		System.out.println("the browser launched is : "+ browser);
	
	       driver.manage().window().maximize();	
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
    }

	                                                                                      
	public static void hiturl(String url) {
		driver.get(url);
		System.out.println("the title of webpage is: "+driver.getTitle());
	}
	
	public static void frame(String locator) {
		WebElement frame1 = driver.findElement(By.className(locator));	    
	    driver.switchTo().frame(frame1);
	}

	public static void action() {
		 ac = new Actions(driver);
	}
	
	public static void sendkeys(WebElement target, String keys) {
	ac.moveToElement(target).click().sendKeys(keys).build().perform();	
	}
	
	public static void movetoelement(String locator) {
		WebElement abc = driver.findElement(By.xpath(locator));
		ac.moveToElement(abc).click().build().perform();
	}
	
	public static void keysdown() {
		ac.keyDown(Keys.PAGE_UP).perform();
	}
	
	public static void keysdown2() {
		ac.keyDown(Keys.PAGE_DOWN).perform();
	}
}
