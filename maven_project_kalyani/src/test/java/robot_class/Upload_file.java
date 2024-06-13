package robot_class;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;

import dynamic_code.Stoared_code;

public class Upload_file extends Stoared_code {

	public static void main(String[] args) throws Throwable {

		launch_browser("chrome");
		hiturl("https://smallpdf.com/pdf-to-word");

		driver.findElement(By.xpath("//span[text()=\"Choose Files\"]")).click();

		StringSelection ss = new StringSelection("\"C:\\Users\\kalya\\Downloads\\DT20234862044_Application.pdf\"");

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		Robot robo = new Robot();
        robo.delay(2000);
		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_V);

		robo.keyRelease(KeyEvent.VK_CONTROL);
		robo.keyRelease(KeyEvent.VK_V);
   	    robo.delay(2000);
   	    
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);

	}

}
