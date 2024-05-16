
public class Ass6_Q3 {
	private String name;

	public Ass6_Q3(String name) {
		this.name = name;
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Garbage collected: " + name);
		super.finalize();
	}

	public static void main(String[] args) {
		Ass6_Q3 obj = new Ass6_Q3("Object");
		obj = null;
		System.gc();
	}

}
