package getMessageMethod;

public class exampleA {
 
		public static void main(String[] args) {
			try {
				System.out.println(10/0);
			} 
			catch (ArithmeticException e) {
				System.out.println(e.getMessage());//provides a sml msg abt exception
			}
			
			System.out.println("end");
			
		}
	}

