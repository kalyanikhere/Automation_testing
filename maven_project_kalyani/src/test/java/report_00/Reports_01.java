package report_00;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import dynamic_code.Reports;

public class Reports_01 extends Reports {

	public static void main(String[] args) throws Throwable {

		extentreport("linkedin", "linkedin_document", "linkedin_report");
		testcase("hiturl", "find url");
		addscreencapture("url_page");
		
		testcase("email", "enter_email");
		addscreencapture("entered_email");
		
		testcase("password", "enter_password");
		addscreencapture("entered_pass");
      
		browser_launch("chrome");
		hiturl("https://in.linkedin.com/");	
		takesscreenshot_way2("homepage");
    
    WebElement email = driver.findElement(By.xpath("//input[@id='session_key']"));
     email.click();
     email.sendKeys("jsjhejui@");
     takesscreenshot_way2("email");
     
     WebElement pass = driver.findElement(By.xpath("//input[@id='session_password']"));
     pass.click();
     pass.sendKeys("jrurugrig");
     takesscreenshot_way2("password");
     
       er.flush();    
	}

}
