package calc;

import java.util.Scanner;

public class user {

    public static void main(String[] args) {
		cal c=new operation();
		Scanner  scn=new Scanner(System.in);
		
		while(true) 
		{
			System.out.println("\n1:add\n2:sub\n3:mul\n4:div\n5:exit");
			System.out.print("\nEnter Ur Choice : ");
			int choice=scn.nextInt();
			
			 if(choice==5) {
			  System.out.println("Calculator app stopped");
			  System.exit(0);
			  }
			 else if(choice>5) {
				 System.out.println("Invalid Choice");
			     continue;
			 }
			   System.out.print("enter No1 : ");
		       int no1=scn.nextInt();
		       System.out.print("enter No2 : ");
		       int no2=scn.nextInt();
			
			switch (choice) {
			case 1:
			      System.out.println( c.add(no1, no2));
			      break;  
			      
			case 2:
			      System.out.println( c.sub(no1, no2));
			      break; 
			case 3:
			      System.out.println( c.mul(no1, no2));
			      break; 
			    
			case 4:
			      System.out.println( c.div(no1, no2));
			      break;
			case 5:
			      System.exit(0);
			      break;
			}
			
			System.out.println("---------------------------");
				
		}
		
    }

}