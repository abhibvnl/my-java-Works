package ex3;


abstract class vehicle{
	abstract void start();
	
}

abstract class car extends vehicle{
	abstract void shiftGear();
	
}

public class driver extends car{
	@Override
	void start() {
		System.out.println("starting car");
	}
	
	@Override
	void shiftGear() {
		System.out.println("Channging Gear");
	}
	
	public static void main(String[] args) {
		
		driver obj =new driver();
	    obj.start();
	    obj.shiftGear();
	}
}

