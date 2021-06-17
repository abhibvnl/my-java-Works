package practise2;

public class test {

public static void main(String[] args) {
		
		demo1 obj=new demo3(); //up cast
		System.out.println(obj.x);
		
		System.out.println("----------------");
		//demo3 d2=(demo3) d1;  //downcast //gives CCE bcoz demo3 is not instanceof(new demo3()) demo1...
		//so to avoid CCE use instanceof operator
		
		if(obj instanceof demo2) {
			demo2  d2=(demo2) obj;  //down cast
			System.out.println(d2.x);  //inherited prop
			System.out.println(d2.y);  //own prop after downcast
		}
		else if(obj instanceof demo3) {
				demo3 d3=(demo3) obj;   //down cast
				System.out.println(d3.x);  //inherited prop
				System.out.println(d3.z);  //own prop after downcast
				
			}
	
		
}
}
