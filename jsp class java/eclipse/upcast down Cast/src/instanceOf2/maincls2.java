package instanceOf2;


class demo1{
	void test() {
		System.out.println("demo1 test() method");
	}
}
public class maincls2 {

	public static void main(String[] args) {
		
		demo1 objr= new demo1();
		if(objr instanceof demo1) 
			System.out.println("objr is reffering to demo1 instance");	
		else
			System.out.println("objr is not reffering demo1 instance");
		

	}

}
