import java.util.LinkedHashSet;
public class linkedhashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> haset= new LinkedHashSet<String>();
		haset.add("Z");
		haset.add("R");
		haset.add("M");
		haset.add("O");
		haset.add("KKK");
		haset.add("EFG");	
		System.out.println(haset);
		LinkedHashSet<Integer> haset1= new LinkedHashSet<Integer>();
		haset1.add(95);
		haset1.add(13);
		haset1.add(0);
		haset1.add(55);
		haset1.add(33);
		haset1.add(61);
		System.out.println(haset1);
//		for (Integer i:haset1) {
//			System.out.println(i);
//		}
	}

}
