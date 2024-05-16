
public class Ass6_Q4 {
	private String name;

	public Ass6_Q4(String name) {
		this.name = name;
	}

	@Override
	protected void finalize() {
		System.out.println("Garbage collected: " + name);
	}

	public static void main(String[] args) {
		new Ass6_Q4("Anonymous");
		System.gc();
	}

}
