package upex5;

class demo1 {
	int x=10;
	void test(){
		System.out.println(" test() of demo1");
	}
}

class demo2 extends demo1 {
	int y=20;
	void disp(){
		System.out.println(" disp() of demo2");
	}
}
class demo3 extends demo2 {
	int z=30;
	void view(){
		System.out.println(" view() of demo3");
	}
}
public class maincls {

	public static void main(String[] args) {
		demo2 obj=new demo3();
		
		 obj.test();
		 obj.disp();
		 //obj.view(); //need downcast
		 
		 demo3 obj3=(demo3)obj;//downcasted demo3
		 obj3.view();
		 
		 
	}

}
