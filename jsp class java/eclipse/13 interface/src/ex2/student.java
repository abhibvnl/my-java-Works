package ex2;

interface university{

	void conductExams ();  //implicitly as public,and abstrct method
}


interface college extends university{

	void conductIa ();  //implicitly as public,and abstrct method
}
public class student implements college {

	@Override
	public void conductExams() {
		System.out.println("Conducting Exams");
	}

	@Override
	public void conductIa() {
		System.out.println("Conducting Ia's");
	}
	public static void main(String[] args) {
		student s=new student();
		s.conductExams();
		s.conductIa();

	}

}
