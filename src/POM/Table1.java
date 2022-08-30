package POM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v101.browser.Browser;

import automation.Browser1;

public class Table1 {
      public static void main(String[] args) {
		WebDriver driver = Browser1.openBrowser("https://demo.guru99.com/test/web-table-element.php");
		
		List<WebElement>currentPrice = driver.findElements(By.xpath("//table1//tbody[1]//tr//td[4]"));
		double max = 0;
		for(int i = 1;i<currentPrice.size();i++) 
		{
			WebElement coloumn = currentPrice.get(i);
			String price = coloumn.getText();
			double value = Double.parseDouble(price);
			if(value>max) 
			{
				max = value;
			}
			
		}
		System.out.println("Max current price is"+max);
	}
}