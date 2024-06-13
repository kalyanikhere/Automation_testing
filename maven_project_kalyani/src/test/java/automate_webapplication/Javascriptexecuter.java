package automate_webapplication;

import org.openqa.selenium.JavascriptExecutor;

import dynamic_code.Stoared_code;

public class Javascriptexecuter extends Stoared_code{

	public static void main(String[] args) throws Throwable  {

     launch_browser("firefox");
     takesscreenshot_way1("browser");
     
     Thread.sleep(2000);
     
     hiturl("https://www.jeevansathi.com/");
     takesscreenshot_way2("homepage");
     
      JavascriptExecutor js = (JavascriptExecutor) driver;
      js.executeScript("window.scrollBy(0,3000) ");
      takesscreenshot_way1("scroll");
      Thread.sleep(2000);
           
      js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
      takesscreenshot_way1("scroll_bottom");
      Thread.sleep(2000);
      
      js.executeScript("window.history.go(0)");
      takesscreenshot_way1("refresh");
      Thread.sleep(2000);
      
      js.executeScript("window.history.back()");
      takesscreenshot_way1("backward");
      Thread.sleep(2000);
      
      js.executeScript("window.history.forward()");
      takesscreenshot_way1("forward");
      Thread.sleep(2000);
      
      driver.close();
	}

}
