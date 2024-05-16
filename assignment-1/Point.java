package Assignment2;

public class Point {
	public int x,y;
	Point(int x,int y){
		this.x=x;
		this.y=y;
	}
	Point(Point obj){
		x=obj.x;
		y=obj.y;
	}
	void setvalues(int x,int y) {
		this.x=x;
		this.y=y;
	}
	void getvalues() {
		System.out.println("X:"+x+" Y:"+y);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point ob=new Point(6,3);
		Point ob1=new Point(ob);
		ob.getvalues();
		ob1.getvalues();
		
		ob.getvalues();
	}

}
