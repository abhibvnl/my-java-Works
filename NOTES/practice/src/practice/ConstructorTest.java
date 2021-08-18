package practice;import com.sun.nio.sctp.SctpChannel;

 class ConstructorTest2 {
     int age;
      
     public static void main(String[] args) {
    	 ConstructorTest2 ct =new ConstructorTest2();
    	 System.out.println(ct.age);  //0
	}
     
}
//or

 public class ConstructorTest{
	 int age;
	 
	ConstructorTest(int a){
		System.out.println("constructor2 body");
	}
    public static void main(String[] args) {
   	 ConstructorTest ct =new ConstructorTest(2);
   	 System.out.println(ct.age);   //0 by default constructor
	}
}
