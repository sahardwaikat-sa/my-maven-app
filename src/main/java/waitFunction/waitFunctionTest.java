package waitFunction;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class waitFunctionTest {
	
@Test
public void testingWaitFunction() {

   WebDriver driver=new ChromeDriver();
   
       driver.manage().window().maximize();

    // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    driver.get("https://the-internet.herokuapp.com/dynamic_controls");
 
    
 
    
   //WebElement sahar= driver.findElement(By.xpath("//a[@href='/abtest']"));
    
 // WebElement ath= wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Form Authentication")));
        
  //ath.click();
   
   WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(20));
    
   WebElement sahar= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Enable']")));
   sahar.click();
  
   WebElement saha= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='text']")));
  
  saha.sendKeys("Hello");
   
    //System.out.println(sahar.getText());
  

 Calendar calendar = Calendar.getInstance();

Date currentDateTime = calendar.getTime();

//==================================================  
 System.out.println(currentDateTime);
  
 
  
  LocalDate  today =LocalDate.now();
 int ss= today.getDayOfMonth();
 

    
	System.out.println(ss);
 
  System.out.println(today);
  
 
  
  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd");

	String today1=today.format(formatter);
	  System.out.println(today1);
//======================================================
	  
	  Date date= new Date();
	  System.out.println(date);


	
	  
	  
	  
	  
}}
