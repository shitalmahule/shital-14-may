package automation;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot1 {
        public static void takesScreenshot(WebDriver driver,String name) throws IOException {
			
        	String date = Screenshot.getDate();
			
			TakesScreenshot sc = ((TakesScreenshot)driver);
	 		File source = sc.getScreenshotAs(OutputType.FILE);
	     	File Destination = new File("C:\\Users\\DELL\\Pictures\\"+name+""+date+".jpg");
	 		FileHandler.copy(source, Destination);
        	
        	
        	
		} 
       
}
