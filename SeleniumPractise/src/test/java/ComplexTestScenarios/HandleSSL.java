package ComplexTestScenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;


public class HandleSSL{
	
	static WebDriver driver;
	
	public static void main(String[] args) {
      //DesiredCapabilities object
      DesiredCapabilities c=DesiredCapabilities.chrome();
      //set SSL certificate to true
      c.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
     // System.setProperty("webdriver.ie.driver", "C:\\Users\\ghs6kor\\Desktop\\Java\\IEDriverServer.exe");
     
      //configure capability to browser
       driver = new ChromeDriver(c);
      //implicit wait
      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      //URL launch
      driver.get("application url to be entered");
   }

}
