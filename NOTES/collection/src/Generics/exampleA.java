//used to specify obj type

package Generics;

import java.util.ArrayList;

public class exampleA {
  
	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<Integer>();  //<Generics>
		
		al.add(50);
		al.add(70);
		//al.add("Hi"); //gives error becuase used Generics 
		al.add(60);
		al.add(40);
		
		//for each loop
		for(int obj:al)  //int bcoz Integer
			System.out.println(obj);
	}
}
