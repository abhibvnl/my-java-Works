//always use superMost class catch  block at end
package ex6;

public class demo2 {

	public static void main(String[] args) {
		
		System.out.println("start");
		
		try {
			System.out.println(10/0);
		}
		
		  catch(ArithmeticException e) {   
				
				System.out.println("invalid dinom");
	 	  }
	    	catch(Exception e) {   //using  superClass exception @ end
			
			System.out.println("superClass handler");
		 }
  
	}
}
