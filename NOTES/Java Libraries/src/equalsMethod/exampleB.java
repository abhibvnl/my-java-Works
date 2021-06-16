package equalsMethod;

public class exampleB {
  String name;

  
  public exampleB(String name) {
	this.name = name;
  }
  
    @Override
    public String toString() {
	return "exampleB [name=" + name + "]";
}




	@Override
   public boolean equals(Object obj) {
	exampleB e=(exampleB) obj;
	return this.name==e.name;
   }
  
  public static void main(String[] args) {
	  exampleB e1=new exampleB("abhi");
	  exampleB e2=new exampleB("abhi");
	   
	  System.out.println(e1);
	  System.out.println(e2);
	  
	  System.out.println(e1.equals(e2));
	  
}
}
