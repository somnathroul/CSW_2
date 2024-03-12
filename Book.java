import java.util.Objects;

public class Book {
	private String name;
	private int price;
	Book(){
		name="";
		price=0;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Book(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	@Override
	public int hashCode() {
		return price;
	}
	
	public static void main(String[] args) {
		Book b1=new Book("abc",200);
		Book b2=new Book("jkh",100);
		//b1=b2;
		System.out.println(b1.hashCode());
		System.out.println(b2.hashCode());
	}
	
}
