//throw used to invoke the Exceptions

package Throw;

public class exampleB {
 public static void main(String[] args) {
	System.out.println("start");
	 
	int a=10;
	int b=5;
	if(b==0) {
		
		try {
			ArithmeticException ae=new ArithmeticException();
			throw ae; // invoking the AE created manually above using throw
		} catch (Exception e) {
			System.out.println("invalid dnmntr");
		}
	
	}
	else 
	System.out.println(a/b);	
	
	System.out.println("end,below lines executed");
	 
}
}
