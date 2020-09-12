package Interview.toolSqa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitPractice {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ProfilesIni profile = new ProfilesIni();
		FirefoxProfile myProfile = profile.getProfile("Selenium");
		WebDriver driver = new FirefoxDriver(myProfile);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		driver.get("https://in.bookmyshow.com/buytickets_v4/airlift-pune/movie-pune-ET00029122-MT/20160220");
		
		
		driver.findElement(By.id("inp_RegionSearch_top")).sendKeys("Pune");
		driver.findElement(By.id("inp_RegionSearch_top")).sendKeys(Keys.ENTER);
		
		/*
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.withTimeout(10, TimeUnit.SECONDS);
		wait.pollingEvery(1, TimeUnit.SECONDS);
		
		wait.until(ExpectedConditions.textToBePresentInElement(element, text))
		*/
		
		
		driver.findElement(By.partialLinkText("09:15 PM")).click();
		driver.findElement(By.id("btnPopupAccept")).click();
		
		driver.findElement(By.id("pop_5")).click();
		driver.findElement(By.id("B_3_02")).click();
		driver.findElement(By.id("txtBtn")).click();
		driver.findElement(By.id("prePay")).click();
		
		Thread.sleep(50000);
		driver.navigate().refresh();
		
		Thread.sleep(50000);
		driver.navigate().refresh();
		
		Thread.sleep(50000);
		driver.navigate().refresh();
		
		Thread.sleep(50000);
		driver.navigate().refresh();
		
		
		
		
		

	}

}
