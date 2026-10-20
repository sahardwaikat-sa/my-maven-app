package SelectablePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SelectablePage {

	private WebDriver driver;

	// Locater

	By listButton = By.xpath("//button[@id='demo-tab-list']");
	By listselected = By.xpath("//li[text()='Cras justo odio']");
	By GridButtons = By.xpath("//button[@id='demo-tab-grid']");
	By Gridselected = By.xpath("//li[normalize-space()='Five']");

	// constructer
	public SelectablePage(WebDriver driver) {
		this.driver = driver;
	}
		
	
	
        public void locaterChange(String gridItem){	
		
	    	   By.xpath("//li[normalize-space()='"+ gridItem +"']");
		
		
	}
//   Methods1

	public boolean checkActiveList() {
		driver.findElement(listButton).click();

		if (driver.findElement(listButton).getAttribute("class").contains("active")) 
			return true;
	    return false;

		//} else {

			//return false;
		//}
	}

	// Method2

	public boolean checkActiveButton() {

		driver.findElement(listselected).click();
		if (driver.findElement(listselected).getAttribute("class").contains("active")) 			
			return true;
	   return false;
		//} else {

			
		//}
	}

	// Method3

	 public void Gridclick() {

	 driver.findElement(GridButtons).click();

	 }

	// Method4
	public boolean threeselected() {
		Gridclick();
		driver.findElement(Gridselected).click();

		if (driver.findElement(Gridselected).getAttribute("class").contains("active")) 
			return true;
         return false;
		//} else {

			
		//}

	}
	
	
	public boolean selected(String gridItem) {
		Gridclick();
		
		driver.findElement(By.xpath("//li[normalize-space()='"+ gridItem +"']")).click();

		if (driver.findElement(By.xpath("//li[normalize-space()='"+ gridItem +"']")).getAttribute("class").contains("active")) 
			return true;
         return false;
	}
}
