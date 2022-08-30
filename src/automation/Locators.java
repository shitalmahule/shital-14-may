package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
   public static void main(String[] args) {
	  	 WebDriver driver = Browser1.openBrowser("https://www.facebook.com/");
	 WebElement email = driver.findElement(By.id("email"));
	 email.sendKeys("Velocity");

     WebElement password = driver.findElement(By.name("pass"));
     password.sendKeys("katraj");
   
     WebElement login = driver.findElement(By.name("login"));
     login.click();  
    
     WebElement forgot = driver.findElement(By.className("97w4"));
     forgot.click();
	  
	 
     	
   
}
}
