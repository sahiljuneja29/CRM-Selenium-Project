package ComplexTestScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.concurrent.TimeUnit;
public class FileUpload{

	 static WebDriver driver;
	 static String url="https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm";
	 
	 public static void main(String[] args) {
	   //System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe");
	   WebDriverManager.chromedriver().setup(); 
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
     
      // identify element
      WebElement m=driver.findElement(By.xpath("//input[@name='photo']"));
      // file selection field with file path
      m.sendKeys("C:\\Users\\sahil.juneja01\\Desktop\\error.png");
   }
}