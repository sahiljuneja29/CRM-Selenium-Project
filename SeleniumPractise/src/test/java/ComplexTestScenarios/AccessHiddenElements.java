package ComplexTestScenarios;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AccessHiddenElements {
	
	 WebDriver driver;
	 		@org.testng.annotations.Test
		   public void Test() throws InterruptedException {
			  //System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe");
	 			WebDriverManager.chromedriver().setup();  
	 			driver = new ChromeDriver();
		      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		      driver.get("https://courses.letskodeit.com/practice");
		      driver.manage().window().maximize();
		      
		      // identify element
		      driver.findElement(By.id("hide-textbox")).click();
		      // Javascript executor class
		      JavascriptExecutor js = (JavascriptExecutor) driver;
		      // identify element and set value
		      js.executeScript("document.getElementById('displayed-text').value='QA';");
		      String str = (String) js.executeScript("return    document.getElementById('displayed-text').value");
		      
		      
		     System.out.print("Value entered in hidden element: " +str);
		     
		     //to scroll by pixels
		     //js.executeScript("window.scrollBy(0,250)");
		     //Thread.sleep(3000);
		     
		     //to scroll to particular element
		   //  WebElement a1=driver.findElement(By.xpath("//*[@id=\"page\"]/div[3]/div/div/div[1]/div/div[2]/ul/li[6]/a"));
		    // js.executeScript("arguments[0].scrollIntoView();",a1);
		     
		     // to scroll to bottom of a page
		     js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		     
		     // driver.close();
		   
		}

}
