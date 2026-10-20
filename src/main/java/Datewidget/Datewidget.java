package Datewidget;

import java.time.LocalDate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Datewidget {
	
	@Test
		public void dateTesting() throws InterruptedException {

			
      WebDriver driver = new ChromeDriver ();
		
		driver.get("https://jqueryui.com/datepicker/");
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		
		driver.switchTo().frame(frame);
		
	WebElement  calen= driver.findElement(By.xpath("//input[@id='datepicker']"));
		
		calen.click();
		
	
		 
		  LocalDate today = LocalDate.now();
		  
		  int day =today.getDayOfMonth();
	
	//WebElement  day= driver.findElement(By.xpath("//span[@title='Monday']"));
	
	//day.click();
	
	   Thread.sleep(2000);
	
	WebElement  daydate= driver.findElement(By.xpath("//a[@data-date="+day+"]"));
	
	daydate.click();
	   Thread.sleep(2000);
	   
	   
	//WebElement  month= driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
	
	//month.click();
	

	
	driver.switchTo().defaultContent();
	
	System.out.println (" the date is selected ");
	}

}
