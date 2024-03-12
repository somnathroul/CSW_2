class point{
	private double x;
	private double y;
	public point(double x,double y) {
		this.x=x;
		this.y=y;
	}
	public point (point otherPoint) {
		this.x=otherPoint.getX();
		this.y=otherPoint.getY();
	}
	public double  getX() {
		return x;
	}
	public void setX(double x) {
		this.x=x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y=y;
	}
}
public class pointDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		point point1=new point(3.0,5.0);
		System.out.println("Point 1 " + "X-" + point1.getX() + " Y-" + point1.getY());
		point point2=new point (point1);
		System.out.println("Point 2 " + "X-" + point2.getX() + " Y-" + point2.getY());
		point1.setX(7.0);
		point1.setY(9.0);
		System.out.println("After Modifiying Point 1");
		System.out.println("Point 1 " + "X-" + point1.getX() + " Y-" + point1.getY());
		System.out.println("Point 2 " + "X-" + point2.getX() + " Y-" + point2.getY());
	}

}
