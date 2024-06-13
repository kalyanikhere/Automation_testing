package dynamic_dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import dynamic_code.Stoared_code;

public class Dropdown_01 extends Stoared_code {

	public static void main(String[] args) {
		launch_browser("chrome");
		hiturl("https://www.railyatri.in/");

		Actions ac = new Actions(driver);
		ac.keyDown(Keys.PAGE_DOWN);

		driver.findElement(By.xpath("//a[@id='nav-profile-tab']")).click();

		WebElement from_stop = driver.findElement(By.xpath("//input[@id='from_city_bus']"));
		from_stop.click();
		from_stop.sendKeys("ako");
		List<WebElement> from = driver.findElements(By.xpath("//ul[@id='ui-id-11']//child::li"));

		for (int h = 0; h <= from.size(); h++) {
			try {
				if (from.get(h).getText().contains("Akot")) {
					from.get(h).click();
				}
			} catch (IndexOutOfBoundsException e) {

			}

		}
		System.out.println("start from the stop is :" + from_stop.getAttribute("value"));

		WebElement to_stop = driver.findElement(By.xpath("//input[@id='to_city_bus']"));
		to_stop.sendKeys("rama");
		List<WebElement> to = driver.findElements(By.xpath("//li[@class=\"ui-menu-item\"]"));

		for (int k = 0; k <= to.size(); k++) {	
			try {
				if (to.get(k).getText().equalsIgnoreCase("Ramanathapuram")) {
					to.get(k).click();
				}
			} catch (IndexOutOfBoundsException e) {
				
			}
				
				
		}
		System.out.println("end to the stop is :"+to_stop.getAttribute("value"));
	}
}
