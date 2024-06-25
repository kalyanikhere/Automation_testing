package assert_;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import dynamic_code.Stoared_code;

public class Hard_assert extends Stoared_code{
  @Test
  public void browser_url() {
	  launch_browser("chrome");
	  hiturl("https://www.irctc.co.in/nget/train-search");
	  
	  String expected_url = "https://www.irctc.co.in/nget/train";
	  String actual_url = driver.getCurrentUrl();
	  
//	  Assert.assertEquals(actual_url, expected_url);
	  Assert.assertNotEquals(actual_url, expected_url);
//     Assert.assertTrue(actual_url.equals(expected_url),"links are not match");	  
	  
	  System.out.println("the actual url is :"+actual_url);
	  	  	  	  
  }
  
  @Test
  public void element() {
		  
	 WebElement login = driver.findElement(By.xpath("//a[text()=\" LOGIN \"]"));
	login.click();
	WebElement username = driver.findElement(By.xpath("//input[@placeholder='User Name']"));
	username.sendKeys("kalyani");
	
	WebElement pass = driver.findElement(By.xpath("//input[@placeholder='Password']"));
	pass.sendKeys("kalyani");
	
	  String expected_element = "LOGIN";
	  String actual_element = login.getText();
	 
	Assert.assertEquals(actual_element, expected_element);
	  
//	  SoftAssert as = new SoftAssert();
//	  as.assertEquals(actual_element, expected_element);
	  
	  System.out.println("the actual webelement is :"+actual_element);
  
}
  
  
  
}
