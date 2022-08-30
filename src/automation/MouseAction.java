package automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {
   public static void main(String[] args) {
	 WebDriver driver = Browser1.openBrowser("https://demo.guru99.com/test/simple_context_menu.html");
	 WebElement rclick = driver.findElement(By.xpath("//span[text()='right click me']"));
	 Actions action = new Actions(driver);
	 action.contextClick(rclick);
	 action.perform();
	 
	/*WebElement dclick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
	action .doubleClick(dclick);
	action.perform();*/
	
	WebElement alert = driver.findElement(By.xpath("//span[text()='right click me']"));
	alert.click();
	Alert a = driver.switchTo().alert();
	a.accept();
	
}
}
