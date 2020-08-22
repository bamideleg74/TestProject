package BrighttalkPages;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BasePagepageFactory {

	
	 private static WebDriver driver; 
		
		
		public BasePagepageFactory(WebDriver driver) 
		{
			this.driver=driver;
		}
		
		@FindBy(how=How.NAME,using="q") 
		WebElement SearchKeyword;
				
		@FindBy(how=How.LINK_TEXT,using="For developers") 
		WebElement submitButton;
		
		@FindBy(how=How.CLASS_NAME,using="#for-developers > .p-ff-roboto-slab-bold") 
		WebElement searchResults;
			
		public void searchTitle (String SearchForItems ){
			SearchKeyword.sendKeys(SearchForItems);
			submitButton.click();
			searchResults.getText();
			
		}
			        
		public static void takesScreenshot (String filename) throws IOException {    	                                                             
	                                                                                             
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);                                                                      
		FileHandler.copy(file, new File ("C:/Users/Allogogate/workspace/BrighttalkProject/Screenshot" + filename+".png"))	;               
		
		}                                                                                                                                             
    
}

