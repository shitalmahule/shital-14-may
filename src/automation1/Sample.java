package automation1;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample {
    @Test(priority=2,timeOut = 2000)
     public void test1() throws InterruptedException {
    	Thread.sleep(1000);
    	System.out.println("test1 executed");
    }
    @Test(enabled = false)
    public void test2() {
    	System.out.println("test2 executed");
    }
    @Test(invocationCount = 2)
    public void test3() {
    	System.out.println("test3 executed");
    }
    @Test(dependsOnMethods = {"test1"})
    public void test4() {
    	System.out.println("test 4 executed");
    }
    @BeforeMethod
    public void beforeMethod() {
    	System.out.println("before method executed");
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
