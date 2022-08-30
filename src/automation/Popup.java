package automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Popup {
  public static void main(String[] args) throws InterruptedException {
	  WebDriver driver = Browser1.openBrowser("https://vctcpune.com/selenium/practice.html");
	  WebElement alert =  driver.findElement(By.xpath("//input[@id='alertbtn']"));
	  alert.click();
	  Alert a = driver.switchTo().alert();
	  Thread.sleep(2000);
	  a.sendKeys("shital");
//	  String s = a.getText();
//	  System.out.println(s);
//	  a.accept();
}
}
