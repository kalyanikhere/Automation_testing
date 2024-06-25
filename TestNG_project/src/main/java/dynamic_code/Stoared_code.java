package dynamic_code;

import java.io.File;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Stoared_code {

	
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

	public static void takesscreenshot_way1(String screenshots) throws Throwable  {
	TakesScreenshot ts = (TakesScreenshot) driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	File target = new File("./listeners_meesho/" + screenshots+ ".png");
	FileHandler.copy(source, target);
	   	
	}
     
	public static void takesscreenshot_way2(String screenshot2) throws Throwable {
		TakesScreenshot  ts2 = (TakesScreenshot) driver;
		File source2 = ts2.getScreenshotAs(OutputType.FILE);
		File target2 = new File (projectpath + "\\failed_test\\" + screenshot2 + ".png");
	    FileHandler.copy(source2, target2);
	}
	
	
	
	
	
	
	
	}





