package appModules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utility.ExcelUtils;

    // Now this method does not need any arguments

    public class Input_Action {

		public static void Execute(WebDriver driver) throws Exception{

			//This is to get the values from Excel sheet, passing parameters (Row num &amp; Col num)to getCellData method

			String sUserName = ExcelUtils.getCellData(2, 0);

			String sPassword = ExcelUtils.getCellData(2, 1);
			
			String sSex = ExcelUtils.getCellData(2, 2);
			
			driver.findElement(By.name("firstname")).sendKeys(sUserName);

			driver.findElement(By.name("lastname")).sendKeys(sPassword);  
			
			if(sSex.equals("Male"))
			driver.findElement(By.id("sex-0")).click();
			else
			driver.findElement(By.id("sex-1")).click();
			
			
        }

}