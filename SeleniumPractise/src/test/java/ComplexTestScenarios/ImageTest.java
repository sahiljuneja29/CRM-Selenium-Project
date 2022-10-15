package ComplexTestScenarios;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ImageTest {
	
	WebDriver driver;
	String url="https://phptravels.com/demo/%20.";
	@Test()
	public void testOnChromeWithBrowserStackSignUp()
	{
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get(url);
	driver.manage().window().maximize();
	
	WebElement image=driver.findElement(By.xpath("//*[@id='Main']/div[1]/img"));
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	Boolean ImagePresent=(Boolean)js.executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", image);
		
   if(!ImagePresent) {
	   System.out.println("Image is not displayed");
   }
   else {
	   System.out.println("image present");
   }
	


	}
}