package Test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseTest;

public class loginTest extends BaseTest {
	
	
	@Test
	public void verifyLoginTest() {
		
	driver.findElement(By.xpath("//a[@href='/login']")).click();
	
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("sahar");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	String Message = driver.findElement(By.xpath("//div[@id='flash']")).getText();
	
	Assert.assertTrue(Message.contains("Your username is invalid!"));
	
	
	
	
	
	
	
	
	
	
	
	

}}
