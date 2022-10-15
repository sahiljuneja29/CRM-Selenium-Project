package ComplexTestScenarios;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class DataProvide {
	WebDriver driver;
	
	@BeforeClass
	@Parameters({"Browser","URL"})
	public void beforeMethod(@Optional("mozilla") String browser1,@Optional("youtube.com")String url) {
		//open chrome browser
		//System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe");
		WebDriverManager.chromedriver().setup(); 
		driver=new ChromeDriver();

	
	    System.out.println("Browser:"+browser1);
	    System.out.println("Browser:"+url);
	    driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10000,TimeUnit.MILLISECONDS);
		
}
	@DataProvider(name="credentials")
	public Object[][] getData(){
		Object[][] data=new Object[2][2];
		data[0][0]= "T7302";
		data[0][1]= "T7302*abc";
		
		data[1][0]= "juneja.sahil2@gmail.com";
		data[1][1]= "Seagate@5421";
		
		return data;
	}
	
	
	@Test(dataProvider="credentials")
  public void test(String username,String password) throws InterruptedException {
		
		driver.findElement(By.id("tellerId")).sendKeys(username);
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/button")).click();
		System.out.println("Test Method run successfully");
		
		driver.findElement(By.linkText("Logout")).click();
		}
	
	@org.testng.annotations.AfterClass
	public void AfterMethod(){
		driver.close();
		
	}
  }
