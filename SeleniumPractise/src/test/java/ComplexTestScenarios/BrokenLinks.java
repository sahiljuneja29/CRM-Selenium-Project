package ComplexTestScenarios;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks { 
	public static void main(String[] args) { 
		 
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\sahil.juneja01\\Desktop\\Study Material\\chromedriver.exe");
		WebDriverManager.chromedriver().setup(); 
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://demoqa.com/broken");
		
		//Maximise browser window 
		driver.manage().window().maximize(); 
		
		//Adding implicit wait 
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS); 
		
		List<WebElement> l1=driver.findElements(By.tagName("a"));
		System.out.println("Total links present on page are:" + l1.size()); 
		Iterator<WebElement> i1=l1.iterator();
		
		while(i1.hasNext()) { 
			System.out.println(i1.next().getText()); 
			}
		System.out.println(driver.getCurrentUrl());
		
		
		while(i1.hasNext()) 
		{ 
			System.out.println(i1.next().getAttribute("href")); 
			 
			} 
		
		for(int i=0;i<l1.size();i++) 
		{ 
			System.out.println(l1.get(i).getAttribute("href")); 
		verifyLinks(l1.get(i).getAttribute("href")); } }
	
	public static void verifyLinks(String linkUrl) 
	{ 
		try { 
			URL url=new URL(linkUrl);
			System.out.println(linkUrl); 
			
	//Now we will be creating url connection and getting the response code 
	HttpURLConnection httpurlconnect=(HttpURLConnection)url.openConnection();
	httpurlconnect.setConnectTimeout(5000); 
	httpurlconnect.connect(); 
	System.out.println(httpurlconnect.getResponseCode()); 
	
	if(httpurlconnect.getResponseCode()>=400) 
	{ 
		System.out.println(linkUrl +":" + httpurlconnect.getResponseMessage()+"" + "is a broken link"); }
	//Fetching and Printing the response code obtained 
	else { 
		System.out.println(linkUrl +":" + httpurlconnect.getResponseMessage());
		} 
	}
		catch(Exception e) 
		{ 
			
		} 
	}
}
