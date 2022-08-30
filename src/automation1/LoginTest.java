package automation1;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import automation.Browser1;

public class LoginTest {
	WebDriver driver;
	@BeforeClass
	public void openBrowser(){
		 driver = Browser1.openBrowser("https://www.facebook.com/");	
	}
	@Test(enabled = false)
      public void loginWithValidCredentialsTest() throws InterruptedException {
	   
	    FaceBookLoginPage facebookloginpage= new FaceBookLoginPage(driver);
	    facebookloginpage.enterEmailID("velocity");
	    facebookloginpage.enterPassword("123456");
	    Thread.sleep(3000);
	    facebookloginpage.clickOnSubmit();
     }
	@Test
	 public void loginWithOnlyEmail() {
	    FaceBookLoginPage facebookloginpage= new FaceBookLoginPage(driver);
		facebookloginpage.enterEmailID("velocity");
//		facebookloginpage.clickOnSubmit();
		facebookloginpage.clickOnForgot();
	}	
	@Test
	  public static void main (String[]args) throws InterruptedException {
		 LoginTest test = new LoginTest();
		 test.loginWithValidCredentialsTest();
		 test.loginWithOnlyEmail();
	}	 
  
//	@AfterClass
//	public void BrowserClosed() {
//		driver.close();
//	}
}
