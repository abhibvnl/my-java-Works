package customExceptions;

import java.util.Scanner;

public class exampleC  {
	
		
	public static void main(String[] args) {
		
		double amt=1500.00;
		
		Scanner scan =new Scanner(System.in);
		System.out.print("enter Amt to be withDrawn : ");
		double Wamt=scan.nextDouble();
		
		if(Wamt<amt)
			System.out.println("Transaction SuccessFull");
		else {
			try {
			throw new InsufficientFundException();	
			} 
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
