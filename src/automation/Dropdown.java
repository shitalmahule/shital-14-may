package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
 public static void main(String[] args) throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Documents\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://vctcpune.com/selenium/practice.html");
		WebElement drop = driver.findElement(By.xpath("//select[@id=\"dropdown-class-example\"]"));
		
		Select select = new Select(drop);
		select.selectByIndex(2);
		select.selectByValue("option1");
		select.selectByVisibleText("option2");
		Thread.sleep(3000);
//		WebElement drop1 = driver.findElement(By.xpath("//option[@value='option2']"));
//		drop1.click();

}
}

