package updownex2;


class demo1{
	int x=10;
	void test() {
		System.out.println("test() method of dmo1");
	}
}
class demo2 extends demo1{
	int y=2;
	void disp() {
		System.out.println(" disp() method of dmo2");
	}
}

class demo3 extends demo1{
	int y=2;
	void disp() {
		System.out.println(" disp() method of dmo2");
	}
}

public class mainCls {

	public static void main(String[] args) {
		 
     demo1 obj= new demo2(); //auto upcasting ,,demo2 csted to demo1,(demo2 acting like a demo1),own prop are hided
     System.out.println(obj.x);
     obj.test();  
     demo2 obj2= (demo2)obj;///down casting// can access own prop
     System.out.println(obj2.y);
		
		
	}

}
