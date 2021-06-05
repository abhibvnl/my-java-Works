package digits;

import java.util.Scanner;

public class D_palindrome {

	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		
		System.out.print("Enter Seq of Numb : ");
		int myNumb=scan.nextInt();
		int duplicate=myNumb;
		
		int rev=0;
		
		while(myNumb!=0) {
		int rem=myNumb%10;
	    rev=rev*10+rem;
		myNumb/=10;
	
		}
		System.out.println(rev==duplicate ? "palindrome" :"not");
		
	
	
		
		
	}
}
