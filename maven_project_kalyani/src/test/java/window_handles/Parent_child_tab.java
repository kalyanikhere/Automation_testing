package window_handles;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import dynamic_code.Stoared_code;


public class Parent_child_tab extends Stoared_code {

	public static void main(String[] args) throws Throwable {

		launch_browser("chrome");
		hiturl("https://www.flipkart.com/");
		takesscreenshot_way1("url");

		WebElement search = driver.findElement(By.xpath("//input[@class='Pke_EE']"));
		search.click();
		search.sendKeys("mobiles 5G");
		Thread.sleep(2000);
		takesscreenshot_way1("searched term");

		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1500)");
		takesscreenshot_way1("scrolled by value");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Blue, 128 GB)']")).click();
		takesscreenshot_way1("switch to element");
		Thread.sleep(1000);

		Set<String> windows = driver.getWindowHandles();
		Iterator<String> window_id = windows.iterator();

		String parent_id = window_id.next();
		System.out.println("the id of parent window is :" + parent_id);

		String child_id = window_id.next();
		System.out.println("the id of child window is :" + child_id);

		driver.switchTo().window(child_id);
		System.out.println("switched to child window");
		Thread.sleep(1000);
		takesscreenshot_way1("switched to child window");

		driver.switchTo().window(parent_id);
		System.out.println("switched to parent window");
		Thread.sleep(1000);
		takesscreenshot_way1("switched to parent window");

		Actions ac = new Actions(driver);
		ac.keyDown(Keys.PAGE_UP);
		ac.keyDown(Keys.PAGE_UP);
		ac.keyDown(Keys.PAGE_UP);
		Thread.sleep(1000);
		takesscreenshot_way1("scrolled up");		

		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();
		Thread.sleep(1000);
		driver.quit();

	}

}
