package com.crm.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class BaseClass extends Page{
	
	//What is Log?// Capturing info/activities at the time of program execution.
	//Types of logs?
	//1. info
	//2. warn
	//3. debug
	//4. fatal
	
	public BaseClass(WebDriver driver) {
		super(driver);
	}

	
	@Override
	public String getPageTitle() {
		return driver.getTitle();
	}

	@Override
	public String getPageHeader(By locator) {
		return getElement(locator).getText();
	}

	@Override
	public WebElement getElement(By locator) {
		WebElement element= null;
		try {
		element=driver.findElement(locator);
		return element;
		}
		catch(Exception e) {
			System.out.println("Some error occured while creating element " +locator.toString());
			e.printStackTrace();
		}
		return element;
	}


	@Override
	public void waitForPageTitle(String title) {
		try {
			wait.until(ExpectedConditions.titleContains(title));
		}
		catch(Exception e) {
			System.out.println("Some exception occured while waiting for the title " + title);
			e.printStackTrace();
		}
	}


	@Override
	public String getPageURL() {
		return driver.getCurrentUrl();
	}


	@Override
	public void waitForElementPresent(By locator) {

		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		}
		catch(Exception e) {
			System.out.println("Some exception occured while waiting for the element " + locator.toString());
			e.printStackTrace();
		}
		
		
	}
	
	

}