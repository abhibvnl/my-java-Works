//always use superMost class catch  block at end
package ex6;

public class demo {

	public static void main(String[] args) {
		
		System.out.println("start");
		
		try {
			System.out.println(10/0);
		}
		
		catch(Exception e) {
			
			System.out.println("superClass handler");
		}
    /*   catch(ArithmeticException e) {    //gives error as its already handling,so use Exception e @ end
			
			System.out.println("invalid dinom");
		}*/
	}
}
