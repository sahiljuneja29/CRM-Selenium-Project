package ComplexTestScenarios;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class RobotKeyboard {
	
	WebDriver driver;
	String url="https://www.naukri.com/mnjuser/profile?id=&orgn=homepage";
	
	@Test()
	public void Test1() throws InterruptedException, AWTException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sahil.juneja01\\Desktop\\chromedriver_win32 (7)\\chromedriver.exe");
		//System.setProperty("webdriver.edge.driver", "D:\\chromedriver\\msedgedriver.exe");
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get(url);
	driver.manage().window().maximize();
	
	driver.findElement(By.id("usernameField")).sendKeys("juneja.sahil2@gmail.com");
	driver.findElement(By.id("passwordField")).sendKeys("Spotify#@!321");
	
	driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[2]/div[3]/div/button[1]")).click();
	
	Thread.sleep(2000);
	WebElement ele=driver.findElement(By.xpath("//*[@id=\"attachCV\"]"));
	
	Actions ac=new Actions(driver);
	//ac.moveToElement(ele).build().perform();
	ac.moveToElement(ele).click().perform();
	
	//ac.moveToElement(ele).perform();
	//ele.sendKeys("C:\\Users\\sahil.juneja01\\Desktop\\deloitte.txt");

	Robot rb=new Robot();
	rb.keyPress(KeyEvent.VK_SHIFT);
	rb.keyPress(KeyEvent.VK_S);
	rb.keyRelease(KeyEvent.VK_SHIFT);
	rb.keyPress(KeyEvent.VK_A);
	rb.keyPress(KeyEvent.VK_PERIOD);
	
	rb.keyPress(KeyEvent.VK_P);
	rb.keyPress(KeyEvent.VK_D);
	rb.keyPress(KeyEvent.VK_F);
	rb.keyPress(KeyEvent.VK_ENTER);
	
	
	
	
	Thread.sleep(2000);
	
}
}
