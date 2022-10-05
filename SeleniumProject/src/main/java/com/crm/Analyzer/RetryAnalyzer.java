package com.crm.Analyzer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer{
	
	
	// this class is used to re-run only failed test cases

	int counter=0;
	int retryLimit=1;

	public boolean retry(ITestResult result) {
		
		if(counter < retryLimit) {
			counter++;
			return true;
		}
		
		return false;
	}

}

