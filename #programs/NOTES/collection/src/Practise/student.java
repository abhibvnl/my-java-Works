package Practise;

import java.util.ArrayList;

public class student {
	       String name;
	       int age;
	       
     public student(String name, int age) {
			super();
			this.name = name;
			this.age = age;
		}

	@Override
	public String toString() {
		return "student [name=" + name + ", age=" + age + "]";
	}



	public static void main(String[] args) {
		   
    	 student s1=new student("tom",21);
    	 student s2=new student("jerry",23);
    	 student s3=new student("jack",22);
    	 
    	 ArrayList al=new ArrayList();
    	 al.add(10);
    	 al.add(s1);
    	 al.add(s2);
    	 al.add("hi");
    	 al.add(s3);
    	 al.add(10.5);
    	 
    	 for(Object obj: al)
    		 System.out.println(obj);
	}
}
