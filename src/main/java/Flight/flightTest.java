package Flight;

import java.time.LocalDate;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class flightTest {
	
	@Test
	public void verifyFlight() {
		
WebDriver driver = new ChromeDriver ();
		
		driver.get("https://www.jetblue.com");
		
		// -----------FROM 

		WebElement from=driver.findElement(By.xpath("//label[normalize-space()='From']/preceding-sibling::input[@role='combobox'][1]"));
				
		from.click();
		//from.sendKeys("Mumbai");

		driver.findElement(
		    By.xpath("//li[@value='BOM']")
		).click();
		
		
	//======================== to 	
		
		
		WebElement to = driver.findElement(By.xpath("//label[normalize-space()='To']/preceding-sibling::input[@role='combobox'][1]"));
		to.click();
	
		driver.findElement(By.xpath("//li[@value='LHR']")).click();
		
		//---------------------------------------------------------
       By DepartINPUT = By.xpath("//label[text()='Depart']/preceding-sibling::input");
		
	WebElement  DEPARTDate= driver.findElement(DepartINPUT);
			
	       DEPARTDate.click();
		 
		  LocalDate today = LocalDate.now();
		  
		  int day =today.getDayOfMonth();

	  LocalDate after2days= today.plusDays(2);
	  
	  int aftertowday= after2days.getDayOfMonth();
	  
	 
	
	WebElement daydate= driver.findElement(By.xpath("//div[@data-month='true'][.//div[normalize-space()='October 2026']]//button[.//span[normalize-space()='"+day+"']]"));
			daydate.click();
		  
		
	
	
	WebElement  returnbu= driver.findElement(By.xpath("//label[text()='Return']/preceding-sibling::input"));
	
	returnbu.click();
	
	
	
WebElement afer22day = driver.findElement(By.xpath("//div[@data-month='true'][.//div[normalize-space()='October 2026']]//button[.//span[normalize-space()='"+aftertowday+"']]"));
	
 afer22day.click();

driver.findElement(By.xpath("//div[text()='Search flights']")).click();




		

		
		
	}
	
	
	

}
