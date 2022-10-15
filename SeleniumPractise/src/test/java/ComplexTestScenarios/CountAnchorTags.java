package ComplexTestScenarios;

import org.testng.annotations.Test;
import java.util.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

//import com.opencsv.exceptions.CsvValidationException;

public class CountAnchorTags {
	
	WebDriver driver;
	String url="https://phptravels.com/demo/%20.";
	
	
	
//	@Test
//	public void Test() throws InterruptedException, IOException, CsvValidationException {
		
		
		//System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
//		System.setProperty("webdriver.edge.driver", "D:\\chromedriver\\msedgedriver.exe");
//		//driver=new ChromeDriver();
//		driver=new EdgeDriver();
//		driver.get(url);
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
//		
//		//Count Anchor tags
//		List<WebElement> all_links=driver.findElements(By.tagName("a"));
//		
//		System.out.println(all_links.size());
//		
//		
//		ProcessBuilder pb=new ProcessBuilder("C:\\Users\\sahil.juneja01\\Desktop\\My\\Hello.bat");
//		Process process=pb.start();
//		
//		BufferedReader reader=new BufferedReader(new InputStreamReader(process.getInputStream()));
//		StringBuilder sb=new StringBuilder();
//		String line;
//		sb.append(reader.read());
//		while((line=reader.readLine())!=null){
//		sb.append(line);
//			
//		}
		
		
		//System.out.println(sb);
//		for(int i=0;i<all_links.size();i++)
//		{
//			// .getText()-->get the text property
//			System.out.println(all_links.get(i).getText()+ "");
//			//.getAttribute("href")-->get the property value mentioned
//			System.out.println(all_links.get(i).getAttribute("href")+ "");
//		}
		
//		try {
//		Process process=Runtime.getRuntime().exec("C:\\Users\\sahil.juneja01\\Desktop\\My\\B1.bat");
//		Process.Start("C:\\Users\\Administrator\\Desktop\\http_IE8.exe");
//		//Process.start
//		
//		// Get output stream to write from it
//
//		OutputStream out = process.getOutputStream();
//
//		out.write("cd d:/ /r/n".getBytes());
//
//		out.flush();
//
//		out.write("dir /r/n".getBytes());
//
//		out.close();
//		} catch (IOException e) {
//
//		}

//}
	@Test()
	public void testOnChromeWithBrowserStackSignUp()
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sahil.juneja01\\Desktop\\chromedriver_win32 (7)\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.browserstack.com/users/sign_up");
	driver.manage().window().maximize();
	driver.findElement(By.id("user_full_name")).sendKeys("Sadhvi Singh");
	driver.findElement(By.id("user_email_login")).sendKeys("sadhvisingh24@gmail.com");
	driver.findElement(By.id("user_password")).sendKeys("browserstack");
	System.out.println("this is the test related to chrome browserstack login"+ " " +Thread.currentThread().getId());
	long id=Thread.currentThread().getId();
	System.out.println("Count anchor tags thread id:"+id);


	}
}