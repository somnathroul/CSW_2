
import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		try {
			System.out.println("Enter any String:");
			String s = obj.nextLine();
			obj.close();
			if (s.isEmpty()) {
				throw new NullPointerException("String Cannot be Null");
			} else {
				System.out.println("Length of the given String " + s + " is:" + s.length());
			}
		} catch (NullPointerException e) {
			System.out.println(e);
		}
	}

}
