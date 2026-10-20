package Test;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseTest;


public class listTest extends BaseTest {
	
	@Test
	public void verifyList() {
		
		driver.get("https://jqueryui.com/menu/");
				
		WebElement Fram= driver.findElement(By.className("demo-frame"));
		
		driver.switchTo().frame(Fram);
		
				
		List<WebElement> mainlist=driver.findElements(By.xpath("//ul[@id='menu']/li"));
		
		//int count=0;
		String actual = null;
		
		for(WebElement list : mainlist) {
			
			if(list.getText().equals ("Books")) {
			 actual =list.getText();
				break;
			}
			
		System.out.println(list.getText());
		//count++;
					
	}
		Assert.assertEquals(actual,"Books");
	
		
			System.out.println(mainlist.size());
	
	Assert.assertTrue(mainlist.containsAll(mainlist));

	//int actualzise=count;
	
	WebElement listitem =driver.findElement(By.xpath("//ul[@id='menu']/li[2]"));
		
	System.out.println(listitem.getText());
	
	System.out.println("the mainlist have" +listitem.getText());
	
	Assert.assertTrue(mainlist.contains(listitem));
	
	System.out.println("the mainlist have" +listitem.getText());
	
	

}}
