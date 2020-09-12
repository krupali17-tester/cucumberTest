package Interview.toolSqa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class XPathPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ProfilesIni profile = new ProfilesIni();
		FirefoxProfile myProfile = profile.getProfile("Selenium");
		WebDriver driver = new FirefoxDriver(myProfile);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		
		driver.get("http://store.demoqa.com/");
		
		//driver.findElement(By.xpath("html/body/div[2]/div/div/footer/section[3]/div/ul/li[3]/a")).click();
		
		//driver.quit();
		//driver.findElement(By.xpath(".//*[@id'account']//a[contains(@href,’your-account’)]")).click();
		driver.findElement(By.xpath(".//*[@id='account']/a/span[1]")).click();
		
		System.out.println("I have clicked now");
		
		
	}

}
