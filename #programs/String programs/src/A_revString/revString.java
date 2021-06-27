package A_revString;

public class revString {
   
	public static void main(String[] args) {
		
		String s="hello";
		String rev="";
		
		
		char[] sArray = s.toCharArray();

		for(int i=s.length()-1;i>=0;i--)
			rev+=sArray[i];
		
		System.out.println("reversed String is : "+ rev);	
	
	}
}
