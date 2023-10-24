package com.crm.base;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class Page {
	
	public static WebDriver driver;
	public static WebDriverWait wait;
	
	public  Page(WebDriver driver) {
		Page.driver=driver;
		Page.wait=new WebDriverWait(Page.driver, Duration.ofSeconds(5));
	}
	
	//abstract methods
	public abstract String getPageTitle();
	public abstract String getPageHeader(By locator);
	public abstract WebElement getElement(By locator);
	public abstract void waitForElementPresent(By locator);
	public abstract void waitForPageTitle(String title);
	public abstract String getPageURL();
	
	//using generics
	public <MPage extends BaseClass> MPage getInstance(Class<MPage> pageClass) {
		
		try {
			return pageClass.getDeclaredConstructor(WebDriver.class).newInstance(this.driver);
		}
		catch(Exception e) {
			e.printStackTrace();
			return null;
		}
		
		
	}
		
}
