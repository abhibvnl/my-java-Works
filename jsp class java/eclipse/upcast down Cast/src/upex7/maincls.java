package upex7;


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
	 demo1 obj=new demo2();   //demo3 acting only like demo1 ,so cant access demo2,demo3 prop directly,need downcasting of both
	 System.out.println(obj.x);
	 obj.test();
                                          
	 
	 demo2 obj2=(demo2)obj;      
	 System.out.println(obj2.y);
	 obj2.disp();
	 
	// demo3 obj3=(demo3)obj;  //getting exception here bcoz obj is not instance of demo3,its instance of nly demo2,demo1
	                            //this castClassException error can be fixed by Instanceof operator
	// System.out.println(obj3.z);
	// obj3.view();
	 if(obj instanceof demo3) {  //if obj is instance of only demo3 ,then downcast and access demo3 prop 
		 demo3 obj3=(demo3)obj;  
	     System.out.println(obj3.z);
	     obj3.view();
	 }
	 }
 }
