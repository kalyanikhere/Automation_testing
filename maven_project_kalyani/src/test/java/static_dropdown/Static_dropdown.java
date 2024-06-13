package static_dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import dynamic_code.Stoared_code;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Static_dropdown extends Stoared_code{

	public static void main(String[] args) {
		launch_browser("chrome");
		hiturl("https://www.jeevansathi.com/m0/register/customreg/15?source=SH_Bra_ROC&sh1");
		
		WebElement profile = driver.findElement(By.cssSelector("select#reg_relationship"));
		profile.click();
		
		Select sc = new Select(profile);
		System.out.println(sc.isMultiple());
		sc.selectByVisibleText("Son");
				
		WebElement height = driver.findElement(By.cssSelector("select[name=\"reg[height]\"]"));		
		Select sc1 = new Select(height);
		sc1.selectByValue("13");
		
		WebElement marrital_status = driver.findElement(By.cssSelector("select[name=\"reg[mstatus]\"]"));						
		Select sc2= new Select(marrital_status);
		sc2.selectByIndex(1);
		
		driver.findElement(By.xpath("(//a[@class='chzn-single chzn-default'])[1]")).click();
		 List<WebElement> options = driver.findElements(By.xpath("//ul[@class=\"chzn-results\"]//child::li"));
	   System.out.println(options.size());
	   
	   for(int a=0; a<=options.size();a++ ) {
		   if(options.get(a).getText().equalsIgnoreCase("hindu")) {
			   options.get(a).click();
		   }
	   }
		
	    driver.findElement(By.xpath("//div[@id=\"reg_city_res_chzn\"]")).click();
	  List<WebElement> city_options = driver.findElements(By.xpath("//li[@class=\"active-result group-option\"]"));
		System.out.println(city_options.size());
		
		for(int k =0; k<city_options.size();k++) {
			try {
				if(city_options.get(k).getText().contains("Bangalore")) {
					city_options.get(k).click();
			}
			} catch (NullPointerException e) {
				
			}
			
		}
			
				
						

	}

}
