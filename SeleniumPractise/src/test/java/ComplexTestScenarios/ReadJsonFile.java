package ComplexTestScenarios;

import java.io.FileReader;

import org.json.JSONArray;
import org.json.JSONObject;
//import org.json.simple.parser.JSONParser;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.google.gson.JsonParser;

public class ReadJsonFile {
	
	 WebDriver driver;
		
	 String url="https://courses.letskodeit.com/practice";
	
	@Test
	public void Test() {
	JsonParser parser=new JsonParser();
	
	try {
		Object object=parser.parse(new FileReader("C:\\Users\\sahil.juneja01\\Desktop\\sample.json"));
	
		//convert object to json object
		JSONObject jsonobject=(JSONObject)object;
		
		//Reading the String
		String name=(String) jsonobject.get("Name");
		Long age = (Long) jsonobject.get("Age");
		 
		 //reading the array
		 JSONArray 	countries=(JSONArray)jsonobject.get("Countries");
		 
		 //print all values
		 System.out.println("Name: " + name);
		 System.out.println("Age: " + age);
		 
		 for(Object country: countries) {
			 System.out.println(country.toString());
			 
		 }
	} 
		 catch(Exception e) {
			e.printStackTrace();
		 }
	}	


	
}
