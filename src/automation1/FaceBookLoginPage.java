package automation1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FaceBookLoginPage {     //POM
	
	@FindBy(xpath="//input[@id='email']")private WebElement email;
	@FindBy(xpath="//input[@id='pass']")private WebElement password;
	@FindBy(xpath="//button[@id='loginbutton']")private WebElement submit;
	@FindBy(xpath="//a[text()='Forgotten password?']")private WebElement forgot;
	@FindBy(xpath="//a[text()='Sign up for Facebook']")private WebElement signup;
	@FindBy(xpath="//a[text()='Create a Page']")private WebElement createpage;
	
	public FaceBookLoginPage(WebDriver driver) {  //we use initelement of pagefactory  class which used the webdriver reference in its argument and then 
		PageFactory.initElements(driver, this); //with help of @findBy annotation it will find all the webelements declared in the class
	}
	
	public void enterEmailID(String mail){
		email.sendKeys(mail);
	}
	public void enterPassword(String pass) {
		password.sendKeys(pass);
	}
	public void clickOnSubmit() {
		submit.click();
	}
	public void clickOnForgot() {
		forgot.click();
	}
	public void clickOnSignup() {
		signup.click();
	}
	public void clickOnCreatePage() {
		createpage.click();
	}
 }
