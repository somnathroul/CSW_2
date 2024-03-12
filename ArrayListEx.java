import java.util.ArrayList;
import java.util.Collections;
public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList mylist= new ArrayList();
		mylist.add(5);
		mylist.add(2);
		mylist.add(4);
		for(int i=0;i<mylist.size(); i++) {
			System.out.println(mylist.get(i));
		}
		int indexoftwo= mylist.indexOf(2);
		System.out.println(indexoftwo);
		System.out.println(mylist.isEmpty());
		mylist.remove(0);
		System.out.println(mylist);
		mylist.set(0,5);
		mylist.set(1,2);
		System.out.println(mylist);
		Collections.sort(mylist);
		System.out.println(mylist);
	}

}
