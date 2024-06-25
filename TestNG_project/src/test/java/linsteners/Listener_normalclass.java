package linsteners;


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import dynamic_code.Stoared_code;


public class Listener_normalclass implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {		
		System.out.println("on test start");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("on test suceess");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("on test failure");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("on start");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("on finish");
	}

	
	
}
