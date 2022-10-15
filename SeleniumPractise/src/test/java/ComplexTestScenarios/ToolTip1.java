package ComplexTestScenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolTip1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sahil.juneja01\\Desktop\\Study Material\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demoqa.com/tool-tips/");
		driver.manage().window().maximize();
	    
		//Adding wait 
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		
		WebElement ele=driver.findElement(By.id("toolTipButton"));
		Actions action=new Actions(driver);
		
		action.moveToElement(ele).perform();
		
		System.out.println(ele.getText());
		
		WebElement tooltip=driver.findElement(By.cssSelector(".area-describedby"));
		String tooltiptext=tooltip.getText();
		System.out.println(tooltiptext);
	}

}
