package automation;

public class demo {         //to resolved Exceptions
    public void MO(int a,int b)
    {
       System.out.println(a*b);
  
       
     try
     {
    	 System.out.println(a/b);
     }
     catch(Exception e)
     {
    	System.out.println("invalid input by user"); 
    	e.printStackTrace();
     }
    
      System.out.println("thanks");
    }
    public static void main(String[] args) {
		demo obj = new demo();
		obj.MO(5, 0);
	}
    
   
}
