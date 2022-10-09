package com.crm.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.crm.base.BaseClass;
import com.crm.pageobjects.IndexPage;

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
		Assert.assertEquals(title,"Free CRM software for customer relationship management India","Indexpage title not matched");
		
	
	}
}