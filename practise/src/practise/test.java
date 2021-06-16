package practise;

public class test {

	public static void main(String[] args) {
		System.out.println(fun());
	}
	

	static int fun() {   //static method not allows to declare static var
		//static int x=0;// gives error
		int x=0;  
		return ++x;
	}
}
