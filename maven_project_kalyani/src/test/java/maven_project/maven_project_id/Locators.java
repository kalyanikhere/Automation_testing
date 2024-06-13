package maven_project.maven_project_id;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.mahametro.org/");

//      Id () locator from MahaMetro application
		driver.findElement(By.id("main-slider"));
		driver.findElement(By.id("footer"));

//     Name () locator from amazon application
		driver.findElement(By.name("twitter:card"));
		driver.findElement(By.name("twitter:site:id"));

//     className () from  MahaMetro application
		driver.findElement(By.className("no-margin"));
		driver.findElement(By.className("carousel slide"));

//  LinkText () from  amazon application
		driver.findElement(By.linkText("Customer Service"));
		driver.findElement(By.linkText("Beauty & Personal Care"));

//  PartialLinkText () from  amazon application
		driver.findElement(By.partialLinkText("Customer S"));
		driver.findElement(By.partialLinkText("Beauty &"));

//  Tagname from  MahaMetro application
		driver.findElements(By.tagName("div"));
		driver.findElements(By.tagName("link"));

//  css - cascading style sheet from  amazon application
//    different combinations

//   1) (Tagname and id values -- Tagname#id values) 
		driver.findElement(By.cssSelector("div#div"));
		driver.findElement(By.cssSelector("div#a-popover-root"));

//   2) (TagName and className -- TagName.ClassName) from  amazon application
		driver.findElement(By.cssSelector("body.homepage"));
		driver.findElement(By.cssSelector("style.vjs-styles-dimensions"));

//   3) (TagName and attribute -- TagName[attribute = "value of attribute"] ) from  flipkart application
		driver.findElement(By.cssSelector("style[id=\"react-native-stylesheet\"]"));
		driver.findElement(By.cssSelector("div[id=\"portal--container\"]"));

//   4) (TagName and multiple attribute -- TagName[attribute1 = "value of attribute1"] [attribute2 = "value of attribute2"] ) () from  flipkart application
		driver.findElement(
				By.cssSelector("script[id=\"__LOADABLE_REQUIRED_CHUNKS___ext\"][type=\"application/json\"]"));
		driver.findElement(By.cssSelector("meta[name=\"Keywords\"][content=\"Online Shopping in India,"
				+ "online Shopping store,Online Shopping Site,Buy Online,"
				+ "Shop Online,Online Shopping,Flipkart\"]"));

//   5) contains  ( TagName[attribute*= "value of attribute"] )from  instagram application
//     this is original value 
		driver.findElement(By.cssSelector("main[class*=\"xvbhtw8 x78zum5 xdt5ytf x1iyjqo2 x182iqb8\"]"));
//    contains
		driver.findElement(By.cssSelector("main[class*=\"xvbhtw8 \"]"));
		driver.findElement(By.cssSelector("main[class*=\"x\"]"));

//   6) startswith ( TagName[attribute^= "value of attribute"] )from  instagram application
//   this is original value
		driver.findElement(By.cssSelector("form[id^=\"loginForm\"]"));
//    starts with
		driver.findElement(By.cssSelector("form[id^=\"login\"]"));
		driver.findElement(By.cssSelector("form[id^=\"l\"]"));

//   7) endswith ( TagName[attribute$= "value of attribute"] )from MahaMetro application
//  this is original value
		driver.findElement(By.cssSelector("meta[name$=\"theme-color\"]"));
//   ends with
		driver.findElement(By.cssSelector("meta[name$=\"color\"]"));
		driver.findElement(By.cssSelector("meta[name$=\"e-color\"]"));

//   8) psuedo class from shaadi.com

//   first-child
//   syntax: tagname[attribute="attribute value"] :first-child
		driver.findElement(By.cssSelector("div[class=\"Dropdown-menu\"] :first-child"));

//   last-child
//   syntax: tagname[attribute="attribute value"] :last-child    
		driver.findElement(By.cssSelector("div[class=\"Dropdown-menu\"] :last-child"));

