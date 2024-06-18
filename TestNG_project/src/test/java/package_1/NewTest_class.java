package package_1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest_class {
	public static WebDriver driver;	
	
  @Test
  public void f() {
	  System.out.println("browser lauched");
  }
  
  @Test
  public void s() {
	  System.out.println("url hit");
  }
  
  @Test
  public void k() {
	  System.out.println("window maximize");
  }
  @Test
  public void p() {
	  System.out.println("4 sec wait");
  }
  
//  @BeforeSuite
//  public void suite() {
//	  System.out.println("before suite");
//  }
//  
//  @BeforeTest
//  public void testing() {
//	  System.out.println("before test");
//  }
  
  @BeforeClass
  public void cla_ss() {
	  driver = new ChromeDriver();
  }
  
  @BeforeMethod
  public void method() {
	  driver.manage().window().maximize();
  }
  
  @AfterMethod
  public void method2() {
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4)); 
  }
  
 @AfterClass
 public void cla_ss2() {
	 driver.get("https://www.salesforce.com/in/");
 }
  
  @AfterTest
  public void testing2() {
	  System.out.println("after test");
  }
  
  @AfterSuite
  public void suite2() {
	  System.out.println("after suite");
  } 
}
