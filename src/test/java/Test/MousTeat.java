package Test;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Base.BaseTest;
import junit.framework.Assert;

public class MousTeat extends BaseTest{
	
	@Test
	public void MouseTest () throws InterruptedException {
		
	
	driver.get("https://the-internet.herokuapp.com/hovers");
	
	WebElement mouse = driver.findElement(By.xpath("//div[@class='example']/div[1]/img"));
	
	Actions action =new Actions(driver);
	
	action.moveToElement(mouse).perform();
	
	WebElement text = driver.findElement(By.xpath("//h5[text()='name: user1']"));
	String  text1=text.getText();
	Assert.assertTrue(text.isDisplayed());
	
	System.out.println("the text is :" + text1);
	
	Thread.sleep(2000);
	
	action.doubleClick(mouse).perform();
	
	Thread.sleep(2000);
	
	action.dragAndDrop(mouse, text).perform();
	
	driver.get("https://the-internet.herokuapp.com/drag_and_drop");
	
	WebElement a= driver.findElement(By.id("column-a"));
	WebElement b= driver.findElement(By.id("column-b"));
	
	Thread.sleep(2000)
	;
	action.dragAndDrop(a, b).perform();
	
	
	

	
	
	
		
		
		
		
		
	}

}
