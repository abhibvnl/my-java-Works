package rule1;

//rule 1
abstract class demo1{
	abstract void test();
	
}

class demo2 extends demo1{
  void test() {
	  System.out.println("hi");
  }
}
public class maincls {
	public static void main(String[] args) {
		
		demo2 obj =new demo2();
	    obj.test();
	}
}
