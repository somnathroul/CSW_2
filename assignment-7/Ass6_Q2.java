public class Ass6_Q2 {
	private String name;

	public Ass6_Q2(String name) {
		this.name = name;
	}

	@Override
	protected void finalize() {
		System.out.println("Garbage collected: " + name);
	}

	public static void main(String[] args) {
		Ass6_Q2 obj1 = new Ass6_Q2("Object 1");
		Ass6_Q2 obj2 = new Ass6_Q2("Object 2");
		obj1 = obj2;
		obj2 = null;
		System.gc();
	}

}
