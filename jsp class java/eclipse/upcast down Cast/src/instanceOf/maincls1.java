package instanceOf;


class demo1{
	void test() {
		System.out.println("demo1 test() method");
	}
}
public class maincls1 {

	public static void main(String[] args) {
		
		demo1 objr= null;
		if(objr!=null) 
			System.out.println("objr is reffering to some instance of class");	
		else
			System.out.println("objr is not reffering to some instance");
		

	}

}
