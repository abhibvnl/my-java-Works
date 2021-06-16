//superMost catch block should be in last
package BasicUnCheckedExcep;

public class exampleH {
public static void main(String[] args) {
	
	
	try {
		System.out.println(10/0);

	} 
	
	//catch (Exception e) {   //if its here gives error below
	//	System.out.println("superMost catch block");
	//}
	
	catch (ArithmeticException e) {
	System.out.println("ArithmeticException block");
	}
	
	catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("ArrayIndexOutOfBoundsException block");
	}
	
	catch (Exception e) {  
		System.out.println("superMost catch block");
		}
	
	
}
}
