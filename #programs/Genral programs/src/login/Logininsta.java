package login;

import java.util.Scanner;

public class Logininsta{
	  static void insta(String name){
	      System.out.println("\n hi "+ name+"!"); 
	      System.out.println("     welcome to instagram \n");  
	         }
	    public static void main(String[] args) {
	        // stored user data
	        String mobNo="9008690086";
	        String id="urstruly_abhi_bevinal";
	        String gmail="abhib0399@gmail.com";
	        String pw="12341234";
	        String userName="abhi";
	       

	        Scanner scanner2= new Scanner(System.in);

	        System.out.print("Enter insta id or gmail or phone: ");
	        String log=scanner2.nextLine().toLowerCase();
	        System.out.print("Enter password: ");
	        String logpw=scanner2.nextLine().toLowerCase();


	        if(log.equals(mobNo) && logpw.equals(pw))
	        {
	          insta(userName);
	        }
	        else if (log.equals(id) && logpw.equals(pw))
	        {
	            insta(userName);
	        }
	        else if (log.equals(gmail) && logpw.equals(pw))
	        {
	            insta(userName);
	        }
	        else
	        System.out.println("Invalid user id or Password ");


	    }
	}

