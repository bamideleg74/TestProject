package StepsDefinition;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class SearchKyewordDataDriven {
	
	WebDriver driver;
	
	@Given("^that I navigates to https://stackoverflow\\.com$")
	public void that_I_navigates_to_https_stackoverflow_com() throws Throwable {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://stackoverflow.com/");
		System.out.println("Start the browser");      
		System.out.println("Browser check");

	} 
	@When("^I enter the SearchKeyword \"([^\"]*)\"\\. Click search button$")
	public void i_enter_the_SearchKeyword_Click_search_button(String title) throws Throwable {
		 driver.findElement(By.name("q")).clear();
		 driver.findElement(By.name("q")).sendKeys(title);
		 driver.findElement(By.linkText("For developers")).click();
		 System.out.println("User entered the search criteria");

	}
	@When("^I should see the page title$")
	public void i_should_see_the_page_title() throws Throwable {
		
		driver.findElement(By.cssSelector("#for-developers > .p-ff-roboto-slab-bold")).getText();
	    try  { 
	    	String SearchResult = driver.findElement(By.cssSelector("#for-developers > .p-ff-roboto-slab-bold")).getText();
	    	System.out.println(" The search result is " + SearchResult);
	    	System.out.println("Pass");
	    }catch (Exception e ){
	    	System.out.println("Object does not exists");
	    	System.out.println("Fail"); 

	    }
	
	}
	@When("^close the browser(\\d+)$")
	public void close_the_browser(int arg1) throws Throwable {
		driver.close();
		System.out.println("Close the browser");
	  
	}
}
