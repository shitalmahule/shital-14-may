package POM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.Browser;

import automation.Browser1;


public class Table {
	public static void main(String[]args) {
		
	 WebDriver driver = Browser1.openBrowser("https://demo.guru99.com/test/web-table-element.php");

     WebElement cName = driver.findElement(By.xpath("//table//tbody//tr[5]//td[1]"));
     System.out.println(cName);
     
     WebElement price = driver.findElement(By.xpath("//table//tbody//tr[5]//td[3]"));
     System.out.println(price);
     
     List<WebElement>heading = driver.findElements(By.xpath("//table//thead//th"));
     
     for(int i=0;i<heading.size();i++)
     {
    	 WebElement head = heading.get(i);
    	 System.out.println(head.getText());
     }
      
}

}
