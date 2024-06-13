package automate_webapplication;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Takesscreenshot_interface {

	public static void main(String[] args) throws Throwable  {
		
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	
//	1st screenshot
	driver.get("https://www.flipkart.com/");
		
    TakesScreenshot ts = (TakesScreenshot) driver;
    File source = ts.getScreenshotAs(OutputType.FILE);    
//    1st way of specifying path of folder    
    File target = new File("./screenshot/flipkart_application.png");    
    FileHandler.copy(source, target);
    
//  2nd screenshot
    
    WebElement search = driver.findElement(By.cssSelector("input[class=\"Pke_EE\"]"));
    search.click();
    search.sendKeys("mobiles");
    
    TakesScreenshot ts1 =(TakesScreenshot) driver;
    File source1 = ts1.getScreenshotAs(OutputType.FILE);
//    2nd way of specifying path of folder
    String projectpath = System.getProperty("user.dir");
    System.out.println(projectpath);
    File target1 = new File (projectpath + "\\screenshot\\search_term.png");
    FileHandler.copy(source1, target1);
    
//	3rd screenshot
        
    driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
    
    TakesScreenshot ts2 = (TakesScreenshot) driver;
    File source2 = ts2.getScreenshotAs(OutputType.FILE);
    File target2 = new File ("./screenshot/search_value.png");
    FileHandler.copy(source2, target2); 

//	4th screenshot
    driver.findElement(By.className("_9Wy27C")).click();
    
    TakesScreenshot ts3 = (TakesScreenshot) driver;
    File source3 = ts3.getScreenshotAs(OutputType.FILE);
    System.getProperty(projectpath);
    String projectpath2 = System.getProperty(projectpath);
    File target3 = new File (projectpath +"\\screenshot\\add_toCart.png");
    FileHandler.copy(source3, target3);
    
    Thread.sleep(3000);
    driver.navigate().back();
    Thread.sleep(3000);
    
//	5th screenshot
    driver.findElement(By.xpath("(//span[text()=\"Become a Seller\"]) [1]")).click();
    TakesScreenshot ts4 = (TakesScreenshot) driver;
    File source4 = ts2.getScreenshotAs(OutputType.FILE);
    File target4 = new File ("./screenshot/become_a_seller.png");
    FileHandler.copy(source4, target4);
    
    driver.navigate().back();
    driver.navigate().back();
    driver.close();
    
    

    
	}

}
