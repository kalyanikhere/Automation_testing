package dynamic_code;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Robot_class {

	public static WebDriver driver;
	public static String projectpath = System.getProperty("user.dir");	


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
	
	public static void robot_class(String locator, String path) throws AWTException {
		driver.findElement(By.xpath(locator)).click();
		
		StringSelection ss = new StringSelection(path);
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		Robot robo = new Robot();
		
		robo.delay(2000);
		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_V);
		
		robo.keyRelease(KeyEvent.VK_CONTROL);
		robo.keyRelease(KeyEvent.VK_V);
		robo.delay(2000);
		
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		
	}

}
