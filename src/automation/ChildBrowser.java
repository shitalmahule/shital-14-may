package automation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChildBrowser {  //popup
  public static void main(String[] args) {
	 WebDriver driver = Browser1.openBrowser("https://vctcpune.com/");
	
//	 String handle = driver.getWindowHandle();// returns the address of main webpage
//	 System.out.println(handle);
//	 
	 WebElement Practise = driver.findElement(By.xpath("//a[@href='../selenium/practice.html']"));
	 Practise.click();
	 Practise.click();
	 
	 Set<String>handles = driver.getWindowHandles();//returns the address of muliple webpage
	 System.out.println(handles);
	 
	 Iterator<String> a = handles.iterator(); //4
	   
	 while(a.hasNext())
	 {
		 String handle = a.next();
		 driver.switchTo().window(handle);
		String currentTitle = driver.getTitle();
//		 System.out.println(currentTitle);
	 if(currentTitle.equals("Practice Page") )
		 {
			WebElement radio = driver.findElement(By.xpath("//input[@type='radio'][1]"));
			 radio.click();
		 }
	 
	 }
		 
	 

}
}
