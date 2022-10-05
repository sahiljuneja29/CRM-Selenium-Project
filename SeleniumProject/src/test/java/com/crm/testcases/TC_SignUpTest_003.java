package com.crm.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.crm.base.BaseClass;
import com.crm.pageobjects.HomePage;
import com.crm.pageobjects.IndexPage;
import com.crm.pageobjects.SignUpPage;

import junit.framework.Assert;

public class TC_SignUpTest_003 extends BaseClass {
	

	IndexPage indexpage;
	SignUpPage signup;
	HomePage homepage;
	
	
	@Parameters("browser")
	@BeforeClass
	public void setUp(String browser) {
		launchApp(browser);
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

	@Test(priority=2)
	public void verifysignUpTest() throws InterruptedException {
		
		homepage=signup.signUp("juneja.sahil2@gmail.com", "8375099046");
		
	}
	
	@Test(priority=1)
	public void verifySignupPageTitleTest() throws InterruptedException {
		
		Thread.sleep(4000);
		indexpage=new IndexPage();
		signup=indexpage.clickSignUp();
		String title=signup.getSignUpPageTitle();
		Assert.assertEquals("SignUpPage title not matched","Cogmento CRM",title);
	
	}
}

