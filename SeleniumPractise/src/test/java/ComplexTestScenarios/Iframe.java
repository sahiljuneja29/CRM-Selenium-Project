package ComplexTestScenarios;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Iframe {
	

	WebDriver driver;
	String url="https://courses.letskodeit.com/practice";
	
	@Test()
	public void Test1()
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sahil.juneja01\\Desktop\\Study Material\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//driver.get(url);
	driver.navigate().to(url);
	driver.manage().window().maximize();
	List<WebElement> frame=driver.findElements(By.tagName("iframe"));
	System.out.println(frame.size());
	

	
	try {
	driver.switchTo().frame(0);     //switch to frame using id
	//driver.switchTo().frame("courses-iframe");     ////switch to frame using name attribute
	}
	catch(NoSuchFrameException e) {
		System.out.println("unable to locate frame with name" + e.getStackTrace() );
		
	}
	catch(Exception e) {
		System.out.println("unable to navigate to  frame with name" + e.getStackTrace());
		
	}
	
	// to come back to parent frame
	driver.switchTo().defaultContent();
	
	driver.findElement(By.id("alertbtn")).click();
	
	WebDriverWait wait =new WebDriverWait(driver,10);
	
	Alert alert=wait.until(ExpectedConditions.alertIsPresent());
	alert.accept();
	
}
}