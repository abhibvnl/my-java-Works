//Gives complete info about stack

package printStackTranceMethod;

public class exampleA {
public static void main(String[] args) {
	System.out.println("start");
	
	try {
		System.out.println(10/0);
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	System.out.println("end");
}
}
