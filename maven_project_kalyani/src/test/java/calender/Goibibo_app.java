package calender;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import dynamic_code.Stoared_code;

public class Goibibo_app extends Stoared_code {

	public static void main(String[] args) throws Throwable {
		 
	launch_browser("chrome");
	hiturl("https://www.goibibo.com/");
	Thread.sleep(3000);
	
	WebElement calender = driver.findElement(By.xpath("(//div[@class='sc-12foipm-2 eTBlJr fswFld '])[3]"));
	calender.click();
	Thread.sleep(2000);
	
//	int date = 6;
	while(true) {
		String month_year = driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[1]")).getText();
		System.out.println("the current month and year is :"+month_year);
		if(!(month_year.contains("October 2024"))) {
			driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
		}else {			
			break;		
			}
		
	}
//	driver.findElement(By.xpath("(//p[text()='"+date+"'])[1]")).click();
	driver.findElement(By.xpath("(//p[text()=\"6\"])[1]")).click();
	System.out.println("the date is selected :"+calender.getText());

	}

}
