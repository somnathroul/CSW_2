package Assignment2;

class Student{
private String studentId, studentName;
College college;
Student(String studentId, String studentName , College college){
this.studentId = studentId;
this.studentName = studentName;
this.college = college;
}

public void displayStudentInfo() {
System.out.println("Name : "+this.studentName+", ID : "+this.studentId+", College Name: "+college.getCollegeName()+", Location of college : "+college.getCollegeLoc());
}
}
class College{
private String collegeName , collegeLoc;
College(String collegeName , String collegeLoc){
this.collegeName = collegeName;
this.collegeLoc = collegeLoc;
}
public String getCollegeLoc() {
return this.collegeLoc;
}
public String getCollegeName() {
return this.collegeName;
}

}


public class Q5 {

	public static void main(String[] args) {
		College Kiit = new College("KIIT", "Patia");
		College Iter = new College("ITER","Jagamara");
		Student stud1 = new Student("3235", "Biti", Iter);
		Student stud2 = new Student("3242", "dibya", Kiit);
		stud1.displayStudentInfo();
		stud2.displayStudentInfo();

	}

}
