package hashCodeMethod;

public class exampleA {
    
	public static void main(String[] args) {
		
		exampleA e1=new exampleA();
		System.out.println(e1.hashCode());//unique code of e1 obj of exmapleA class
		
		
		exampleA e2=new exampleA();
		System.out.println(e2.hashCode());//unique code of e2 obj of exmapleA class
		
	}
}
