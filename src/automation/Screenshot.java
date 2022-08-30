package automation;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
     public static void main(String[] args) throws IOException {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Documents\\selenium\\chromedriver.exe");
 		WebDriver driver = new ChromeDriver(); 
 		driver.get("https://vctcpune.com/selenium/practice.html");
 		TakesScreenshot sc = ((TakesScreenshot)driver);//upcasting of Webdriver interface
 		File source = sc.getScreenshotAs(OutputType.FILE);//method -getscreenshot of Takescreenshot interface
     	File Destination = new File("C:\\Users\\DELL\\Pictures\\vctc1.jpg");
 		FileHandler.copy(source, Destination);
 		
	}

	public static String getDate() {
		DateTimeFormatter Dtf = DateTimeFormatter.ofPattern("yyyy-MMM-dd HH-mm-ss");//format of date n time
		LocalDateTime currentTime = LocalDateTime.now();//return current time
		String d = Dtf.format(currentTime);//method to required format n return string
		
		return d;
	}
}

