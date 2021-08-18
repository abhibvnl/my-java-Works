//helloWorld => hello
package questionSet1;

public class Q18 {
	public static String firstHalf(String str) {
		String finalStr="";
		for(int i=0; i<str.length()/2;i++) {
			finalStr+=str.charAt(i);
		}
		 return finalStr;
	 }
	 
	 public static void main(String[] args) {
		 System.out.println(firstHalf("helloWorld"));
	}
}
