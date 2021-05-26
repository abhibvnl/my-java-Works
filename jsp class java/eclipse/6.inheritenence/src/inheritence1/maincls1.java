package inheritence1;

 class demo1 {

	int x=10;
	void disp1() {
		System.out.println(x);
	}
	
}

class demo2 extends demo1  {  // inheriting all  x and disp1() //it means all are copied into demo2 and u can use and access
	int y=10;
	
	void disp2() {
		System.out.println(x+y);
	}
	
}

public class maincls1 {

	public static void main(String[] args) {
		demo2 obj1=new demo2();       //created obj2 demo2
		obj1.disp1();           //but im calling disp1 from demo1 ,we hv inherited ,doesnt give error
	}

}



