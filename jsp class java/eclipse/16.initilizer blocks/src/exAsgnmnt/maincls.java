package exAsgnmnt;
class demo1{
	static int x;  
	int y;
	static {
		System.out.println("running static demo1 ini block");
	}
	
	{
		System.out.println("running instance demo1 ini block");
	}
	
	demo1(){
		System.out.println("running demo1 constructor");
	}
}

class demo2 extends demo1{
	static {
	
		System.out.println("running static demo2 ini block");
	}
	
	{
		System.out.println("running instance demo2 ini block");
		x=20;
	}
	
	demo2(){
		//implicitly super construtr  is calling
		System.out.println("running demo2 constructor");
	}
	
}
public class maincls {

	public static void main(String[] args) {
	    demo2 obj=new demo2();
		System.out.println(demo2.x);

	}

}
