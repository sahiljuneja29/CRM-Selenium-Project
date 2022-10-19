package ComplexTestScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class SeleniumGrid {
	
	WebDriver driver;
	String baseURL="https://courses.letskodeit.com/practice";
	String nodeURL="http://192.168.1.5:4444/wd/hub";
	String url="https://courses.letskodeit.com/practice";
	
//	@BeforeTest
//	public void gridSetup() throws MalformedURLException {
//		
//		//driver=new ChromeDriver();
//		//DesiredCapabilites is used to set the type of browser and OS that we will automate
//		//RemoteWebDriver is used to set which node (or machine) that our test will run against.
//		
//		DesiredCapabilities capability= DesiredCapabilities.chrome();
//		//capability.setBrowserName("chrome");
//		capability.setPlatform(Platform.ANY);
//		driver = new RemoteWebDriver(new URL(nodeURL),capability);
//		
//		
//	}
	@Test
	public void simpleTest() throws MalformedURLException {

		
		{
			DesiredCapabilities capability= DesiredCapabilities.chrome();
			//capability.setBrowserName("chrome");
			capability.setPlatform(Platform.ANY);
			driver = new RemoteWebDriver(new URL(nodeURL),capability);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get(url);
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath("//*[@id=\"bmwcheck\"]")).click();
			
			WebElement is=driver.findElement(By.xpath("//*[@id=\"bmwcheck\"]"));
			if(is.isEnabled())
				System.out.println("element is enabled");
			
			if(is.isDisplayed())
				System.out.println("element is displayed");
			
			if(is.isSelected())
				System.out.println("element is selected");
		}
		
	}
	
//	@Test
//	public void simpleTest2() throws MalformedURLException {
//		
//		{
//			DesiredCapabilities capability= DesiredCapabilities.edge();
//			//capability.setBrowserName("MicrosoftEdge");
//			//capability.setVersion("96.0");
//			capability.setPlatform(Platform.ANY);
//			driver = new RemoteWebDriver(new URL(nodeURL),capability);
//			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//			driver.get(url);
//			driver.manage().window().maximize();
//			
//			driver.findElement(By.xpath("//*[@id=\"bmwcheck\"]")).click();
//			
//			WebElement is=driver.findElement(By.xpath("//*[@id=\"bmwcheck\"]"));
//			if(is.isEnabled())
//				System.out.println("element is enabled");
//			
//			if(is.isDisplayed())
//				System.out.println("element is displayed");
//			
//			if(is.isSelected())
//				System.out.println("element is selected");
//		}
//		
//	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}