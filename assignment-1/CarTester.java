package Assignment2;
class Car{
	private String make,model;
	Car(String make,String model){
		this.make=make;
		this.model=model;}
	public void setdetail(String make,String model) {
			this.make=make;
			this.model=model;
		}
	void getdetails() {
		System.out.println("Make:"+make+" "+"Model:"+model);
	}
	}

public class CarTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car mycar1=new Car("Tata","X93u");
		Car mycar2=new Car(null, null);
		System.out.println("Car1");
		mycar1.getdetails();
		System.out.println("Car2");
		mycar2.getdetails();
		mycar2.setdetail("KIA","V9ed44");
		System.out.println("Car2");
		mycar2.getdetails();
	}

}
