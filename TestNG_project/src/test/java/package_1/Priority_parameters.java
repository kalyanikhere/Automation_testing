package package_1;

import java.util.concurrent.PriorityBlockingQueue;

import org.testng.annotations.Test;



public class Priority_parameters {
	
  @Test(priority = 0)
  public void application() {
	  System.out.println("install application");
  }
  
  @Test(priority = 3)
  public void fuctionality() {
	  System.out.println("homepage_functionality");
  }
  
  @Test(priority = 1)
  public void fuctionality2() {
	  System.out.println("login to application");
  }
  
  @Test(priority = 2)
  public void fuctionality3() {
	  System.out.println("verification");
  }
}
