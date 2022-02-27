package solid;

import java.util.List;

interface Comparator{
	float compare(float a, float b);
}
class Ascending implements Comparator{

	@Override
	public float compare(float a, float b) {
		
		return a-b;
	}
	
}
class Descending implements Comparator{

	@Override
	public float compare(float a, float b) {
		
		return a-b;
	}
	
}

public class SortingStudents {
static void sortStudents(List<singleResaddstudents> list, Comparator com)
{
	for(int i=0;i<list.size();i++)
	{
		for(int j=0;j<list.size();j++)
		{
			if(com.compare(list.get(i).getStudentRoll(),list.get(j).getStudentRoll())>0)
			{
				singleResaddstudents ts=list.get(i);
			list.set(i,list.get(j));
			list.set(j, ts);
            
			}
			else if(com.compare(list.get(i).getStudentRoll(),list.get(j).getStudentRoll())==0) {
				if(com.compare(list.get(i).getCGPA(),list.get(j).getCGPA())>0) {
					singleResaddstudents ts=list.get(i);
					list.set(i,list.get(j));
					list.set(j, ts);
				}
			}
		}
	}
	for(int i=0;i<list.size ();i++)
	{
		PrintStudents pt=new PrintStudents();
		pt.printStudents(list.get(i));
	}
}
}

