package com.src.ActionDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.crm.base.BaseClass;

public class Action extends BaseClass{
	
	public Action(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public static void scrollByVisibilityOfElement(WebDriver driver, WebElement ele) {
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", ele);
		
	}
	
	public static void click(WebDriver ldriver, WebElement locator) {
		
		Actions act=new Actions(ldriver);
		act.moveToElement(locator).click().build().perform();
	}
	
	public static boolean findElement(WebDriver ldriver, WebElement ele) {
		boolean flag=false;
		
		try {
			ele.isDisplayed();
			flag=true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			flag=false;
			e.printStackTrace();
		}finally {
			if(flag) {
				System.out.println("Successfully found element at ");
			}
			else {
				System.out.println("Unable to locate element at ");
			}
		}
		return flag;
	}
	
	public static boolean isDisplayed(WebDriver ldriver, WebElement ele) {
		boolean flag=false;
		flag=findElement(ldriver, ele);
		
		if(flag) {
			flag=ele.isDisplayed();
			if(flag) {
				System.out.println("Element is displayed");
			}
			else {
				System.out.println("Element is not displayed");
			}
		
		}else {
			System.out.println("Not displayed");		
		}
		return flag;
	}
	
	public static void jsClick(WebDriver driver, WebElement ele) {
		//boolean flag=false;
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", ele);
	}

	public static void sendKeys(WebElement ele, String text) {
		ele.sendKeys(text);
	}
	
	public void waitforanelement(WebElement element)
    {
		
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
         wait.until(ExpectedConditions.presenceOfElementLocated((By) element)); //you can use any other By like id, cssselector, name, linktext etc
    }

	public String screenShot(WebDriver driver, String name) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	}
