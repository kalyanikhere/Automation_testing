package automate_webapplication;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import dynamic_code.Stoared_code;

public class All_methods_used extends Stoared_code {

	public static void main(String[] args) throws Throwable {

	launch_browser("edge");
		
	hiturl("https://www.mothercare.in/");
	takesscreenshot_way2("homepage");

	driver.findElement(By.xpath("(//i[@class='pe-7s-search'])[1]")).click();
   
	WebElement searchbox = driver.findElement(By.id("search_query"));
    searchbox.click();
    searchbox.sendKeys("toys");
    takesscreenshot_way2("search_term");
    
    driver.findElement(By.xpath("(//i[@class='fa fa-search']) [3]")).click();
    takesscreenshot_way2("search_result");
        
    JavascriptExecutor js = (JavascriptExecutor) driver;
    Thread.sleep(1000);
    js.executeScript("window.scrollBy(0,1500)");
    takesscreenshot_way2("scroll");
    
	js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
    takesscreenshot_way2("scroll_bottom");
	
	js.executeScript("window.scrollBy(0,-3500)");
    takesscreenshot_way2("scroll_up");
    
    js.executeScript("window.history.go(0)");
    takesscreenshot_way2("refresh");
    
	js.executeScript("window.history.back()");
	takesscreenshot_way2("backword");
 
	js.executeScript("window.history.forward()");
	takesscreenshot_way2("forward");
	
	driver.close();
	
	}

}
