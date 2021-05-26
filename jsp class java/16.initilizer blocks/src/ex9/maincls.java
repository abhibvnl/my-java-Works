package ex9;
class  demo1{
	static int x;
	
	demo1(){
		x=20;
		
	  }
}
public class maincls {
public static void main(String[] args) {
	System.out.println(demo1.x);  //0
	demo1 obj=new demo1();      //calling contrtr during obj creation
	System.out.println(demo1.x);  //20
}
}
