package com.crm.base;

import java.io.FileInputStream;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.apache.logging.log4j.*;
import org.apache.logging.log4j.core.config.ConfigurationFactory;
import org.apache.logging.log4j.core.config.Configurator;
import org.apache.logging.log4j.core.config.xml.XmlConfigurationFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.w3c.dom.DOMConfiguration;

import com.aventstack.extentreports.model.Log;

import com.crm.utility.TestUtil;
import com.crm.utility.WebEventListener;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass {
	
	//What is Log?// Capturing info/activities at the time of program execution.
	//Types of logs?
	//1. info
	//2. warn
	//3. debug
	//4. fatal
	
	public static Properties prop;
	public static WebDriver driver;
	public static EventFiringWebDriver edriver;
	public static WebEventListener eventListener;
	
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

	public static void launchApp(String browser_name) {
		
		//String browserName=prop.getProperty("browser");
		String browserName=browser_name;
		
		if(browserName.contains("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}else if(browserName.contains("edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		else if(browserName.contains("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		
		
		edriver=new EventFiringWebDriver(driver);
		//Now create an object of EventListenerHandler to register it with EventFiringWebDriver
		eventListener=new WebEventListener();
		edriver.register(eventListener);
		driver=edriver;
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		
		
		driver.get(prop.getProperty("url"));
		
	}
	
	

}