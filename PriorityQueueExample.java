import java.util.*;
public class PriorityQueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String>pr= new PriorityQueue<String>();
		pr.add("c");
		pr.add("java");
		pr.add("python");
		pr.add("c++");
		System.out.println("the head value using peek function is " +pr.peek());
		System.out.println("the total queue element are: ");
		Iterator itr=pr.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		pr.poll();
		System.out.println("after removing an element : ");
		Iterator<String> itr1= pr.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		pr.remove("java");
		System.out.println("after removing java :");
		Iterator<String> itr2=pr.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		boolean a= pr.contains("c");
		System.out.println("does this priority queue conatins c; " +a);
	}

}
