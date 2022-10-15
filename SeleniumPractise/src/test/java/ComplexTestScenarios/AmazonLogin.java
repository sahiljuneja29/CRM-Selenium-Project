package ComplexTestScenarios;

import org.testng.annotations.Test;



//import com.sun.jna.platform.FileUtils;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

public class AmazonLogin {
	private static final String DBUserName = null;
	private static final String DBConnectionURL = null;
	private static final String DBPassword = null;
	WebDriver driver;
	String url;
	
  @Test
  public void f() {
  }
  @BeforeMethod
  public void beforeMethod() throws InterruptedException, IOException {
	 // System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe");
	  	WebDriverManager.chromedriver().setup();  
		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("/html/body")));
//		driver.manage().timeouts().implicitlyWait(10000,TimeUnit.MILLISECONDS);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("8375099046");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("Dolly@54321");
//		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[4]/div/div[2]/a/div/img[2]")).click();
		//driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button")).click();
        //driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input")).sendKeys("Iphone x");
        //Thread.sleep(2000);
//        driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/button/svg")).click();
        
       // driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[2]/div/div[1]/div[2]/div/a/div/img[2]")).click();
        Thread.sleep(2000);
        
        //Screenshot
        File SS1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        org.apache.commons.io.FileUtils.copyFile(SS1,new File("C:\\Users\\HP\\Desktop\\error.png"));
        
//        String sqlString="insert into ChillNGrill_Orders values(?,?,?,?,?,?)";		
//        try(Connection connection=DriverManager.getConnection(DBConnectionURL, DBUserName, DBPassword);
//        PreparedStatement prepareStatement = connection.prepareStatement(sqlString);)
//        {
//         prepareStatement.setInt(1, order.getOrderId());
//         prepareStatement.setString(2, order.getCustomerName());
//         prepareStatement.setString(3, order.getOrderedItem());
//         prepareStatement.setDouble(4, order.getTotalBillAmount());
//         prepareStatement.setLong(5, order.getContactNo());
//         prepareStatement.setString(6, order.getOrderedBranch());
//        }      
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}