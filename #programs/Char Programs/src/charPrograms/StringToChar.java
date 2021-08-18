package charPrograms;

import java.util.Arrays;

public class StringToChar {
  public static void main(String[] args) {
	
	  String s1="hello";
	  
	  char c[]=s1.toCharArray();
	  System.out.println(c);  //char array
	  System.out.println(c+"ji");
	  
	  String s2=new String(c);  //char Array to String
	  System.out.println(s2);
	  
	  //sort array
	  Arrays.sort(c);  //modifies Original array
	  System.out.println(c);
}
}
