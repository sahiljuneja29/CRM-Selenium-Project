package ComplexTestScenarios;

import java.util.List;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementException {
	
	WebDriver driver;
	//String url="https://www.rediff.com/";
	//String url="https://phptravels.com/demo/%20.";
	String url="https://www.tutorialspoint.com/about/about_careers.htm";
	
	@org.testng.annotations.Test
	public void Test() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		
		// identify element
	      WebElement l = driver.findElement(By.id("search-strings"));
	      l.sendKeys("Selenium");
	      //refresh page
	      driver.navigate().refresh();
	      l.sendKeys("Selenium");
	      
	      //handle staleelement exception using try catch block and getting the element again
//	      try {
//	      l.sendKeys("Selenium");
//	      }
//	      catch(StaleElementReferenceException e){
//	    	  WebElement l1 = driver.findElement(By.id("search-strings"));
//	    	  l1.sendKeys("Selenium");
//	    	  //obtain value entered
//	          String s= l1.getAttribute("value");
//	          System.out.println("Value entered is: " +s);
//	    	  
//	      }
	      driver.quit();
		
		//driver.findElement(By.xpath("/html/body/div[5]/ul/li[2]/a")).click();
		
//		List <WebElement>links=driver.findElements(By.xpath("/html/body/div[5]/div[2]"));
//		
//		for(int i=0;i<links.size();i++) {
//			
//			String linktext=((WebElement) links.get(i)).getText();
//			System.out.println(linktext);
//			
//		links.get(i).click();
//		System.out.println("\n");
		//driver.get(url);
		//driver.findElement(By.xpath("/html/body/div[5]/ul/li[2]/a")).click();
		
		}
		

}
