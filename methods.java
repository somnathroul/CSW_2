class generics{
	public <A> A getx(A x) {
		return x;
	}
}
public class methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		generics g1=new generics();
		generics g2= new generics ();
		System.out.println(g1.getx(3));
		System.out.println(g2.getx("Hello World"));
	}

}
