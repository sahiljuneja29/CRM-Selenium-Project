package Xpath_CSS;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxis2 {
	
	
	public static void main(String args[]) {
		
	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\sahil.juneja01\\Desktop\\Study Material\\chromedriver.exe");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sahil.juneja01\\Desktop\\chromedriver_win32 (7)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();

	
	driver.get("https://demoqa.com/text-box");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//input[@id=\"userName\"]")).sendKeys("Sahil Juneja");
	
	driver.findElement(By.xpath("//input[contains(@placeholder,'name@example')]")).sendKeys("juneja.sahil2@gmail.com");
	
	
	driver.findElement(By.xpath("//textarea[starts-with(@id,'currentAd')]")).sendKeys("310A/24 Jagdish colony Rohtak");
	
	Boolean val=driver.findElement(By.xpath("//div[@class='col-md-9 col-sm-12']/ancestor::div")).isDisplayed();
	System.out.println(val);
	
	driver.findElement(By.xpath("//*[@id=\"item-2\"]/span")).click();
	

}

	
}