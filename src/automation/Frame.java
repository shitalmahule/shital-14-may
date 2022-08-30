package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Frame {
   public static void main(String[] args) {
	  WebDriver driver = Browser1.openBrowser("https://vctcpune.com/selenium/practice.html");
 
		driver.switchTo().frame(0);  //switch to frame by index
//		driver.switchTo().frame("iframe-name");//switch to frame by id or name
//		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='courses-iframe']"))); //switch to frame by webelement
//	
     WebElement course = driver.findElement(By.xpath(""));
     course.click();
     
     driver.switchTo().defaultContent();//will switch the focus to main page
    
     WebElement alert = driver.findElement(By.xpath(""));
     alert.click();
}
}
