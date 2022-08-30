package POM;

public class BufferAndBuilder {
  public static void main (String[]args) {
	
	String s = "velocity";
	String sc = s.concat("katraj");
	System.out.println(sc);
	
	StringBuffer sf = new StringBuffer("hello");
	sf.append("everyone");
	System.out.println(sf);
	
	StringBuilder sb = new StringBuilder("good");
	sb.append("morning");
	System.out.println(sb);
	
	System.out.println(sf.reverse());
}
}