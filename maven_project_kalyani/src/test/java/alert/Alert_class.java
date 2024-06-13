package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import dynamic_code.Stoared_code;

public class Alert_class extends Stoared_code{

	public static void main(String[] args) throws Throwable {
		launch_browser("chrome");
		hiturl("https://demoqa.com/alerts");
//        takesscreenshot_way1("url");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400)");
//        takesscreenshot_way1("scroll by");
        
        System.out.println("-------------------------------------------------------------");
        
        driver.findElement(By.xpath("//button[@id='alertButton']")).click();
        Alert simple_alert = driver.switchTo().alert();
        System.out.println(simple_alert.getText());
        Thread.sleep(2000);
//        takesscreenshot_way1("simplealert");
        simple_alert.accept();
        
        System.out.println("-------------------------------------------------------------");
       
		driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
		Thread.sleep(5000);
		Alert simple_timer = driver.switchTo().alert();
		System.out.println(simple_timer.getText());
		Thread.sleep(2000);
//		takesscreenshot_way1("simle_timer");
		simple_timer.accept();
		
		System.out.println("-------------------------------------------------------------");
		
		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
		Alert confirm_alert = driver.switchTo().alert();
		System.out.println(confirm_alert.getText());
		Thread.sleep(2000);
//		takesscreenshot_way1("conformation_alert");
//		confirm_alert.accept();
		confirm_alert.dismiss();
		WebElement msg = driver.findElement(By.xpath("//span[@id='confirmResult']"));
		System.out.println(msg.getText());
		
		System.out.println("-------------------------------------------------------------");
		
		driver.findElement(By.xpath("//button[@id='promtButton']")).click();
		Alert prompt_alert = driver.switchTo().alert();
		System.out.println(prompt_alert.getText());
		Thread.sleep(2000);
//		takesscreenshot_way1("without_enter_text");
		prompt_alert.sendKeys("kalyani");
//		takesscreenshot_way1("after_enter_text");
		Thread.sleep(2000);
		prompt_alert.accept();
		WebElement msg2 = driver.findElement(By.xpath("//span[@id='promptResult']"));
		System.out.println(msg2.getText());
	
	}

}
