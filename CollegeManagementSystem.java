class college{
	private String collegeName;
	private String collegeLoc;
	public  college(String collegeName,String collegeLoc) {
		this.collegeName=collegeName;
		this.collegeLoc=collegeLoc;
	}
	public void collegeinfo() {
		System.out.println("College name " + collegeName);
		System.out.println("College Location " + collegeLoc);
	}
}
class students{
	private int studentId;
	private String studentName;
	college studentCol;
	public students(int studentId, String studentName,college studentCol) {
		this.studentId=studentId;
		this.studentName=studentName;
		this.studentCol=studentCol;
	}
	public void displayStudentinfo() {
		System.out.println("Name " + studentName);
		System.out.println("ID " + studentId);
		System.out.println("College Information");
		studentCol.collegeinfo();
	}
}
public class CollegeManagementSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		college college1= new college ("ABC UNIVERSITY" , "BBSR");
		college college2= new college ("XYZ UNIVERSITY" , "BBSR");
		students s1= new students(18129,"Somnath Roul",college1);
		students s2= new students(18160,"Pranab Rout",college2);
		s1.displayStudentinfo();
		s2.displayStudentinfo();
	}

}
