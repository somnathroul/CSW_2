import java.util.ArrayList;
public class Student {
	private String name;
	private int id;
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	public static void main(String[] args) {
		ArrayList<Student> li=new ArrayList<>();
		Student s1=new Student("Rahul",12);
		Student s2=new Student("raj",1);
		Student s3=new Student("Satyam",121);
		li.add(s1);
		li.add(s2);
		li.add(s3);
		System.out.println(li);

	}

}
