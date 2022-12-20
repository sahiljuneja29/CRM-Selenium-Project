package com.crm.testcases;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

//import com.aventstack.extentreports.model.Log;
import com.crm.base.BaseClass;
import com.crm.base.Page;
import com.crm.utility.TestUtil;
import com.crm.utility.WebEventListener;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	public static Properties prop;
	public static WebDriver driver;
	public static EventFiringWebDriver edriver;
	public static WebEventListener eventListener;
	public static Page page;
	//Logger log=Logger.getLogger(Log.class.getName());
	
	@BeforeSuite
	public void loadConfig() throws URISyntaxException {
		
		try {
			prop=new Properties();
			FileInputStream ip=new FileInputStream(
					System.getProperty("user.dir")+"\\src\\test\\resources\\Configuration\\config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	@BeforeClass
	@Parameters(value = {"browser"})
	public void setUp(String browser) {
		
		//String browserName=prop.getProperty("browser");
		String browserName=browser;
	
		
		if(browserName.contains("chrome")) {
			WebDriverManager.chromedriver().setup();
			// Use chromeoptions to execute the test in headless mode
//			ChromeOptions option=new ChromeOptions();
//			option.addArguments("headless");
//			driver=new ChromeDriver(option);
			driver=new ChromeDriver();
		}else if(browserName.contains("edge")) {
			WebDriverManager.edgedriver().setup();
			EdgeOptions edgeOptions =new EdgeOptions();
			  //edgeOptions.addArguments("headless");
			driver=new EdgeDriver(edgeOptions);
		}
		else if(browserName.contains("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			//Set Firefox Headless mode as TRUE
	        FirefoxOptions options = new FirefoxOptions();
	        options.setHeadless(true);
			driver=new FirefoxDriver();
		}
		
		
		
		edriver=new EventFiringWebDriver(driver);
		//Now create an object of EventListenerHandler to register it with EventFiringWebDriver
		eventListener=new WebEventListener(driver);
		edriver.register(eventListener);
		driver=edriver;
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		
		//log.info("*****************Launching the app****************");
		
		driver.get(prop.getProperty("url"));
		
		page= new BaseClass(driver);
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}


}
