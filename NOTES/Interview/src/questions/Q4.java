//find the 2 Digit largest number consisting of two different digits in the Given number sequence
//example 1: input : 4134776937 output: 69
//example 2: input : 4613156133 output: 61

package questions;
import java.util.Arrays;
import java.util.Scanner;

public class Q4 {
  public static void main(String[] args) {
	  
	  Scanner scan=new Scanner(System.in);
	  System.out.print("enter Even dsequence Of Number : ");
	  String s=scan.next();
	  
	  char chars[]= new char[s.length()];
	     
	  for(int i=0;i<s.length();i++) 
		 chars[i]=s.charAt(i);	
	  
	  System.out.println(Arrays.toString(chars));
	  
	  String Strings[]=new String[chars.length/2];
	  int cnt=0;
	  
	  //converting  2 chars to String
	 try {
		 for(int i=0;i<chars.length;) {
			   Strings[cnt] =Character.toString(chars[i]);
			   Strings[cnt]+=Character.toString(chars[i+1]);
			   i+=2;
			   cnt++;
			  }
	 }
	 catch (ArrayIndexOutOfBoundsException e) {
		System.err.println(" pls Enter even Sequence,I skipped Last Number");

	}
	 finally {
		 scan.close();
	 }
	  System.out.println(Arrays.toString(Strings));
	
	 //Converting string to int  ;	   
	  int ints[]=new int[Strings.length];
	  for(int i=0;i<Strings.length;i++)
		  ints[i]=Integer.parseInt(Strings[i]);
	      System.out.println(Arrays.toString(ints));
	  
	  //Descending the int Array
	  for(int i=0;i<ints.length-1;i++) 
	     for(int j=0;j<ints.length-1;j++) {
	    	if(ints[j]<ints[j+1]) {
	    	    int  temp=ints[j]	;
	    		ints[j]=ints[j+1];
	    		ints[j+1]=temp;
	     }
	  } 
	  
	  System.out.println(Arrays.toString(ints));
	   
	for(int i=0;i<ints.length;i++)	{
		String finalStr=Integer.toString(ints[i]);	
		if(finalStr.charAt(0)!=finalStr.charAt(1)) {	
			System.out.println(finalStr);			
			break;
	       }	
		 }  
  
}
}
