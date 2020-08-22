package Helper;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;

public class BrowserSetup {
	
	static WebDriver driver;
	
	
	public static WebDriver startBrowser(String browserName, String url) {	
	
	String path = System.getProperty("user.dir");
	System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\browserDrivers\\IEDriverServer.exe");


	if(browserName.equalsIgnoreCase("Firefox")) 
	{
		driver = new FirefoxDriver ();
	   
	}
	else if(browserName.equalsIgnoreCase("IE")) 
	{
		
		driver = new InternetExplorerDriver();
	}
	else if(browserName.equalsIgnoreCase("Chrome")) {
		
		driver= new ChromeDriver();		
	}
     else if(browserName.equalsIgnoreCase("edge")) {
		
		driver = new EdgeDriver();	
	}
	 driver.manage().window().maximize();
	 driver.get(url);
	 
	 return driver;
  }
}
