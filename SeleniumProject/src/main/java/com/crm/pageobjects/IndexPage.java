package com.crm.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.base.BaseClass;
import com.src.ActionDriver.Action;
	
public class IndexPage extends BaseClass{
	
	@FindBy(linkText = "Login")
	WebElement LoginButton;
	
	@FindBy(linkText = "Sign Up")
	WebElement SignUpButton;
	
	@FindBy(linkText = "Contact Us")
	WebElement ContactUsButton;
	
	@FindBy(linkText = "Pricing")
	WebElement PricingButton;
	
	@FindBy(linkText = "Features")
	WebElement FeaturesButton;
	
	
	@FindBy(xpath = "//img[@class='img-responsive' and @alt='free crm logo']")
	WebElement crmLogo;
	
	//Initialize the page objects
	public IndexPage() {
		PageFactory.initElements(driver, this);
	}
	
	public LoginPage clickLogin() {
		Action.click(driver, LoginButton);
		return new LoginPage();
	}
	
	public SignUpPage clickSignUp() {
		Action.click(driver, SignUpButton);
		return new SignUpPage();
	}
	

	public PricingPage clickPricing() {
		Action.click(driver, PricingButton);
		return new PricingPage();
	}
	
	public FeaturesPage clickFeatures() {
		Action.click(driver, FeaturesButton);
		return new FeaturesPage();
	}
	
	public boolean validateLogo() {
		return Action.isDisplayed(driver, crmLogo);
	}
	
	public String getCrmTitle() {
		return driver.getTitle();
	}
	

}