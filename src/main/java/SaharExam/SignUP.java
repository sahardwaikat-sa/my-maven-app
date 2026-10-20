package SaharExam;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import java.util.Random;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import org.testng.Assert;



public class SignUP extends SetupPage {
	
	 private String generateRandomName() {
	        String[] names = {"sahar", "mohammed", "ahmad", "nour", "lama", "mira", "noor", "ali"};
	        Random random = new Random();
	        return names[random.nextInt(names.length)] + random.nextInt(1000);
	    }

	    private String generateRandomEmail() {
	        return generateRandomName().toLowerCase() + System.currentTimeMillis() + "@gmail.com";
	    }

	    @DataProvider(name = "signUpDATA")
	    public Object[][] getdata3() {
	        return new Object[][] {
	            { generateRandomName(), generateRandomEmail() }
	        };
	    }

	
	@DataProvider(name ="InfoDATA")
	public Object[][] getdata() {

		return new Object[][] {
			{"1234", "sahar1","dwailk","adress111","palestine","nablus","00972","0599311989" } 
			

		};
	}
	
	
	
	
	
	@Test(priority=1,dataProvider ="signUpDATA")
		
	public void verifySignUPTest( String name, String email) {
		
		
		By signup= By.xpath("//a[@href='/login']");
		By Name = By.xpath("//input[@placeholder='Name']");
		By Email = By.xpath("//input[@data-qa='signup-email']");
		By signUpButton=By.xpath("//button[@data-qa='signup-button']");
		

		
		driver.findElement(signup).click();
		driver.findElement(Name).sendKeys(name);
		driver.findElement(Email).sendKeys(email);
		driver.findElement(signUpButton).click();
		
	}
	
	@Test(priority=2,dataProvider = "InfoDATA")
	
	public void verifyInformationaccount( String PASS, String Firstname,String Lastname,String Adress, String State,String City,String ZIP,String Mobile ) {
		
By MR = By.xpath("//input[@id='id_gender1']");
By pass = By.xpath("//input[@id='password']");
By day= By.xpath("//select[@id='days']");
By month= By.xpath("//select[@id='months']");
By Year = By.xpath("//select[@id='years']");
By NewsCheck = By.xpath("//input[@id='newsletter']");

By firstname= By.xpath("//input[@id='first_name']");
By lastname =By.xpath("//input[@id='last_name']");
By adress1 = By.xpath("//input[@id='address1']");
By countrylist = By.xpath("//select[@id='country']");
By state = By.xpath("//input[@id='state']");
By city = By.xpath("//input[@id='city']");
By zipcode = By.xpath("//input[@id='zipcode']");
By mobileNO= By.xpath("//input[@id='mobile_number']");

By createaccount = By.xpath("//button[@data-qa='create-account']");

driver.findElement(MR).click();

driver.findElement(pass).sendKeys(PASS);

WebElement day1 = driver.findElement(day);

Select daylist =new Select(day1);

daylist.selectByVisibleText("2");

WebElement month1 = driver.findElement(month);

Select monthlist =new Select(month1);

monthlist.selectByVisibleText("April");

WebElement year1 = driver.findElement( Year);

Select yearlist =new Select(year1);

yearlist.selectByVisibleText("2021");

driver.findElement(NewsCheck).click();

driver.findElement(firstname).sendKeys(Firstname);
driver.findElement(lastname).sendKeys(Lastname);
driver.findElement(adress1).sendKeys(Adress);

WebElement country  = driver.findElement(countrylist);

Select country11 =new Select(country);

country11.selectByValue("Canada");


driver.findElement( state).sendKeys(State);
driver.findElement( city).sendKeys(City);
driver.findElement(zipcode).sendKeys(ZIP);
driver.findElement(mobileNO).sendKeys(Mobile);

driver.findElement(createaccount).click();



   Assert.assertTrue(driver.getCurrentUrl().contains("account_created"));
   System.out.println(driver.getCurrentUrl());

   By accountCreatedMsg = By.xpath("//b[normalize-space()='Account Created!']");

   wait.until(ExpectedConditions.visibilityOfElementLocated(accountCreatedMsg));

   String message = driver.findElement(accountCreatedMsg).getText().trim().toLowerCase();

   System.out.println(message);
   Assert.assertTrue(message.contains("account created"));
	
	
	

}}
