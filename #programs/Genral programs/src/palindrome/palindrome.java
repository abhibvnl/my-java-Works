package palindrome;

import java.util.Scanner;

public class palindrome {
	  public static void main(String[] args) {

	          String s="gadag";
	   
	          char[] a=s.toCharArray();  //{'j','a','v','a'}
	          
	          //Reversing String
	          for(int i=a.length-1; i>=0;i--)
	        	  System.out.print(a[i]);
	          
	          String rev="";
	          
	          //Reversing String and Storing
	          for(int i=a.length-1; i>=0;i--) {
	        	  rev+=a[i];          //implicitly converts char to String
	          }
	        	
	          System.out.println(rev);
	          System.out.println(rev.equals(s)? "pol":"not pol");	        

	    }
	}