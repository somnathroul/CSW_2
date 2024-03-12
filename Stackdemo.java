import java.util.*;
public class Stackdemo {

	public static void main(String[] args)throws java.lang.Exception {
		// TODO Auto-generated method stub
		Stack<Integer> mylist= new Stack();
		mylist.push(5);
		mylist.push(2);
		mylist.push(1);
		System.out.println(mylist.peek());
		System.out.println(mylist.search(5));
		mylist.pop();
		System.out.println(mylist.empty());
		System.out.println(mylist);
	}

}
