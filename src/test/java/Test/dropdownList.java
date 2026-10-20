package Test;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseTest;


public class dropdownList extends BaseTest {
	
	By url =By.id("dropdown");
	
	String Url ="https://the-internet.herokuapp.com/dropdown";

	@Test
	public void  vrtifyDropdownSelect() {
	
		driver.get(Url);
	
	
	WebElement Dropdown = driver.findElement(url);
	
	Select sel=new Select (Dropdown);
	
       sel.selectByIndex(1);
       
        String Select1 = sel.getFirstSelectedOption().getText();
    
               
       System.out.println(Select1);
       
       Assert.assertEquals( Select1,"Option 1");

       Assert.assertTrue( Select1.contains("Option 1"));
       
     
     

}
	@Test
	public void  vrtifyDropdownList() {
		
		driver.get(Url);
		
		
		WebElement Dropdown = driver.findElement(url);
		
		Select sel=new Select (Dropdown);
		
		List<WebElement>list1= sel.getOptions();
		
		int count=0;
			
		for(WebElement list2 : list1) {
			
			System.out.println(list2.getText());
						count++;
			
					}
		
		System.out.println("actual size" + count);
		
		Assert.assertEquals(count, list1.size());
		
		
	}
	
	
	

	
}
