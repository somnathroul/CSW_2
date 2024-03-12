class genericsDemo <A>{
	A x;
	public genericsDemo(A x) {
		this.x=x;
	}
	public A getx() {
		return x;
	}
}
public class Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		genericsDemo <Integer> g1= new genericsDemo<Integer>(3);
		genericsDemo<Double>g2=new genericsDemo<Double>(3.5);
		System.out.println(g1.getx());
		System.out.println(g2.getx());
	}

}
