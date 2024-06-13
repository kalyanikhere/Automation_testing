package dynamic_code;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


	
public class Sayli_tai {
	public static WebDriver driver;
	public static String host = "localhost";
	public static String portno = "3306";
	public static ResultSet result;
	
	public static void dbconnection1(String database_name,String Query) throws SQLException {

		// String host="localhost";
		// String portno="3306";
		
		
		Connection connect = DriverManager.getConnection("jdbc:mysql://" + host + ":" + portno + "/" +database_name, "root" ,"Sayali22$");
		Statement cs = connect.createStatement();
		 result = cs.executeQuery(Query);
		result.next();
		

	}
	public static void column(String column_name,String locator) throws Throwable {
		System.out.println(result.getString(column_name)); 
		driver.findElement(By.xpath(locator)).sendKeys(result.getString(column_name));
		
	}


	
//	public class Db_extend extends Database_dynamic {
//
//		public static void main(String[] args) throws Throwable {
//			WebDriver driver=new ChromeDriver();
//			driver.manage().window().maximize();

//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//			driver.get("https://in.linkedin.com/");
//			driver.findElement(By.xpath("//a[@class=\"nav__button-secondary btn-md btn-secondary-emphasis\"]")).click();
//		
//			dbconnection1("emp", "select emailid,password from dbconnection where sr_no=3;");
//
//			column("emailid", "//input[@id=\"username\"]");
//			column("password", "//input[@id=\"password\"]");	
//			
//			
//		}
//
//	}
	
	
	
}
	
	
	