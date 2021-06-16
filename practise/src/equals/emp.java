//with overriding equals method
package equals;

public class emp {
   
	String name;
	
	emp(String name){
		this.name=name;
	}
	
	  @Override
	  public boolean equals (Object obj) {
		  emp e=(emp) obj;
		  return this.name==e.name;
	  }
	public static void main(String[] args) {
		
		emp e1=new emp("toj");
		emp e2=new emp("tom");
		System.out.println(e1.equals(e2));
		
	}
}