package static_dropdown;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import dynamic_code.Stoared_code;

public class DemoQA extends Stoared_code{

	public static void main(String[] args) throws Throwable {
		launch_browser("chrome");
		hiturl("https://mdbootstrap.com/docs/standard/extended/multiselect/");
		
	Actions ac = new Actions(driver);
	ac.sendKeys(Keys.PAGE_DOWN).build().perform();
	Thread.sleep(2000);
	
	WebElement dropdown = driver.findElement(By.xpath("(//select[@class=\"select-initialized\"]) [1]"));
	 Select sc = new Select(dropdown);
	 System.out.println(sc.isMultiple());
	 sc.selectByValue("4");
	
	 
	 
	}

}
