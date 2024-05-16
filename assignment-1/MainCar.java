package Assignment2;
interface Vehicle{
public void accelerate() ;
public void brake();
}

class Cars implements Vehicle{

@Override
public void accelerate() {
System.out.println("Car is accelerating now.");
}

@Override
public void brake() {
System.out.println("The Car stops.");
}

public void accelerate(double speed,String duration) {
System.out.println("Car is accelerating at the speed of "+speed+" for about "+duration);
}
}

class Bicycle implements Vehicle{

@Override
public void accelerate() {
System.out.println("Bicycle is accelerating now.");
}

@Override
public void brake() {
System.out.println("The bicyle stops.");
}

public void accelerate(double speed,String duration) {
System.out.println("Bicycle is accelerating at the speed of "+speed+" for about "+duration);
}
}
public class MainCar {

	public static void main(String[] args) {
		Cars c = new Cars();
		c.accelerate();
		c.accelerate(80,"3 mins");
		c.brake();
		Bicycle b = new Bicycle();
		b.accelerate();
		b.accelerate(20,"2 mins");
		b.brake();

	}

}
