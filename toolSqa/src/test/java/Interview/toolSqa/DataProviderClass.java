package Interview.toolSqa;

import org.testng.ITestContext;
import org.testng.annotations.DataProvider;

public class DataProviderClass {

	@DataProvider(name ="FirstParametar")
	  public Object[][] getDataFromDataprovider(ITestContext c){
		  
		 Object[][] groupArray = null;
		 
	        for (String group : c.getIncludedGroups()) {
	 
	        if(group.equalsIgnoreCase("A")){
	 
	            groupArray = new Object[][] {
	 
	                { "Guru99", "India" },
	 
	                { "Krishna", "UK" },
	 
	                { "Bhupesh", "USA" }
	 
	                };
	 
	        break;    
	 
	        }
	 
	            else if(group.equalsIgnoreCase("B"))
	 
	            {
	 
	            groupArray = new Object[][] {
	 
	                        { "Canada" },
	 
	                        { "Russia" },
	 
	                        { "Japan" }
	 
	                    };
	 
	            }
	 
	        break;
	 
	    }
	 
	         
	 
	    return groupArray;        
	 
	    
	          
	  }
	
}
