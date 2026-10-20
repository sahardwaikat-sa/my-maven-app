package SwagLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
	
	public   WebDriver driver;
	
	//LOCATERS 
			
	    By username= By.id("user-name");
		By password=By.id("password");
		By login=By.id("login-button");
		By Title=By.xpath("//span[text()='Products']");
		
		
		
	
	
	

     
    public loginPage(WebDriver driver) {
    	this.driver = driver;
	}


    
	public void enterUsername(String Username ) {
    	
    	 driver.findElement(username).sendKeys(Username);
     
  	     	 
     }
	
    
    public void enterPassword(String Password ) {
    	
   	 driver.findElement(password).sendKeys(Password);
     	     	 
    }
    
	
	public void clikLogin() {
			driver.findElement(login).click();
      
         
		
	}
	
	

	
	
	
	public String goNextpage() {
		
	    return driver.findElement(Title).getText();
		
	}
	
	
	
	public void loginFunction(String Username , String Password) {
		 enterPassword( Password );
		 enterUsername (Username );
		 		clikLogin();
		 		
		 		
	}




	
	
	

}
