

package com.crm.pageobjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.base.BaseClass;
import com.src.ActionDriver.Action;

public class ContactsPage extends BaseClass {
	
	
	@FindBy(xpath = "//button[@class='ui linkedin button' and text()='Create']")
	WebElement createButton;
	
	@FindBy(xpath = "//input[@name='first_name']")
	WebElement firstName;
	
	@FindBy(xpath = "//input[@name='last_name']")
	WebElement lastName;
	
	@FindBy(xpath = "//input[@name='value' and @placeholder='Email address']")
	WebElement email_address;
	
	@FindBy(xpath = "//div[@name='category' and @role='listbox']")
	WebElement category_dropdown;
	
	@FindBy(xpath = "//span[text()='Lead']")
	WebElement select_lead;
	
	
	@FindBy(xpath = "//button[@class='ui linkedin button']")
	WebElement savebutton;
	
	@FindBy(xpath = "//input[@name='image']")
	WebElement uploadImage;
	
	@FindBy(xpath = "//button[contains(@class,'ui small fluid')]")
	WebElement Accessbutton;
	
	@FindBy(xpath = "//div[contains(@class,'twelve wide field')]//div[@class='divider default text']")
	WebElement accessSearchBar;
	
	
	
	

	public ContactsPage() {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void clickNewContactButton() {
		Action.click(driver, createButton);
		
	}
	
	public void selectCategory(String name) {
		driver.findElement(By.xpath("//span[text()='"+name+"']")).click();
	}
	
	public List<String> getStatus() {
	
		String dropdown="//div[@name='status' and @role='listbox']";
		WebElement e1=driver.findElement(By.xpath(dropdown));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", e1);
		
		List<WebElement> statusValues=driver.findElements(By.xpath("//div[@class='visible menu transition']//div[@name='status']//span"));
		
		List<String> data=new ArrayList<String>();
		
		for(WebElement e:statusValues) {
			data.add(e.getText());
		}
		return data;
	}
	
	public void selectStatus(String status) {
		String dropdown="//div[@name='status' and @role='listbox']";
		WebElement e=driver.findElement(By.xpath(dropdown));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", e);
		String statusxpath="//div[@class='visible menu transition']//div//span[text()='"+ status +"']";
		WebElement ss=driver.findElement(By.xpath(statusxpath));
		ss.click();
		
	}
	
	
	public void createNewContact(String fname,String lname,String email,String category,String status) {
		
		
		firstName.sendKeys(fname);
		lastName.sendKeys(lname);
		email_address.sendKeys(email);
		category_dropdown.click();
		selectCategory(category);
		selectStatus(status);
		//select_lead.click();
		uploadImage.sendKeys("C:\\Users\\HP\\Desktop\\IMG_20190906_150555.jpg");
		savebutton.click();
		driver.navigate().refresh();
		
		
	}
	
	public List<String> verifyAccessButton() {
		
		if(Accessbutton.isDisplayed()) {
			Accessbutton.click();
		}
		List<String> data=new ArrayList<String>();
		String color=Accessbutton.getCssValue("color");	
		String text=Accessbutton.getText();
		data.add(color);
		data.add(text);
		
		return data;
		
	}
	
	public Boolean verifyAccessSearchBar() {
		Boolean flag=accessSearchBar.isEnabled();
		
		if(flag=true) {
			return flag;
		}
		else {
			System.out.println("Search bar is not enabled");
			return false;
		}
	}
	
	
	
	

}