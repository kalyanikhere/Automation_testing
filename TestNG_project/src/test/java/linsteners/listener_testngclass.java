package linsteners;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listener_normalclass.class)
public class listener_testngclass extends Listener_normalclass{
  @Test
  public void d() {
	  System.out.println("method d");
  }
  
  @Test
  public void k() {
	  System.out.println("method k");
  }
  
  @Test
  public void h() {
	  System.out.println("method h");
  }
  
  @Test
  public void p() {
	  System.out.println("method p");
  }
}
