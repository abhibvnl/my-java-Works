//extraEnd("Hello") → "lololo"
//extraEnd("ab") → "ababab"
//extraEnd("Hi") → "HiHiHi"
package questionSet1;

public class Q16 {
   public static String extraEnd(String s) {
	   
	String finalStr =Character.toString(s.charAt(s.length()-2));
	finalStr+=Character.toString(s.charAt(s.length()-1));
	
	String temp=finalStr;
	finalStr+=temp;
	finalStr+=temp;
	
	
	   return finalStr ;
   }
   
   public static void main(String[] args) {
	 System.out.println(extraEnd("HI"));
}
}
