package dataProviderPracticeClasses;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class DataProviderTest {
	
	
	
  @Test(dataProvider = "dp")
  public void f(BeanClass myBean) {
	  
	  System.out.println("Name of this asshole is" +myBean.getPersonName());
	  System.out.println("Age of this Asshole is " +myBean.getAge());
	  
	  
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }


  @DataProvider(name= "dp")
  public Object[][] dp() {
    return new Object[][] {{ new BeanClass("Nikunj", 27)}};
}

  
}