//   nth-child
//   syntax: tagname[attribute="attribute value"] :nth-child(n) 
		driver.findElement(By.cssSelector("div[class=\"Dropdown-menu\"] :nth-child(4)"));

//   nth-last-child
//   syntax: tagname[attribute="attribute value"] :nth-last-child(n) 
		driver.findElement(By.cssSelector("div[class=\"Dropdown-menu\"] :nth-last-child(2)"));

//     Xpath from shadi.com
		
//   two types absolute and relative Xpath

//   absolute Xpath: eg:-/html/body/div[1]/div[8]/div/div[3]/div[2]/a
//   generally we dont prefer this path

//   relative
//   syntax : //tagname[@attribute='attribute value']
		driver.findElements(By.xpath("//div[@class=\"Footer_sRedLogo__1us9y\"]"));

//   differnt combination of Xpath

//   1) tagname and attribute
//   syntax : //tagname[@attribute='attribute value']
		driver.findElement(By.xpath("//div[@class=\"Footer_sRedLogo__1us9y\"]"));

//   1) tagname and multiple attribute
//   syntax : //tagname[@attribute1='attribute value'][@attribute2='attribute value']
		driver.findElement(By.xpath("//a[@id=\"shaadiHelpLink\"][@class=\"common_help__1NOqB css-ny049c\"]"));

//   and operator
//   syntax : //tagname[@attribute1='attribute value'and@attribute2='attribute value']
//   both value of attribute is true then we use it
		driver.findElement(By.xpath("//a[@id=\"shaadiHelpLink\"and@class=\"common_help__1NOqB css-ny049c\"]"));

//   or operator
//   when one of the value of attribute is true then we use it
//   syntax : //tagname[@attribute1='attribute value'or@attribute2='attribute value']
		driver.findElement(By.xpath("//a[@id=\"shaadiHelpLink\"or@id=\"shaadiHelpArrow\"]"));

//   contains
//   syntax : //tagname[contain(@attribute,'attribute value')]
//   eg :-//h1[contains(@class,"common_headline__3GyDZ")]
		driver.findElement(By.xpath("//h1[contains(@class,\"_headline__\")]"));

//   starts with
//   syntax : //tagname[starts-with(@attribute,'attribute value')]
//   eg :-//h1[starts-with(@class,"common_headline__3GyDZ")]
		driver.findElement(By.xpath("//h1[starts-with(@class,\"common\")]"));

//   text without index
//   syntax : //tagname[text()= "text value"]
		driver.findElement(By.xpath("//a[text()=\"All Communities\"]"));
		
//   text with index
//	 syntax : (//tagname[text()= "text value"])[index no]
		driver.findElement(By.xpath("(//a[text()=\"More Matrimonials\"])[2]"));
		
		
//	parent and child relation from flipkart
//		syntax: //parent tagname[@parent attribute='attribute value']//child tagname[@child attribute='attribute value']
		driver.findElement(By.xpath("//div[@class='_2SmNnR']//input[@class='Pke_EE']"));
		
//		self node
//		generally we dont use it
//		syntax: //tagname[@attribute='attribute value']//self::current tagname
		driver.findElement(By.xpath("//input[@class='Pke_EE']//self::input"));	
		
//		select parent of current element/node
//		syntax: //child tagname[@child attribute=' value']//parent::parent tagname
		driver.findElement(By.xpath("//input[@class='Pke_EE']//parent::div"));	
		
//		select child element/node
//		syntax: //parent tagname[@parent attribute=' value']//child::child attribute
//		we can also use index here if we dont gat 1/1 match to find perticular index
//		syntax: //parent tagname[@parent attribute=' value']//child::child attribute[index]
		driver.findElement(By.xpath("//div[@class='_2SmNnR']//child::input"));		
		
		
		
		
		
	}

}
