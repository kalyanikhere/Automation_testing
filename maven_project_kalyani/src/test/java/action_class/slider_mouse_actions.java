package action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import dynamic_code.Stoared_code;

public class slider_mouse_actions extends Stoared_code {

	public static void main(String[] args) throws Throwable {

    launch_browser("chrome");
    
    hiturl("https://jqueryui.com/slider/");
    
    Actions ac = new Actions(driver);
    
    WebElement frame1 = driver.findElement(By.className("demo-frame"));
    
    driver.switchTo().frame(frame1);
    
    WebElement slider = driver.findElement(By.cssSelector("span[class=\"ui-slider-handle ui-corner-all ui-state-default\"]"));            
		
//    different ways to move slider
    
    ac.moveToElement(slider).clickAndHold().moveByOffset(200, 0).release().build().perform();
    Thread.sleep(2000);
    
    ac.dragAndDropBy(slider, -100, 0).build().perform();
    Thread.sleep(2000);
    
    ac.clickAndHold(slider).moveByOffset(100, 0).release(slider).build().perform();
    
    driver.switchTo().defaultContent();
    
    driver.findElement(By.xpath("//a[text()=\"Resizable\"]")).click();
    System.out.println("the current page title is :"+driver.getTitle());
    
	}

}
