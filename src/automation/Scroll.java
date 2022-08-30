package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Scroll {
 public static void main(String[] args) throws InterruptedException {
	 WebDriver driver = Browser1.openBrowser("https://demoqa.com/text-box");
	 WebElement submit = driver.findElement(By.xpath("//button[@id='submit']"));
	 
//	 ((JavascriptExecutor)driver).executeScript("arguments[0].scrollInToView(true)",submit);
	 Thread.sleep(2000);
	 ((JavascriptExecutor)driver).executeScript("window.scrollBy(100,300");
}
}
