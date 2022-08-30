package automation1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import automation.Browser1;

public class Assertion1 {
      @Test
      public void vctc() {
    	  WebDriver driver = Browser1.openBrowser("https://vctcpune.com/selenium/practice.html");
    	  WebElement hide = driver.findElement(By.xpath("//input[@id='hide-textbox']"));
    	  hide.click();
    	  
    	  WebElement textBox = driver.findElement(By.xpath("//input[@id='displayed-text']"));
    	  boolean result = textBox.isDisplayed();
    	  
    	  SoftAssert softAssert = new SoftAssert();
    	  softAssert.assertTrue(result);    //soft Assert
    	  String title = driver.getTitle();
    	  softAssert.assertEquals(title,"Practice Page");
    	  System.out.println("ThankYou");
    	  
    	  softAssert.assertAll(); //it prints the assertion result at the end 
      }
}
