package assert_;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
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

  @Test
  public void searchbox1() {
	  WebElement searchbox1 = driver.findElement(By.xpath("//input[@id='searchInputBox']"));
	  System.out.println(searchbox1.getSize());
	  
	  String expected_search1 = "(225, 18)";
	 Dimension actual_search1 =searchbox1.getSize();
	 SoftAssert as = new SoftAssert();
	 as.assertEquals(expected_search1, expected_search1);
	 
	 System.out.println("the size of search box is :"+actual_search1);
	 
}
}
