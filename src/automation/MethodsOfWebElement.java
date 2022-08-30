package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodsOfWebElement {
  public static void main(String[] args) {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Documents\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://demo.guru99.com/test/radio.html");
		WebElement radio = driver.findElement(By.xpath("//input[@type='radio']"));
		radio.click();
		boolean r = radio.isSelected();
		System.out.println(r);
		
}
}
