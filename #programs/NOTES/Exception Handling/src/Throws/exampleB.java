//Throws is an indication to the caller about possibility of exception
//generally Throws used in checked exceptions
package Throws;

public class exampleB {
   
	void devide (int a,int b) throws ArithmeticException {
		System.out.println(a/b);
	}
	
	public static void main(String[] args) {
		
		exampleB e=new exampleB();
		try { 
			e.devide(10,0);    //caller//unchecked excp
		}
		catch (Exception e2) {
			System.out.println("invalid dnmtr");
		}
	
		
	}
}
