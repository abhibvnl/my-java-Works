package equals;

   //public class employeeB extends Object{  //this is explicitly written
	public class employeeB{

	int age;
	
	employeeB(int age){
		this.age=age;
	}
	
	@Override
	public boolean equals(Object obj) {
	  employeeB e=(employeeB) obj;	
	  return this.age==e.age;
	}
	
	
	public static void main(String[] args) {
		
		employeeB e1=new employeeB(10);
		employeeB e2=new employeeB(10);
		System.out.println(e1.equals(e2));
		
		employeeB e3=new employeeB(10);
		employeeB e4=new employeeB(20);
		System.out.println(e3.equals(e4));
	}
}
