package com.crm.utility;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.crm.base.BaseClass;

public  class TestUtil extends BaseClass{
	
	public TestUtil(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public static long PAGE_LOAD_TIMEOUT=20;
	public static long IMPLICIT_WAIT=20;
	

	public static String TestDataSheetPath="C:\\Users\\HP\\git\\repository\\SeleniumProject"
			+ "\\src\\test\\resources\\TestData\\contacts.xlsx";
	
	
	public  static Object[][] readExcel() throws IOException    {
		
		//Create an object of FileInputStream class to read excel file
		File file=new File(TestDataSheetPath);
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(fis);     			//creating Workbook instance that refers to .xlsx file 
		XSSFSheet sheet=wb.getSheet("Sheet1");			  //creating a Sheet object to retrieve object 
		
		int lastrownum=sheet.getLastRowNum();
		
		Object[][] data=new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		
		for(int i=0;i<lastrownum;i++) {
			for(int j=0;j<sheet.getRow(0).getLastCellNum();j++) {
				data[i][j]=sheet.getRow(i+1).getCell(j).toString();
			}
		}
		//wb.close();
		return data;
		
		
		
	}
	
	public static void takeScreenShot() throws IOException {
		File scrFile=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String currentDir=System.getProperty("user.dir");
		FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));
	}
	
	
	public static void selectByValue(WebElement element,String value) {
		Select select =new Select(element);
		select.selectByValue(value);
	}
	
	public static void selectByVisibleText(WebElement element,String text) {
		Select select =new Select(element);
		select.selectByVisibleText(text);
	}

}