//type1
package questionSet2;

public class RotateString {
  public static void main(String[] args) {
	
	  String orgnl="abcdefg";
	  int times=3;
	  String rotatedStr="";
	  
for(int i=orgnl.length()-times;i<orgnl.length();i++)
	rotatedStr+=orgnl.charAt(i);
  

for(int i=0;i<orgnl.length()-times;i++)
	rotatedStr+=orgnl.charAt(i);

	 System.out.println(rotatedStr);
	  
	  
	
}
}
