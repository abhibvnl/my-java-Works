package rotateStr;

public class RotateStr {
	static String leftRotate(String str,int times) {  //abcdef //2
		
		String leftRotRes=str.substring(times)+str.substring(0,times);
		return leftRotRes;
	}
	
	static String rightRotate(String str,int times) {
		return leftRotate(str, str.length()-times);
		
	}
	
  public static void main(String[] args) {
	 
	 
	  
	  System.out.println(leftRotate("abcdef",2));  //rotate by 2 times  //cdefab
	  
	  System.out.println(rightRotate("abcdefgh", 3));  ///rotate by 2 times  // fghabcde
	
}
}
