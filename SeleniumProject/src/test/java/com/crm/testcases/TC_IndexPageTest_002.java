package com.crm.testcases;

import org.apache.logging.log4j.core.LoggerContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.beust.jcommander.Parameter;
import com.crm.base.BaseClass;
import com.crm.pageobjects.IndexPage;

import junit.framework.Assert;

public class TC_IndexPageTest_002 extends BaseClass{
	
	
	IndexPage indexpage;
	Logger logger=Logger.getLogger(TC_IndexPageTest_002.class);
	
	@Parameters("browser")
	@BeforeClass
	public void setUp(String browser) {
		launchApp(browser);
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	 
	@Test(priority=1)
	public void verifyLogo() {
		
		indexpage=new IndexPage() ;
		boolean result=indexpage.validateLogo();
		logger.info("Validating index page logo");
		Assert.assertTrue(result);
	
	}
	//retryAnalyzer = com.crm.Analyzer.RetryAnalyzer.class
	@Test(priority=2)
	public void verifyTitle() {
		
		String title=indexpage.getCrmTitle();
		logger.info("Checking title of page:");
		Assert.assertEquals("Indexpage title not matched","#1 Free CRM software for any business with sales, support and customer relationship management",title);
	
	}
}