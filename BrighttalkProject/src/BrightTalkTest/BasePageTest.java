package BrightTalkTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Helper.BrowserSetup;




public class BasePageTest<BasePagepageFactory> {	
	
	@Test
	public void verifySearch () {
		
// This will launch specific browser and url		
		WebDriver driver =BrowserSetup.startBrowser("IE","https://stackoverflow.com");
	

//  Created page object using Page factory
		BasePageTest SearchKeyword =PageFactory.initElements(driver,BasePageTest.class);
		 
// Call the method	
		BasePagepageFactory searchTitle.sendKeys("Automation Tester");
				 
	    driver.quit();  
		
	  }

	}
	
	


