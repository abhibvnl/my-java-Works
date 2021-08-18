/*Original alphabet:      abcdefghijklmnopqrstuvwxyz
Alphabet rotated +2:    cdefghijklmnopqrstuvwxyzab*/
package questionSet2;

public class RotateString2 {
  public static void main(String[] args) {
	
	  String orgnl="abcdefghijklmnopqrstuvwxyz";
	  int times=2;
	  String rotatedStr="";
	  
for(int i=times;i<orgnl.length();i++)
	rotatedStr+=orgnl.charAt(i);

for(int i=0;i<times;i++)
	rotatedStr+=orgnl.charAt(i);

	 System.out.println(rotatedStr);
	  
}
}
