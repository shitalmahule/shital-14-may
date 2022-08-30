package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
   public static void main(String[] args) throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Documents\\selenium\\chromedriver.exe");
	WebDriver driver = new ChromeDriver(); 
	driver.get("https://in.tradingview.com/");
	
	driver.navigate().to("https://www.youtube.com/");
	
	Thread.sleep(2000);        //set the time
	
	driver.navigate().back();
    driver.navigate().forward();
	driver.navigate().refresh();
	
	String title = driver.getTitle();
	System.out.println(title);
	
	String url = driver.getCurrentUrl();
	System.out.println(url);
	
	driver.manage().window().maximize();
	driver.manage().window().minimize();
	
}


}

