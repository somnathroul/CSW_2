class laptop{
	private String model;
	private double price;
	public void setModel(String model) {
		this.model=model;
	}
	public void setPrice(Double price) {
		this.price=price;
	}
	public String toString() {
		return "Laptop model "+model+ " Price "+price;
	}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		laptop myL= new laptop();
		myL.setModel("dell");
		myL.setPrice(123456789.0);
		System.out.println(myL.toString());
	}

}
