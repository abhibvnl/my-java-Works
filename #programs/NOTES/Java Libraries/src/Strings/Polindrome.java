package Strings;

import java.util.Scanner;

public class Polindrome {
	
   public static void main(String[] args) {
	
	   Scanner scan=new Scanner(System.in);
	   System.out.print("enter String value : ");
	   String s=scan.next();
	   
	   
	   
	          char[] a=s.toCharArray();  //{'j','a','v','a'}
	          String rev="";
	          
	          //Reversing String and Storing
	          for(int i=a.length-1; i>=0;i--) {
	        	  rev+=a[i];     //implicitly converts char to String
	          }
	        
	          System.out.println(rev.equals(s)? "pol":"not pol");
	    
}
}
