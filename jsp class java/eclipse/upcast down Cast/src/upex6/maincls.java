package upex6;


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
	 demo1 obj=new demo3();   //demo3 acting only like demo1 ,so cant access demo2,demo3 prop directly,need downcasting of both
	 System.out.println(obj.x);
	 obj.test();
	 //System.out.println(obj.y);  //cant without downcast demo2
	 //obj.disp();                  //cant without downcast demo2
	 //System.out.println(obj.z);  //cant without downcast demo3
	 //obj.view();                  //cant without downcast demo3
	 
	 demo2 obj2=(demo2)obj;  //downcasting demo2
	 System.out.println(obj2.y);
	 obj2.disp();
	 
	 demo3 obj3=(demo3)obj;  //downcasting demo3
	 System.out.println(obj3.z);
	 obj3.view();
 }
}