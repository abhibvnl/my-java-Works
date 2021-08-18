//catch exe nly when exception occurs
package BasicUnCheckedExcep;

public class exampleC {
  public static void main(String[] args) {
	System.out.println("start");
	 try {
		 System.out.println(10/5);
	} 
	 catch (Exception e) { //not executes
		System.out.println("invalid dnmntr");
	}
	 
		System.out.println("end");

}
}
