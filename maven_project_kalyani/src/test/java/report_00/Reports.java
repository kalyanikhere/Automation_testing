 package report_00;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import dynamic_code.Stoared_code;

public class Reports extends Stoared_code {

	public static void main(String[] args) throws Throwable {

		String projectpath = System.getProperty("user.dir");
		System.out.println(projectpath);

		ExtentSparkReporter ex = new ExtentSparkReporter(projectpath + "\\reports_1\\ main_report");
		ex.config().setDocumentTitle("document1");
		ex.config().setReportName("report_name");
		ex.config().setTheme(Theme.STANDARD);

		ExtentReports er = new ExtentReports();
		er.attachReporter(ex);

		er.setSystemInfo("operating system", "windows");
		er.setSystemInfo("browser", "chrome");
		er.setSystemInfo("tester", "kalyani");
		er.setSystemInfo("e_comerce_site", "flipkart");

		ExtentTest et = er.createTest("search_flipkart");
		et.log(Status.INFO, "find_search_webelement");

		ExtentTest et1 = er.createTest("click search");
		et.log(Status.INFO, "click_search_webelement");

		ExtentTest et2 = er.createTest("search mobiles");
		et.log(Status.INFO, "sendkeys in search field");

		launch_browser("chrome");
		hiturl("https://www.flipkart.com/");

		WebElement search = driver.findElement(By.xpath("//input[@class='Pke_EE']"));
		search.click();
		search.sendKeys("mobiles");
		takesscreenshot_way1("search mobiles");
		et2.addScreenCaptureFromPath(projectpath + "\\flipkart_ss\\search mobiles.png");
		er.flush();

	}

}
