package Practise;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ex3 {
public static void main(String[] args) {
List<Integer> ls=new LinkedList<Integer>();

ls.add(6);
ls.add(3);
ls.add(7);

Collections.sort(ls);

System.out.println(ls);

for(int i : ls)
	System.out.println(i);
}
}
