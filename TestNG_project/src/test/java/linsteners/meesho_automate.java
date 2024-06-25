package linsteners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import dynamic_code.Stoared_code;

@Listeners(listeners_meesho.class)
public class meesho_automate extends Stoared_code {
	
  @Test(priority = 1)
  public void Women_Ethnic() throws Throwable {
	  WebElement women = driver.findElement(By.xpath("//span[text()=\"Women Ethnic\"]"));
	  ac.moveToElement(women).build().perform();
	  System.out.println("Women_Ethnic");
	  Thread.sleep(1000);
  }
  
  @Test(priority = 2)
  public void Women_Western() throws Throwable {
	  WebElement women2 = driver.findElement(By.xpath("//span[text()=\"Women Western\"]"));
	  ac.moveToElement(women2).build().perform();
	  System.out.println("Women_Western");
	  Thread.sleep(1000);
  }
  

  @Test(priority = 3)
  public void Men() throws Throwable {
	  WebElement Men = driver.findElement(By.xpath("//span[text()=\"Men\"]"));
	  ac.moveToElement(Men).build().perform();
	  System.out.println("Men");
	  Thread.sleep(1000);
  }

  @Test(priority = 4)
  public void Kids() throws Throwable {
	  WebElement Kids = driver.findElement(By.xpath("//span[text()=\"Kids\"]"));
	  ac.moveToElement(Kids).build().perform();
	  System.out.println("Kids");
	  Thread.sleep(1000);
  }
  

  @Test(priority = 5)
  public void Home_Kitchen() throws Throwable {
	  WebElement Home_Kitchen = driver.findElement(By.xpath("//span[text()=\"Home & Kitchen\"]"));
	  ac.moveToElement(Home_Kitchen).build().perform();
	  System.out.println("Home_Kitchen");
	  Thread.sleep(1000);
  }
  

  @Test(priority = 6)
  public void Beauty_Health() throws Throwable {
	  WebElement Beauty_Health = driver.findElement(By.xpath("//span[text()=\"Beauty & Health\"]"));
	  ac.moveToElement(Beauty_Health).build().perform();
	  System.out.println("Beauty_Health");
	  Thread.sleep(1000);
  }
  

  @Test(priority = 7)
  public void Jewellery_Accessories() throws Throwable {
	  WebElement Jewellery_Accessories = driver.findElement(By.xpath("//span[text()=\"Jewellery & Accessories\"]"));
	  ac.moveToElement(Jewellery_Accessories).build().perform();
	  System.out.println("Jewellery_Accessories");
	  Thread.sleep(1000);
  }
  

  @Test(priority = 8)
  public void Bags_Footwear() throws Throwable {
	  WebElement Bags_Footwear = driver.findElement(By.xpath("//span[text()=\"Bags & Footwear\"]"));
	  ac.moveToElement(Bags_Footwear).build().perform();
	  System.out.println("Bags_Footwear");
	  Thread.sleep(1000);
  }
  

  @Test(priority = 9)
  public void Electronics() throws Throwable {
	  WebElement Electronics = driver.findElement(By.xpath("//span[text()=\"Electronics\"]"));
	  ac.moveToElement(Electronics).build().perform();
	  System.out.println("Electronics");
	  Thread.sleep(1000);
  }
  
}
