package tohashCode;

public class student {  //implicitly inherits object class and hashCode method

	public static void main(String[] args) {
		
		student s=new student();
		System.out.println(s.hashCode());
		student s1=new student();
		System.out.println(s1.hashCode());  //each object has diffrent unique identity
		}
}
