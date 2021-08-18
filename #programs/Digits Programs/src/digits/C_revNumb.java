package digits;

import java.util.Scanner;

public class C_revNumb {

	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Enter Seq of Numb");
		int myNumb=scan.nextInt();
		
		
		System.out.print("reveresed numb is : ");
		
		int rev=0,rem=0;
		while(myNumb>0) {
		rem=myNumb%10;
	    rev=rev*10+rem;
		myNumb/=10;
		}
		System.out.println(rev);
		
	
		
		
	}
}
