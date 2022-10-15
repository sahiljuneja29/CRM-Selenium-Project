package ComplexTestScenarios;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelRead {
	WebDriver driver;
	String url;
	@Test
	public void Test() throws InterruptedException, IOException{
		//System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe");
		WebDriverManager.chromedriver().setup(); 
		driver=new ChromeDriver();
		driver.get("http://10.82.180.36:8080/EDUBank/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("userId")).sendKeys("Steven");
		driver.findElement(By.id("password")).sendKeys("Steven!123");
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/form/button")).click();
		Thread.sleep(2000);
		
		WebElement a1=driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div/span"));
		WebElement a2=driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div/div/p[1]/a"));
		
		Actions action=new Actions(driver);
		action.moveToElement(a1).moveToElement(a2).click().build().perform();
		
		//Explicit wait with a maximum of 20seconds
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("/html/body"))));
		
		
		//Retrieve data from excel file.
		
		File file_path=new File("D:\\Test1.xlsx");
		FileInputStream file_ip=new FileInputStream(file_path);
		
		XSSFWorkbook w_book=new XSSFWorkbook(file_ip);
		XSSFSheet sheet= w_book.getSheet("data");
		
		int row_num=sheet.getLastRowNum();
		
		System.out.println(row_num);
		
		for(int i=1; i<=sheet.getLastRowNum();i++) {
			
			String num1=sheet.getRow(i).getCell(0).getRawValue();
			String num2=sheet.getRow(i).getCell(1).getRawValue();
			String num3=sheet.getRow(i).getCell(2).getRawValue();
			
			driver.findElement(By.id("password")).sendKeys(num1);
			Thread.sleep(1000);
			driver.findElement(By.id("newPassword")).sendKeys(num2);
			driver.findElement(By.id("confirmNewPassword")).sendKeys(num3);
			driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/form/button")).click();
			WebElement text=driver.findElement(By.xpath("/html/body/div/div[4]"));
			String txt =text.getText();
			System.out.println(txt);
			
			//Write data into excel
			sheet.getRow(i).createCell(3);
			sheet.getRow(i).getCell(3).setCellValue(txt);
			
			file_ip.close();
			Thread.sleep(2000);
			
			
			//Create an output stream with the location where the file has to be created
			FileOutputStream file_op=new FileOutputStream(file_path);
			//Write the workbook
			w_book.write(file_op);
			file_op.close();
			}
		
//		XSSFSheet sheet1= w_book.createSheet("data2");
//		  // creating a row object 
//        XSSFRow row; 
//  
//		for(int j=0;j<=25;j++) {
//			int k=0;
//			row=sheet1.createRow(j);
//			
//			Cell cell =row.createCell(k);
//			Cell cell1=row.createCell(k+1);
//			k=k+1;
//			cell.setCellValue("ab");
//			cell1.setCellValue("pqrs");
//			FileOutputStream file_op1=new FileOutputStream(file_path);
//			w_book.write(file_op1);
//			file_op1.close();
//		}
		
		 // This data needs to be written (Object[]) 
        Map<String, Object[]> studentData  = new TreeMap<String, Object[]>(); 
  
        studentData.put( "1", new Object[] { "Roll No", "NAME", "Year" }); 
  
        studentData.put("2", new Object[] { "128", "Aditya", "2nd year" }); 
  
        studentData.put( 
            "3", 
            new Object[] { "129", "Narayana", "2nd year" }); 
  
        studentData.put("4", new Object[] { "130", "Mohan", 
                                            "2nd year" }); 
  
        studentData.put("5", new Object[] { "131", "Radha", 
                                            "2nd year" }); 
  
        studentData.put("6", new Object[] { "132", "Gopal", 
                                            "2nd year" }); 
  
        Set<String> keyid = studentData.keySet(); 
  
        XSSFSheet sheet2= w_book.createSheet("Student Data");
        int rowid = 0; 
        XSSFRow row;
        
        for(String key: keyid) {
        	
        	row=sheet2.createRow(rowid++);
        	Object[] objectArr= studentData.get(key);
        	int cellid=0;
        	
        	for(Object object : objectArr) {
        		Cell cell=row.createCell(cellid++);
        		cell.setCellValue((String)object);
        		}
        }
        
        FileOutputStream file_op2=new FileOutputStream(file_path);
		w_book.write(file_op2);
		file_op2.close();

		w_book.close();
	
		
		
		
}
}
