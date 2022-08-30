package automation1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Shital{
  @Test
  public void sample() 
  {
	  System.out.println("test1 executed");
  }
  @Test
  public void test() 
  {
	System.out.println("test2 executed");  
  }
  @BeforeClass
  public void beforeClass()
  {
	  System.out.println("Before class executed");
  }
  @AfterClass
  public void afterClass()
  {
	  System.out.println("After Class executed");
  }
  @BeforeMethod
  public void beforeMethod()
  {
	  System.out.println("Before method executed");
  }
  @AfterMethod
  public void afterMethod()
  {
	  System.out.println("After method executed");
  }
  @BeforeTest
  public void beforeTest()
  {
	  System.out.println("Before test executed");
  }
  @AfterTest
  public void afterTest()
  {
	  System.out.println("After test executed");
  }
  
  
  
  
  
  
  
  
  
}
