

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q25 {
	public static void Method() throws InputMismatchException {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter any Number:");
		int num = obj.nextInt();
		obj.close();
		System.out.println("You ");
	}

	public static void main(String[] args) {
		try {
			Method();
		} catch (InputMismatchException e) {
			System.out.println(e);
		}

	}

}
