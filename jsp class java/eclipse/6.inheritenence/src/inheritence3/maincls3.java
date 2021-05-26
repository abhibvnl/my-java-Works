package inheritence3;


 class demo1 {

	int x=10;
	void disp1() {
		System.out.println(x);
	}
	
}

class demo2 extends demo1 {  // inheriting all  x and disp1() //it means all are copied into demo2 and u can use and access
	int y=10;
	
	demo2(){
		x=30;
	}
	
	void disp2() {
		System.out.println(y);
	}
	
}

public class maincls3 {

	public static void main(String[] args) {
		demo2 obj1=new demo2();
		System.out.println(obj1.x);
		//obj1.x=20;
		System.out.println(obj1.x);
		obj1.disp1();
	}

}




