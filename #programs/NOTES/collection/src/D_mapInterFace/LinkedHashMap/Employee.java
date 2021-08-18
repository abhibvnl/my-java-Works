//maintains Insertion order
//value is CustomObject
package D_mapInterFace.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Set;

public class Employee {
   int id;
   String name;
   
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + "]";
}

public Employee(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}

public static void main(String[] args) {
	
	Employee e1=new Employee(23,"tom");  
	Employee e2=new Employee(21,"jerry");  
	Employee e3=new Employee(22,"ram");  
      
	LinkedHashMap<Integer, Employee > lhm=new  LinkedHashMap<Integer, Employee>();
	
	lhm.put(10,e1);
	lhm.put(20,e2);
	lhm.put(30,e3);
	
	Set<Integer> keys = lhm.keySet();
	
	for(int key: keys)
		System.out.println(key+" "+lhm.get(key));
	
}
   
}
