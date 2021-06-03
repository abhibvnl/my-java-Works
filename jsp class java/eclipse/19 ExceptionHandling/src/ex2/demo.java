package ex2;

public class demo {

	public static void main(String[] args) {
		
		int a[]= {10,20,30};
		
		System.out.println("start");
		try {
			System.out.println(a[100]);	
		}
	  catch(ArrayIndexOutOfBoundsException e) {
		  System.out.println("invalid index");
		//  System.out.println(a[1]);	
	  }
		System.out.println("end");
	}
}
