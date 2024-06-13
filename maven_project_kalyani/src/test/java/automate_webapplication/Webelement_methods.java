package automate_webapplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import dynamic_code.Stoared_code;

public class Webelement_methods extends Stoared_code{

	public static void main(String[] args) throws Throwable {
		
	launch_browser("Edge");	
	hiturl("https://www.meesho.com/");
			
	 WebElement search = driver.findElement(By.xpath("(//input[@type=\"text\"])[1]")); 
		search.click();
		search.sendKeys("shoes");
		Thread.sleep(3000);
		search.clear();
		Thread.sleep(3000);
		search.sendKeys("saree");
		
		System.out.println("the text is entered : "+search.getAttribute("value"));
		System.out.println("the value of attribute is : "+search.getAttribute("type"));
		
		System.out.println("the x coordinate of search box is at: "+search.getLocation().x);
		System.out.println("the x coordinate of search box is at: "+search.getLocation().y);
		
		System.out.println("the size of search box is : "+search.getSize());
		   
		   System.out.println("the tagname for search box button is :"+search.getTagName());
		   
		   System.out.println("search box is displayed on UI or webpage :"+search.isDisplayed());
		   
		   System.out.println("search box is enabled on UI or webpage :"+search.isEnabled());
		   
		   search.isSelected();
		   
		   Thread.sleep(3000);
		   driver.navigate().refresh();
		   Thread.sleep(3000);
		   
		   driver.navigate().back();
		   Thread.sleep(3000);
		   
		   driver.navigate().forward();
		   Thread.sleep(3000);
		   
		   driver.close();

	}

}
