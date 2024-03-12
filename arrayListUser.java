import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
class User implements Comparable<User>{
	private String name;
	private int age;
	public User(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age=age;
	}
	@Override
	public int compareTo(User o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
public class arrayListUser {
	private ArrayList<User> userlist;
	public arrayListUser() {
		this.userlist=new ArrayList<>();
	}
	public void addUser(User user) {
		userlist.add(user);
	}
	public void printUser() {
		for(User user:userlist) {
			System.out.println("Name "+ user.getName() + "Age " + user.getAge());
		}
	}
	public void sortUserByAge() {
		Collections.sort(userlist,Comparator.comparingInt(User::getAge));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arrayListUser userlistmanager= new arrayListUser();
		userlistmanager.addUser(new User("som",20));
		userlistmanager.addUser(new User("pranab",100));
		userlistmanager.addUser(new User("shivam",5));
		System.out.println("Original list of user");
		userlistmanager.printUser();
		userlistmanager.sortUserByAge();
		System.out.println("Sorted List");
		userlistmanager.printUser();
		
		
	}

}
