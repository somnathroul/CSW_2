package Assignment2;

public class Rectangle {
	private double length,width;
	Rectangle(double a,double b){
		length=a;width=b;
	}
	void setvalue(double a,double b) {
		length=a;width=b;
	}
	void getvalue() {
		System.out.println("Length:"+length+" Width:"+width);
	}
	double area() {
		return (length*width);
		}
	double perimeter() {
		return (2*(length+width));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle R1=new Rectangle(0.0,0.0);
		R1.setvalue(12.0, 5.0);
		R1.getvalue();
		System.out.println("Area"+R1.area());
		System.out.println("Perimeter"+R1.perimeter());
	}

}
