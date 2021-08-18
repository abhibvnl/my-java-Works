package StringToInt;



public class strToInt {
  public static void main(String[] args) {
	
	  String s="123";
	  
	  //1st way
	  int number = Integer.valueOf(s);
	  System.out.println(number);
	  
	  //2nd way
	  int number2 = Integer.parseInt(s);
	  System.out.println(number);
	  
	  //wrong Input
	  String s2="12T";
	  
	  try {
		  int number3 = Integer.valueOf(s2);  //gives NumberFormatException 
	  }
	  catch (Exception e) {
		// TODO: handle exception
		  e.printStackTrace();
	}
}
} 
