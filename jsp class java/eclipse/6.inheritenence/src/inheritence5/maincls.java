package inheritence5;

class demo1{
	
	demo1(int a) {
		System.out.println("hi");
	}
}

class demo2 extends demo1{
	
	demo2(){
		super(2);
		System.out.println("constr of demo2");
	}
}

public class maincls {

	public static void main(String[] args) {
		demo2 obj=new demo2();

	}

}
