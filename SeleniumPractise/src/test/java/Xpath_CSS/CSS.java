package Xpath_CSS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sahil.juneja01\\Desktop\\Study Material\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		
		driver.get("https://www.demoqa.com/webtables");
		
		//css selector using Id attribute
		driver.findElement(By.cssSelector("button[id='addNewRecordButton']")).click();
		//driver.findElement(By.id("firstName")).sendKeys("Sahil");
		
		//css selector using starts with
		//driver.findElement(By.cssSelector("input[id^='sear']")).sendKeys("Sahil");
		
		//css selector using endswith
		driver.findElement(By.cssSelector("input[id$='ame']")).sendKeys("Sahil");
		
		//css selector using contains
		driver.findElement(By.cssSelector("input[id*='astName']")).sendKeys("Juneja");
		
		driver.findElement(By.cssSelector("input[class='mr-sm-2 form-control']")).sendKeys("Juneja.sahil2@gmail.com");
		
		//driver.findElement(By.cssSelector("input#lastName")).sendKeys("Juneja");
		
		//css selector using parent to child  :  div>textarea[placeholder='Current Address']
		//driver.findElement(By.cssSelector("input#lastName")).sendKeys("Juneja");
		
	}

}
