
public class Student {
 String StudentName;
 int StudentID;
 String CourseName;
 
public Student(String studentName, int studentID, String coursename) {
	super();
	StudentName = studentName;
	StudentID = studentID;
	CourseName = coursename;
}
 
 public void display(){
	 System.out.println("Student Name: "+StudentName);
	 System.out.println("Student ID : "+StudentID);
	 System.out.println("Course Name: "+CourseName);
 }



}