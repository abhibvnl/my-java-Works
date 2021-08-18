package compareToMethod;
import java.util.ArrayList;
import java.util.Collections;
//bug not sorting
public class exampleB implements Comparable<exampleB> {
	 int age;
	 
	 public exampleB(int age) {
		this.age=age;
	}
	 
	 
	 @Override
	public String toString() {
		return "exampleB [age=" + age + "]";
	}


	@Override
	public int compareTo(exampleB e) {
		return this.age-e.age;
	}
	
   public static void main(String[] args) {
	  
	  exampleB e1=new exampleB(35);
	  exampleB e2=new exampleB(15);
	  exampleB e3=new exampleB(25);
	  
	  
	  ArrayList<exampleB> al=new ArrayList<exampleB>();  //Overriden compareTo method
	
	 
	  al.add(e1);
	  al.add(e2);
	  al.add(e3);
	  
	  Collections.sort(al);  //use this method after adding  object 
	  
	  
	  for(exampleB obj: al)
		  System.out.println(obj);
}
}
