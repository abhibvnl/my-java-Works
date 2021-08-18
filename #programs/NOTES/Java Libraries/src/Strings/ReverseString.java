package Strings;

public class ReverseString {
	
   public static void main(String[] args) {
	
	   String s="java";
	   
	          char[] a=s.toCharArray();  //{'j','a','v','a'}
	          
	          //Reversing String  //tip 1
	          for(int i=a.length-1; i>=0;i--)
	        	  System.out.print(a[i]);
	          
	          System.out.println("\n-------------------");
	          
	          //Reversing String  //tip 2
	          for(int i=a.length-1; i>=0;i--)
	        	  System.out.print(s.charAt(i));
	          
	          System.out.println("\n--------------------");
	          String rev="";
	          
	          //Reversing String and Storing 
	          for(int i=a.length-1; i>=0;i--) {
	        	  rev+=a[i];     //implicitly converts char to String
	          }
	          
	          //checking polindrome or not
	          System.out.println(rev);
	          System.out.println(rev.equals(s)? "pol":"not pol");
	    
}
}
