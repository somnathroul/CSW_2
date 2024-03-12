import java.util.HashSet;
public class hashset {
	public static void main(String[] args) {
		HashSet<String> haset = new HashSet<String>();
		haset.add("Apricot");
		haset.add("Mango");
		haset.add("Orange");
		haset.add("Strawberry");
		haset.add("Dates");
		haset.add("Orange");
		haset.add("Mango");
		haset.add(null);
		haset.add(null);
		System.out.println(haset);
		for(String i:haset) {
			System.out.println(i);
		}
		System.out.println(haset.size());
		System.out.println(haset.contains("null"));
	}

}
