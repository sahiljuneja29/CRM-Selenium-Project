package com.crm.pageobjects;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.base.BaseClass;
import com.src.ActionDriver.Action;

public class HomePage extends BaseClass {
	
	@FindBy(xpath = "//div[@class='header item']")
	WebElement homePageLogo;
	
	@FindBy(xpath = "//*[text()='Sahil Juneja']")
	WebElement userName;
	
	@FindBy(xpath = "//i[@class='users icon']")
	WebElement contactButton;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String getHomePageTitle() {
		return driver.getTitle();
	}
	
	public String getHomePageUrl() {
		return driver.getCurrentUrl();
	}
	
	public boolean validateLogo() {
		boolean result=Action.isDisplayed(driver, homePageLogo);
		return result;
	}
	
	public boolean validateUserName() {
		boolean result=Action.isDisplayed(driver, userName);
		return result;
	}
	
	public ContactsPage clickContactButton() {
		Actions act=new Actions(driver);
		act.moveToElement(contactButton).click().build().perform();
		
		//Action.click(driver, contactButton);
		return new ContactsPage();
	}
	
	
	

}