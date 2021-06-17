//finally block is a set of instructions exec irrespective of excep occurs or not
//mainly used to close Costly resources,
//give example of DataBase close 

package FinallyBlock;

public class exampleA {

	public static void main(String[] args) {
		
		try {
		  System.out.println("data BAse openned");	
		} catch (Exception e) {
			System.out.println("failed to store data in data base");
		}
		
		finally {
			System.out.println("data base closed"); //executed without exception
		}
	}
}
