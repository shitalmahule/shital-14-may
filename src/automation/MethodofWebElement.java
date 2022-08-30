package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodofWebElement {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Documents\\selenium\\chromedriver.exe");
	WebDriver driver = new ChromeDriver(); 
	driver.get("https://vctcpune.com/selenium/practice.html");
	WebElement text = driver.findElement(By.xpath("//input[@name='show-hide']"));
	text.sendKeys("shital");
	boolean status = text.isDisplayed();
	System.out.println(status);
	Thread.sleep(6000);
	
	WebElement hide = driver.findElement(By.xpath("//input[@hide-textbox]"));
	hide.click();
	boolean Status = hide.isDisplayed();
	System.out.println(Status);
	
	WebElement heading = driver.findElement(By.xpath("//h1[text()='Welcome To Practice Page']"));
	String text1 = heading.getText();
	System.out.println(text1);
}
}
