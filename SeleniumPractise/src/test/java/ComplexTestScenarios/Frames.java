package ComplexTestScenarios;

import java.awt.List;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Frames {
	

	WebDriver driver;
	String url="https://courses.letskodeit.com/practice";
	@Test()
	public void testOnChromeWithBrowserStackSignUp()
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sahil.juneja01\\Desktop\\Study Material\\chromedriver.exe");
	driver=new ChromeDriver();
//		System.setProperty("webdriver.edge.driver", "D:\\chromedriver\\msedgedriver.exe");
//		driver=new EdgeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get(url);
	driver.manage().window().maximize();
	//List<WebElement> iframeElements = driver.findElements(By.tagName("iframeResult"));
	ArrayList <WebElement>frame= (ArrayList) driver.findElements(By.tagName("iframe"));
	System.out.println(frame.size());
	
	//By executing a java script
	JavascriptExecutor exe = (JavascriptExecutor) driver;
	Integer noOfFrames = Integer.parseInt(exe.executeScript("return window.length").toString());
	//System.out.println("No. of iframes on the page are " + numberOfFrames);
	
	driver.switchTo().frame(0);
	//First finding the element using any of locator strategy
	//WebElement iframeElement = driver.findElement(By.id("iFrameResult"));
	//now using the switch command to switch to main frame.
	driver.switchTo().frame(1);
	//Perform all the required tasks in the frame 0
	
	//Switching back to previous frame
	driver.switchTo().parentFrame();
	//Switching back to the main window
	driver.switchTo().defaultContent();
	//driver.quit();


}
}
