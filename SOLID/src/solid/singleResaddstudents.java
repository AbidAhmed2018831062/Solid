package solid;

public class singleResaddstudents {
	String name;
	int roll;
	float cgpa;
 singleResaddstudents(String name, int roll, float cgpa)
 {
	 this.name=name;
	 this.roll=roll;
			 this.cgpa=cgpa;
 }
 String getStudentName()
 {
	 return this.name;
 }
 int getStudentRoll()
 {
	 return this.roll;
 }
 float getCGPA()
 {
	 return this.cgpa;
 }
 void setStudentName(String name)
 {
	 this.name=name;
 }
 void setStudentRoll(int roll)
 {
	 this.roll=roll;
 }
 void setStudentCGPA(float cgpa)
 {
	 this.cgpa=cgpa;
 }
}
