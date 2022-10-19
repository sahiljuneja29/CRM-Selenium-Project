package Dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dropdown1 {
	
	WebDriver driver;
	String url="https://demoqa.com/select-menu";
	
	@Test()
	public void Test1()
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sahil.juneja01\\Desktop\\Study Material\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get(url);
	driver.manage().window().maximize();
	
//	WebElement d1=driver.findElement(By.xpath("//*[@id=\"withOptGroup\"]/div/div[1]"));
//	Select s1=new Select(d1);
//	s1.selectByIndex(2);
	
	WebElement d2=driver.findElement(By.id("oldSelectMenu"));
	Select s2=new Select(d2);
	s2.selectByIndex(3);
      List<WebElement> l1=s2.getOptions();
      
      for(WebElement s:l1) {
    	  System.out.println(s.getText());
      }
      
      s2.selectByValue("6");
      s2.selectByVisibleText("Aqua");
	
      System.out.println("*****************************");
      // mUlti select
      
      Select s3=new Select(driver.findElement(By.id("cars")));
      if(s3.isMultiple()) {
    	  
    	  s3.selectByIndex(2);
    	  s3.selectByIndex(3);
    	  s3.selectByVisibleText("Volvo");
    	  
    	  WebElement first=s3.getFirstSelectedOption();
    	  System.out.println(first.getText());
    	  
    	   List<WebElement> l2=s3.getAllSelectedOptions();
    	   
    	   for(WebElement l:l2) {
    		   System.out.println(l.getText());
    	   }
    	   
    	   s3.deselectByIndex(2);
    	   s3.deselectByVisibleText("Volvo");
    	   
    	 //Validate that both the values are deselected
           System.out.println("The selected values after deselect in the dropdown options are -");
    	   	List<WebElement> l3=s3.getAllSelectedOptions();
    	   
    	   for(WebElement l:l3) {
    		   System.out.println(l.getText());
    	   }
    	   
    	   
    	   s3.deselectAll();
      }
	

}
}


