package solid;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class getStudentsDetails {
	static List<singleResaddstudents> list=new ArrayList<>();
public static void main (String[] args)
{
	System.out.println("Welcome to our Univeristy");
	
	System.out.println("How many students you want to add?");
Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
	
	int count= sc.nextInt();
	String en= sc.nextLine();
	  
	for(int i=0;i<count;i++) {
		System.out.print("Enter student's name: ");  
	String name = sc.nextLine();  
	System.out.print("Enter student's roll: ");  
	int roll= sc.nextInt();  
	System.out.print("Enter student's CGPA: ");  
	float cgpa= sc.nextFloat();
	en= sc.nextLine();
	singleResaddstudents students=new singleResaddstudents(name, roll, cgpa);
	list.add(students);
	
}
	
	System.out.println("Want to see students' list? Type yes");
	
	String yes=sc.nextLine();
	if(yes.equals("yes"))
	{
		SortingStudents.sortStudents(list, new Ascending());
		
	}
	System.out.println("Do you want add student's sports ability? Type yes");
	yes=sc.nextLine();
	for(int i=0;i<list.size();i++)
	{
		System.out.println("Does "+list.get(i).getStudentName()+" play cricket or football? if yes then type 1 for cricket and 2 for football");
		int y=sc.nextInt();
		if(y==1)
		{
			Student s1=new Student();
			s1.batting(list.get(i).getStudentName());
			
		}
		else
		{
			Student2 s1=new Student2();
			s1.attack(list.get(i).getStudentName());
		}
		
	}

}
}
