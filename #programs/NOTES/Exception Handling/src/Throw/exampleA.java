//throw used to invoke the Exceptions

package Throw;

public class exampleA {
 public static void main(String[] args) {
	
	int a=10;
	int b=0;
	if(a<100) {
		ArithmeticException ae=new ArithmeticException();
		throw ae; // invoking the AE created manually above
	}
	else 
	System.out.println(a/b);	
	 
}
}
