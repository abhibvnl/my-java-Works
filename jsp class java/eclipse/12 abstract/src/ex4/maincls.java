package ex4;


abstract class demo1{
	demo1(){
		System.out.println("hi...constr of demo1");
	}
	
}
class demo2 extends demo1{
	demo2(){
		//super()   //implicitly
		System.out.println("hello...constr of demo2");
	}
	
}


public class maincls {
	public static void main(String[] args) {
		
	demo2 obj=new demo2();
	}
}
