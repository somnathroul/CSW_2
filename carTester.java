class car1{
	private String make;
	private String model;
	public car1(String make, String model) {
		this.make=make;
		this.model=model;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make=make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model=model;
	}
}
public class carTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car1 mycar1= new car1("Toyota" , "Fortuner");
		car1 mycar2=new car1(null,null);
		System.out.println("make-" + mycar1.getMake() + "Model-" + mycar1.getModel());
		System.out.println("make-" + mycar2.getMake() + "Model-" + mycar2.getModel());
		mycar2.setMake("Honda");
		mycar2.setModel("Accord");
		System.out.println("updated value "+"make-" + mycar1.getMake() + "Model-" + mycar2.getModel());
	}

}
