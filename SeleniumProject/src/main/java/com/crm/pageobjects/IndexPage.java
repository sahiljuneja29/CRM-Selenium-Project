package com.crm.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.base.BaseClass;
import com.src.ActionDriver.Action;
	
public class IndexPage extends BaseClass{
	
	@FindBy(linkText = "Login")
	private WebElement LoginButton;
	
	@FindBy(linkText = "Sign Up")
	private WebElement SignUpButton;
	
	@FindBy(linkText = "Contact Us")
	private WebElement ContactUsButton;
	
	@FindBy(linkText = "Pricing")
	private WebElement PricingButton;
	
	@FindBy(linkText = "Features")
	private WebElement FeaturesButton;
	
	
	@FindBy(xpath = "//img[@class='img-responsive' and @alt='free crm logo']")
	private WebElement crmLogo;
	
	//Initialize the page objects
	public IndexPage() {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public LoginPage clickLogin() {
		LoginButton.click();
		//Action.click(driver, LoginButton);
		return new LoginPage();
	}
	
	public SignUpPage clickSignUp() {
		//Action.click(driver, SignUpButton);
		SignUpButton.click();
		return new SignUpPage();
	}
	

	public PricingPage clickPricing() {
		//Action.click(driver, PricingButton);
		PricingButton.click();
		return new PricingPage();
	}
	
	public FeaturesPage clickFeatures() {
		//Action.click(driver, FeaturesButton);
		FeaturesButton.click();
		return new FeaturesPage();
	}
	
	public boolean validateLogo() {
		return crmLogo.isDisplayed();
		//return Action.isDisplayed(driver, crmLogo);
	}
	

	

}