package inherit;

class demo1{
	int x=10;
}
class demo2 extends demo1{
	int x=20;
}
class demo3 extends demo2{
	int x=30;
	
	void f1() {
		demo1 obj=new demo1();
		
		System.out.println(x);
		System.out.println(super.x);
		System.out.println(obj.x);
	}
}
public class maincls extends demo3 {

	public static void main(String[] args) {
		demo3 obj=new demo3();
		System.out.println(obj.x);
		
		obj.f1();
		

	}

}
