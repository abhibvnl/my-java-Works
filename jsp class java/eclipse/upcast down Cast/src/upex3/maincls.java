package upex3;

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
	// demo1 obj1=new demo3();   //(1) we can cast demo3 to demo1 or demo2 //acts as demo2 (access only demo1  prop)
	//obj1.test();
	 
	 //demo2 obj1=  new demo3(); //(2) we can cast demo3 to demo1 or demo2 //acts as demo2 (access only demo1 and demo2 prop)
	//obj1.test();
   // obj1.disp();
	 
	demo3 obj1=  new demo3(); //(3) we can cast demo3 to demo1 or demo2 or demo3 //acts as demo3 (acess all cls prop)
	obj1.test();
	obj1.disp();
	obj1.view();
	
	
	
}
}
