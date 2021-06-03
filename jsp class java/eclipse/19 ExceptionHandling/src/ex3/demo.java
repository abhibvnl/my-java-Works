//catch block executes nly when exception occurs
package ex3;

import java.util.Scanner;

public class demo {

	public static void main(String[] args) {
		
		System.out.println("start");
		
		Scanner scan=new Scanner(System.in);
		System.out.print("enter First no : ");
		int numb1=scan.nextInt();
		System.out.print("enter second no : ");
		int numb2=scan.nextInt();
		
		try {
			 System.out.println(numb1/numb2);
		}
		
		catch(ArithmeticException e) {
			System.out.println("donot divide by zero");
		}
		
		 
		System.out.println("end");
		
		
	}
}
