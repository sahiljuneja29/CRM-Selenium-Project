package ComplexTestScenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IsDisplayed {
	
	WebDriver driver;
	
	@Test
	public void Test1() {
		
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\sahil.juneja01\\Desktop\\Study Material\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sahil.juneja01\\Desktop\\chromedriver_win32 (7)\\chromedriver.exe");

		driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://courses.letskodeit.com/practice");
		
		

//Your questions is correct, isDisplayed will display True for the all the element that are present , 
//anything else will definitely go to NoSuchElementException. 
		
		//isDisplayed will return fales in case of hidden elements
		//isDisplayed() method returns boolean value either True or False
		Boolean Display = driver.findElement(By.xpath("//*[@id=\"opentab\"]")).isDisplayed();
		//To print the value
		System.out.println("Element displayed is :"+Display);
		//isEnabled() method returns boolean value either True or False 
		//Boolean Enable = driver.findElement(By.xpath("//*[@id='multi-select-example-div']/fieldset/legend")).isEnabled();
		Boolean Enable = driver.findElement(By.xpath("//*[@id='benzradio']")).isEnabled();
		System.out.println("Element enabled is :"+Enable);
//		//Passing value as "softwaretestingmaterial" in the email field
//		driver.findElement(By.xpath("//*[@id='Email']")).sendKeys("<put_an_email_id>");
//		//to click on next button
//		driver.findElement(By.xpath("//*[@id='next']")).click();
//		//isSelected() method returns boolean value either True or False
		Boolean Select = driver.findElement(By.xpath("//*[@id='benzradio']")).isSelected();
		System.out.println("Element selected is :"+Select);
		}
	}
