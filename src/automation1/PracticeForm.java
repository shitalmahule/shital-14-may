package automation1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PracticeForm {

	@FindBy(xpath="//input[@id='firstName']")private WebElement firstName;
	@FindBy(xpath="//input[@id='lastName']")private WebElement lastName;
	@FindBy(xpath="//input[@id='userEmail']")private WebElement email;
	@FindBy(xpath="//div[@class='col-md-9 col-sm-12']")private WebElement gender;
	@FindBy(xpath="//input[@id='userNumber']")private WebElement mobileNo;
	@FindBy(xpath="//input[@id='dateOfBirthInput']")private WebElement DOB;
	@FindBy(xpath="//div[@class='subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3']")private WebElement subject;
	@FindBy(xpath="(//div[@class='col-md-9 col-sm-12'])[6]")private WebElement hobbies;
	@FindBy(xpath="//input[@id='uploadPicture']")private WebElement picture;
	@FindBy(xpath="//textarea[@id='currentAddress']")private WebElement cAddress;
	@FindBy(xpath="")private WebElement stateCity;

	public PracticeForm(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void firstName(String FN) {
		firstName.sendKeys(FN);
	}
	public void lastName(String LN) {
		lastName.sendKeys(LN);
	}
	public void email(String mail) {
		email.sendKeys(mail);
	}
	public void gender(String gd) {
		gender.sendKeys(gd);
	}
	public void mobileNo(String No) {
		mobileNo.sendKeys(No);
	}
	public void DOB(String dob) {
		DOB.sendKeys(dob);
	}
	public void subject(String sub) {
		subject.sendKeys(sub);
	}
	public void hobbies(String hobby) {
		hobbies.sendKeys(hobby);
	}
	public void picture() {
		picture.click();
	}
	public void cAddress(String add) {
		cAddress.sendKeys(add);
	}
		
		
		
		
		
		
		
	
}
