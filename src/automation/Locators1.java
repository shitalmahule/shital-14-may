package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Locators1 {
  public static void main(String[] args) {
	     WebDriver driver = Browser1.openBrowser("https://www.facebook.com/"); 
	
	     WebElement createpage = driver.findElement(By.partialLinkText("Create a"));
	     createpage.click();
	     
	     WebElement signup = driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']")) ; 
	     signup.click();
	     	
	    
}
}
