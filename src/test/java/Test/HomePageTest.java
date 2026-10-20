package Test;


import org.testng.Assert;
import org.testng.annotations.Test;
import Base.BaseTest;

public class HomePageTest extends BaseTest{
	
	
	@Test
	public void verifyHomepage() {
					 
	 Assert.assertTrue(driver.getTitle().contains("Internet")); 
	 System.out.println("the test is pass");
		
		
		
	}
	
	

}
