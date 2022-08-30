package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Keyboard {
  public static void main(String[] args) {
	 WebDriver driver = Browser1.openBrowser("https://demoqa.com/text-box");
	
	 WebElement Firstname = driver.findElement(By.xpath("//input[@id='userName']"));
	 Firstname.sendKeys("shital");
	 
	 Actions action = new Actions(driver);
	 action.sendKeys(Keys.TAB);
	 action.perform();
	 
	 action.sendKeys("xyz@gmail.com");
	 action.perform();
	
	 action.sendKeys(Keys.TAB);
	 action.perform();
	 
	 action.sendKeys("makade nagar");
	 action.perform();
	 
	 action.keyDown(Keys.CONTROL);
	 action.sendKeys("a");
	 action.keyUp(Keys.CONTROL);
	 action.build().perform();
	 
	 action.keyDown(Keys.CONTROL);
	 action.sendKeys("c");
	 action.keyUp(Keys.CONTROL);
	 action.build().perform();
	 
	 action.sendKeys(Keys.TAB);

	 action.keyDown(Keys.CONTROL);
	 action.sendKeys("v");
	 action.keyUp(Keys.CONTROL);
	 action.build().perform();
	 
	 
}
 
}
