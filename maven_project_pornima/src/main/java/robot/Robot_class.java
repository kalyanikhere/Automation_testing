package robot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Robot_class {
        
	public static void launch_browser(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
		 WebDriver driver = new ChromeDriver();
		
	}else if(browser.equalsIgnoreCase("edge")){
		
	}

		
	
		}
		
		
	

}
