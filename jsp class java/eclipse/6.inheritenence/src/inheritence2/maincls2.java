package inheritence2;

class demo1{
	int x=10;
}

class demo2 extends demo1{  //x inherited
 
	void disp() {
		System.out.println(x);
	}
}

public class maincls2 {

	public static void main(String[] args) {
		demo2 obj1=new demo2();
		obj1.disp();

	}

}

