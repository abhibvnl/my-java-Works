package ATM;

import java.util.Scanner;

public  class user {
   
	public static void main(String[] args) {
		
		atm a =new bank();
		Scanner scn =new Scanner(System.in);
		
		while(true) 
		{
			System.out.println("\n1:deposit\n2:withdraw\n3:checkBalance\n4:exit");
			System.out.print("\nEnter Ur Choice : ");
			int choice=scn.nextInt();
			
			switch (choice) {
			case 1:
			      System.out.print("Enter amount to deposite : ");
			      int amt=scn.nextInt();
			      a.deposit(amt);
			      break;  
			      
			case 2:
				  System.out.print("Enter amount withdraw : ");
			      amt=scn.nextInt();
			      a.withdraw(amt);
			      break;  
			case 3:
			      a.checkBal(); 
			      break;
			case 4:
				 System.out.println("Thank You ! Visit Again : ");
			      System.exit(0);
			 default:System.out.println("Invalid Choice: ");   
			}
			
			System.out.println("---------------------------");
				
		}
			
	}
}

