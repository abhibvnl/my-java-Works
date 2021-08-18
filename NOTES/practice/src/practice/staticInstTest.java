package practice;

public class staticInstTest {
	
	static int sv=10;
	       int iv=20;
	       
	   static {
		   sv=100;
	   }
	   
	   {
		   iv=200;
		   sv=150;
	   }
   public static void main(String[] args) {
	   System.out.println(staticInstTest.sv);   //100
	   
	   staticInstTest s= new staticInstTest();
	  
	   System.out.println(staticInstTest.sv); //150
	   System.out.println(s.iv);              //200
	   
}
}
