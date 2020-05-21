package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class base {
	
	public static WebDriver driver;
	public Properties prop;
	public WebDriver initializeDriver() throws IOException 
	
	{
	    prop = new Properties();
	    //FileInputStream System.getProperty("user.dir")
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"/src/main/java/resources/data.properties");
		prop.load(file);
		String browserName = prop.getProperty("browser");
		
		System.out.println(browserName);
		
		if (browserName.equals("Chrome"))
		{
			//Execute
			System.setProperty("webdriver.chrome.driver","/Users/lisandrosilva/Documents/Drivers/chromedriver ");
		                driver = new ChromeDriver();
		                 
		}
		else if (browserName.equals("Safari")) {
			
			//Execute
			//driver = new SafariDriver();
		}
		else if (browserName.equals("FireFox")) {
			System.setProperty("webdriver.gecko.driver","/Users/lisandrosilva/Documents/Drivers/geckodriver");
                           driver = new FirefoxDriver();	
			//Execute
		      // driver = new FirefoxDriver();
		}
		else if (browserName.equals("IE")) {
			//Execute
			    // driver = new InternetExplorerDriver();
		}
		
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		return driver;
	}

}
