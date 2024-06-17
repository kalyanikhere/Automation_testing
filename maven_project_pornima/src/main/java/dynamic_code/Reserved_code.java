package dynamic_code;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class Reserved_code {
	
	public static WebDriver driver;
    public static String projectpath = System.getProperty("user dir");
	static String host = "Localhost";
	static String portnumber = "3306";
	
	
	public static void launch_browser(String browser) {
		if(browser.equalsIgnoreCase("Chrome")) {
		 driver = new ChromeDriver();
		
		}else if(browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
			
		}else if(browser.equalsIgnoreCase("edge")) {
			 driver = new EdgeDriver();
			
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	}     
	
	public static void url(String url) {
		driver.get(url);
		System.out.println(driver.getTitle());
		}
	
	public static void takesscreenshot_1 (String screenshot_name) throws Throwable  {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File Target = new File ("./linkdin_screenshot/"+screenshot_name +".png");
		FileHandler.copy(source, Target);
	}
	public static void takesscreenshot_2(String screenshot) throws Throwable {
		TakesScreenshot ts_1= (TakesScreenshot) driver;
	File source_1 = ts_1.getScreenshotAs(OutputType.FILE);
	File Target_1 = new File(projectpath+"\\linkdin_screenshot\\"+ screenshot +"png");
	FileHandler.copy(source_1, Target_1);
		
	}
	public static void database_testing(String database,String query,String username,String password) throws Throwable {
		
	 Connection connect = DriverManager.getConnection("jdbc:mysql://"+host+":" +portnumber+ database,"root","Himanshu@123");
	 Statement cs = connect.createStatement();
	   ResultSet result = cs.executeQuery(query);
	   result.next();
	   
	   result.getString(username);
	result.getString(password);
	  	  
	}
}

			
//Connection connect = DriverManager.getConnection("jdbc:mysql://"+host+":"+portnumber+ database,"root", "Himanshu@123");
//Statement cs = connect.createStatement();
// ResultSet resut = cs.executeQuery(query);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
		
		
		
		
		
		
		
		
		
		
		
	

	
	
	


