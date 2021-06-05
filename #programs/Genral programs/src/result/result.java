package result;

import java.util.Scanner;

public class result {
	 public static void main(String[] args) {
	        
	        

	        Scanner scanner1=new Scanner(System.in);
	        System.out.print("Enter your Roll No: ");
	        int reg=scanner1.nextInt();

	        switch (reg) {
	            case 123:
	                System.out.println("\nName : ABHi \nResult : Second class\ncollege : PES\n");
	                break;
	            case 456:
	                System.out.println("\nName : Banu \nResult : First class\ncollege : SCE\n");
	                break;
	            case 789:
	            System.out.println("\nName : Mukunda \nResult : FCD\ncollege : GEC\n");
	            break;
	        
	            default:System.out.println("Invalid Roll No");
	              
	        }
	    }
	}