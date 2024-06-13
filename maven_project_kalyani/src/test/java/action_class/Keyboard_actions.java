package action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import dynamic_code.Stoared_code;

public class Keyboard_actions extends Stoared_code{

	public static void main(String[] args) throws Throwable {
		
	launch_browser("chrome");
	
	hiturl("https://www.mothercare.in/");
	
    Actions ac = new Actions(driver);
    
	WebElement cloth = driver.findElement(By.xpath("//strong[text()=\"Baby clothing\"]"));
	ac.moveToElement(cloth).perform();
	
	WebElement newborn = driver.findElement(By.xpath("//a[text()=\"New born clothing\"]"));
	ac.moveToElement(newborn).click().build().perform();
	
	WebElement account = driver.findElement(By.xpath("(//i[@class=\"fa fa-user\"]) [2]"));
    ac.moveToElement(account).click().build().perform();
    
    WebElement sale = driver.findElement(By.xpath("//strong[text()=\"Sale\"]"));
    ac.moveToElement(sale).contextClick().build().perform();
    
    WebElement telephone = driver.findElement(By.xpath("(//input[@name=\"telephone\"]) [1]"));	
	ac.moveToElement(telephone).click().sendKeys("1234567890").build().perform();
	 Thread.sleep(2000);	 

	 
	 WebElement lastname = driver.findElement(By.cssSelector("input[name=\"lastname\"]"));	 
	 ac.moveToElement(lastname).click().sendKeys("eudeinjnvi").build().perform();
//	 we can use doubleclick method of mouse or we can use keyboard action ctrl+a	 
//	 ac.doubleClick(telephone).build().perform();
//	 ac.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
	 
	 ac.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
	 ac.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
	  
	 ac.keyDown(Keys.TAB).perform();
	 Thread.sleep(1000);
	 
	 ac.keyDown(Keys.TAB).perform();
	 Thread.sleep(1000);
	 
	 ac.keyDown(Keys.TAB).perform();
	 Thread.sleep(1000);
	 
	WebElement password = driver.findElement(By.xpath("(//input[@name=\"password\"]) [2]"));
	 ac.moveToElement(password).click().build().perform();
	 ac.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
     Thread.sleep(2000);
	  
	 ac.keyDown(Keys.PAGE_DOWN).build().perform();
	 Thread.sleep(2000);
	 
	 ac.keyDown(Keys.PAGE_DOWN).build().perform();
	 Thread.sleep(2000);
	 
	 ac.keyDown(Keys.PAGE_UP).build().perform();
	 Thread.sleep(2000);
 
     driver.navigate().back();
	 Thread.sleep(2000);
     driver.navigate().forward();
     driver.close();
	}

}
