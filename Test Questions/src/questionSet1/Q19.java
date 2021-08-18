/*
withoutEnd("Hello") → "ell"
withoutEnd("java") → "av"
withoutEnd("coding") → "odin"*/

package questionSet1;

public class Q19 {
	public static String withoutEnd(String str) {
		String finalStr="";
		for(int i=1; i<str.length()-1;i++) {
			finalStr+=str.charAt(i);
		}
		 return finalStr;
	 }
	 
	 public static void main(String[] args) {
		 System.out.println(withoutEnd("hello"));
	}
}
