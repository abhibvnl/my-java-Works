package digits;

import java.util.Scanner;

public class C_revNumb {

	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Enter Seq of Numb");
		int myNumb=scan.nextInt();
		
		
		System.out.println("reveresed numb entered");
		
		
		while(myNumb>0) {
		int last=myNumb%10;
		System.out.print(last);
		myNumb/=10;
		}
		
		
	
		
		
	}
}
