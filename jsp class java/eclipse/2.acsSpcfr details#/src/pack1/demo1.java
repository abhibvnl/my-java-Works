package pack1;

public class demo1 {
	
  	private int var1=10;    // access lvl only within  class
	        int var2=20;    //default access specifier is package ,access lvl only within  package
	protected int var3=30;  // access lvl only within  package and outside with is a relation
	public int var4=40;    //access lvl   everywhere
	
   void	func1() {
	   System.out.println(var1);
	   System.out.println(var2);
	   System.out.println(var3);
	   System.out.println(var4);
	   
   }

}


