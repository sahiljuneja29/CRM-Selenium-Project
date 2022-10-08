//package com.crm.utility;
//
//
//import java.io.File;
//
//import java.io.IOException;
//import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.ITestContext;
//import org.testng.ITestListener;
//import org.testng.ITestResult;
//import com.aventstack.extentreports.MediaEntityBuilder;
//import com.aventstack.extentreports.Status;
//import com.aventstack.extentreports.markuputils.ExtentColor;
//import com.aventstack.extentreports.markuputils.MarkupHelper;
//import com.crm.base.BaseClass;
//import com.src.ActionDriver.Action;
//
//
//
//public class ListenerClass extends ExtentManager implements ITestListener {
//
//	Action action= new Action();
//	public WebDriver driver=new ChromeDriver();
//	
//	public void onTestStart(ITestResult result) {
//		test = extent.createTest(result.getName());
//	}
//
//	public void onTestSuccess(ITestResult result) {
//		if (result.getStatus() == ITestResult.SUCCESS) {
//			test.log(Status.PASS, "Pass Test case is: " + result.getName());
//		}
//	}
//
//	public void onTestFailure(ITestResult result) {
////		driver=new ChromeDriver();
//		if (result.getStatus() == ITestResult.FAILURE) {
//			try {
//				test.log(Status.FAIL,
//						MarkupHelper.createLabel(result.getName() + " - Test Case Failed", ExtentColor.RED));
//				test.log(Status.FAIL,
//						MarkupHelper.createLabel(result.getThrowable() + " - Test Case Failed", ExtentColor.RED));
//				String imgPath = action.screenShot(driver, result.getName());
//			
//				test.fail("ScreenShot is Attached", MediaEntityBuilder.createScreenCaptureFromPath(imgPath).build());
//				
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//	}
//
//	public void onTestSkipped(ITestResult result) {
//		if (result.getStatus() == ITestResult.SKIP) {
//			test.log(Status.SKIP, "Skipped Test case is: " + result.getName());
//		}
//	}
//
//	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
//		// TODO Auto-generated method stub
//	}
//
//	public void onStart(ITestContext context) {
//		// TODO Auto-generated method stub
//
//	}
//
//	public void onFinish(ITestContext context) {
//		System.out.println("After finishing test case");
//	}
//}
