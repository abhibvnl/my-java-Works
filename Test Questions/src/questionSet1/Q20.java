/*
  comboString("Hello", "hi") → "hiHellohi"
comboString("hi", "Hello") → "hiHellohi"
comboString("aaa", "b") → "baaab"
*/
package questionSet1;

public class Q20 {
	public static String comboString(String str1,String str2) {
		String finalStr="";
		if(str1.length()<str2.length()) 
			finalStr=str1.concat(str2).concat(str1);
		else	
			finalStr=str2.concat(str1).concat(str2);
		 return finalStr;
	 }
	 
	 public static void main(String[] args) {
		 System.out.println(comboString("hello","hi"));
	}
}
