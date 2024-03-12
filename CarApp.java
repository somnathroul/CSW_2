import java.util.Collections;
import java.util.ArrayList;
class Car implements Comparable<Car> {
	private String name;
	private int modelNo;
	private int stock;
	public Car(String name,int modelNo, int stock) {
		this.name=name;
		this.modelNo=modelNo;
		this.stock=stock;
	}
	public String toString() {
		return "Name "+ name+ " Model No: " + modelNo+ " Stock: "+ stock;
	}
	@Override
	public int compareTo(Car car) {
		// TODO Auto-generated method stub
		return Integer.compare(this.stock,car.stock);
	}
	
}
public class CarApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Car> carlist=new ArrayList<>();
		carlist.add(new Car("Ford",6333,3));
		carlist.add(new Car("Honda",7333,2));
		carlist.add(new Car("Audi",8333,1));
		carlist.add(new Car("MG",9333,0));
		for(Car car:carlist) {
			System.out.println(car.toString());
		}
		Collections.sort(carlist);
		for(Car car:carlist) {
			System.out.println(car.toString());
		}
	}

}
