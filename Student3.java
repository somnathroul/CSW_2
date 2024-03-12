import java.util.*;
public class Student3 implements Comparable<Student3>{
	private int roll;
	private String name;
	Student3(){
		roll=0;
		name="";
	}
	
	public Student3(int roll, String name) {
		this.roll = roll;
		this.name = name;
	}
	
	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student3 [roll=" + roll + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Student3 s) {
		return this.roll-s.roll;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	Student3 s []=new Student3[3];
	for(int i=0;i<s.length;i++) {
		s[i]=new Student3();
	}
	for(int i=0;i<s.length;i++) {
		
		System.out.println("Enter roll and name");
		int x=sc.nextInt();
		String y=sc.next();
		s[i].setRoll(x);
		s[i].setName(y);
	}
	for(int i=0;i<s.length-1;i++) {
		for(int j=0;j<s.length-1-i;j++) {
			if(s[j].compareTo(s[j+1])>0) {
				Student3 t=s[j];
				s[j]=s[j+1];
				s[j+1]=t;
			}
		}
	}
	for(int i=0;i<s.length;i++) {
		System.out.println(s[i]+" ");
	}
	}

}
