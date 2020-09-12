package automationFramework;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import utility.Constant;
//import pageObject.*;


// Import Package utility.*

import utility.ExcelUtils;
import appModules.Input_Action;




public class Apache_POI_TC {
	private static WebDriver driver =null;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		ExcelUtils.setExcelFile((Constant.Path_TestData + Constant.File_TestData), "Sheet1");
		//System.out.println(Constant.Path_TestData + Constant.File_TestData);
	
	    driver = new FirefoxDriver();
 
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
 
        driver.get(Constant.URL);
 
        Input_Action.Execute(driver);
		
		System.out.println("Entered Data Successfully");
		ExcelUtils.setCellData("Pass", 1,3);

	}

}
