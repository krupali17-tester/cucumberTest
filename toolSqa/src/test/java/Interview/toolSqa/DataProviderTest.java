package Interview.toolSqa;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import java.lang.reflect.Method;

import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;

public class DataProviderTest {
	

  
  @Test(dataProvider="FirstParametar")
  public void f(String p1, String p2 ) {
	  
	  System.out.println("It has two parameter first one is " +p1);
	  System.out.println("It has two parameter Second one is " +p2);
  }
  
  
  @Test(dataProvider="FirstParametar")
  public void B(String p2) {
	  System.out.println("It has one parameter which is " +p2);
	
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	 // System.out.println("This is before method code");
  }

  @AfterMethod
  public void afterMethod() {
	  
	 // System.out.println("This is After method code");
  }
  
  @DataProvider(name ="FirstParametar")
  public Object[][] getDataFromDataprovider(Method c){
	  
	 if(c.getName().equalsIgnoreCase("f"))
	return new Object[][] {
 
                { "Guru99", "India" },
 
                { "Krishna", "UK" },
 
                { "Bhupesh", "USA" }
 
                };
 
            else {
   return new Object[][] {
	   { "Canada" },
	   
       { "Russia" },

       { "Japan" }
            	
            };
    
          
  }
   
		  

  }}
