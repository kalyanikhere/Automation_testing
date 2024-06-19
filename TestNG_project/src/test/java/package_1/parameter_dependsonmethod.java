package package_1;

import org.testng.annotations.Test;

public class parameter_dependsonmethod {
	
  @Test(dependsOnMethods = "from_station")
  public void to_station() {
	  System.out.println("to_station");
	  }
	
  @Test
  public void launch_browser() {
	  System.out.println("browser_launched");
  }
  
  @Test(dependsOnMethods = "hiturl")
  public void from_station() {
	  System.out.println("from_station");
  }
  
  @Test(dependsOnMethods = "launch_browser")
  public void hiturl() {
	  System.out.println("hiturl");
  }
  
  @Test(priority = 5)
  public void search() {
	  System.out.println("search");
  }
}
