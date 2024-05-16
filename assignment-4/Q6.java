


import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		try {
			System.out.println("Enter any Number:");
			int x = obj.nextInt();
			x = Integer.parseInt(null);
			System.out.println(x);
		} catch (NumberFormatException e) {
			System.out.println(e);
		}
		obj.close();
	}

}
