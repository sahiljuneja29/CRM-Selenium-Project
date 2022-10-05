package com.crm.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.base.BaseClass;
import com.src.ActionDriver.Action;

public class LoginPage extends BaseClass{
	

	@FindBy(xpath = "//input[@type='text' and @name='email']")
	@CacheLookup
	WebElement emailAddress;
	
	@FindBy(xpath = "//input[@type='password' and @name='password']")
	WebElement password;
	
	@FindBy(xpath = "//div[text()='Login']")
	WebElement LoginButton;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public HomePage Login(String uname, String pwd) {
	
		Action.sendKeys(emailAddress, uname);
		Action.sendKeys(password, pwd);
		Action.click(driver, LoginButton);
		
		return new HomePage();
		
	}
	
	public String getLoginPageTitle() {
		return driver.getTitle();
	}
	

}