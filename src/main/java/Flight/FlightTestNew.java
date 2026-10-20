package Flight;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class FlightTestNew {
	
	@Test
	public void FlightTesting() {
	
	WebDriver driver;
	driver= new ChromeDriver();
    WebDriverWait wait;
    
 
    
    By Popframe = By.xpath("//div[contains(@class,'trustarc_newcm_container') and contains(@class,'truste_popframe')]");
    
    wait= new WebDriverWait (driver,Duration.ofSeconds(30));
	driver.get("https://www.jetblue.com/"); 
	
	
	try {

		
	// Find the Shadow DOM host
	WebElement host = wait.until(ExpectedConditions.presenceOfElementLocated(Popframe)) ;
			
	System.out.println("2. Popup host found.");	
	
	

	//  Enter Shadow DOM
      SearchContext  shadow_root = host.getShadowRoot();
	 
	
    System.out.println("3. Shadow DOM entered.");

	  // Find Reject All inside Shadow DOM
    
	
	 WebElement reject_all = shadow_root.findElement(By.xpath("//*[contains(text(),'Reject All')]"));
			
			  //System.out.println("4. Reject All found.");
			  
			
	// Click
			 reject_all.click();
	System.out.println("=== Reject All clicked successfully ===");
	
	  
	}
	
	
    catch (Exception e) {
        // لا يوجد popup — نكمل
    }

    System.out.println("=== cookie popup handled ===");

   

	
	
	
	

}}
