

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		try {
			System.out.println("Enter any String:");
			String s = obj.nextLine();
			int a = Integer.parseInt(s);
			System.out.println(a);
		} catch (NumberFormatException e) {
			System.out.println(e);
		}
		obj.close();
	}

}
