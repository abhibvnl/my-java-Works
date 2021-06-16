//ArithmeticException

package BasicUnCheckedExcep;

public class exampleA {
	
public static void main(String[] args) {
	 System.out.println("start");
	
	 //System.out.println(10/0);  //exception @
	 
	 try {
		 System.out.println(10/0);  //handling
	  } 
	 catch (ArithmeticException e) {
		System.out.println("donot devide by 0");
	}
	 System.out.println("end,below lines of code executed");
}
}
