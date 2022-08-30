package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseAction3 {
 public static void main(String[] args) throws InterruptedException {
	WebDriver driver = Browser1.openBrowser("https://www.globalsqa.com/demo-site/draganddrop/");
	WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
	driver.switchTo().frame(iframe);
	
	List<WebElement>source = driver.findElements(By.xpath("//li[@class='ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle']"));
	int s = source.size();//to get the size of list
	
	WebElement destination = driver.findElement(By.xpath("//div[@id='trash']"));
	Actions action = new Actions(driver);
	
	for (int i=0;i<s;i++) //0,1,2,3,4
	{
		WebElement image = source.get(i);//get method is used to get the value from list 
		action.dragAndDrop(image ,destination) ;
		action.perform();
		Thread.sleep(2000);
	}
	
}
}
