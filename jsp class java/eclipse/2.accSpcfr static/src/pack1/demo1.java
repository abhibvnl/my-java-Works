package pack1;

public class demo1 {
	
  static 	private int var1=10;    // access lvl only within  class
  static            int var2=20;    //default access specifier is package ,access lvl only within  package
  static 	protected int var3=30;  // access lvl only within  package and outside with is a relation
  static 	public int var4=40;    //access lvl   everywhere
	
  
public static void main(String[] args) {
		
	     	 System.out.println(var1);
		   System.out.println(var2);
		   System.out.println(var3);
		   System.out.println(var4);
		   
	}

}
