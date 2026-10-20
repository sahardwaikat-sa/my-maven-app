package alertTest;

import org.testng.annotations.Test;
import org.testng.Assert;


import java.time.Duration;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;



public class alertTest {
	
	@Test
		
	public void verifyAlertTest() {
		
		WebDriver driver ;
		
		WebDriverWait wait;
		
		driver =new ChromeDriver();
		wait= new WebDriverWait(driver,Duration.ofSeconds(20));
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

	
			 //Verify Promt alert 
			 
				WebElement Buttons= driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
				
				
				WebElement Mesg = driver.findElement(By.xpath("//p[@id='result']"));
				
				Buttons.click();
				
				//Alert alert2= driver.switchTo().alert();
													
				Alert alert2 = wait.until(ExpectedConditions.alertIsPresent());
							
				alert2.sendKeys("sahar");
				
				//Assert.assertTrue(alert2.getText().contains("Please enter your name"));
				
				alert2.accept();
				
				Assert.assertTrue(Mesg.getText().contains("sahar"));
				
				
				
				
				
				
						
				
			
		
	 }
	
}
