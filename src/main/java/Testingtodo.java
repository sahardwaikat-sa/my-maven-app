import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testingtodo {
	
	
	@Test
	public void toodolist() {
		
		WebDriver driver;
		WebDriverWait wait;
		
	
				
		
		driver = new ChromeDriver();
		wait = new WebDriverWait (driver ,Duration.ofSeconds(20));
		List<WebElement> lists ;
		
		driver.get("https://todomvc.com/examples/angular/dist/browser/#/all");
		
		WebElement list = driver.findElement( By.xpath("//input[@placeholder='What needs to be done?']"));
		
		By AllList = By.xpath("//ul[@class='todo-list']//li");
		By task1 = By.xpath("//label[normalize-space()='task1']");
		By CheckBox = By.xpath("//label[text()='task1']/preceding-sibling::input[@type='checkbox']");
		
		list.sendKeys("task1");
		list.sendKeys(Keys.ENTER);
		
		wait.until(ExpectedConditions.numberOfElementsToBe(AllList, 1));
	   
		list.sendKeys("task2");
		list.sendKeys(Keys.ENTER);
	
		wait.until(ExpectedConditions.numberOfElementsToBe(AllList, 2));
		
		
	
         lists = driver.findElements(AllList);
         
         
    Assert.assertEquals(lists.size(),2);
 		
 		Assert.assertFalse(lists.isEmpty());
 				
 		
		String name =driver.findElement(task1).getText();
		Assert.assertEquals(name, "task1");
		
		WebElement checkbox1= driver.findElement(CheckBox);
		checkbox1.click();
		
		
		Assert.assertTrue(checkbox1.isSelected());
		
		//Completed task 
		
		By completedtask = By.xpath("//li[@class='completed']");
		WebElement copmleted=driver.findElement(completedtask);
		
		Assert.assertTrue(copmleted.getAttribute("class").contains("completed"));
		
		//Deleted
		
		By deleteButton = By.xpath("//label[text()='task1']/following-sibling::button[@class='destroy']");
		
		driver.findElement(deleteButton).click();
		
	  List<WebElement>list2 =driver.findElements(AllList);
		
					     
	     Assert.assertEquals(list2.size(),1);

	     
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		;
		
		
		
		
	}
	

}
