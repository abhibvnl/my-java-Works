//super most class "Exception" handles any type of exception
package ex5;

public class demo {

	public static void main(String[] args) {
		int a[]= {10,20,30};
		System.out.println("start");
		
		try {
			System.out.println(10/0);
		}
		catch(Exception e) {
			System.out.println("invalid dinom");
		}
		
		
		try {
			System.out.println(a[100]);
		}
		
		//int x=5;// this line gives error ,bcoz there should not be any executeable line between try and catch
		
		catch(Exception e) {
			System.out.println("invalid index");
		}
		
		System.out.println("start");
		
	}
	
	
}
