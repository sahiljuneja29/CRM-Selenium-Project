package ComplexTestScenarios;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionDemo {
  
	@Test
  public void f() {
	  
	  String var1="abc";
	  
	 
	//HARD ASSERT: Execution will be stopped if hard assertion got failed and next line won't be executed 
	  Assert.assertEquals(var1,"abc");
//	  System.out.println("Assertions equal done");
//	  
//	  Assert.assertTrue(56>8);
//	  System.out.println("Assertions true done");
//	  
	  
	  //****************************************************************
	  // Soft Assertion : Execution will not be stopped if soft assertion got failed and next line will be executed , error will
	  //be printed in console
	  
	  SoftAssert assertion1=new SoftAssert();
	  
	  assertion1.assertEquals("abc", "abcd");
	  System.out.println("Assertion Equals done");
	  
	  
	  assertion1.assertTrue(5>2);
	 
	  System.out.println("Assertion true done");
	  
	  assertion1.assertNotEquals("abc", "def");
	  System.out.println("Assertion Not Equals done");
	  
	  // collates the results of soft assertions mentioned and pass/fail the testcase based on the result
	  assertion1.assertAll();
	  
  }
  
  
  
}