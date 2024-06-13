package database_testing;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;

import dynamic_code.Stoared_code;

public class Connection extends Stoared_code {

	public static void main(String[] args) throws Throwable {
		 
		String host = "localhost";
		String portnumber = "3306";
		
		launch_browser("chrome");
		hiturl("https://www.instagram.com/");
		
		 java.sql.Connection connect = DriverManager.getConnection("jdbc:mysql://"+host+":"+portnumber+"/november", "root", "Himanshu@123");
		
		Statement cs = connect.createStatement();
		
		ResultSet result = cs.executeQuery("select username, password from user where sr_no = 5;");
		result.next();
		
		System.out.println(result.getString("username"));
		System.out.println(result.getString("password"));
		
		driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys(result.getString("username"));
		driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys(result.getString("password"));
		
		driver.findElement(By.xpath("//button[text()=\"Show\"]")).click();
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
