package inheritence4;

class demo1{
  int x=100;
}
class demo2 extends demo1{
	int x=200;
	
	void disp() {
		
		int x=300;
		System.out.println(x);  ///prints local  300
		System.out.println(this.x);  //prints obj copy value 200
		System.out.println(super.x);   // ///prints inherited value 100
	}
}
public class maincls {

	public static void main(String[] args) {
		
		demo2 obj1=new demo2();
		obj1.disp();
		
		//System.out.println(obj1.x);
		//demo1 obj2=new demo1();
		//System.out.println(obj2.x);
	}

}
