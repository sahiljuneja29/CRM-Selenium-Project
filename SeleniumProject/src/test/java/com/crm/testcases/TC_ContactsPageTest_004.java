package com.crm.testcases;

import java.io.IOException;
import java.util.logging.Logger;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.model.Log;
import com.crm.base.BaseClass;
import com.crm.pageobjects.ContactsPage;
import com.crm.pageobjects.HomePage;
import com.crm.pageobjects.IndexPage;
import com.crm.pageobjects.LoginPage;
import com.crm.utility.TestUtil;

public class TC_ContactsPageTest_004 extends BaseTest {
	
	IndexPage indexpage;
	LoginPage loginpage;
	HomePage homepage;
	ContactsPage contactpage;
	
	
	
	
	@Test(priority=1)
	public void NavigateToContactPage() throws InterruptedException {
		
		Thread.sleep(3000);
		indexpage=new IndexPage();
		loginpage=indexpage.clickLogin();
		contactpage=new ContactsPage();
		homepage=loginpage.Login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	
	
//	@Test(priority=1)
//	public void verifyContactCreation() throws InterruptedException {
//		
//		contactpage=homepage.clickContactButton();
//		
//	}
//	
	
	@DataProvider
	public Object[][] getTestData() throws IOException {
		Object data[][]=TestUtil.readExcel();
		return data;
	}
	
	
	@Test(priority=2,dataProvider = "getTestData")
	public void validateCreateNewContactTest(String fname,String lname,String email,String category,String status) throws InterruptedException {
		
		log.info("**************Clicking the new contact button*************");
		contactpage=homepage.clickContactButton();
		contactpage.clickNewContactButton();
		Thread.sleep(2000);
		contactpage.createNewContact(fname,lname,email,category,status);
		
	}
	
	
	

}