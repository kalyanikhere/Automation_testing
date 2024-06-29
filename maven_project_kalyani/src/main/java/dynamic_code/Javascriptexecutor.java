package dynamic_code;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Javascriptexecutor {
	
	public static WebDriver driver;
	public static String projectpath = System.getProperty("user.dir");
	public static JavascriptExecutor js;
	

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
	
	public static void scroll(int value1 ,int value2) {
		js = (JavascriptExecutor) driver;				
		js.executeScript("window.scrollBy("+value1+","+value2+")");
	}
	
	public static void scrollheight() {
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}
	
	public static void refresh() {
		js.executeScript("window.history.go(0)");
	}
	
	public static void back() {
		js.executeScript("window.history.back()");
	}
	
	public static void forword() {
		js.executeScript("window.history.forward()");
	}
	
	
	
	
	
	
}
