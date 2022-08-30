package automation;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FaceBook {
  public static void main(String[] args) throws IOException, InterruptedException {
	
	  WebDriver driver = Browser1.openBrowser("https://www.facebook.com/");
	  
	  String emailId = Parametrization.getData("Sheet1", 0, 0);
	  String pass = Parametrization.getData("Sheet1", 1, 0) ;
	   Thread.sleep(2000);
	  WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
	  email.sendKeys(emailId);
	 
	  WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
	  password.sendKeys(pass);
}
}
