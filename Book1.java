import java.util.*;
public class Book1 implements Comparator<Book1>{
	private String name;
	private int price;
	Book1(){
		name="";
		price=0;
	}
	
	public Book1(String name,int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	
	public String toString() {
		return "Book1 [name=" + name + ", price=" + price + "]";
	}
	
	@Override
	public  int compare(Book1 b1,Book1 b2) 
	   
	{ return b1.name.compareTo(b2.name);}
   

	@Override
	public boolean equals(Object obj) {
		Book1 b1=(Book1)obj;
		if(this.name.compareTo(b1.name)==0) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		Book1 b1=new Book1("pqr",300);
		Book1 b2=new Book1("abc",400);
		Book1 b3=new Book1("pqr",300);
		
		 ArrayList<Book1> li=new ArrayList<>();
		 li.add(b1);
		 li.add(b2);
		 System.out.println(li);
	   	 Collections.sort(li,b1);
	   	 li.sort(b1);
		 System.out.println(li);
		// li.remove(b3);
     	 System.out.println(li);
//		 System.out.println(li.size());
//		 li.add(1,b3);
//		 System.out.println(li);
		 System.out.println(li.contains(b3));
		 Iterator it=li.iterator();
		 while(it.hasNext()) {
			 System.out.println(it.next());
		 }

	}

}
