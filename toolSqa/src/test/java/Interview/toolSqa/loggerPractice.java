package Interview.toolSqa;

import java.util.concurrent.TimeUnit;


import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Level;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.w3c.dom.DOMConfiguration;

public class loggerPractice {

	
	private static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 BasicConfigurator.configure();
	     Logger OurLogger = LogManager.getLogger("OurLogger");
	     
	     FileAppender fileappeander = new FileAppender();
	     fileappeander.setFile("logfile.txt");
	     fileappeander.setLayout(new SimpleLayout());
	     
	     OurLogger.addAppender(fileappeander);
	     fileappeander.activateOptions();
	     
	     OurLogger.info("We are here first time");
	     
		ProfilesIni profile = new ProfilesIni();
		FirefoxProfile myProfile = profile.getProfile("Selenium");
		
		driver = new FirefoxDriver(myProfile);
		 OurLogger.debug("Custom profile is run" + myProfile.toString());
		 
		 

		
		driver.manage().window().maximize();
		
		OurLogger.info("The browser window is maximized");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		
		driver.get("http://www.google.com");
		
		OurLogger.info("The bookmyshow website is open");
		
		driver.quit();
		OurLogger.error("We didn't want to close browser");
		
		
	

	
		

	}

}
