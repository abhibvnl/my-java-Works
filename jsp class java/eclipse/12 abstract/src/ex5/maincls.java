package ex5;


abstract class demo1{
	demo1(int arg){
		System.out.println("hi...constr of demo1");
	}
	
}
class demo2 extends demo1{
	demo2(){
		super(10);   //explicitly must for parameterized constr....
		System.out.println("hello...constr of demo2");
	}
	
}


public class maincls {
	public static void main(String[] args) {
		
	demo2 obj=new demo2();
	}
}
