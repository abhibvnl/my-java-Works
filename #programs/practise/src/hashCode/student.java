//without overriding hashCode
package hashCode;

public class student {

	public static void main(String[] args) {
		
		student s1=new student();
		System.out.println(s1.hashCode());
		
		student s2=new student();
		System.out.println(s2.hashCode());
	}
}
