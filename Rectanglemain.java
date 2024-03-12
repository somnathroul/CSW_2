class rectangle{
	private double length;
	private double width;
	public rectangle(double length,double width) {
		this.length=length;
		this.width=width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length=length;
	}
	public double getwidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width=width;
	}
	public double area() {
		return length*width;
	}
	public double perimeter() {
		return 2*(length+width);
	}
}
public class Rectanglemain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rectangle myrect= new rectangle(5.0,3.0);
		System.out.println("Initail length " + myrect.getLength());
		System.out.println("Initail width " + myrect.getwidth());
		System.out.println("Area " + myrect.area());
		System.out.println("perimeter "+ myrect.perimeter());
	}

}
