package Interview.toolSqa;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.support.ui.Select;

public class elementPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;
		ProfilesIni profile = new ProfilesIni();
		FirefoxProfile myProfile = profile.getProfile("Selenium");
		driver = new FirefoxDriver(myProfile);		
		driver.manage().window().maximize();		
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
		
		driver.get("http://nothing");
		System.out.println("This is my first page");
		Set <String> handle= driver.getWindowHandles();
		//String handle = driver.getWindowHandle();
		String second = handle.iterator().next();
		System.out.println(second);
		String third = handle.iterator().next();
		System.out.println(third);
		driver.switchTo().window(second);
		System.out.println("I could switch to second");
		driver.switchTo().window(third);
		System.out.println("I could switch to third");
		
		
	}
}


