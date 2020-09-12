package Interview.toolSqa;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class NewTest {
  @Test
  public void BC() {
	  System.out.println("Fisrt");
  }
  @Test
  public void BA() {
	  System.out.println("Second");
  }
  
  @Test
  public void A() {
	  System.out.println("Third");
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

}
