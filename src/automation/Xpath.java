package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Xpath {
  public static void main(String[] args) throws InterruptedException {
	 WebDriver driver = Browser1.openBrowser("https://www.facebook.com/");
	 
	 WebElement email = driver.findElement(By.xpath("//input[@name ='email']"));
	 email.sendKeys("shital");
	 
	 WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
	 password.sendKeys("pune");
	
	 Thread.sleep(6000);
     WebElement key = driver.findElement(By.xpath("//div[@class='_9lsb _9ls9']"));
	 key.click();
	 
	 WebElement Email = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input"));
	 Email.sendKeys("velocity");
	 
	
}
}
