package upex4;



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
	 
	demo3 obj1=  new demo3(); //(3) we can cast demo3 to demo1 or demo2 or demo3 //acts as demo3 (acess all cls prop)
	obj1.test();
	obj1.disp();
	obj1.view();
	 
	demo2 obj2=(demo2) obj1;  //down cast  through obj1 ref var
	demo1 obj3=(demo1) obj1;  //downcast through obj1 ref var
	
	
	
}
}
