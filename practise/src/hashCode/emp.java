//with overriding hashCode()
package hashCode;

public class emp {

	
	  @Override
	  public int hashCode() {
		  return 100;
	  }
	public static void main(String[] args) {
		
		emp e1=new emp();
		System.out.println(e1.hashCode());
		
		
		emp e2=new emp();
		System.out.println(e2.hashCode());
		
	}
}
