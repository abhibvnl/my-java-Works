package ex3;


interface vehicle{

	void start ();  //implicitly as public,and abstrct method
}


class bike implements vehicle{
	@Override
 public	void start () {
		System.out.println("starting bike");
	}
}

public class car implements vehicle {

	@Override
	public void start() {
		System.out.println("starting car");
	}

	
	public static void main(String[] args) {
		car c=new car();
		c.start();
		bike b=new bike();
		b.start();
	}

}
