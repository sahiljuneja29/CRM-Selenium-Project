package ComplexTestScenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert; 

public class Keyboard {
	

	public static void main(String[] args) { 
		// TODO Auto-generated method stub 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sahil.juneja01\\Desktop\\Study Material\\chromedriver.exe"); //create object of chrome options 
		// ChromeOptions options = new ChromeOptions(); 
		//add the headless argument 
		// options.addArguments("headless"); 
		//pass the options parameter in the Chrome driver declaration 
		// WebDriver driver = new ChromeDriver(options); 
		WebDriver driver = new ChromeDriver(); 
		//Navigate to the demo site 
		driver.get("https://demoqa.com/text-box"); 
		//Maximise browser window 
		driver.manage().window().maximize(); 
		//Adding wait 
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS); 
		
		//Create object of the Actions class 
		Actions actions = new Actions(driver); 
		
		// Enter the Full Name 
		WebElement fullName = driver.findElement(By.id("userName")); 
		fullName.sendKeys("Mr.Peter Haynes"); 
		
		//Enter the Email 
		WebElement email=driver.findElement(By.id("userEmail")); email.sendKeys("PeterHaynes@toolsqa.com");
		WebElement address=driver.findElement(By.id("currentAddress")); address.sendKeys("310A/24 Delhi Road near main market"); 
		
		actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		actions.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform(); 
		actions.sendKeys(Keys.TAB).build().perform();
		actions.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		
		WebElement permanentaddress=driver.findElement(By.id("permanentAddress")); 
		System.out.println(permanentaddress.getAttribute("value")); 
		
		Assert.assertEquals(address.getAttribute("value"), permanentaddress.getAttribute("value")); 
		}
	} 

