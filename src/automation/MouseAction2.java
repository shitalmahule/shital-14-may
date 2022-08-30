package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseAction2 {
  public static void main(String[] args) {
	  WebDriver driver = Browser1.openBrowser("https://www.globalsqa.com/demo-site/draganddrop/");
	  
	  WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
	  driver.switchTo().frame(iframe);
	
      WebElement source = driver.findElement(By.xpath("//li[@class='ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle']"));
	  WebElement destination = driver.findElement(By.xpath("//div[@id='trash']"));
	 
	  Actions action = new Actions(driver);
	  action.dragAndDrop(source, destination);
	  action.perform();
}
}
