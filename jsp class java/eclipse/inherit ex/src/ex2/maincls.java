package ex2;

class demo1{
	int x;
	
	demo1(int arg){
		x=arg;
	}
}

class demo2 extends demo1{
	demo2(int num){
		super(num);
	}
}
public class maincls {

	public static void main(String[] args) {
		demo2 obj =new  demo2(20);
       System.out.println(obj.x);
	}

}
