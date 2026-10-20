package SelectableTest;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import SelectableBase.BaseClass;
import SelectablePage.SelectablePage;


public class SelectableTest extends BaseClass {
	
	 
	  SelectablePage DIV;

	    @BeforeMethod
	    public void createPageObject() {
	        DIV = new SelectablePage(driver);
	    }
	
			
	@Test
	
	void verifyActivList() {
		
		Assert.assertTrue(DIV.checkActiveList());
		System.out.println("list Button is active now ");
	
	}
	
	
	@Test
	
	void verifyActiveButton() {
		
		Assert.assertTrue(DIV.checkActiveButton());
		System.out.println("Dapibus ac facilisis  Button is active now ");
		}
		

	
	@Test
	
	void verifyActiveThree() {
		
		Assert.assertTrue(DIV.threeselected());
		System.out.println("Three Button is active now ");
	
	}
	
	
	

	@Test
	@Parameters({"gridItem"})
	
	void verifyActiveselected (String gridItem) {
		
		Assert.assertTrue(DIV.selected( gridItem));
		System.out.println(" Button is active now ");
	
	}
	
	
	
	
	
	
	
	

}
