package automation1;

import org.openqa.selenium.WebDriver;

import automation.Browser1;

public class LoginZerodha {
	
	public void login() throws InterruptedException {
		WebDriver driver = Browser1.openBrowser("https://kite.zerodha.com/");
		ZerodhaLoginPage zerodhaloginpage = new ZerodhaLoginPage(driver);
		zerodhaloginpage.enteruserid("OKP335");
		zerodhaloginpage.enterpassword("ZAQ1234567");
		zerodhaloginpage.login();
		Thread.sleep(5000);
		zerodhaloginpage.pin("234567");
		zerodhaloginpage.submit();
		
	}
	 public static void main(String[] args) throws InterruptedException {
	  LoginZerodha obj = new LoginZerodha();
	  obj.login();
	  
}
}
