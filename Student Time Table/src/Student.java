
public class Student {
 String StudentName;
 int StudentID;
 String CourseTitle;
 String TimeTable;
 
public Student(String studentName, int studentID, String courseTitle) {
	super();
	StudentName = studentName;
	StudentID = studentID;
	CourseTitle = courseTitle;
}
 
 public void display(){
	 System.out.println("Student Name: "+StudentName);
	 System.out.println("Student ID : "+StudentID);
	 System.out.println("Course Title: "+CourseTitle);
 }



public void display2(){
	System.out.println("Time table :"+TimeTable);
}
}