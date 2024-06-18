package TestNG_001;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  System.out.println( "1St test");
	  
  }
  @Test
  public void h() {
	  System.out.println("2nd test");
  }
  @BeforeSuite
  public void a () {
	  System.out.println("Before suit");
	  
  }
  @BeforeTest
  public void b() {
	  System.out.println("Before Test");
  }
  @BeforeClass
  public void c() {
	  System.out.println("Before Class");
  }

  @BeforeMethod
  public void d() {
	System.out.println("Before Method");  
  }
  @AfterMethod
  public void e() {
	  System.out.println("After Method");
  }
  @AfterClass
  public void g() {
	  System.out.println("After Class");
  }
  @AfterTest
  public void i() {
	  System.out.println("After Test");
  }
@AfterSuite
public void j() {
	  System.out.println("After Suit");
}
}
