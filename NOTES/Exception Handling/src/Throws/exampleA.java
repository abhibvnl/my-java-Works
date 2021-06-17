//Throws is an indication to the caller about possibility of exception
//generally used in checked exceptions
package Throws;

public class exampleA {
   
	void disp () throws Exception {
		for(int i=0;i<5;i++)
		{
		System.out.println(i);
		Thread.sleep(2000);	
		}
	}
	
	public static void main(String[] args) {
		
		exampleA e=new exampleA();
		try { 
			e.disp();    //caller//checked excp
		} catch (Exception e2) {
			System.out.println("invalid dnmtr");
		}
	
		
		}
}
