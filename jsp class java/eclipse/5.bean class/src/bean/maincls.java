package bean;

public class maincls {

	
	
	public static void main(String[] args) {
		
		employee e1=new employee(122,"abhi",22000.00);
		
		System.out.println("id is :"+e1.getId());  //printing return value
		System.out.println("name is :"+e1.getName());
		System.out.println("salary is :"+e1.getSalary());
		
		//modify salary to 25k
		
		e1.setSalary(25000.00);
		System.out.println("updated salary is :"+e1.getSalary());
		
		
	}

}
