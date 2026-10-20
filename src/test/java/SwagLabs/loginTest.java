package SwagLabs;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class loginTest  extends baseTest{
	
	loginPage log;
	
	@BeforeMethod
	void setupdriver() {
		log=new loginPage(driver);
	}
	
	
	@Test(dataProvider ="Athentication")
	
	public void verifyLogin(String username , String password,  boolean expected) {
		try {
		log.loginFunction(username, password);
		
		if (expected) {
		        String result = log.goNextpage();
		        Assert.assertTrue(result.contains("Product"));
		        System.out.println("yes we are in product page");
		 }
		
		
		//String actualmessage = log.checkMessag();
		//Assert.assertTrue(actualmessage.contains("Username and password do not match any user in this servicet"));
		
			
	}catch  (Exception e) {
		System.out.println(e);
	
	}
	}	
	

	
	
@DataProvider(name ="Athentication")
	
	public  Object[][] getdata(){
		
		return new Object[][] {
			{"standard_user","secret_sauce",true},
			{"admin1","pass123",false},
			{"admin","123",false},
			{"","pass123",false},
			{"admin","",false},
			{"","",false},
			{"admin","-123",false},
			{"Admin","%&*#@",false,}
			
		};
}}







