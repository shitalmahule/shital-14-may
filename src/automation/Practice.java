package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
  public static void main(String[] args) throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Documents\\selenium\\chromedriver.exe");
  	WebDriver driver = new ChromeDriver();
  	driver.get("https://www.amazon.in/");
  	
  /*	Thread.sleep(3000);
  	driver.navigate().forward();
  	Thread.sleep(3000);
  	driver.navigate().back();
  	Thread.sleep(3000);
  	driver.navigate().refresh();
  	
  	String title = driver.getTitle();
  	System.out.println(title);
  	String url = driver.getCurrentUrl();
  	System.out.println(url);
  	
  	WebElement sign = driver.findElement(By.xpath("//a[@data-nav-role='signin']"));
  	sign.click();
  	WebElement email = driver.findElement(By.id("ap_email"));
  	email.sendKeys("shitalmahule1992@gmail.com");
  	
  	WebElement c = driver.findElement(By.xpath("//input[@id='continue']"));
 	c.click();
 	
  	WebElement CA = driver.findElement(By.xpath("//a[ @id='createAccountSubmit']"));
  	CA.click();*/
  	
    WebElement heading = driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
    String t = heading.getText();
    System.out.println(t);
    
    
  	
}
}
