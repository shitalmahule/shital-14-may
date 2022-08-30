package automation1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaLoginPage {
 
	@FindBy(xpath= "//input[@id='userid']")private WebElement id;
	@FindBy(xpath="//input[@id='password']")private WebElement password;
	@FindBy(xpath="//button[@class='button-orange wide']")private WebElement login;
	@FindBy(xpath= "//input[@id='pin']")private WebElement pin;
	@FindBy(xpath= "//button[@type='submit']")private WebElement submit;
	
	public ZerodhaLoginPage(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}
	public void enteruserid(String idname) 
	{
		id.sendKeys(idname);
	}	
	public void enterpassword(String pass)	{
		password.sendKeys(pass);
	}
	public void login() {
		login.click();
	}
	public void pin(String pinname) {
		pin.sendKeys(pinname);
	}
	public void submit() {
		submit.click();
	}
		
		
		
	}

