package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser1 {
        public static WebDriver openBrowser(String url) {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Documents\\selenium\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	driver.navigate().to(url);
    	driver.manage().window().maximize();
    	return driver;
    }
}
