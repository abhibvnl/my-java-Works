package hashCodeMethod;

public class exampleB {
    
	@Override
	public int hashCode() {
	  return 100;	
	}
	
  public static void main(String[] args) {
		
		exampleB e1=new exampleB();
		System.out.println(e1.hashCode());//unique code Overriden of exmapleA class
		
		
		exampleB e2=new exampleB();
		System.out.println(e2.hashCode());//unique code Overriden of exmapleA class
		
	}
}
