package calender;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import dynamic_code.Stoared_code;

public class Calender_01 extends Stoared_code {

	public static void main(String[] args) throws Throwable {
		launch_browser("chrome");
		hiturl("https://www.railyatri.in/");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		WebElement calender = driver.findElement(By.xpath("//input[@id='datepicker_train']"));
		calender.click();

//		we use while loop because
//      int date = 4;
		while (true) {
			String month_year = driver.findElement(By.xpath("(//th[@class='datepicker-switch'])[1]")).getText();
			System.out.println("current month and year is :" + month_year);
			if (!(month_year.contains("September 2024"))) {
				driver.findElement(By.xpath("(//th[@class='next'])[1]")).click();
			} else {				
				break;
			}
			 
		}
//		 driver.findElement(By.xpath("//td[text()='"+date+"']")).click();
		driver.findElement(By.xpath("//td[text()='12']")).click();
		System.out.println("date is selected is :" + calender.getAttribute("value"));
	}

}
