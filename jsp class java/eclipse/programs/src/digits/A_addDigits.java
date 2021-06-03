package digits;

import java.util.Scanner;

public class A_addDigits {

	public static void main(String[] args) {
		
		int sum=0,rem=0;
		Scanner scan=new Scanner(System.in);
		System.out.print("enter seq of Number : ");
		int myNumb=scan.nextInt();
		
	   while(myNumb!=0) {
		   rem+=myNumb%10;
		   sum+=rem;
		   myNumb/=10;
	   }
	   System.out.println(rem);
	}
}
