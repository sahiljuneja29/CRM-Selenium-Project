package ComplexTestScenarios;



import org.testng.AssertJUnit;
import java.awt.List;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class JavascriptExecutor {
	
	WebDriver driver;
	String url="https://phptravels.com/demo/%20.";
	
	@org.testng.annotations.Test
	public void Test() throws InterruptedException, IOException {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		
		WebElement from=driver.findElement(By.xpath("/html/body/header/div/nav/div[3]/span"));
		
		WebElement to=driver.findElement(By.xpath("/html/body/header/div/nav/div[3]/div/a[3]"));
		
		Actions action=new Actions(driver);
		action.moveToElement(from).moveToElement(to).click().build().perform();
		
		driver.findElement(By.xpath("/html/body/header/div/nav/a[6]")).click();
		
		Set<String> windowhandles=driver.getWindowHandles();
		
		for(String handles: windowhandles) {
			driver.switchTo().window(handles);
			if(handles.contains("Login - PHPTRAVELS")) {
				
				break;
				
				
			}
		}
//		driver.findElement(By.linkText("Register")).click();
//		Thread.sleep(2000);
//		WebElement dd2=driver.findElement(By.xpath("//*[@id=\'customfield1\']"));
//		Select sl2=new Select(dd2);
//		System.out.println("Total number of options in Dropdown" + sl2.getOptions().toString());
	
		WebElement uid=driver.findElement(By.id("inputEmail"));
		WebElement pass=driver.findElement(By.id("inputPassword"));
		
		action.keyDown(uid, Keys.SHIFT).sendKeys("juneja.sahil2@gmail.com").keyUp(Keys.SHIFT).build().perform();
		action.keyDown(pass, Keys.SHIFT).sendKeys("sahil12").keyUp(Keys.SHIFT).build().perform();
		
		driver.navigate().refresh();
		
		driver.findElement(By.xpath("//*[@id=\"Primary_Navbar-Store\"]/a")).click();
		
		WebElement to1=driver.findElement(By.xpath("//*[@id=\"Primary_Navbar-Store-Mobile\"]/a"));
		
		action.moveToElement(to1).click().build().perform();
		
		driver.findElement(By.xpath("//*[@id=\"pid17\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"order-boxes\"]/div[3]/form/div[2]/button")).click();
		Thread.sleep(2000);
		
		WebElement checkbox=driver.findElement(By.xpath("//*[@id=\"frmConfigureProduct\"]/div/div[1]/div[4]/div/div/div[1]/label/div/ins"));
		Boolean ab,bz,ca;
		ab=checkbox.isDisplayed();
		bz=checkbox.isEnabled();
		ca=checkbox.isSelected();
		
		System.out.println(ab);
		System.out.println(bz);
		System.out.println(ca);
		if(checkbox.isEnabled()) {
			checkbox.click();
			Boolean ma;
			ma=checkbox.isSelected();
			System.out.println(ma);
		}
		
	
		try {
			driver.findElement(By.id("btnCompleteProductConfig")).click();
		}
		
		catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println("element not found");
		
		File scr1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);	
		FileUtils.copyFile(scr1, new File("C:\\Users\\sahil.juneja01\\Desktop\\error.png"));
		}
		
		Thread.sleep(2000);
		driver.findElement(By.linkText("Register")).click();
//		Thread.sleep(2000);
//		WebElement dd2=driver.findElement(By.xpath("//*[@id=\'customfield1\']"));
//		Select sl2=new Select(dd2);
		//List l1=(List) sl2.getOptions();
//		//for(int i=0;i<l1.size();i++) {
////			System.out.println(l1.getItem(i));
////		}
//		System.out.println("Total number of options in Dropdown" + sl2.getOptions().toString());
		
		
		WebElement inputfname=driver.findElement(By.xpath("//*[@id=\"frmCheckout\"]/p/input"));
		String input_fname=inputfname.getText();
		System.out.println(input_fname);
		
		WebElement ename=driver.findElement(By.name("firstname"));
		String LoginClassName = ename.getAttribute("name");
		System.out.println(LoginClassName);
		
		SoftAssert assertion=new SoftAssert();
		String title=driver.getTitle();
		AssertJUnit.assertEquals(title, "Register - PHPTRAVELS");
		
		//We can scroll down a page by using window.scrollBy() function.
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,700)");
		
		driver.findElement(By.xpath("//*[@id=\"Primary_Navbar-Contact_Us\"]/a")).click();
		WebElement element=driver.findElement(By.xpath("//*[@id=\"main-body\"]/div/div/div[1]/form/div[6]/div/button"));
		
		//To scroll down to a particular element on a web page, we can use the function scrollIntoView()
		js.executeScript("arguments[0].scrollIntoView();", element);
		
		//js.executeScript("document.getElementById('text-8').scrollIntoView(true);");
		
		System.out.println(driver.manage().window().getSize());
		Dimension d = new Dimension(420,600);
		driver.manage().window().setSize(d);
		
		
		
//		assertion.assertAll();
//			
//			
//			finally{
//				driver.quit();
////			}


}
}