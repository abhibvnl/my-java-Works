package ex1;

public class demo {

	public static void main(String[] args) {
		System.out.println("start");
		try {
			System.out.println(10/0);	
		}
	
		catch(ArithmeticException e){
			System.out.println("Inavalid dinominator");
		}
		System.out.println("end");
	}
}
