package login;

import java.util.Scanner;

public class loginRepeat {
	  static void insta(String name){
	      System.out.println("\n hi "+ name+"!"); 
	      System.out.println("     welcome to instagram \n");  
	         }
	    public static void main(String[] args) {
	        // stored user data
	        String mobNo="9008690086";
	        String id="urstruly_abhi_bevinal";
	        String gmail="abhib0399@gmail.com";
	        String pw="1234";
	        String userName="abhi";
	       

	        Scanner scanner2= new Scanner(System.in);

	        System.out.print("Enter  phone: ");
	        String log=scanner2.nextLine().toLowerCase();
	        System.out.print("Enter password: ");
	        String logpw=scanner2.nextLine().toLowerCase();

	        while((!mobNo.equals(log))||(!logpw.equals(pw)))
	        {
	        
	            System.out.println("invalid");
	            System.out.print("Enter  phone: ");
	            log=scanner2.nextLine().toLowerCase();
	            System.out.print("Enter password: ");
	            logpw=scanner2.nextLine().toLowerCase();
	        }
	       
	       insta(userName);


	    }
	}

