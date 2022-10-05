package com.crm.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.base.BaseClass;
import com.src.ActionDriver.Action;

public class SignUpPage extends BaseClass{
	

	@FindBy(xpath ="//p[text()='For Security you must verify your Email']")
	WebElement signupHeader;
	
	@FindBy(xpath = "//input[@name='email']")
	WebElement emailAddress;
	
	@FindBy(xpath = "//input[@name='phone']")
	WebElement phoneNumber;
	
	@FindBy(xpath = "//input[@name='terms' and @type='checkbox']")
	WebElement terms_conditions;
	
	@FindBy(xpath = "//div[@class='recaptcha-checkbox-spinner']")
	WebElement captcha;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement signUpButton;
	
	//Initialize the page objects
	public SignUpPage() {
		PageFactory.initElements(driver, this);
	}
	
	public HomePage signUp(String email,String phoneNo) throws InterruptedException {
		
		Action.sendKeys(emailAddress, email);
		Action.sendKeys(phoneNumber, phoneNo);
		Action.click(driver, terms_conditions);
		Thread.sleep(4000);
		//Action.click(driver, captcha);
		
		Action.click(driver, signUpButton);
		return new HomePage();	
	}
	
	public String getSignUpPageTitle() {
		return driver.getTitle();
	}
	
	
	
}
