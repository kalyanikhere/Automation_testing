package action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import dynamic_code.Stoared_code;

public class Mouse_action_Drop extends Stoared_code {

	public static void main(String[] args) throws Throwable {
		
		launch_browser("chrome");
		
		hiturl("https://jqueryui.com/");
		
		Actions action = new Actions(driver);
		
		driver.findElement(By.xpath("//a[text()=\"Droppable\"]")).click();
		
		 WebElement frame1 = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(frame1);
		
		WebElement drag = driver.findElement(By.cssSelector("div#draggable"));
		WebElement drop = driver.findElement(By.cssSelector("div#droppable"));
		
//		for drag and drop we can use different ways
		
		action.dragAndDrop(drag, drop).build().perform();
		
//		action.moveToElement(drag).clickAndHold().moveToElement(drop).release().build().perform();
		
//		action.clickAndHold(drag).moveToElement(drop).release(drag).build().perform();
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[text()=\"Sortable\"]")).click();
		System.out.println("the current page title is :"+driver.getTitle());
		
		
		
		
		
	}
	
}
