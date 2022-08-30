package automation1;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TEST {
  
	@Test
	public void demo() {
		System.out.println("demo executed");
	}
	@Test(priority = -1)
	public void demo1() {
		System.out.println("demo1 executed");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("beforeMethod executed");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("beforetest executed");
	}
	@Test
    @Parameters({"a","b"})
	public void test(int a, int b) {
		System.out.println(a-b);
	}
	
}
