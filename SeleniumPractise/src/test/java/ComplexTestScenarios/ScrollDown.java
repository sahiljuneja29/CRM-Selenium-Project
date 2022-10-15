package ComplexTestScenarios;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown {
	static WebDriver driver;
	//String url="http://10.82.180.36:8080/EDUBank/tellerLogin";
	 
    public static void main(String[] args) {
             // TODO Auto-generated method stub
    		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
            driver = new ChromeDriver();
             JavascriptExecutor js = (JavascriptExecutor) driver;
             driver.manage().window().maximize();
             driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
             driver.get("https://www.google.com");
             WebElement element = driver.findElement(By.name("q"));
             element.sendKeys("SoftwareTestingHelp");
             element.sendKeys(Keys.ENTER);
              js.executeScript("window.scrollBy(0,1000)");
            //  driver.findElement(by.c);
              List <WebElement> lst=driver.findElements(By.tagName("a"));
             
             for(WebElement a4: lst) {
            	 System.out.println(a4.getAttribute("href"));
            	 System.out.println(a4.getText());
             }
              //js.executeScript("window.scrollBy(1000,0)");
}
}