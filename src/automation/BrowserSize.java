package automation;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;

public class BrowserSize {
       public static void main(String[] args) {
		WebDriver driver =Browser1.openBrowser("https://www.facebook.com/");
		Dimension d = new Dimension(600,900);
		driver.manage().window().setSize(d);
		
		Point P = new Point(300,400);
		driver.manage().window().setPosition(P);
	}
}



