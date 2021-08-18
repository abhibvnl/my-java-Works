package comparatorInterFace;

import java.util.Comparator;

public class SortStudentByName implements Comparator<Student>{
	
	@Override
	public int compare(Student NewObj,Student PrevObj) {
		
		return NewObj.Name.compareTo(PrevObj.Name);
	}

}
