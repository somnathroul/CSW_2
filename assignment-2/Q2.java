import java.util.*;

class User {
	private String name;
	private int age;

	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

class ArrayListUser {
	private ArrayList<User> userList;

	public ArrayListUser() {
		userList = new ArrayList<>();
	}

	public void addUser(User user) {
		userList.add(user);
	}

	public void printUsers() {
		System.out.println("Users:");
		for (User user : userList) {
			System.out.println("Name: " + user.getName() + ", Age: " + user.getAge());
		}
	}

	public void sortUsersByAge() {
		Collections.sort(userList, Comparator.comparingInt(User::getAge));
	}
}

public class Q2 {

	public static void main(String[] args) {
		ArrayListUser arrayListUser = new ArrayListUser();

		arrayListUser.addUser(new User("Ram", 24));
		arrayListUser.addUser(new User("Shyam", 31));
		arrayListUser.addUser(new User("Hari", 12));

		System.out.println("Before sorting:");
		arrayListUser.printUsers();

		arrayListUser.sortUsersByAge();

		System.out.println("\nAfter sorting by age:");
		arrayListUser.printUsers();
	}

}
