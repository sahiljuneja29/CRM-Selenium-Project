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
	private WebElement emailAddress;
	
	@FindBy(xpath = "//input[@type='password' and @name='password']")
	private WebElement password;
	
	@FindBy(xpath = "//div[text()='Login']")
	private WebElement LoginButton;
	

	@FindBy(xpath = "//a[text()='Forgot your password?']")
	private WebElement ForgotPassword;

	@FindBy(xpath = "//a[text()='Sign Up']")
	private WebElement signup;
	
	@FindBy(xpath = "//a[text()='Classic CRM']")
	private WebElement classicCRM;
	
	
	public LoginPage() {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public HomePage Login(String uname, String pwd) {
	
		//Action.sendKeys(emailAddress, uname);
		//Action.sendKeys(password, pwd);
		//Action.click(driver, LoginButton);
		emailAddress.sendKeys(uname);
		password.sendKeys(pwd);
		LoginButton.click();
		
		return new HomePage();
		
	}
	
	
	public void forgotPassword() {
		ForgotPassword.click();
		//Action.click(driver, ForgotPassword);
		
		
	}
	

}