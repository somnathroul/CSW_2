package Assignment2;
class Laptop{
private String model;
private double price;

public void setModel(String model) {
this.model = model;
}

public void setPrice(double price) {
this.price = price;
}
void getModel() {
	System.out.println(model);
}
void getPrice() {
	System.out.println(price);
}

public String toString() {
return "Model : "+this.model+" , Price : " + this.price;
}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Laptop L1 = new Laptop();
		L1.setModel("Lenovo");
		L1.setPrice(50000);
		System.out.println(L1);
	}

}
