

package com.crm.pageobjects;

import org.openqa.selenium.By;
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
	
	
	
	public void createNewContact(String fname,String lname,String email,String category,String status) {
		
		
		firstName.sendKeys(fname);
		lastName.sendKeys(lname);
		email_address.sendKeys(email);
		category_dropdown.click();
		selectCategory(category);
		
		//select_lead.click();
		savebutton.click();
		driver.navigate().refresh();
		
		
	}
	
	
	
	

}