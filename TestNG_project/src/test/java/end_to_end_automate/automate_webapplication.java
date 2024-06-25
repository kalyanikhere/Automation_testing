package end_to_end_automate;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import dynamic_code.Stoared_code;

public class automate_webapplication extends Stoared_code{
	
	@BeforeSuite
	public void launch_browser() {
		launch_browser("chrome");
	}
	
	@BeforeTest
	public void url() {
		hiturl("https://www.netmeds.com/");
	}	
	
  @Test(priority = 1)
  public void pin() throws Throwable {
	WebElement deliver_to = driver.findElement(By.xpath("//span[@class='delivery_section']"));
	deliver_to.click();
	System.out.println("already exist pin is :"+deliver_to.getAttribute("value"));
	
	WebElement pin = driver.findElement(By.xpath("//input[@id='rel_pincode']"));
	pin.click();
	pin.sendKeys("442907");	
	System.out.println("pin entered is :"+pin.getAttribute("value"));
	Thread.sleep(2000);
  }
  
  @Test(priority = 2)
  public void searchbox() throws Throwable {
	 WebElement search = driver.findElement(By.xpath("//input[@id='search']"));
	 search.sendKeys("erythromycin");
	 Thread.sleep(1000);
	 System.out.println("search item entered is :"+search.getAttribute("value"));
	 Actions ac = new Actions(driver);
	 ac.keyDown(Keys.ENTER).build().perform();
  }
  
  
  @Test(priority = 3)
  public void select() {
	  driver.findElement(By.xpath("//div[@class='cat-item ']")).click();
  }
  
  @Test(priority = 4)
  public void scrollto() {
	  JavascriptExecutor js =  (JavascriptExecutor) driver;
	  js.executeScript("window.scrollBy(0,200)");	  
  } 
  
  @Test(priority = 5)
  public void addtocart() throws Throwable {
	  driver.findElement(By.xpath("(//span[text()=\"ADD TO CART\"])[1]")).click();
	  Thread.sleep(1000);
	 WebElement cart = driver.findElement(By.xpath("//div[text()=\" Cart \"]"));
	 cart.click();
	 System.out.println(driver.getTitle());
	  Thread.sleep(1000);
  }
  
  
  @Test(priority = 6)
  public void cart() throws Throwable {
	   WebElement quantity = driver.findElement(By.xpath("//select[@name='quantity']"));
	  Select sc= new Select(quantity);
	  sc.selectByVisibleText(" 2");
	  System.out.println(quantity.getAttribute("value"));
	  driver.findElement(By.xpath("//button[text()=\"Proceed\"]")).click();
	 Thread.sleep(1000);
  }
  

  @Test(priority = 7)
  public void mobile() throws Throwable {
	  WebElement number = driver.findElement(By.xpath("//input[@id='loginfirst_mobileno']"));
	  number.click();
	  number.sendKeys("1234567890");
	  System.out.println(driver.getTitle());
	  Thread.sleep(1000);
	  number.clear();
	  Thread.sleep(1000);
//	  driver.findElement(By.xpath("//button[text()=\"USE OTP\"]")).click();
	  
  } 
  
  @AfterClass
  public void refresh() throws Throwable {
	   driver.navigate().refresh();
	   Thread.sleep(1000);
  }
  
  @AfterTest
  public void back() throws Throwable {
	   driver.navigate().back();
	   Thread.sleep(1000);
  }
  
   @AfterSuite
   public void close() {
	   driver.close();
   }
}
