package comparatorInterFace;

import java.util.Scanner;
import java.util.TreeSet;

public class Employee {
   String name;
   int  id;
   
public Employee(String name, int age) {
	super();
	this.name = name;
	this.id = age;
}

@Override
public String toString() {
	return "Employee [" + (name != null ? "name=" + name + ", " : "") + "id=" + id + "]";
}

public static void main(String[] args) {
	
	Employee e1=new Employee("B",9456);
	Employee e2=new Employee("C",5645);
	Employee e3=new Employee("A",2975);
	
	SortEmployeeById id=new SortEmployeeById();
	SortEmployeeByName name=new SortEmployeeByName();
	TreeSet<Employee> ts = null;
	
	Scanner scan =new Scanner(System.in);
	System.out.println("How do U want sort Employee\n1:Name\n2:Id");
	int choice=scan.nextInt();
	
	if(choice==1)
		ts=new TreeSet<>(name);
	else if(choice==2)
		ts=new TreeSet<>(id);
	else
		System.out.println("Hey enter Only 1 or 2");
	
	try {
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		for(Employee obj: ts)
			System.out.println(obj);
	} catch (Exception e) {
		System.out.println("Wrong input");
	}
	

	
}
   
}  
