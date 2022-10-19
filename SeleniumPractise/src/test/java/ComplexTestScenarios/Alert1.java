package ComplexTestScenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Alert1 {
	
	
		WebDriver driver;
		String url="https://demoqa.com/alerts";
		
		@Test()
		public void Test1()
		{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sahil.juneja01\\Desktop\\Study Material\\chromedriver.exe");
		driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		 //driver.findElement(By.id("alertButton")).click();
		
		WebElement element = driver.findElement(By.id("promtButton"));
		
		((JavascriptExecutor)driver).executeScript("arguments[0].click()",element);
		Alert a1=driver.switchTo().alert();
		 System.out.println(a1.getText());
		
		 
		a1.sendKeys("abc");
		a1.accept();
		
		 try {
	            driver.findElement(By.id("timerAlertButton")).click();
	            WebDriverWait wait = new WebDriverWait(driver,4);
	            wait.until(ExpectedConditions.alertIsPresent());
	            Alert simpleAlert = driver.switchTo().alert();
	            simpleAlert.accept();
	            System.out.println("Unexpected alert accepted");
	        } catch (Exception e) {
	            System.out.println("unexpected alert not present");
	        }
	        //driver.quit();
		 
		 finally {
			 System.out.println("finally");
		 }
	    }

}
