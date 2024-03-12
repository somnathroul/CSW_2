import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class hashmapExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hmap1= new HashMap<Integer, String>();
		hmap1.put(14,"George");
		hmap1.put(33, "Paul");
		hmap1.put(16,"Jane");
		hmap1.put(7,"Brian");
		hmap1.put(19,"Jack");
		Set set1= hmap1.entrySet();
		Iterator iterator1=  set1.iterator();
		for (int i:hmap1.keySet()) {
			System.out.println(i + " " + hmap1.get(i));
		}
		String va=hmap1.get(2);
		System.out.println("index 2 has value of " + va);
		hmap1.remove(16);
		Set set2= hmap1.entrySet();
		Iterator iterator2=set2.iterator();
		for (int i:hmap1.keySet()) {
			System.out.println(" now value is "+ i + "key is " + hmap1.get(i));
		}
	}

}
