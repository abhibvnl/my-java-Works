package B_polindrome;

public class polindrome {
   
	public static void main(String[] args) {
		
		String s="gadag";
		String rev="";
		
		
		char[] sArray = s.toCharArray();

		for(int i=s.length()-1;i>=0;i--)
			rev+=sArray[i];
	    
		System.out.println(rev.equals(s)? "polindrome": "not polindrome");
	}
}
