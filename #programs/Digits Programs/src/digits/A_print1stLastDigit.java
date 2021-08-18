package digits;

import java.util.Scanner;

public class A_print1stLastDigit {

	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Enter Seq of Numb");
		int myNumb=scan.nextInt();
		
		int last=myNumb%10;
		
		while(myNumb>10)
		myNumb/=10;
		
		System.out.println("1st digit : "+myNumb);
		System.out.println("last digit : "+last);
		
	}
}
