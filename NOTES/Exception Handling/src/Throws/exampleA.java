//indication to the caller about possibility of exception
package Throws;

public class exampleA {
   
	void devide (int a,int b) throws ArithmeticException {
		System.out.println(a/b);
	}
	
	public static void main(String[] args) {
		
		exampleA e=new exampleA();
		try {
			e.devide(10,0);
		} catch (Exception e2) {
			System.out.println("invalid dnmtr");
		}
	
		
		}
}
