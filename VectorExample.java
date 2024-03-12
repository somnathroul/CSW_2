import java.util.*;
public class VectorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v= new Vector(3,2);
		System.out.println("Initial size is: " + v.size());
		System.out.println("Initial capacity is " + v.capacity());
		v.addElement(new Integer(1));
		v.addElement(new Integer(2));
		v.addElement(new Integer(3));
		v.addElement(new Integer(4));
		System.out.println("The capacity after four addition is: " + v.capacity());
		v.addElement(new Double(6.55));
		System.out.println("Now capacity is " + v.capacity());
		v.addElement(new Integer(8));
		System.out.println("Now capacity is " + v.capacity());
		v.addElement(new Float(9.5));
		System.out.println("Now capacity is " + v.capacity());
		v.addElement(new Integer(11));
		v.addElement(new Integer(12));
		System.out.println("First element is " + (Integer)v.firstElement());
		System.out.println("Last element is " + (Integer)v.lastElement());
		if(v.contains(new Integer(3))) {
			Enumeration vec= v.elements();
			System.out.println("\nElement in the vector :");
			while(vec.hasMoreElements()) {
				System.out.print(vec.nextElement() + " ");
			}
			System.out.println();
		}
	}

}
