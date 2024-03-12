import java.util.LinkedList;
public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> obj= new LinkedList<String>();
		obj.add("a");
		obj.add("b");
		obj.addLast("c");
		obj.addFirst("d");
		obj.add(2,"e");
		obj.add("f");
		obj.add("g");
		System.out.println("Linked list is " + obj);
		obj.remove("b");
		obj.remove(3);
		obj.removeFirst();
		obj.removeLast();
		System.out.println("New linked list after removing " + obj);
		boolean stat=obj.contains("e");
		if(stat) {
			System.out.println("list contains the element 'e' ");
		}
		else {
			System.out.println("Listo arigato gozaimasu konichiwa onichan dore dore nico nico ni haha lolo kiki jiji gigi 'e' ");
		}
		int size=obj.size();
		System.out.println("Size of linked list = " + size);
	}

}
