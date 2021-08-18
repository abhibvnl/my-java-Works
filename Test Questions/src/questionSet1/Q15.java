//conCat("abc", "cat") → "abcat"
//conCat("dog", "cat") → "dogcat"
//conCat("abc", "") → "abc"
//conCat("pig", "doggy") → "pigdoggy"
//conCat("pig", "g") → "pig"
package questionSet1;

import java.util.TreeSet;

public class Q15 {
	 public static String  cancator(String s1,String s2) {
		 
		String finalStr="";
	    if(s1.length()>=1 && s2.length()>=1) {
		    	if(s1.charAt(s1.length()-1)==s2.charAt(0)){
		   	     char similar=s2.charAt(0);
	
		   	     for(int i=0;i<s1.length()-1;i++)
		   	    	 finalStr+=s1.charAt(i);
		   	     
		   	     finalStr+=similar;
		   	     
		   	     for(int i=1;i<s2.length();i++)
		   	    	 finalStr+=s2.charAt(i);
		   	    }
		   	    else 	
		   		 finalStr=s1.concat(s2);
	    }
	    else if(s1.length()<1)
	    	finalStr=s2;
	    else if(s2.length()<1)
	    	finalStr=s1;
		 return finalStr;
	  }
	 
	 public static void main(String[] args) {
		System.out.println( cancator("","abc"));
	}
}
