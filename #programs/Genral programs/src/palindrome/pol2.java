package palindrome;

public class pol2 {
  public static void main(String[] args) {
	 String s="gadag";
	 
	 String rev="";
	 
	 for(int i=s.length()-1;i>=0;i--)
		 rev+=s.charAt(i);
	 
	 System.out.println(s.equals(rev) ? "pol" : "not");
}
}
