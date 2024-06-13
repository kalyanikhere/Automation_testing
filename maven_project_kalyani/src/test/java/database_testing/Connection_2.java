package database_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import dynamic_code.Database_testing;
import dynamic_code.Stoared_code;

public class Connection_2 extends Database_testing{


	public static void main(String[] args) throws Throwable {
		
		launch_browser("chrome");
		takesscreenshot_way1("browser");
		hiturl("https://www.reddit.com/login/");
		takesscreenshot_way1("url");
		
		database_connection("january", "select username, password from connection where sr_no = 4;");
        		
		database_column_name("username", "//input[@name='username']");
		takesscreenshot_way1("enter_username");
		Thread.sleep(1000);
		
		database_column_name("password", "//input[@name='password']");
		takesscreenshot_way1("enter_password");
		Thread.sleep(1000);
		
		driver.close();
	}

}
