package linsteners;

import org.openqa.selenium.interactions.Actions;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import dynamic_code.Stoared_code;

public class listeners_meesho extends Stoared_code implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
	    ac = new Actions(driver);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		try {
			takesscreenshot_way1(result.getMethod().getMethodName());
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestFailure(ITestResult result) {
		try {
			takesscreenshot_way2(result.getMethod().getMethodName());
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("the test is skipped");
	}

	@Override
	public void onStart(ITestContext context) {
		launch_browser("chrome");
		hiturl("https://www.meesho.com/");
		
	}

	@Override
	public void onFinish(ITestContext context) {
		driver.close();
	}

	

}
