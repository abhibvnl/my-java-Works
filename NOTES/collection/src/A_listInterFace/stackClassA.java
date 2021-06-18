package A_listInterFace;

import java.util.Stack;

public class stackClassA {
public static void main(String[] args) {
	
	Stack s=new Stack();
	
	s.push(64);
	s.add("also");
	s.add(8);
	
	System.out.println("using For loop");
	for(int i=0;i<s.size();i++) 
	System.out.println(s.get(i));
	
	System.out.println("-----------------------");
	System.out.println(s.size());
	System.out.println("-----------------------");
	
	System.out.println("using pop");
	System.out.println(s.pop());//lifo
	System.out.println(s.pop());
	System.out.println(s.pop()); //once u pop object ,object removed from memory
	
	System.out.println("-----------------------");
	System.out.println(s.size());

	
	
}
}
