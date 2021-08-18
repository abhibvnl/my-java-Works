package StringMethods;

public class StringMethods {

	public static void main(String[] args) {
		
		String s="Java Developer";  //or
	   //String s=new String("Java Developer");
		
		
		System.out.println(s.startsWith("Java"));  //1
		System.out.println(s.endsWith("Java"));    //2
		
		System.out.println(s.toLowerCase());       //3
		System.out.println(s.toUpperCase());       //4
		
		System.out.println(s.indexOf("e"));        //5
		System.out.println(s.indexOf("e",7));      //5
		System.out.println(s.lastIndexOf("e"));    //6
		System.out.println(s.charAt(5));           //7
		
		System.out.println(s.length());             //8
		System.out.println(s.replace("Java","Python"));//9   //not effects to original
		System.out.println(s.substring(5));          //10
		System.out.println(s.substring(5,8));        //11   ignores 8th end index
		
		s="  Java Developer  ";
		
		System.out.println(s);
		System.out.println(s.trim());               //12
		
		
		
		
		

		


	}
}
