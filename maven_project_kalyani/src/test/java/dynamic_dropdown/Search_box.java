package dynamic_dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import dynamic_code.Stoared_code;

public class Search_box extends Stoared_code{
	
  public static void main(String[] args) {
	 
	  launch_browser("chrome");
	  hiturl("https://www.amazon.in/");
	  
	  WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
			  search.click();
			  search.sendKeys("shoes");
			  
			  driver.findElement(By.xpath("//div[@aria-label=\"shoes for women sneakers\"]")).click();
			  
//	we do not below conditions because we can directly locate the element	  
			  
//	 List<WebElement> options = driver.findElements(By.xpath("//div[@class='s-suggestion s-suggestion-ellipsis-direction']"));
//			  
//			  for(int p=0; p<=options.size(); p++) {
//				  try {
//					  if(options.get(p).getText().contains("for women sneakers")) {
//						  options.get(p).click();
//					  }
//				} catch (Throwable e) {
//					
//				}			  
//       }
//			  System.out.println("searched value is :"+ search.getAttribute("value"));
}
}
