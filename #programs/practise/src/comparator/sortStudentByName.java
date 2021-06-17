package comparator;

import java.util.Comparator;

public class sortStudentByName implements Comparator<student> {

	
	@Override
	public int compare(student newObj,student oldObj) {
		return newObj.name.compareTo(oldObj.name);
	}
}