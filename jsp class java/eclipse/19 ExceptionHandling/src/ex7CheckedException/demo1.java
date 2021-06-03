package ex7CheckedException;

public class demo1 {

	public static void main(String[] args) {
		System.out.println("start");
		
		for (int i=1;i<=5;i++) {
			System.out.println(i);
			
			//Thread.sleep(2000);  //checked ecxeption //forcing to handle immidiatly
			
			try {
				Thread.sleep(2000); 
			} catch (InterruptedException e) {
			System.out.println("some intruption");
			}
		}
	}
}
