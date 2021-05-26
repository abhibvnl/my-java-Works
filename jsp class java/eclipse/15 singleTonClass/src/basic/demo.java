//Singleton class used to ctreate only one obj per class
//rules
//1)private Cnonstructor  
//2)public static helper method to create obj within the same cls
//3)private static objRef of the class

package basic;

public class demo {

	private demo() {
		System.out.println("object created");
	}
	
	private static demo d=null;// written null is optional
	
	public static void helper() {
		if (d==null) {
			System.out.println(d);  //d==null
			d=new demo();
			System.out.println(d);  //d==some address
		}
		else
			System.out.println("cant create obj,once its already created ");
	}
}
