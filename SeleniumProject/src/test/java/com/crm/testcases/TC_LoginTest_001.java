package com.crm.testcases;

import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.crm.base.BaseClass;
import com.crm.pageobjects.HomePage;
import com.crm.pageobjects.IndexPage;
import com.crm.pageobjects.LoginPage;

import junit.framework.Assert;

public class TC_LoginTest_001 extends BaseTest{
	
	IndexPage indexpage;
	LoginPage loginpage;
	HomePage homepage;
	
//	
//	@Parameters("browser")
//	@BeforeClass
//	public void setUp(String browser) {
//		launchApp(browser);
//	}
//	
//	@AfterClass
//	public void tearDown() {
//		driver.quit();
//	}
	
	@Test(priority=2)
	public void verifyLogin() throws InterruptedException {
		
		Thread.sleep(1000);
		homepage=loginpage.Login(prop.getProperty("username"), prop.getProperty("password"));
		boolean homepagelogo=homepage.validateLogo();
		Assert.assertTrue(homepagelogo);
		
		
	}
	
	@Test(priority=1)
	public void verifyLoginPagteTitle() throws InterruptedException {
		
		Thread.sleep(3000);
		indexpage=new IndexPage();
		loginpage=indexpage.clickLogin();
		String actualtitle=loginpage.getPageTitle();
		System.out.println(actualtitle);
		Assert.assertEquals("LoginPage title not matched","Cogmento CRM",actualtitle);
		
			
	}
	
	

}