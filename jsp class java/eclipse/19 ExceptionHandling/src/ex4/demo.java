//one try block can have more than one catch blocks

package ex4;

public class demo {

	public static void main(String[] args) {
	
		System.out.println("start");
		
		try {
			System.out.println(10/0);
		}
		catch(ArrayIndexOutOfBoundsException e){ //thi wont executes
		  System.out.println("invalid index");	
		}
	
	    catch(ArithmeticException  e){
		  System.out.println("invalid dinominator");	
		}
	
}
}