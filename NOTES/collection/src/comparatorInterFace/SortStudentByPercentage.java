package comparatorInterFace;

import java.util.Comparator;

public class SortStudentByPercentage implements Comparator<Student>{
	
	@Override
	public int compare(Student NewObj,Student PrevObj) {
		
		return NewObj.percentage.compareTo(PrevObj.percentage);
	}

}
