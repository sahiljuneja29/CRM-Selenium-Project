package ComplexTestScenarios;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnDemoTest {
  
  @Test(enabled=true)
  public void Login() {
	  System.out.println("Login");
	
  }
  
  @Test(dependsOnMethods={"Login"})
  public void AddPayee() {
	  System.out.println("AddPayee");
	  Assert.assertTrue(5>21);
  }
  
  @Test(dependsOnMethods={"AddPayee"})
  public void ViewTransactions() {
	  System.out.println("ViewTransactions");
	 
  }
  
}
