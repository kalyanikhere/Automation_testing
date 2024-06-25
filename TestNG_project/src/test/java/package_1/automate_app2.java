package package_1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import dynamic_code.Stoared_code;

public class automate_app2 extends Stoared_code{
	

	@BeforeSuite
	public void launch_browser() {
		launch_browser("chrome");
	}
	
	@BeforeTest
	public void url() {
		hiturl("https://www.truemeds.in/");
	}		
	
  @Test
  public void deliver() {
	  WebElement deliver_to = driver.findElement(By.xpath("//span[text()='Deliver to']"));
	  deliver_to.click();
	  
	 WebElement pin = driver.findElement(By.xpath("//input[@placeholder='Enter your PIN code']"));
	 pin.click();
	 pin.sendKeys("442907");
  }
  
  @Test
  public void searchbox() {
	 WebElement search = driver.findElement(By.xpath("//input[@id='searchInput']"));
	 search.click();
	 search.sendKeys("althrocin");
	 Actions ac = new Actions(driver);
	 ac.keyDown(Keys.ENTER).build().perform();
	 System.out.println("search item entered is :"+search.getAttribute("value"));
  }
  

  @Test(priority = 1)
  public void addtocart() {
	  driver.findElement(By.xpath("(//button[text()='Add To Cart'])[1]")).click();
	  driver.findElement(By.xpath("//button[text()='Proceed to Cart ']")).click();
//	  driver.findElement(By.xpath("(//button[text()='Add To Cart'])[7]")).click();
	  
//	  WebElement phone = driver.findElement(By.xpath("//input[@id='phone']"));
//	  phone.click();
//	  phone.sendKeys("9579781129");
//	  
//	  driver.findElement(By.xpath("//button[text()=\"Get OTP\"]")).click();
//	  
  }

}
