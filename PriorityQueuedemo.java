import java.util.*;   
public class PriorityQueuedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> mylist= new PriorityQueue();
		System.out.println(mylist.isEmpty());
		mylist.offer(5);
		mylist.offer(2);
		mylist.offer(1);
		System.out.println(mylist.isEmpty());
		System.out.println(mylist.peek());
		mylist.poll();
		System.out.println(mylist);
		
	}

}
