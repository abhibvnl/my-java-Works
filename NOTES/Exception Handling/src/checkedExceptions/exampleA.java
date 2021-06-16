package checkedExceptions;

public class exampleA {
public static void main(String[] args) {
	
	for(int i=0;i<5;i++) {
		System.out.println(i);
		
		//Thread.sleep(2000); //Immediate fix,known exception
		
		try {
			Thread.sleep(2000); 
		} catch (Exception e) {
			System.out.println("some intruption");
		}
	}
}
}
