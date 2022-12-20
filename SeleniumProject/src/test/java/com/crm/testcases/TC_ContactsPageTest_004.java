package com.crm.testcases;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

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
	public void validateCreateNewContactTest(String fname,String lname,String email,String category) throws InterruptedException {
		
		//log.info("**************Clicking the new contact button*************");
		contactpage=homepage.clickContactButton();
		contactpage.clickNewContactButton();
		Thread.sleep(2000);
		String status="Active";
		contactpage.createNewContact(fname,lname,email,category,status);
		
	}
	
	@Test(priority=3)
	public  void validateAccessButton() throws InterruptedException {
		
		contactpage=homepage.clickContactButton();
		contactpage.clickNewContactButton();
		Thread.sleep(2000);
		List<String> actual=contactpage.verifyAccessButton();
		List<String> expected=new ArrayList<String>();
		expected.add("rgba(255, 255, 255, 1)");
		expected.add("Private");
		Assert.assertEquals(actual, expected);
	}
	
	@Test(priority=4)
	public void validateAccessSearchBar() {
		Boolean actual=contactpage.verifyAccessSearchBar();
		Boolean expected=true;
		Assert.assertEquals(actual,expected);
	}
	
	@Test(priority=5)
	public void validateStatusDropdownList() {
		List<String> expected=new ArrayList<String>();
		expected.add("New");
		expected.add("Active");
		expected.add("Inactive");
		expected.add("On Hold");
		expected.add("Terminated");
		expected.add("Hot");
		
		Assert.assertEquals(contactpage.getStatus(), expected);
	}
	

}