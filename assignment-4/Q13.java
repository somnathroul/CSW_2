

import java.util.*;

public class Q13 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("X=");
		double x = obj.nextDouble();
		obj.close();
		try {
			double denominator = Math.sin(x) + Math.cos(x);
			double result = Math.sin(x) * Math.cos(x) / denominator;

			if (denominator <= 0) {
				throw new ArithmeticException(" may arise \r\n"
						+ "due to invalid mathematical operations");
			}
			System.out.println("Result: " + result);
		} catch (ArithmeticException e) {
			System.out.println(e);
		}

	}

}
