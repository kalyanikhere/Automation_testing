package package_1;

import org.testng.annotations.Test;

public class groups_parameter {
  @Test (groups = {"high"})
  public void test() {
	  System.out.println("login to app");
  }
  
  @Test (groups = {"low"})
  public void test2() {
	  System.out.println("check the colour of login button by using invalid colour");
  }
  
  @Test(groups = {"medium"})
  public void test3() {
	  System.out.println("search the product");
  }
  
  @Test(groups = {"medium"})
  public void test4() {
	  System.out.println("click on searched product");
  }
  
  @Test(groups = {"high"})
  public void test5() {
	  System.out.println("logout the app");
  }
  
  @Test (groups = {"low"})
  public void test6() {
	  System.out.println("select the colour of product");
  }
  
  @Test(groups = {"medium"})
  public void test7() {
	  System.out.println("buy the product");
  }
  
  @Test(groups = {"medium"})
  public void test8() {
	  System.out.println("add to cart the product");
  }
}
