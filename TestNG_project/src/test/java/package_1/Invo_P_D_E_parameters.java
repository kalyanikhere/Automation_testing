package package_1;

import org.testng.annotations.Test;

public class Invo_P_D_E_parameters {
  @Test(priority = 1,invocationCount = 3)
  public void student_name() {
	  System.out.println("all names");
  }
  
  @Test(description = "all students got good marks")
  public void marks() {
	  System.out.println("marks in every subject");
  }
  
  @Test(enabled = false)
  public void percentage() {
	  System.out.println("total percentage");
  }
  
  @Test(invocationCount = 4,priority = 2)
  public void subjects() {
	  System.out.println("total subject they have");
  }
}
