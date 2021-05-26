package ex1;

interface person{
	int id=12234;  //implicitly as public,static,final
	
	void test();  //implicitly as public,and abstrct method
}

public class employee implements person {
	@Override
	public void test() {
		System.out.println("abstrct method should b Override with Public Accs Spcfier");
	}
	
	public static void main(String[] args) {
		System.out.println(person.id);
		
		employee e=new employee();
		e.test();
	}

}
