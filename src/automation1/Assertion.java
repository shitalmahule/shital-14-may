package automation1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import automation.Browser1;

public class Assertion {
	
      @Test
	  public void vctc() {
      WebDriver driver = Browser1.openBrowser("https://vctcpune.com/selenium/practice.html");
      WebElement hide = driver.findElement(By.xpath("//input[@id='hide-textbox']"));
	  hide.click();
	  
	  WebElement textbox = driver.findElement(By.xpath("//input[@id='displayed-text']"));
	  boolean result = textbox.isDisplayed();
	  
//	  Assert.assertEquals(result,false);//hard assertion 
	  Assert.assertFalse(result);
	  
	  String title = driver.getTitle();
	  
	  Assert.assertEquals(title,"Practice page");
	  
	  System.out.println("Thank you");
	
	
	
	
  }	
	
}
