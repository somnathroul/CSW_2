
public class Student2 {
	 private int sid;
	 private String name;
	 Student2(){
		 sid=0;
		 name="";
	 }
	 
	public Student2(int sid, String name) {
		this.sid = sid;
		this.name = name;
	}
	
 public boolean equals(Object ob) {
	 Student2 s=(Student2) ob;
	 if((this.sid==s.sid) && this.name.compareTo(s.name)==0) {
		 return true;
	 }
	 else {
		 return false;
	 }
 }
	public static void main(String[] args) {
		Student2 s1=new Student2(12,"Rahul");
		Student2 s2=new Student2(1,"Rahul");
		if(s1.equals(s2)) {
			System.out.println("Same");
		}
		else {
			System.out.println("not same");
		}

	}

}
