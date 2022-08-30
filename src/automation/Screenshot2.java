package automation;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

public class Screenshot2 {
    public static void main(String[] args) throws IOException {
		WebDriver driver = Browser1.openBrowser("https://www.facebook.com/");
		 
		ScreenShot1.takesScreenshot(driver," shital");
	}
}
