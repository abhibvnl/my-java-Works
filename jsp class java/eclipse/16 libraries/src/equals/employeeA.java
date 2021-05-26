package equals;

public class employeeA {
    
	public static void main(String[] args) {
		employeeA e1=new employeeA();
		employeeA e2=new employeeA();
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e1.equals(e2));//takes Object class obj as arguments
		
		
	}
}
