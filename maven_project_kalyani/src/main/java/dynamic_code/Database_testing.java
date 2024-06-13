package dynamic_code;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class Database_testing {
	public static WebDriver driver;
	public static String host = "localhost";
	public static String portnumber = "3306";
	public static ResultSet result;
	public static String projectpath = System.getProperty("user.dir");

	public static void launch_browser(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();

		} else if (browser.equalsIgnoreCase("firefox")) {

			driver = new FirefoxDriver();
		}
		System.out.println("the browser launched is : " + browser);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	}

	public static void hiturl(String url) {
		driver.get(url);
		System.out.println("site title is :"+driver.getTitle());
	}

	public static void takesscreenshot_way1(String screenshots) throws Throwable {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File("./reddit_ss/" + screenshots + ".png");
		FileHandler.copy(source, target);
	}

	public static void database_connection(String database_name, String query) throws Throwable {

		Connection connect = DriverManager.getConnection("jdbc:mysql://" + host + ":" + portnumber + "/" + database_name, "root", "Himanshu@123");

		Statement cs = connect.createStatement();

		result = cs.executeQuery(query);
		result.next();

	}

	public static void database_column_name(String column, String locator) throws Throwable {
		System.out.println(result.getString(column));
		driver.findElement(By.xpath(locator)).sendKeys(result.getString(column));

	}
}
