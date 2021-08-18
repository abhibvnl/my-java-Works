//firstTwo("Hello") → "He"
//firstTwo("abcdefg") → "ab"
//firstTwo("ab") → "ab"
//firstTwo("a") → "a"
package questionSet1;

public class Q17 {
 public static String firstTwo(String str) {
	 String finalStr="";
	 if(str.length()==1)
		 finalStr=str;
	 else if(str.length()>=2) 
		 for(int i=0 ;i<2 ;i++) 
			 finalStr+= str.charAt(i);  
	 else
		 finalStr="";
	 
	 return finalStr;
 }
 
 public static void main(String[] args) {
	 System.out.println(firstTwo("a"));
}
}
