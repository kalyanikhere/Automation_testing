package automate_webapplication;

import dynamic_code.Javascriptexecutor;

public class Javascriptexecuter_1 extends Javascriptexecutor{

	public static void main(String[] args) throws Throwable {
		launch_browser("chrome");
		hiturl("https://www.jeevansathi.com/");
		Thread.sleep(1000);
		scroll(0, 2000);
//		Thread.sleep(1000);
//		scrollheight();
//		Thread.sleep(1000);
//		refresh();
//		Thread.sleep(1000);
//		back();
//		Thread.sleep(1000);
//		forword();
//		Thread.sleep(1000);
//		driver.close();

	}

}
