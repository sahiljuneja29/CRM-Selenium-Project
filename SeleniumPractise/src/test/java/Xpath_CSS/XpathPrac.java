package Xpath_CSS;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class XpathPrac {

	WebDriver driver;
	ChromeOptions op=new ChromeOptions();
	

	
	@Test(priority=1,enabled=false)
	public void Test1() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sahil.juneja01\\Desktop\\chromedriver_win32 (7)\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Images']")).click();
		
	}
	
	@Test(priority=2)
	public void Test2() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sahil.juneja01\\Desktop\\chromedriver_win32 (7)\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.Amazon.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Actions ac=new Actions(driver);
		
		//ac.moveToElement(driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span"))).build().perform();
		ac.moveToElement(driver.findElement(By.id("nav-link-accountList-nav-line-1"))).build().perform();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@id='nav-al-your-account']/child::a[1]/child::span[1]")).click();

	}
	
	@AfterMethod
	public void afterTest() {
		//driver.close();
	}

}