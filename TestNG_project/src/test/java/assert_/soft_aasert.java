package assert_;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import dynamic_code.Stoared_code;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;


public class soft_aasert extends Stoared_code{
  @Test
  public void browser_url() {
	  launch_browser("chrome");
	  hiturl("https://www.jiocinema.com/");
	  
	  String expected_url = "https://www.jiocinema";
	  String actual_url = driver.getCurrentUrl();
	  
	  SoftAssert as = new SoftAssert();
	  as.assertEquals(actual_url, expected_url);
	  
	  System.out.println("the current url is:"+actual_url);
	  as.assertAll();
  }
  
  @Test
  public void searchbox() {
	  WebElement searchbox = driver.findElement(By.xpath("//input[@id='searchInputBox']"));
	  searchbox.click();
	  searchbox.sendKeys("mr bean");
	  System.out.println("value enter is :"+searchbox.getAttribute("value"));
	  
	  String expected_search = "mr bean";
	  String actual_search = searchbox.getAttribute("value");
	  
	  SoftAssert as = new SoftAssert();
	  as.assertEquals(actual_search, expected_search);
	  
	  System.out.println("enterd search term is:"+actual_search);
	  as.assertAll();
  }

}
