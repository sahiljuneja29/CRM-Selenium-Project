package ComplexTestScenarios;

import java.awt.AWTException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;


public class WindowHandle1 {
	WebDriver driver;
	String url="https://demoqa.com/browser-windows";
	
	//@Ignore
	@Test()
	public void Test1() throws InterruptedException, AWTException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sahil.juneja01\\Desktop\\chromedriver_win32 (7)\\chromedriver.exe");
		//System.setProperty("webdriver.edge.driver", "D:\\chromedriver\\msedgedriver.exe");
		//driver =new EdgeDriver();
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get(url);
	driver.manage().window().maximize();
	
	String homewindow=driver.getWindowHandle();
	System.out.println("Home window:" +homewindow);
	
	driver.findElement(By.id("windowButton")).click();
	
	driver.findElement(By.id("messageWindowButton")).click();
	
	Set<String> all_windows=driver.getWindowHandles();
	


	for(String a: all_windows) {
		
			driver.switchTo().window(a);
			System.out.println(driver.getCurrentUrl());
//			if(driver.getCurrentUrl().equals("https://demoqa.com/sample")) {
//				break;
		}
	
//}
	
	
	System.out.println("Current window:" +driver.getWindowHandle());
	
	

}
}