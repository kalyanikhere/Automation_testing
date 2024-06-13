package static_dropdown;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Practice_dropdown {

	
	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File ("./dropdown/homepage.png");
		FileHandler.copy(source, target);
			
		WebElement product = driver.findElement(By.cssSelector("select#first"));
		Select sc = new Select(product);
		sc.selectByValue("Apple");
		
		WebElement animals = driver.findElement(By.cssSelector("select#animals"));		
		Select sc1 = new Select(animals);
		sc1.selectByVisibleText("Baby Cat");
		
		TakesScreenshot ts1 = (TakesScreenshot) driver;
		File source1 = ts1.getScreenshotAs(OutputType.FILE);
		File target1 = new File ("./dropdown/entered_values.png");
		FileHandler.copy(source1, target1);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,-40)");
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		
		js.executeScript("window.history.go(0)");
		Thread.sleep(2000);
		
		js.executeScript("window.history.back()");
		Thread.sleep(2000);
		
		js.executeScript("window.history.forward(0)");
		Thread.sleep(2000);
		
		driver.close();
		
	
		
	}

	
}
