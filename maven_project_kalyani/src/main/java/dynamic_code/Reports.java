package dynamic_code;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Reports {

	public static WebDriver driver;
	static String projectpath = System.getProperty("user.dir");
	public static ExtentTest test;
	public static ExtentReports er;
    
	 public static void extentreport(String app, String document_title, String report_name) {
			
			ExtentSparkReporter esr = new ExtentSparkReporter(projectpath +"\\reports\\report_1");
			esr.config().setDocumentTitle(document_title);
			esr.config().setReportName(report_name);
			esr.config().setTheme(Theme.STANDARD);
//			esr.config().setTheme(Theme.DARK);
			
			er = new ExtentReports();
			er.attachReporter(esr);
			er.setSystemInfo("operating system", "windows");
		    er.setSystemInfo("browser", "chrome");
		    er.setSystemInfo("tester", "kalyani");
		    er.setSystemInfo("application_site", app);
		    
		}
		    
		    public static void testcase(String testcase_name,String testinfo) {
			test = er.createTest(testcase_name);
			test.log(Status.INFO, testinfo);
					
		}
		    
		    public static void addscreencapture(String screenshot_name) {
		    	test.addScreenCaptureFromPath(projectpath+"\\report_ss\\"+screenshot_name+".png");
		    }

	public static void browser_launch(String browser) throws Throwable {
			
			if (browser.equalsIgnoreCase("chrome")) {
				driver = new ChromeDriver();

			} else if (browser.equalsIgnoreCase("edge")) {
				driver = new EdgeDriver();

			} else if (browser.equalsIgnoreCase("firefox")) {
				
			    driver = new FirefoxDriver();
		    }
			System.out.println("the browser launched is : "+ browser);
		
			driver.manage().window().maximize();	
		       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	}
		    
		       public static void hiturl(String url) {
		    	   driver.get(url);
					System.out.println(driver.getTitle());
		       }
			
		   					   	
			
	public static void takesscreenshot_way2(String screenshot2) throws Throwable {
		TakesScreenshot  ts2 = (TakesScreenshot) driver;
		File source2 = ts2.getScreenshotAs(OutputType.FILE);
		File target2 = new File (projectpath + "\\linkedin_ss\\" + screenshot2 + ".png");
	    FileHandler.copy(source2, target2);
	}

	 }
